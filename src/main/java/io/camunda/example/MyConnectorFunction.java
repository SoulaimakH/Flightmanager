package io.camunda.example;

import io.camunda.connector.api.annotation.OutboundConnector;
import io.camunda.connector.api.error.ConnectorException;
import io.camunda.connector.api.outbound.OutboundConnectorContext;
import io.camunda.connector.api.outbound.OutboundConnectorFunction;
import io.camunda.connector.generator.annotation.ElementTemplate;
import io.camunda.example.dto.MyConnectorRequest;
import io.camunda.example.dto.MyConnectorResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

@OutboundConnector(
    name = "MYCONNECTOR",
    inputVariables = {"textfield_wqrvmq","select_p3yizl","select_nx568m","select_iqhp1x9","select_nx568m","select_iqhp1x9","select_34utwf","select_0obapg","datetime_twftp","datetime_l9yxf"},
    type = "FormVar")
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
    String message = connectorRequest.Flight_id();
    String m1 = connectorRequest.v1();
    String m2 = connectorRequest.v2();
    String m3 = connectorRequest.v3();
    String m4 = connectorRequest.v4();
    String m5 = connectorRequest.v5();
    String m6 = connectorRequest.v6();
    String m7 = connectorRequest.v7();
    String d1 = connectorRequest.date1();
    String d2 = connectorRequest.date2();




    //String m= Arrays.toString(message);
    return new MyConnectorResult("Message received: id:" + message+" v1:"+m1+" v2"+m2+" v4"+m2+" v5"+m5+" v6");
  }
}
