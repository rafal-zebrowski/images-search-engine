package pl.rafalzebrowski.imagessearchengine.model;

public record ImagesSearchCriteria(
        String query,
        Integer page,
        Integer perPage,
        ImageOrderBy orderBy
) {}
