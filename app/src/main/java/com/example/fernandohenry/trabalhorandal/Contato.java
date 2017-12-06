package com.example.fernandohenry.trabalhorandal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Contato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);
    }

    public void enviar(View view) {
        Intent intent = new Intent(this, ListaProdutosActivity.class);

        startActivity(intent);
        finish();
    }
}
