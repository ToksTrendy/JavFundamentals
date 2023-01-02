package practice.schoolportal.datastore;

import practice.schoolportal.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherDatastore extends BaseDatastore{
    private static ArrayList<Teacher> teacherList = new ArrayList<>();

    public static int add(Teacher teacher) {
        teacherList.add(teacher);
        return teacherList.indexOf(teacher);
    }

    public static int getNewId() { //
        return getNewId(teacherList);
    }


    public static Teacher getTeacherById(int id) {
        ensureIdIsValid(teacherList, id);
        return teacherList.get(id - 1);
    }

    public static boolean isEmpty() {
        return teacherList.isEmpty();
    }

    public static int getSize() {
        return teacherList.size();
    }

    public static List<Teacher> getAllTeachers() {
        return teacherList;
    }

    public static void printList() {
        printList(teacherList);
    }

    public static List<Teacher> getAvailableTeachers() {
        ArrayList<Teacher> availableTeachers = new ArrayList<>();
        for (Teacher teacher : teacherList) {
            if (teacher.getClassroom() == null) {
                availableTeachers.add(teacher);
            }
        }
        return availableTeachers;
    }

    public static void view() {
        view(teacherList, "List of Teachers");
    }
}
