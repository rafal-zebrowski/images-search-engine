package pl.rafalzebrowski.imagessearchengine.service;

import pl.rafalzebrowski.imagessearchengine.model.ImageResult;
import pl.rafalzebrowski.imagessearchengine.model.ImagesSearchCriteria;

public interface ImageService {
    ImageResult search(ImagesSearchCriteria criteria);
}
