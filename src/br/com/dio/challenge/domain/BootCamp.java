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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDiscipition() {
        return discipition;
    }
    public void setDiscipition(String discipition) {
        this.discipition = discipition;
    }
    public LocalDate getInitDate() {
        return initDate;
    }
    public LocalDate getFinalDate() {
        return finalDate;
    }
    public Set<Dev> getSubmitDevs() {
        return submitDevs;
    }
    public void setSubmitDevs(Set<Dev> submitDevs) {
        this.submitDevs = submitDevs;
    }
    public Set<Content> getContents() {
        return contents;
    }
    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((discipition == null) ? 0 : discipition.hashCode());
        result = prime * result + ((initDate == null) ? 0 : initDate.hashCode());
        result = prime * result + ((finalDate == null) ? 0 : finalDate.hashCode());
        result = prime * result + ((submitDevs == null) ? 0 : submitDevs.hashCode());
        result = prime * result + ((contents == null) ? 0 : contents.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BootCamp other = (BootCamp) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (discipition == null) {
            if (other.discipition != null)
                return false;
        } else if (!discipition.equals(other.discipition))
            return false;
        if (initDate == null) {
            if (other.initDate != null)
                return false;
        } else if (!initDate.equals(other.initDate))
            return false;
        if (finalDate == null) {
            if (other.finalDate != null)
                return false;
        } else if (!finalDate.equals(other.finalDate))
            return false;
        if (submitDevs == null) {
            if (other.submitDevs != null)
                return false;
        } else if (!submitDevs.equals(other.submitDevs))
            return false;
        if (contents == null) {
            if (other.contents != null)
                return false;
        } else if (!contents.equals(other.contents))
            return false;
        return true;
    }

    
    
}
