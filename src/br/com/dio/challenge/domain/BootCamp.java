package br.com.dio.challenge.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class BootCamp {

    private String name;
    private String discipition;
    private final LocalDate initDate = LocalDate.now();
    private final LocalDate finalDate = initDate.plusDays(45);
    private Set<Dev> submitDevs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();
    
}
