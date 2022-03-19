package com.sandstone.moviedb.service;

import com.sandstone.moviedb.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonApiService {

    @GET("/posts")
    Call<List<Post>> getPosts();
}
