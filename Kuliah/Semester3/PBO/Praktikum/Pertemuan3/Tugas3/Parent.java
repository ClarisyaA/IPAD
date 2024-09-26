package Kuliah.Semester3.PBO.Praktikum.Pertemuan3.Tugas3;

public class Parent {
    protected String name;
    protected int age;
    protected String job;

    public Parent(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setJob(String job) {
        this.job = job;
    }
    
    public String getJob() {
        return job;
    }
}
