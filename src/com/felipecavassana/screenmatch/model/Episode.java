package com.felipecavassana.screenmatch.model;

import com.felipecavassana.screenmatch.calculations.Classification;

public class Episode implements Classification {
    private int number;
    private String title;
    private TVShow tvShow;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TVShow getTvShow() {
        return tvShow;
    }

    public void setTvShow(TVShow tvShow) {
        this.tvShow = tvShow;
    }

    @Override
    public int getClassification() {
        int stars = 2;
        if (totalViews > 100) {
            stars = 4;
        }
        return stars;
    }
}
