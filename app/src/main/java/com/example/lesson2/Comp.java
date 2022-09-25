package com.example.lesson2;

import java.io.Serializable;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.content.Intent;
import android.widget.RadioButton;
import android.database.sqlite.SQLiteDatabase;

public class Comp implements Serializable {
    private int mouse, pubg, headphones, multiply;


    public Comp(int mouse, int pubg, int headphones, int multiply) {
        this.mouse = mouse;
        this.pubg = pubg;
        this.headphones = headphones;
        this.multiply = multiply;
    }

    public void InsertToBD(SQLiteDatabase db, String s) {
        db.execSQL("INSERT OR IGNORE INTO lots VALUES (s , this.multiply)");
    }

    public int getMultiply() {
        return multiply;
    }

    public void setMultiply(int multiply) {
        this.multiply = multiply;
    }

    public int getMouse() {
        return mouse;
    }

    public int getPubg() {
        return pubg;
    }

    public int getHeadphones() {
        return headphones;
    }

    public void setMouse(int mouse) {
        this.mouse = mouse;
    }

    public void setPubg(int pubg) {
        this.pubg = pubg;
    }

    public void setHeadphones(int headphones) {
        this.headphones = headphones;
    }

}