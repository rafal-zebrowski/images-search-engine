package pl.rafalzebrowski.imagessearchengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@ConfigurationPropertiesScan
public class ImagesSearchEngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImagesSearchEngineApplication.class, args);
    }

    @Bean
    public WebClient webClient() {
        return WebClient.create();
    }
}
