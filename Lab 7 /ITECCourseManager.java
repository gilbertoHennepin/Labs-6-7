package week7;


import java.sql.SQLOutput;

/**
 * Not an object oriented program.
 */
public class ITECCourseManager {

    public static void main(String[] args) {


        ITECourse maintenanceCourse = new ITECourse("Microcomputer Systems Maintenance", 1310, 20);
//        maintenanceCourse.name = ;
//        maintenanceCourse.code = 1310;
//        maintenanceCourse.maxStudents = 20;

        //Add some students.   TODO check that we have not exceeded the max number for the class
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.removeStudent("Carl");
        maintenanceCourse.removeStudent("Martha");

        maintenanceCourse.writeCourseInfo();

        ITECourse datacomCourse = new ITECourse("Data Communications", 1425, 30);
//        datacomCourse.name = "Data Communications";
//        datacomCourse.code = 1425;
//        datacomCourse.maxStudents = 30;

        //Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();

        ITECourse SoftwareDevelopmentCourse = new ITECourse("Software Development Projects", 2903, 24);
        SoftwareDevelopmentCourse.addStudent("Gus");
        SoftwareDevelopmentCourse.addStudent("Harry");
        SoftwareDevelopmentCourse.addStudent("Izzy");
        SoftwareDevelopmentCourse.addStudent("Jake");

        int NumberOfStudents = SoftwareDevelopmentCourse.getNumberOfStudents();
        System.out.println("The " + SoftwareDevelopmentCourse.getName() +" Course has " + NumberOfStudents + " students");
        System.out.println("ITEC " + SoftwareDevelopmentCourse.getName() + " " + SoftwareDevelopmentCourse.getName());

        SoftwareDevelopmentCourse.setMaxStudents(69);
        SoftwareDevelopmentCourse.writeCourseInfo();

        ITECourse smallCourse = new ITECourse("Made up course", 1234, 3);
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        smallCourse.addStudent("Miriam");
        smallCourse.removeStudent("Kirby");
        smallCourse.addStudent("Nita");

        smallCourse.writeCourseInfo();
    }






}
