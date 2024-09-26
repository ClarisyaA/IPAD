package Kuliah.Semester3.PBO.Praktikum.Pertemuan3.tugas;

public class Son extends Parent {
    private String school;

    public Son(String name, int age, String job, String school) {
        super(name, age, job);
        this.school = school;
    }

    // Getter and Setter
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    // Override method display
    @Override
    protected void display() {
        super.display();  // Memanggil method dari kelas Parent
        System.out.println("\nSon Name: " + super.getName());
        System.out.println("Son Age: " + super.getAge());
        System.out.println("Son Job: " + super.getJob());
        System.out.println("Son School: " + school);
    }
}
