package pl.rafalzebrowski.imagessearchengine.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.rafalzebrowski.imagessearchengine.model.ImageResult;
import pl.rafalzebrowski.imagessearchengine.model.ImagesSearchCriteria;
import pl.rafalzebrowski.imagessearchengine.restclient.UnsplashRestClient;

@AllArgsConstructor
@Service
public class UnsplashImageServiceImpl implements ImageService {

    public final UnsplashRestClient unsplashRestClient;

    @Override
    public ImageResult search(ImagesSearchCriteria criteria) {
        return unsplashRestClient.search(criteria);
    }
}
