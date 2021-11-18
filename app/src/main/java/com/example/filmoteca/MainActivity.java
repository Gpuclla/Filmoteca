package com.example.filmoteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    ListView listapeli;
    ImageButton btnarte,btnyou;
    List<Pelicula> lst;
    private String url1,url2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listapeli=findViewById(R.id.lista);
        url1="https://centroqosqodeartenativo.com/es/";
        url2="https://www.youtube.com/watch?v=Jsw9Vnrsg3M";

        CustomAdapter adapter= new CustomAdapter(this,GetData());
        listapeli.setAdapter(adapter);
        listapeli.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Pelicula p=lst.get(i);
                Intent openvideo = new Intent(MainActivity.this,VideoActivity.class)
                        .putExtra("titulo",p.titulo)
                        .putExtra("sinopsis",p.sinopsis)
                        .putExtra("link",p.link);
                startActivity(openvideo);
                Toast.makeText(getBaseContext(),p.titulo,Toast.LENGTH_SHORT).show();
            }
        });

    }

        private List<Pelicula> GetData() {
        lst=new ArrayList<>();
        lst.add(new Pelicula(1,R.drawable.el_cargaddor,"El cargador","1957","Pelicula documental sobre los cargadores cusqueños","https://drive.google.com/file/d/1xraIXwtn5ihSIucncSabeKpGnt--huDd/preview"));
        lst.add(new Pelicula(2,R.drawable.land_incas,"El mundo de los incas(1937)","1937","Documental mudo sobre el cusco de 1937","https://drive.google.com/file/d/1TTEA37WrIcPZX9r8Xa-UkIkYPyVTOVZZ/preview"));
        return lst;
    }
}