package com.recycler_view_retrofit.mvpretrofit.Models;

import com.recycler_view_retrofit.mvpretrofit.ListarSimpsonContract;
import com.recycler_view_retrofit.mvpretrofit.Entidades.Simpson;
import com.recycler_view_retrofit.mvpretrofit.Others.ApiClient;
import com.recycler_view_retrofit.mvpretrofit.Others.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListarSimpsonModel implements ListarSimpsonContract.Model {
    @Override
    public void listarSimpsonWS(Simpson simpson, OnListaSimpsonListener onLstSimpsonListener) {

        getSimpsonService(onLstSimpsonListener);
    }

    public void getSimpsonService(final OnListaSimpsonListener onLstSimpsonListener) {

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<ArrayList<Simpson>> call = apiService.getPopularSimpson(8);
        call.enqueue(new Callback<ArrayList<Simpson>>() {
            @Override
            public void onResponse(Call<ArrayList<Simpson>> call, Response<ArrayList<Simpson>> response) {
                ArrayList<Simpson> lstSimpson = response.body();

                onLstSimpsonListener.onSuccess(lstSimpson);
            }

            @Override
            public void onFailure(Call<ArrayList<Simpson>> call, Throwable t) {
                onLstSimpsonListener.onFailure(t.getMessage());
            }
        });
    }
}
