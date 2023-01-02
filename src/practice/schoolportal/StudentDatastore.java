package practice.schoolportal;

import practice.schoolportal.datastore.BaseDatastore;

import java.util.ArrayList;
import java.util.List;

public class StudentDatastore extends BaseDatastore {
    private static ArrayList<Student> studentList = new ArrayList<>();

    public static void view() {
        view(studentList, "List of students");
    }


    public static int add(Student student) {
        studentList.add(student);
        return studentList.indexOf(student);
    }

    public static int getNewId() { //
        return getNewId(studentList);
    }


    public static Student getStudentById(int id) {
        ensureIdIsValid(studentList, id);
        return studentList.get(id - 1);
    }

    public static List<Student> getStudentByClassroom(Classroom classroom) {
        if (classroom == null) {
            return new ArrayList<>();
        }
        ArrayList<Student> studentByClassroom = new ArrayList<>();
        for (Student student : studentList) {
            if (classroom.equals(student.getClassroom())) {
                studentByClassroom.add(student);
            }
        }
        return studentByClassroom;
    }

    public static List<Student> getStudentByTeacher(Teacher teacher) {
        if (teacher == null) {
            return new ArrayList<>();
        }
        ArrayList<Student> studentByTeacher = new ArrayList<>();
        for (Student student : studentList) {
            Classroom classroom = student.getClassroom();
            if (classroom != null && teacher.equals(classroom.getTeacher())) {
                studentByTeacher.add(student);
            }
        }
        return studentByTeacher;
    }

    public static boolean isEmpty() {
        return studentList.isEmpty();
    }

    public static int getSize() {
        return studentList.size();
    }

    public static List<Student> getAllStudents() {
        return studentList;
    }

    public static void printList() {
        printList(studentList);
    }

    public static List<Student> getAvailableStudents() {
        ArrayList<Student> availableStudents = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getClassroom() == null) {
                availableStudents.add(student);
            }
        }
        return availableStudents;
    }
}
