package com.example.lesson2;

import java.io.Serializable;

public class Comp implements Serializable {
    private int mouse, pubg,headphones, multiplay;


    public Comp(int mouse, int pubg, int headphones, int multiplay) {
        this.mouse = mouse;
        this.pubg = pubg;
        this.headphones = headphones;
        this.multiplay = multiplay;
    }
    public int getMultiplay() {
        return multiplay;
    }

    public void setMultiplay(int multiplay) {
        this.multiplay = multiplay;
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