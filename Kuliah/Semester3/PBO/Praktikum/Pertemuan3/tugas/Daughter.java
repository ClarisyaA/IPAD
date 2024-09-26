package Kuliah.Semester3.PBO.Praktikum.Pertemuan3.tugas;

public class Daughter extends Parent {
    private String hobby;

    public Daughter(String name, int age, String job, String hobby) {
        super(name, age, job);
        this.hobby = hobby;
    }

    // Getter and Setter
    public String gethobby() {
        return hobby;
    }

    public void sethobby(String hobby) {
        this.hobby = hobby;
    }

    // Override method display
    @Override
    protected void display() {
        super.display();  // Memanggil method dari kelas Parent
        System.out.println("\nDaughter Name: " + super.getName());
        System.out.println("Daughter Age: " + super.getAge());
        System.out.println("Daughter Job: " + super.getJob());
        System.out.println("Daughter hobby: " + hobby);
    }
}
