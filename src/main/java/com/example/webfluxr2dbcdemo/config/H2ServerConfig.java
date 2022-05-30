package com.example.webfluxr2dbcdemo.config;

import java.sql.SQLException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.h2.tools.Server;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@Slf4j
@Profile("h2")
@Configuration
@RequiredArgsConstructor
public class H2ServerConfig {

    private Server webServer;
    private final WebClientConfig webClientConfig;

    @EventListener(ContextRefreshedEvent.class)
    public void start() throws SQLException {
        log.info("starting h2 console at port {}", this.webClientConfig.getH2ConsolePort());
        this.webServer = Server.createWebServer("-webPort", this.webClientConfig.getH2ConsolePort().toString());
        this.webServer.start();
    }

    @EventListener(ContextClosedEvent.class)
    public void stop() {
        log.info("stoping h2 console at port {}", this.webClientConfig.getH2ConsolePort());
        this.webServer.stop();
    }
}
