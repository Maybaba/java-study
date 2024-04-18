package day08.practice;

public class Department {
    //field
    private String departmentName; //instance
    private int studentCount; //instance
    private static int totalStudents; //static

    //method
    Department(String departmentName, int studentCount) {
        this.departmentName = departmentName;
        this.studentCount = studentCount; //엥 안돼!!!
        //총 학생 수 누적
        totalStudents += studentCount;
    }
    //학과별 학생 수 더하기 static - 공유하는 데이터!
    public void addStudent(int addStudentNum) {
        this.studentCount += addStudentNum;
        totalStudents += addStudentNum;
    }
    // 학과별 학생 수 리턴
    public int getStudentCount() {
        return studentCount;
    }
    //전체 학생 수 리턴
    public static int getTotalStudents() { //전체 학생 수 공유하기
        return totalStudents;
    }
}
