package Kuliah.Semester3.PBO.Praktikum.Tugas3;

public class Son extends Parent {
    private String school;

    public Son(String name, int age, String job, String school) {
        super(name, age, job); 
        this.school = school;
    }

    public Son(){
        super();
        this.school = "";
    }

    public void setSchool(String school){
        this.school = school;
    }
    public String getSchool() {
        return school;
    }

}
