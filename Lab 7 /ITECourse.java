package week7;

import java.util.ArrayList;
import java.util.List;


public class ITECourse {

//    data - fields - instance variables
    private String name;
    private int code;
    private  List<String> students;
    private int maxStudents;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents < 0){
            return;
        }
        this.maxStudents = maxStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ITECourse(String courseName, int courseCode, int courseMaxStudents) {
        name = courseName;
        code = courseCode;
        maxStudents = courseMaxStudents;
        students = new ArrayList<>();
    }

    public void addStudent(String studentName) { // instance method
       if (students.size() == maxStudents) {
           System.out.println("Course is full, cant add " + studentName);
       } else {
           students.add(studentName);
       }
    }
    public void writeCourseInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Students enrolled:");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students that can enroll in this course is  " + maxStudents);
    }
     int getNumberOfStudents() {
        return students.size();
    }

    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println("Student " + studentName + " was un-enrolled " + name);
        } else {
            System.out.println("Student " + studentName + " was not enrolled / not found " + name);
        }
    }
}
