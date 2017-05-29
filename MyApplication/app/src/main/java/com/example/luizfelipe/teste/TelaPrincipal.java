package com.example.luizfelipe.teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TelaPrincipal extends AppCompatActivity {

    private EditText campoNome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaprincipal);

        campoNome = (EditText) findViewById(R.id.campoNome);
    }
    public void clickOk(View view){
        Toast.makeText(TelaPrincipal.this"Olá" + campoNome.getText(), Toast.LENGTH_LONG).show();

    }
}

