package com.felipecavassana.screenmatch.main;

import com.felipecavassana.screenmatch.calculations.CalculatorTime;
import com.felipecavassana.screenmatch.calculations.RecommendationFilter;
import com.felipecavassana.screenmatch.model.Episode;
import com.felipecavassana.screenmatch.model.Movie;
import com.felipecavassana.screenmatch.model.TVShow;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Movie 1
        Movie movie1 = new Movie("Big Hero 6",2014);
        movie1.setDurationTimeMin(102);
        movie1.setPlanIncluded(true);

        movie1.showInfo();
        movie1.evaluate(8.3);
        movie1.evaluate(10);
        movie1.evaluate(9.5);

        System.out.println(movie1.getRatingSum());
        System.out.println(movie1.getTotalRating());
        System.out.println(movie1.calculateMedia());

        // Movie 2
        Movie movie2 = new Movie("Avatar",2012);
        movie2.setDurationTimeMin(220);
        movie2.setPlanIncluded(true);

        movie2.showInfo();
        movie2.evaluate(10);
        movie2.evaluate(10);

        System.out.println(movie2.getRatingSum());
        System.out.println(movie2.getTotalRating());
        System.out.println(movie2.calculateMedia());

        var movie3 = new Movie("MI 6",2025);
        movie3.setPlanIncluded(true);
        movie3.evaluate(6.7);

        TVShow serie1 = new TVShow("Lost",2002);
        serie1.setEpisodesPerSeason(22);
        serie1.setMinutesPerEpisode(50);
        serie1.setSeasons(10);
        serie1.setActive(false);

        serie1.showInfo();
        System.out.println("Duração em minutos para maratonar a serie: "+ serie1.getDurationTimeMin());

        CalculatorTime calculatorTime = new CalculatorTime();
        calculatorTime.insert(movie1);
        calculatorTime.insert(movie2);
        calculatorTime.insert(serie1);

        System.out.println(calculatorTime.getTotalTime());

        Episode episode1 = new Episode();
        episode1.setNumber(1);
        episode1.setTvShow(serie1);
        episode1.setTotalViews(300);
        episode1.setTitle("Pilot");

        RecommendationFilter recommendationFilter = new RecommendationFilter();
        recommendationFilter.filter(movie1);
        recommendationFilter.filter(movie2);
        recommendationFilter.filter(episode1);

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(movie3);
        moviesList.add(movie1);
        moviesList.add(movie2);

        System.out.println("Quantidades de filmes criados: "+ moviesList.size());
        System.out.println("Primeiro filme: "+ moviesList.get(0).getName());

        System.out.println(moviesList);


    }
}