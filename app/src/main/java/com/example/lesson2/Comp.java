package com.example.lesson2;

import java.io.Serializable;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.content.Intent;
import android.widget.RadioButton;


public class Comp implements Serializable {
    private String oc, anti, clear, name;
    private int multiply, pOc, pAnti, pClear;


    public Comp() {
        this.oc = "none";
        this.anti = "none";
        this.clear = "none";
        this.multiply = 0;
        this.pOc = 0;
        this.pAnti = 0;
        this.pClear = 0;
    }


    //getPrice
    public int getpOc() {
        return pOc;
    }

    public int getpAnti() {
        return pAnti;
    }

    public int getpClear() {
        return pClear;
    }

    //Get

    public String getName() {
        return name;
    }

    public String getOc() {
        return oc;
    }

    public String getAnti() {
        return anti;
    }

    public String getClear() {
        return clear;
    }

    public int getMultiply() {
        return multiply;
    }


    //Set

    public void setName(String name) {
        this.name = name;
    }

    public void setOc(String oc, int pOc) {
        this.oc = oc;
        this.pOc = pOc;
    }

    public void setAnti(String anti, int pClear) {
        this.anti = anti;
        this.pClear = pClear;
    }

    public void setClear(String clear, int pAnti) {
        this.clear = clear;
        this.pAnti = pAnti;
    }

    public void setMultiply(int multiply) {
        this.multiply = multiply;
    }

}