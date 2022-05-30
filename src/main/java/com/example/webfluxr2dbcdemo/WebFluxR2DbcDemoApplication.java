package com.example.webfluxr2dbcdemo;

import com.example.webfluxr2dbcdemo.config.WebClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {
    WebClientConfig.class
}
)
public class WebFluxR2DbcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebFluxR2DbcDemoApplication.class, args);
    }

}
