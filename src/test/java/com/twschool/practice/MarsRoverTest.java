package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {

    @Test
    public void should_return_x_0_y_0_direction_N_given_x0_y0_N_command_M(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,"N");
        MarsRover marsRover = new MarsRover(marsRoverPostion);

        //when
        MarsRoverPostion result = marsRover.receive("M");

        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(1,result.getCoordinatesY());
        Assert.assertEquals("N",result.getDirection());

    }

    @Test
    public void should_return_x_0_y_0_direction_W_given_x0_y0_N_command_L(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,"N");
        MarsRover marsRover = new MarsRover(marsRoverPostion);

        //whenL
        MarsRoverPostion result = marsRover.receive("L");

        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("W",result.getDirection());
    }

    @Test
    public void should_return_x_0_y_0_direction_E_given_x0_y0_N_command_R(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,"N");
        MarsRover marsRover = new MarsRover(marsRoverPostion);

        //whenL
        MarsRoverPostion result = marsRover.receive("R");

        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("E",result.getDirection());
    }



    @Test
    public void should_return_x_0_y_0_direction_W_given_x0_y0_W_command_M(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,"W");
        MarsRover marsRover = new MarsRover(marsRoverPostion);

        //when
        MarsRoverPostion result = marsRover.receive("M");

        //then
        Assert.assertEquals(-1,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("W",result.getDirection());
    }

    @Test
    public void should_return_x_0_y_0_direction_S_given_x0_y0_W_command_L(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,"W");
        MarsRover marsRover = new MarsRover(marsRoverPostion);

        //when
        MarsRoverPostion result = marsRover.receive("L");

        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("S",result.getDirection());
    }


    @Test
    public void should_return_x_0_y_0_direction_S_given_x0_y0_W_command_R(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,"W");
        MarsRover marsRover = new MarsRover(marsRoverPostion);

        //when
        MarsRoverPostion result = marsRover.receive("R");

        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("N",result.getDirection());
    }

    @Test
    public void should_return_x_0_y_0_direction_S_given_x0_y0_S_command_M(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,"S");
        MarsRover marsRover = new MarsRover(marsRoverPostion);

        //when
        MarsRoverPostion result = marsRover.receive("M");

        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(-1,result.getCoordinatesY());
        Assert.assertEquals("S",result.getDirection());
    }

    @Test
    public void should_return_x_0_y_0_direction_E_given_x0_y0_S_command_L(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,"S");
        MarsRover marsRover = new MarsRover(marsRoverPostion);

        //when
        MarsRoverPostion result = marsRover.receive("L");

        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("E",result.getDirection());
    }
    @Test
    public void should_return_x_0_y_0_direction_W_given_x0_y0_S_command_R(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,"S");
        MarsRover marsRover = new MarsRover(marsRoverPostion);

        //when
        MarsRoverPostion result = marsRover.receive("R");

        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("W",result.getDirection());
    }

    @Test
    public void should_return_x_0_y_0_direction_E_given_x0_y0_E_command_M(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,"E");
        MarsRover marsRover = new MarsRover(marsRoverPostion);

        //when
        MarsRoverPostion result = marsRover.receive("M");

        //then
        Assert.assertEquals(1,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("E",result.getDirection());
    }

    @Test
    public void should_return_x_0_y_0_direction_E_given_x0_y0_E_command_L(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,"E");
        MarsRover marsRover = new MarsRover(marsRoverPostion);

        //when
        MarsRoverPostion result = marsRover.receive("L");

        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("N",result.getDirection());
    }

    @Test
    public void should_return_x_0_y_0_direction_E_given_x0_y0_E_command_R(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,"E");
        MarsRover marsRover = new MarsRover(marsRoverPostion);

        //when
        MarsRoverPostion result = marsRover.receive("R");

        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("S",result.getDirection());
    }


















//    @Test
//    public void should_return_0_0_W_given_0_0_N_M(){
//        //given
//        DoAction doAction = new DoAction();
//
//        //when
//        String result = doAction.action(0,0,"N","M");
//
//        //then
//        Assert.assertEquals("00W",result);
//    }
//    public void should_return_0_0_W_given_0_0_N_L(){}
//    public void should_return_0_0_W_given_0_0_N_M_L(){}
//    public void should_return_0_0_W_given_0_0_N_L_M(){}





}
