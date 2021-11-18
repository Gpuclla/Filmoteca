package com.example.filmoteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.VideoView;
import java.util.List;

public class VideoActivity extends AppCompatActivity {
    WebView movie;
    TextView nombre,sinopsis;
    List<Pelicula> lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        movie= findViewById(R.id.PeliView);
        nombre= findViewById(R.id.txtTitulo);
        sinopsis=findViewById(R.id.txtSinopsis);

        Intent i = getIntent();
        String titulo= i.getStringExtra("titulo");
        String sinop= i.getStringExtra("sinopsis");
        nombre.setText(titulo);
        sinopsis.setText(sinop);
        WebSettings webSettings= movie.getSettings();
        webSettings.setJavaScriptEnabled(true);
        movie.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

/*webView.setWebChromeClient(new WebChromeClient(){
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
});*/
        movie.loadUrl(i.getStringExtra("link"));

        /*movie.setVideoPath(i.getStringExtra("link"));// usar un link .mp4 para reproducir, pero sin controles
        movie.start();*/

    }

}