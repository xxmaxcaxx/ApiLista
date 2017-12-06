package com.example.fernandohenry.trabalhorandal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.fernandohenry.trabalhorandal.adapter.ProdutoAdapter;
import com.example.fernandohenry.trabalhorandal.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutosActivity extends AppCompatActivity {

    private List<Produto> produtos;
    private ListView lvProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_produtos);

        produtos = getListaProdutos();
        lvProdutos = (ListView) findViewById(R.id.lvProdutos);

        lvProdutos.setAdapter(new ProdutoAdapter(ListaProdutosActivity.this, produtos));
        lvProdutos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(produtos.get(position).getId() == 1){
                    Brownie(view);
                } else if (produtos.get(position).getId() == 2){
                    Cookie(view);
                } else if (produtos.get(position).getId() == 3){
                    Bolo(view);
                } else {
                    Toast.makeText(ListaProdutosActivity.this,
                            produtos.get(position).getNome(),
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private List<Produto> getListaProdutos(){
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Brownie", "R$: 2,00", R.drawable.brownie));
        produtos.add(new Produto(2, "Cookie", "R$: 3,00", R.drawable.cokie));
        produtos.add(new Produto(3, "Bolo de pote", "R$: 5,00", R.drawable.bolodepote));
        return produtos;
    }

    public void Brownie(View view){
        Intent intent = new Intent(this, BrownieActivity.class);

        startActivity(intent);
        finish();
    }
    public void Cookie(View view){
        Intent intent = new Intent(this, Cookie.class);

        startActivity(intent);
        finish();
    }
    public void Bolo(View view){
        Intent intent = new Intent(this, BoloDePote.class);

        startActivity(intent);
        finish();
    }
}
