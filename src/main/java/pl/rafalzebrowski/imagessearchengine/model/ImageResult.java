package pl.rafalzebrowski.imagessearchengine.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record ImageResult(
        Integer total,
        @JsonProperty("total_pages")
        Integer totalPages,
        List<Image> results
) {}
