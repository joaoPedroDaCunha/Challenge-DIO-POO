package br.com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    
    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> completedContent = new LinkedHashSet<>();

    public void submitBootCamp(BootCamp bootcamp){}

    public void progress(){}

    public void calculeteTotalXP(){}

    

}
