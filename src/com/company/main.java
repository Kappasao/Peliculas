package com.company;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        Pelicula theRevenant = new Pelicula(1l, "The Revenant", 2015, "Año 1823...", "Acción", 8.5, 1000);
        Pelicula shutterIsland = new Pelicula(2l, "Shutter Island", 2010, "En el verano de 1954...", "Thriller", 8.5, 1250);
        Pelicula inception = new Pelicula(3l, "Inception", 2010, "Un ladrón...", "Thriller", 9, 2000);

        List<Pelicula> peliculaList = new ArrayList<>();

        peliculaList.add(theRevenant);
        peliculaList.add(shutterIsland);
        peliculaList.add(inception);

        for (Pelicula pelicula : peliculaList) {

            if (pelicula.getAño() == 2010) {
                System.out.println(pelicula);
            }

        }
        for (Pelicula pelicula : peliculaList){

            if (pelicula.getRecaudacion()>= 10000){
                System.out.println(pelicula);
            }
        }



//        peliculaList.
//                stream().
//                filter(pelicula -> pelicula.getAño() == 2010).
//                forEach(pelicula -> System.out.println(pelicula));


    }
}