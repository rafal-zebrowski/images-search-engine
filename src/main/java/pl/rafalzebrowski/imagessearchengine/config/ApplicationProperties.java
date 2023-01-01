package pl.rafalzebrowski.imagessearchengine.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "application.config")
public record ApplicationProperties(String clientId) {}
