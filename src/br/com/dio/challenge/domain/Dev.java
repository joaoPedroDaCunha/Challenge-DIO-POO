package br.com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    
    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> completedContent = new LinkedHashSet<>();

    public void submitBootCamp(BootCamp bootcamp){
        this.subscribedContent.addAll(bootcamp.getContents());
        bootcamp.getSubmitDevs().add(this);
    }

    public void progress(){
        Optional<Content> contentOptional = this.subscribedContent.stream().findFirst();
        if(!contentOptional.isEmpty()){
            this.completedContent.add(contentOptional.get());
            this.subscribedContent.remove(contentOptional.get());
        }else{
            System.err.println("Você não esta maticulado em nenhum conteudo");
        }
    }

    public double calculeteTotalXP(){
        return completedContent.stream().mapToDouble(content -> content.calculeteXP()).sum();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((subscribedContent == null) ? 0 : subscribedContent.hashCode());
        result = prime * result + ((completedContent == null) ? 0 : completedContent.hashCode());
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
        Dev other = (Dev) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (subscribedContent == null) {
            if (other.subscribedContent != null)
                return false;
        } else if (!subscribedContent.equals(other.subscribedContent))
            return false;
        if (completedContent == null) {
            if (other.completedContent != null)
                return false;
        } else if (!completedContent.equals(other.completedContent))
            return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Content> getCompletedContent() {
        return completedContent;
    }

    public void setCompletedContent(Set<Content> completedContent) {
        this.completedContent = completedContent;
    }

    

}
