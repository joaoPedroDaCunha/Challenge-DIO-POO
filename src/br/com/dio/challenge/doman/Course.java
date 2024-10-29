package br.com.dio.challenge.doman;


public class Course extends Content{

    private int workload;
    
    public Course(String title, String description, int workload) {
        super(title, description);
        this.workload = workload;
    }

    public Course(String title, int workload) {
        super(title);
        this.workload = workload;
    }

    public Course(){

    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "[title=" + super.getTitle() + ", description=" + super.getDiscription() + ", workload=" + workload + "]";
    }

    @Override
    public double calculeteXP() {
        return XP_PADRAO * getWorkload();
    }
    
    
}
