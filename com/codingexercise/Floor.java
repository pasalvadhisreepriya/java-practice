package com.codingexercise;

public class Floor {
    private double width;
    private double length;
    public Floor(double width, double length){
        this.width = width;
        this.length = length;
        if(width<0){
            this.width = 0;
        }
        if(length<0){
            this.length = 0;
        }
    }
    public double getArea(){
        return width*length; //for calculating area we multiply width and length
    }
}








