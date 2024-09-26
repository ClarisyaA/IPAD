package Kuliah.Semester3.PBO.Praktikum.Tugas3;

public class Daughter extends Parent {
    private String hobby;

    public Daughter(String name, int age, String job, String hobby) {
        super(name, age, job); 
        this.hobby = hobby;
    }

    public Daughter() {
        super();
        this.hobby = "";
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    
}
