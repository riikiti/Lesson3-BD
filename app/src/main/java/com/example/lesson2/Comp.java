package com.example.lesson2;

public class Comp {
    private int mouse, pubg,headphones;

    public Comp(int mouse, int pubg, int headphones) {
        this.mouse = mouse;
        this.pubg = pubg;
        this.headphones = headphones;
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