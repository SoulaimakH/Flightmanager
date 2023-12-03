package io.camunda.example.dto;

import io.camunda.connector.generator.annotation.TemplateProperty;
import io.camunda.connector.generator.annotation.TemplateProperty.PropertyType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record MyConnectorRequest(
    @NotEmpty @TemplateProperty(group = "compose", type = PropertyType.Text , label = "textfield_wqrvmq") String Flight_id,
        @NotEmpty @TemplateProperty(group = "compose", type = PropertyType.Text , label = "select_p3yizl") String v1 ,
    @NotEmpty @TemplateProperty(group = "compose", type = PropertyType.Text , label = "select_nx568m") String v2,
    @NotEmpty @TemplateProperty(group = "compose", type = PropertyType.Text , label = "select_iqhp1x9") String v3,
    @NotEmpty @TemplateProperty(group = "compose", type = PropertyType.Text , label = "select_nx568m") String v4,
    @NotEmpty @TemplateProperty(group = "compose", type = PropertyType.Text , label = "select_iqhp1x9") String v5,
    @NotEmpty @TemplateProperty(group = "compose", type = PropertyType.Text , label = "select_34utwf") String v6,
    @NotEmpty @TemplateProperty(group = "compose", type = PropertyType.Text , label = "select_0obapg") String v7,
    @NotEmpty @TemplateProperty(group = "compose", type = PropertyType.Text , label = "datetime_twftp") String date1,
    @NotEmpty @TemplateProperty(group = "compose", type = PropertyType.Text , label = "datetime_l9yxf") String date2
    ) {};
