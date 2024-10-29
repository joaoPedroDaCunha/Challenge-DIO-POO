package br.com.dio.challenge.domain;

public abstract class Content {
    
    protected static final double XP_PADRAO = 10d;

    private String title;
    private String discription;

    public Content(){

    }

    public Content(String title){
        this.title = title;
    }

    public Content(String title,String discription){
        this.title = title;
        this.discription = discription;
    }

    public String getTitle() {
        return title;
    }



    public void setTitle(String title) {
        this.title = title;
    }



    public String getDiscription() {
        return discription;
    }



    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public abstract double calculeteXP();
}
