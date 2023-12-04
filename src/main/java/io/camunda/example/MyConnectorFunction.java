package io.camunda.example;

import io.camunda.connector.api.annotation.OutboundConnector;
import io.camunda.connector.api.outbound.OutboundConnectorContext;
import io.camunda.connector.api.outbound.OutboundConnectorFunction;
import io.camunda.connector.generator.annotation.ElementTemplate;
import io.camunda.example.dto.MyConnectorRequest;
import io.camunda.example.dto.MyConnectorResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Date;

@OutboundConnector(
    name = "MYCONNECTOR",
    inputVariables = {"id","type","start","end"},
    type = "request")
@ElementTemplate(
    id = "io.camunda.connector.Template.v1",
    name = "Template connector",
    version = 1,
    description = "Describe this connector",
    icon = "icon.svg",
    documentationRef = "https://docs.camunda.io/docs/components/connectors/out-of-the-box-connectors/available-connectors-overview/",
    propertyGroups = {
      @ElementTemplate.PropertyGroup(id = "authentication", label = "Authentication"),
      @ElementTemplate.PropertyGroup(id = "compose", label = "Compose")
    },
    inputDataClass = MyConnectorRequest.class)
public class MyConnectorFunction implements OutboundConnectorFunction {

  private static final Logger LOGGER = LoggerFactory.getLogger(MyConnectorFunction.class);

  @Override
  public Object execute(OutboundConnectorContext context) {
    final var connectorRequest = context.bindVariables(MyConnectorRequest.class);
    return executeConnector(connectorRequest);
  }

  private MyConnectorResult executeConnector(final MyConnectorRequest connectorRequest) {
    // TODO: implement connector logic
    LOGGER.info("Executing my connector with request {}", connectorRequest);
    int id = connectorRequest.id();
    String type = connectorRequest.type();
    Date start = connectorRequest.start();
    Date end = connectorRequest.end();

    String uri = "http://localhost:8081/api/Employees/"+id;
    RestTemplate restTemplate = new RestTemplate();

    Employee emp = restTemplate.getForObject(uri, Employee.class);
    System.out.println(emp.toString());
    System.getLogger(emp.toString());

    //String m= Arrays.toString(message);
    return new MyConnectorResult("" + emp.getVacDays().get(0));
  }
}
