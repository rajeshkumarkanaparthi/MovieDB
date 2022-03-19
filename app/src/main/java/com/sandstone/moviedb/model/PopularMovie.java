package com.sandstone.moviedb.model;

import java.util.List;

public class PopularMovie {
    private Integer page;
    private List<Movie> results;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "PopularMovie{" +
                "page=" + page +
                ", results=" + results +
                '}';
    }
}
