package com.felipecavassana.screenmatch.main;

import com.felipecavassana.screenmatch.model.Movie;
import com.felipecavassana.screenmatch.model.TVShow;
import com.felipecavassana.screenmatch.model.Title;

import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Big Hero 6",2014);
        movie1.evaluate(9);
        Movie movie2 = new Movie("Avatar",2012);
        movie2.evaluate(7.5);
        var movie3 = new Movie("MI 6",2025);
        movie3.evaluate(10);
        TVShow serie1 = new TVShow("Lost",2002);

        ArrayList<Title> arrayList = new ArrayList<>();
        arrayList.add(movie1);
        arrayList.add(movie2);
        arrayList.add(movie3);
        arrayList.add(serie1);

        for (Title title : arrayList){
            System.out.println(title);
            if (title instanceof Movie movie && movie.getClassification() > 2) {
                System.out.println("Classificação: " + movie.getClassification());
            }
        }
    }
}
