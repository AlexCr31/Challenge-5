package com.recycler_view_retrofit.Rfit.interfaces;

import com.recycler_view_retrofit.Rfit.model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Posts>> getPosts();
}
