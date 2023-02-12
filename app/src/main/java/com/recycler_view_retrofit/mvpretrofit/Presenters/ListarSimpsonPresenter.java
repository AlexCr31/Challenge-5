package com.recycler_view_retrofit.mvpretrofit.Presenters;
import com.recycler_view_retrofit.mvpretrofit.ListarSimpsonContract;
import com.recycler_view_retrofit.mvpretrofit.Entidades.Simpson;
import com.recycler_view_retrofit.mvpretrofit.Models.ListarSimpsonModel;


import java.util.ArrayList;

public class ListarSimpsonPresenter implements ListarSimpsonContract.Presenter {
    private ListarSimpsonModel listarSimpsonModel;
    private ListarSimpsonContract.View view;

    public ListarSimpsonPresenter(ListarSimpsonContract.View view) {
        this.view = view;
        listarSimpsonModel = new ListarSimpsonModel();
    }

    @Override
    public void listarSimpson(Simpson simpson) {
        listarSimpsonModel.listarSimpsonWS(simpson, new ListarSimpsonContract.Model.OnListaSimpsonListener() {
            @Override
            public void onSuccess(ArrayList<Simpson> listaSimpson) {
                if (listaSimpson != null && listaSimpson.size() > 0) {
                    view.successLstSimpson(listaSimpson, "Datos correctos");
                } else {
                    view.failureLstSimpson("Data no llegó");
                }
            }

            @Override
            public void onFailure(String error) {
                view.failureLstSimpson("Se produjo un error we");
            }
        });
    }
}
