package Kuliah.Semester3.PBO.Praktikum.Tugas3;

public class Parent extends Grandparent {
    private String job;

    public Parent(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public Parent(){
        super();
        this.job = "";
    }

    public void setJob(String job){
        this.job = job;
    }
    public String getJob() {
        return job;
    }
}
