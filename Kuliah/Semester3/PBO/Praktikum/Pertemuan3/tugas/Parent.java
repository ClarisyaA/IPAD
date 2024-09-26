package Kuliah.Semester3.PBO.Praktikum.Pertemuan3.tugas;

public class Parent extends Grandparent {
    private String job;

    public Parent(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    // Getter and Setter
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    // Override method display
    @Override
    protected void display() {
        super.display();  // Memanggil method dari kelas Grandparent
        System.out.println("\nParent Name: " + super.getName());
        System.out.println("Parent Age: " + super.getAge());
        System.out.println("Parent Job: " + job);
    }
}
