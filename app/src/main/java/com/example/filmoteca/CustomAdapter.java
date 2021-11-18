package com.example.filmoteca;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Context context;
    List<Pelicula>lst;

    public CustomAdapter(Context context, List<Pelicula> lst) {
        this.context = context;
        this.lst = lst;
    }

    @Override
    public int getCount() {
        return lst.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imgpelicula;
        TextView titulo;
        TextView desc;
        Pelicula p=lst.get(i);

        if (view==null)
            view= LayoutInflater.from(context).inflate(R.layout.item,null);

        imgpelicula=view.findViewById(R.id.imgpeli);
        titulo=view.findViewById(R.id.txtTitulo);
        desc= view.findViewById(R.id.txtContenido);

        imgpelicula.setImageResource(p.imagen);
        titulo.setText(p.titulo);
        desc.setText(p.desc);
        return view;
    }
}
