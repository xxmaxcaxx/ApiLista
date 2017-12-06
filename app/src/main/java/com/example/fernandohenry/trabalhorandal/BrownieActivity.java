package com.example.fernandohenry.trabalhorandal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BrownieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brownie);
    }

    public void voltar(View view) {
        Intent intent = new Intent(this, ListaProdutosActivity.class);

        startActivity(intent);
        finish();
    }

    public void falar(View view) {
        Intent intent = new Intent(this, Contato.class);

        startActivity(intent);
        finish();
    }
}
