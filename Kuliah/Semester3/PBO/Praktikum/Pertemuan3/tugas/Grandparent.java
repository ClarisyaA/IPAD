package Kuliah.Semester3.PBO.Praktikum.Pertemuan3.tugas;

public class Grandparent {
    private String name;
    private int age;

    public Grandparent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method untuk di-override
    protected void display() {
        System.out.println("Grandparent Name: " + getName());
        System.out.println("Grandparent Age: " + getAge());
    }
}
