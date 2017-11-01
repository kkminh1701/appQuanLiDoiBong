package com.example.pc.appquanlidoibong.com.models;


import java.io.Serializable;

public class DoiBong implements Serializable {
    private int diem;
    private int image;
    private String name;
    private String coach;
    private String level;


    public DoiBong() {
    }

    public int getDiem() {

        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public DoiBong(int diem, int image, String name, String coach, String level) {

        this.diem = diem;
        this.image = image;
        this.name = name;
        this.coach = coach;
        this.level = level;
    }
}

