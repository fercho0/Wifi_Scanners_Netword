package com.example.forevertucode.wifi_scanners_netword;

public class Element {
    private String title;
    private String subtitle;

    public Element(String t, String s){
        this.title=t;
        this.subtitle=s;
    }

    public String getTitle(){
        return this.title;
    }

    public String getSubtitle(){
        return this.subtitle;
    }

}
