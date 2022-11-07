import java.util.*;
import java.io.*;

class StudentCourse {
    private String studentId;
    private String studentName;
    private String studentClass;
    private String studentEmail;

    public StudentCourse(String studentId, String studentName, String studentClass, String studentEmail) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.studentEmail = studentEmail;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public String toString() {
        return studentId + " " + studentName + " " + studentClass + " " + studentEmail;
    }
}

public class J05023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<StudentCourse> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String studentId = sc.nextLine();
            String studentName = sc.nextLine();
            String studentClass = sc.nextLine();
            String studentEmail = sc.nextLine();
            StudentCourse student = new StudentCourse(studentId, studentName, studentClass, studentEmail);
            list.add(student);
        }
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String course = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + course + ":");
            for (StudentCourse student : list) {
                if (student.getStudentClass().substring(1, 3).equals(course.substring(2))) {
                    System.out.println(student);
                }
            }

        }
    }
}
