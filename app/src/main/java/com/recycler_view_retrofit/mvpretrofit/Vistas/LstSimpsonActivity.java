package com.recycler_view_retrofit.mvpretrofit.Vistas;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.sanvalero.recycler_view_retrofit.R;
import com.recycler_view_retrofit.mvpretrofit.ListarSimpsonContract;

import com.recycler_view_retrofit.mvpretrofit.Adapter.AdapterSimpson;
import com.recycler_view_retrofit.mvpretrofit.Entidades.Simpson;
import com.recycler_view_retrofit.mvpretrofit.Presenters.ListarSimpsonPresenter;


import java.util.ArrayList;

public class LstSimpsonActivity extends AppCompatActivity implements ListarSimpsonContract.View {
    private ListarSimpsonPresenter listarSimpsonPresenter;
    RecyclerView recyclerSimpson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_simpson);

        initComponents();
        initPresenter();
        initData();
    }

    private void initComponents() {
        recyclerSimpson = findViewById(R.id.RecyclerId);
    }

    private void initPresenter() {listarSimpsonPresenter = new ListarSimpsonPresenter(this);}

    private void initData ()  {listarSimpsonPresenter.listarSimpson(null);}

    @Override
    public void successLstSimpson(ArrayList<Simpson> lstSimpson, String msg) {
        Toast.makeText(this, "Se recibieron la tada", Toast.LENGTH_SHORT).show();
        recyclerSimpson.setLayoutManager(new LinearLayoutManager(this));

        AdapterSimpson adapter = new AdapterSimpson(lstSimpson);
        recyclerSimpson.setAdapter(adapter);
    }

    @Override
    public void failureLstSimpson(String err) {
        Toast.makeText(this, err, Toast.LENGTH_SHORT).show();
    }
}