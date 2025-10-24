package com.felipecavassana.screenmatch.model;

import com.felipecavassana.screenmatch.calculations.Classification;

public class Movie extends Title implements Classification {
    private String director;

    public Movie(String name, int yearRelease) {
        super(name, yearRelease);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) calculateMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: "+ this.getName() +" ("+ this.getYearRelease() + ")";
    }
}
