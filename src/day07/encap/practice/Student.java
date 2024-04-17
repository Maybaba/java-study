package day07.encap.practice;

public class Student {
    //field
    private String name;
    private String studentId;
    private String department;

    //constructor
    //setter , getter
    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            System.out.println("제대로된 값 입력해주세으!!");
        }
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setStudentId(String studentId ) {
        this.studentId = studentId;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }

}
