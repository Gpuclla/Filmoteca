package com.example.filmoteca;

public class Pelicula {
     int id;
     int imagen;
     String titulo;
     String desc;
     String sinopsis;
     String link;


    public Pelicula(int id, int imagen, String titulo, String desc,String sinopsis,String link){
        this.id = id;
        this.imagen = imagen;
        this.titulo = titulo;
        this.desc = desc;
        this.sinopsis = sinopsis;
        this.link=link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSinopsis() { return sinopsis; }

    public void setSinopsis(String sinopsis) { this.sinopsis = sinopsis; }
    public String getLink() {return link;}

    public void getLink(String sinopsis) { this.link = link;
    }
}
