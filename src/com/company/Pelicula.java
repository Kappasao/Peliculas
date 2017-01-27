package com.company;

public class Pelicula {

    private long id;
    private String nombre;
    private int año;
    private String sinopsis;
    private String genero;
    private double precioEntrada;
    private int taquilla;


    public Pelicula(long id, String nombre, int año, String sinopsis, String genero, double precioEntrada, int taquilla) {
        this.id = id;
        this.nombre = nombre;
        this.año = año;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.precioEntrada = precioEntrada;
        this.taquilla= taquilla;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public int getTaquilla() {
        return taquilla;
    }

    public void setTaquilla(int taquilla) {
        this.taquilla = taquilla;
    }

    public double getRecaudacion(){
        return precioEntrada*taquilla;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", año=" + año +
                ", sinopsis='" + sinopsis + '\'' +
                ", genero='" + genero + '\'' +
                ", precioEntrada=" + precioEntrada +
                ", taquilla=" + taquilla +
                '}';
    }
}

