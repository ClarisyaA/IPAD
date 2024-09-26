package Kuliah.Semester3.PBO.Praktikum.Pertemuan3.Tugas3;

public class Daughter {
    protected String name;
    protected int age;
    protected String school;

    public Daughter(String name, int age, String school) {
        this.name = name;
        this.age = age;
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

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }
    
}
