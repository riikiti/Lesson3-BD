package com.example.lesson2;

import java.io.Serializable;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.content.Intent;
import android.widget.RadioButton;
import android.database.sqlite.SQLiteDatabase;

public class Comp implements Serializable {
    private String mouse, pubg, headphones,name;
    private int multiply, pMouse, pHeadphones, pPubg;


    public Comp() {
        this.mouse = mouse;
        this.pubg = pubg;
        this.headphones = headphones;
        this.multiply = 0;
        this.pMouse = 0;
        this.pHeadphones = 0;
        this.pPubg = 0;
    }

    public void InsertToBD(SQLiteDatabase db, String s) {
        db.execSQL("INSERT OR IGNORE INTO lots VALUES (s , this.multiply)");
    }

    //getPrice
    public int getpMouse() {
        return pMouse;
    }

    public int getpHeadphones() {
        return pHeadphones;
    }

    public int getpPubg() {
        return pPubg;
    }

    //Get

    public String getName() {
        return name;
    }

    public String getMouse() {
        return mouse;
    }

    public String getPubg() {
        return pubg;
    }

    public String getHeadphones() {
        return headphones;
    }

    public int getMultiply() {
        return multiply;
    }


    //Set

    public void setName(String name) {
        this.name = name;
    }

    public void setMouse(String mouse, int pMouse) {
        this.mouse = mouse;
        this.pMouse = pMouse;
    }

    public void setPubg(String pubg, int pPubg) {
        this.pubg = pubg;
        this.pPubg = pPubg;
    }

    public void setHeadphones(String headphones, int pHeadphones) {
        this.headphones = headphones;
        this.pHeadphones = pHeadphones;
    }

    public void setMultiply(int multiply) {
        this.multiply = multiply;
    }

}