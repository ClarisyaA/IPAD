package Kuliah.Semester3.PBO.Praktikum.Pertemuan3.Tugas3;

public class Son {
    protected String name;
    protected int age;
    protected String job;
    protected String school;

    public Son(String name, int age, String job, String school) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.school = school;
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

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }
}
