package com.sandstone.moviedb.service;

import com.sandstone.moviedb.model.PopularMovie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieService {

    @GET("movie/popular")
    Call<PopularMovie> getPopularMovies(@Query("api_key") String api_key);
}
