package com.recycler_view_retrofit.mvpretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.sanvalero.recycler_view_retrofit.R;
import com.recycler_view_retrofit.mvpretrofit.Vistas.LstSimpsonActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent screenChanger = new Intent(getBaseContext(),
                        LstSimpsonActivity.class
                );
                startActivity(screenChanger);
            }
        }, 5000);
    }
}