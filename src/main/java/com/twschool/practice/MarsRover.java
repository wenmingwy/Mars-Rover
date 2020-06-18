package com.twschool.practice;

public class MarsRover {
    private MarsRoverPostion marsRoverPostion;
    public MarsRover(MarsRoverPostion marsRoverPostion) {
        this.marsRoverPostion=marsRoverPostion;
    }

    public MarsRoverPostion receive(String command) {
        int tempCoordinatesY = marsRoverPostion.getCoordinatesY();
        int tempCoordinatesX = marsRoverPostion.getCoordinatesX();
        String  tempDirection = marsRoverPostion.getDirection();

        if(command.equals("M") && marsRoverPostion.getDirection().equals("N")) {
            marsRoverPostion.setCoordinatesY(tempCoordinatesY + 1);
        } else if(command.equals("M") && marsRoverPostion.getDirection().equals("E") ){
            marsRoverPostion.setCoordinatesX(tempCoordinatesX + 1);
        }else if(command.equals("M") && marsRoverPostion.getDirection().equals("S")) {
            marsRoverPostion.setCoordinatesY(tempCoordinatesY - 1);
        } else if(command.equals("M") && marsRoverPostion.getDirection().equals("W") ){
            marsRoverPostion.setCoordinatesX(tempCoordinatesX - 1);
        }else if(command.equals("M") && marsRoverPostion.getDirection().equals("W") ) {
            marsRoverPostion.setCoordinatesX(tempCoordinatesX - 1);
        }else if(command.equals("L") && marsRoverPostion.getDirection().equals("N") ) {
            marsRoverPostion.setDirection("W");
        }else if(command.equals("L") && marsRoverPostion.getDirection().equals("E") ) {
            marsRoverPostion.setDirection("N");
        }else if(command.equals("L") && marsRoverPostion.getDirection().equals("S") ) {
            marsRoverPostion.setDirection("E");
        }else if(command.equals("L") && marsRoverPostion.getDirection().equals("W") ) {
            marsRoverPostion.setDirection("S");
        }else if(command.equals("R") && marsRoverPostion.getDirection().equals("N") ) {
            marsRoverPostion.setDirection("E");
        }else if(command.equals("R") && marsRoverPostion.getDirection().equals("E") ) {
            marsRoverPostion.setDirection("S");
        }else if(command.equals("R") && marsRoverPostion.getDirection().equals("S") ) {
            marsRoverPostion.setDirection("W");
        }else if(command.equals("R") && marsRoverPostion.getDirection().equals("W") ) {
            marsRoverPostion.setDirection("N");
        }
        return  marsRoverPostion;
    }
}
