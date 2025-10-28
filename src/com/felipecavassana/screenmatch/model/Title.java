package com.felipecavassana.screenmatch.model;

import com.felipecavassana.screenmatch.exception.ErroDeConversaoDeAnoException;
import com.felipecavassana.screenmatch.model.record.TitleOMDB;

public class Title implements Comparable<Title> {
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

    public Title(TitleOMDB titleOMDB) {
        this.name = titleOMDB.title();
        if (titleOMDB.year().length() > 04){
            throw new ErroDeConversaoDeAnoException("Ano não convertido");
        }
        this.yearRelease = Integer.valueOf(titleOMDB.year());
        this.durationTimeMin = Integer.valueOf(titleOMDB.runtime().split(" ")[0]);
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

    @Override
    public int compareTo(Title o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", yearRelease=" + yearRelease +
                ", durationTimeMin=" + durationTimeMin +
                '}';
    }
}