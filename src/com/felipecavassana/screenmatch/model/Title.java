package com.felipecavassana.screenmatch.model;

public class Title {
    private String name;
    private int yearRelease;
    private boolean planIncluded;
    private double ratingSum;
    private int totalRating;
    private int durationTimeMin;

    public Title(String name, int yearRelease) {
        this.name = name;
        this.yearRelease = yearRelease;
    }

    public String getName() {
        return name;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public boolean isPlanIncluded() {
        return planIncluded;
    }

    public int getDurationTimeMin() {
        return durationTimeMin;
    }

    public int getTotalRating() {
        return totalRating;
    }

    public double getRatingSum() {
        return ratingSum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }

    public void setDurationTimeMin(int durationTimeMin) {
        this.durationTimeMin = durationTimeMin;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Year of release: " + yearRelease);
        System.out.println("Duration in minutes: " + durationTimeMin);
        System.out.println("Included in the plan: " + planIncluded);
    }

    public void evaluate(double rating) {
        ratingSum += rating;
        totalRating++;
    }

    public double calculateMedia() {
        return ratingSum / totalRating;
    }
}