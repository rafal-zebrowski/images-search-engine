package pl.rafalzebrowski.imagessearchengine.model;

import java.util.Map;

public record Image(
        String id,
        Map<String, String> urls,
        Map<String, String> links
) {}
