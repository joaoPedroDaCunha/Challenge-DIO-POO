package br.com.dio.challenge.doman;

import java.time.LocalDate;

public class Mentoring extends Content{
    

    private LocalDate date;
    
    public Mentoring(String title, String discription, LocalDate date) {
        super(title, discription);
        this.date = date;
    }

    public Mentoring(String title, LocalDate date) {
        super(title);
        this.date = date;
    }

    public Mentoring(){

    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring [title=" + super.getTitle() + ", discription=" + super.getDiscription() + ", date=" + date + "]";
    }

    @Override
    public double calculeteXP() {
        return XP_PADRAO + 20;
    }

    
}
