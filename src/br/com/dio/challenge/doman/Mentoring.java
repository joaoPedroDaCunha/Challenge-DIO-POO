package br.com.dio.challenge.doman;

import java.time.LocalDate;

public class Mentoring {
    
    private String title;
    private String discription;
    private LocalDate date;
    
    public Mentoring(String title, String discription, LocalDate date) {
        this.title = title;
        this.discription = discription;
        this.date = date;
    }

    public Mentoring(String title, LocalDate date) {
        this.title = title;
        this.date = date;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring [title=" + title + ", discription=" + discription + ", date=" + date + "]";
    }

    
}
