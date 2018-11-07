package com.pro1.vukn.englishforkids.model;

/**
 * Created by Toan on 30/11/2017.
 */

public class Game {
    private int id;
   private String cauHoi;
   private String a;
   private String b;
   private String c;
   private String d;
   private String dapanDung;

    public Game() {
    }

    public Game(int id, String cauHoi, String a, String b, String c, String d, String dapanDung) {
        this.id = id;
        this.cauHoi = cauHoi;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.dapanDung = dapanDung;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCauHoi() {
        return cauHoi;
    }

    public void setCauHoi(String cauHoi) {
        this.cauHoi = cauHoi;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getDapanDung() {
        return dapanDung;
    }

    public void setDapanDung(String dapanDung) {
        this.dapanDung = dapanDung;
    }
}
