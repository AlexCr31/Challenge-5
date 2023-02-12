package com.recycler_view_retrofit.mvpretrofit.Others;

import com.recycler_view_retrofit.mvpretrofit.Entidades.Simpson;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Query;

public interface ApiInterface {
    Call<ArrayList<Simpson>> getPopularSimpson(@Query("count") int count);

}
