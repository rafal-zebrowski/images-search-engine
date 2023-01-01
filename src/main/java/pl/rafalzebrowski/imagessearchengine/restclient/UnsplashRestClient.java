package pl.rafalzebrowski.imagessearchengine.restclient;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
import pl.rafalzebrowski.imagessearchengine.config.ApplicationProperties;
import pl.rafalzebrowski.imagessearchengine.model.ImageResult;
import pl.rafalzebrowski.imagessearchengine.model.ImagesSearchCriteria;

import java.util.Optional;

@AllArgsConstructor
@Component
public class UnsplashRestClient {

    private final static String UNSPLASH_URL = "https://api.unsplash.com";

    private ApplicationProperties properties;
    private WebClient client;

    public ImageResult search(ImagesSearchCriteria criteria) {
        String url = UriComponentsBuilder.fromHttpUrl(UNSPLASH_URL)
                .path("/search/photos")
                .queryParam("query", criteria.query())
                .queryParamIfPresent("page", Optional.ofNullable(criteria.page()))
                .queryParamIfPresent("per_page", Optional.ofNullable(criteria.perPage()))
                .queryParamIfPresent("order_by", Optional.ofNullable(criteria.orderBy()))
                .queryParam("client_id", properties.clientId())
                .encode()
                .toUriString();

        ImageResult response = client.get()
                .uri(url)
                .retrieve()
                .bodyToMono(ImageResult.class)
                .block();
        return response;
    }
}
