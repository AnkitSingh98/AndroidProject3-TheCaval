package com.ankithacks.thecaval;

/**
 * Created by DellSe on 15-05-2017.
 */

public class custom_booking_history {

    private String text1,text3;
    long text2;
    long text4;

    public custom_booking_history(String text1,  long text2, String text3,long text4) {
        this.text1 = text1;
        this.text3 = text3;
        this.text2 = text2;
        this.text4 = text4;
    }

    public String getText1() {
        return text1;
    }

    public String getText3() {
        return text3;
    }

    public long getText2() {
        return text2;
    }

    public long getText4() {
        return text4;
    }
}
