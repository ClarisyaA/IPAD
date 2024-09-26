package Kuliah.Semester3.PBO.Praktikum.Pertemuan3.Tugas3;

public class Grandparents {
    protected String name;
    protected int age;

    public Grandparents(String name, int age) {
        this.name = name;
        this.age = age;
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

}
