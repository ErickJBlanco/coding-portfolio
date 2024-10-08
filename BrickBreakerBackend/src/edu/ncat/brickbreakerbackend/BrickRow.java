package edu.ncat.brickbreakerbackend;
/*
Student Name: Erick Blanco
o Date: 09/26/2024
o Class / Section: Comp 167- 003
o This class will be what colors the rows of bricks will be.
 */

import javafx.scene.paint.Color;
import java.util.ArrayList;
//the BrickRow classes for the colors of the bricks
//and the bricks themselves.
public class BrickRow {
    //initializing values
    private int pointValue;
    private Color color;
    private boolean[] brickMask;

    public BrickRow() {
        this.pointValue = 0;
        this.color = Color.PURPLE;
        this.brickMask = new boolean[10];
    }

    public BrickRow(int pointValue, Color color, String brickMask) {
        setPointValue(pointValue);
        setColor(color);

        this.brickMask = new boolean[brickMask.length()];
        for (int i = 0; i < brickMask.length(); i++) {
            if( (brickMask.charAt(i) == '1')) {
                this.brickMask[i] = true;
            }
            else {
                this.brickMask[i] = false;// Converts to true and false
            }
        }
    }


    public boolean getBrickMaskValue(int index) {
        if (index >= 0 && index < brickMask.length) {
            return brickMask[index];
        } else {
            return false;
        }
    }

    public void setBrickMaskValue(int index, boolean value) {
        if (index >= 0 && index < brickMask.length) {
            brickMask[index] = value;
        }
    }

    public int getBrickMaskLength() {
        return brickMask.length;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String toString() {


        String result = pointValue + System.getProperty("line.separator") + (int) ((color.getRed()) * 255) + " " +
                (int) (color.getGreen() * 255) + " " + (int)(color.getBlue() * 255) + System.getProperty("line.separator");

        for (int i = 0; i < brickMask.length; i++) {
            if (brickMask[i]) {
                result += "1";
            } else {
                result += "0";
            }
        }
    return result;
    }

}