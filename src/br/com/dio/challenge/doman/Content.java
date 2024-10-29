package br.com.dio.challenge.doman;

public abstract class Content {
    
    protected static final double XP_PADRAO = 10d;

    private String title;
    private String discription;

    public abstract double calculeteXP();
}
