package com.ankithacks.thecaval;

/**
 * Created by DellSe on 15-05-2017.
 */

public class custom_regVehicles {

    private String text1,text2,text4;
    private int image;

    public custom_regVehicles(String text1, String text2, String text4, int image) {
        this.text1 = text1;
        this.text2 = text2;

        this.text4 = text4;
        this.image = image;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }



    public String getText4() {
        return text4;
    }

    public int getImage() {
        return image;
    }
}
