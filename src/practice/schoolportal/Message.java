package practice.schoolportal;

import practice.schoolportal.datastore.ClassroomDatastore;
import practice.schoolportal.datastore.TeacherDatastore;

import java.util.List;
import java.util.Scanner;

public class Message {
    static Scanner scanner = new Scanner(System.in);

    public static void displayWelcomeMessage() {
        System.out.println("Welcome to school portal");
        System.out.println("Please create a new admin or proceed to login");

    }

    public static int selectBaseOperation() {
        return selectOperation("Press 1 to create a new admin\npress 2 to login as an admin\npress -1 to leave " +
                "application");
    }

    public static int selectAdminOperation() {
      return selectOperation("1: create a classroom\n" +
              "2: Create a teacher \n" +
              "3: Create a student  \n" +
              "4: View classroom  \n" +
              "5: View teacher  \n" +
              "6: View student  \n" +
              "-1: Back");
    }

    public static int selectAdminOperation2() {
        return selectOperation("1: Classroom\n" +
                "2: Teacher \n" +
                "3: Student  \n" +
                "-1: Back");
    }

    private static int selectOperation(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public static String getStringFromUser(String message) {
        System.out.println(message);
        return scanner.next();
    }

    public static String getAdminDetails() {
        return getStringFromUser("Please enter your details in this format:" +
                " (firstname,lastname,age,username,password)");
    }

    public static String getClassroomDetails() {
        return getStringFromUser("Please enter classroom details in this format:" +
                " (name,capacity)");
    }

    public static String getTeacherDetails() {
        return getStringFromUser("Please enter teacher details in this format:" +
                " (firstname,lastname,age)");
    }

    public static Teacher getSelectedTeacher(List<Teacher> teachers) {
        StringBuilder str = new StringBuilder("Please Select a teacher id for your class or -1 for none\n");
        for (Teacher teacher : teachers) {
                str.append(" id = ")
                        .append(teacher.getId())
                        .append(" = ")
                        .append(teacher.getFullName())
                        .append("\n");
        }

        int id = selectOperation(str.toString());
        if (id == -1) {
            return  null;
        }
        return TeacherDatastore.getTeacherById(id);
    }

    public static Classroom getSelectedClassroom(List<Classroom> classrooms, String origin) {
        StringBuilder str = new StringBuilder("Please Select a classroom id for your " + origin + " or -1 for none\n");
        for (Classroom classroom : classrooms) {
            str.append(" id = ")
                    .append(classroom.getId())
                    .append(" = ")
                    .append(classroom.getName())
                    .append("\n");
        }

        int id = selectOperation(str.toString());
        if (id == -1) {
            return  null;
        }
        return ClassroomDatastore.getClassroomById(id);
    }

    public static String getStudentDetails() {
        return getStringFromUser("Please enter student details in this format:" +
                " (firstname,lastname,age)");
    }
}
