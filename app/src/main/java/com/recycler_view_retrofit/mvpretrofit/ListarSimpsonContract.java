package com.recycler_view_retrofit.mvpretrofit;

import com.recycler_view_retrofit.mvpretrofit.Entidades.Simpson;

import java.util.ArrayList;

public interface ListarSimpsonContract {
    public interface View{
        void successLstSimpson(ArrayList<Simpson> lstSimpson, String msg);
        void failureLstSimpson(String err);
    }
    public interface Presenter{

        void listarSimpson(Simpson simpson);
    }
    public interface Model{
        interface OnListaSimpsonListener {
            void onSuccess(ArrayList<Simpson> lstSimpson);
            void onFailure(String error);
        }
        void listarSimpsonWS(Simpson simpson, OnListaSimpsonListener onLstSimpsonListener);
    }
}
