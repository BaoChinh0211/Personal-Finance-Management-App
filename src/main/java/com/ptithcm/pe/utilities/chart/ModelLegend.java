package com.ptithcm.pe.utilities.chart;

import java.awt.Color;

public class ModelLegend {
    String name;
    Color color;

    public ModelLegend(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public ModelLegend() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
}
