package io.camunda.example.dto;

import io.camunda.connector.generator.annotation.TemplateProperty;
import io.camunda.connector.generator.annotation.TemplateProperty.PropertyType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;

public record MyConnectorRequest(
    @NotEmpty @TemplateProperty(group = "compose", type = PropertyType.Text , label = "id") int id,
    @NotEmpty @TemplateProperty(group = "compose", type = PropertyType.Text , label = "type") String type ,
    @NotEmpty @TemplateProperty(group = "compose", type = PropertyType.Text , label = "start") Date start,
    @NotEmpty @TemplateProperty(group = "compose", type = PropertyType.Text , label = "end") Date end
    ) {};
