package pl.rafalzebrowski.imagessearchengine.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rafalzebrowski.imagessearchengine.model.ImageResult;
import pl.rafalzebrowski.imagessearchengine.model.ImagesSearchCriteria;
import pl.rafalzebrowski.imagessearchengine.service.ImageService;

@RestController
@RequestMapping("/images")
@AllArgsConstructor
public class ImageSearchController {

    final private ImageService unsplashImageService;

    @PostMapping("/search")
    public ImageResult search(@RequestBody ImagesSearchCriteria criteria) {
        return unsplashImageService.search(criteria);
    }
}
