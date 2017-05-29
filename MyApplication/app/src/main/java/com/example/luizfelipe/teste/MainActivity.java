package com.example.luizfelipe.teste;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends ActionBarActivity implements  Runnable{


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Handler handler = new Handler();
        handler.postDelayed(this, 2000);
    }
    @Override
    public void run() {
        startActivity(new Intent(this, TelaPrincipal.class));
    }

}
