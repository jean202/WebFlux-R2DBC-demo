package com.example.webfluxr2dbcdemo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "webclient")
public class WebClientConfig {

    private String h2ConsolePort;

}
