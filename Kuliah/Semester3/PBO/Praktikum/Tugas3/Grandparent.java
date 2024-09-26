package Kuliah.Semester3.PBO.Praktikum.Tugas3;

public class Grandparent {
    private String name;
    private int age;

    public Grandparent() {
        this.name = "";
        this.age = 0;
    }

    public Grandparent(String name, int age) {
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
