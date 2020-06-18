package com.twschool.practice;

public class MarsRoverPostion {
    private int coordinatesX;
    private int coordinatesY;
    private String direction;

    public MarsRoverPostion(int coordinatesX, int coordinatesY, String direction) {
        this.coordinatesX=coordinatesX;
        this.coordinatesY = coordinatesY;
        this.direction = direction;
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
