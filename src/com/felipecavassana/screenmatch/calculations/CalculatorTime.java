package com.felipecavassana.screenmatch.calculations;

import com.felipecavassana.screenmatch.model.Title;

public class CalculatorTime {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void insert(Title title){
        this.totalTime += title.getDurationTimeMin();
    }
}
