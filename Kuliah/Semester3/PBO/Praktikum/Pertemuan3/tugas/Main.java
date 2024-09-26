package Kuliah.Semester3.PBO.Praktikum.Pertemuan3.tugas;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Grandparent
        Grandparent grandparent = new Grandparent("John", 70);

        // Membuat objek Parent
        Parent parent = new Parent("Michael", 45, "Engineer");

        // Membuat objek Son
        Son son = new Son("Daniel", 20, "Student", "University of Example");

        // Membuat objek Daughter
        Daughter daughter = new Daughter("Emily", 18, "Student", "High School");
        System.out.println();

        // Menampilkan informasi menggunakan metode yang di-override
        grandparent.display();
        System.out.println();

        parent.display();
        System.out.println();

        son.display();
        System.out.println();

        daughter.display();
        System.out.println();

        // Menggunakan getter dan setter
        son.setName("Daniel Smith");
        daughter.setJob("Teacher");

        System.out.println("Updated Son Name: " + son.getName());
        System.out.println();

        System.out.println("Updated Daughter Job: " + daughter.getJob());
        System.out.println();
    }
}
