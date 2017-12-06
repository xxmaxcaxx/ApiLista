package com.example.fernandohenry.trabalhorandal.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fernandohenry.trabalhorandal.R;
import com.example.fernandohenry.trabalhorandal.model.Produto;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by User on 26/11/2017.
 */

public class ProdutoAdapter extends BaseAdapter {

    private Context context;
    private List<Produto> produtos;
    public ProdutoAdapter(Context context, List<Produto> produtos){
        this.context = context;
        this.produtos = produtos;
    }

    @Override
    public int getCount() {
        return produtos.size();
    }

    @Override
    public Object getItem(int position){
        return produtos.get(position);
    }

    @Override
    public long getItemId(int position){
        return produtos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View view;

        ProdutoViewHolder holder;

        if(convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.produto_item, parent, false);
            holder = new ProdutoViewHolder(view);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (ProdutoViewHolder)view.getTag();
        }

        Produto produto = produtos.get(position);

        holder.ivProduto.setImageDrawable(ContextCompat.getDrawable(context, produto.getResourceIdImagem()));
        holder.tvNome.setText(produto.getNome());
        holder.tvAnoProduto.setText(String.valueOf(produto.getAnoProduto()));

        return view;

    }

    public class ProdutoViewHolder {
        final ImageView ivProduto;
        final TextView tvNome;
        final TextView tvAnoProduto;

        public ProdutoViewHolder(View view){
            ivProduto = (ImageView) view.findViewById(R.id.ivProduto);
            tvNome = (TextView) view.findViewById(R.id.tvNome);
            tvAnoProduto  = (TextView) view.findViewById(R.id.tvAnoProduto);
        }
    }
}
