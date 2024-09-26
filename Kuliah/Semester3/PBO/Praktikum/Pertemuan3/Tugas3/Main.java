package Kuliah.Semester3.PBO.Praktikum.Pertemuan3.Tugas3;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Grandparents
        Grandparents grandpa = new Grandparents("John", 70);
        Grandparents grandma = new Grandparents("Mary", 68);

        // Membuat objek Parent
        Parent father = new Parent("Michael", 45, "Engineer");
        Parent mother = new Parent("Susan", 43, "Teacher");

        // Membuat objek Son
        Son son = new Son("Daniel", 20, "Student", "University of Example");

        // Membuat objek Daughter
        Daughter daughter = new Daughter("Emily", 18, "High School");

        // Menampilkan informasi
        System.out.println("Grandparents:");
        System.out.println("Grandpa: " + grandpa.getName() + ", Age: " + grandpa.getAge());
        System.out.println("Grandma: " + grandma.getName() + ", Age: " + grandma.getAge());

        System.out.println("\nParent:");
        System.out.println("Father: " + father.getName() + ", Age: " + father.getAge() + ", Job: " + father.getJob());
        System.out.println("Mother: " + mother.getName() + ", Age: " + mother.getAge() + ", Job: " + mother.getJob());

        System.out.println("\nSon:");
        System.out.println("Son1: " + son.getName() + ", Age: " + son.getAge() + ", Job: " + son.getJob() + ", School: " + son.getSchool());

        System.out.println("\nDaughter:");
        System.out.println("Daughter1: " + daughter.getName() + ", Age: " + daughter.getAge() + ", School: " + daughter.getSchool());
    }
}
