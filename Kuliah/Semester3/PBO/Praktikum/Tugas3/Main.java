package Kuliah.Semester3.PBO.Praktikum.Tugas3;

public class Main {
    public static void main(String[] args) {
        Grandparent grandparent = new Grandparent("John", 75);

        Parent father = new Parent("Michael", 45, "Engineer");
        Parent mother = new Parent("Susi", 40, "Housewife");

        Son son = new Son("Tom", 20, "Teacher", "University");

        Daughter daughter = new Daughter("Lucy", 18, "Doctor", "Painting");

        System.out.println("Grandparent Name: " + grandparent.getName());
        System.out.println("Grandparent Age: " + grandparent.getAge());

        System.out.println("\nFather Name: " + father.getName());
        System.out.println("Father Age: " + father.getAge());
        System.out.println("Father Job: " + father.getJob());

        System.out.println("\nMother Name: " + mother.getName());
        System.out.println("Mother Age: " + mother.getAge());
        System.out.println("Mother Job: " + mother.getJob());

        System.out.println("\nSon Name: " + son.getName());
        System.out.println("Son Age: " + son.getAge());
        System.out.println("Son Job: " + son.getJob());
        System.out.println("Son School: " + son.getSchool());

        System.out.println("\nDaughter Name: " + daughter.getName());
        System.out.println("Daughter Age: " + daughter.getAge());
        System.out.println("Daughter Job: " + daughter.getJob());
        System.out.println("Daughter Hobby: " + daughter.getHobby());
    }
}
