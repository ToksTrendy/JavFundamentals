package practice.schoolportal.datastore;

import practice.schoolportal.Classroom;

import java.util.ArrayList;
import java.util.List;

public class ClassroomDatastore extends BaseDatastore {
    private static ArrayList<Classroom> classroomList = new ArrayList<>();

    public static int add(Classroom classroom) {
        classroomList.add(classroom);
        return classroomList.indexOf(classroom);
    }

    public static int getNewId() { //
        return classroomList.size() + 1;
    }

    public static Classroom getClassroomById(int id) {
        ensureIdIsValid(classroomList, id);
        return classroomList.get(id - 1);
    }

    public static boolean isEmpty() {
        return classroomList.isEmpty();
    }

    public static int getSize() {
        return classroomList.size();
    }

    public static void printList() {
        printList(classroomList);
    }


    public static List<Classroom> getAllClassrooms() {
        return classroomList;
    }

    public static void update(Classroom classroom) {
        classroomList.set(classroom.getId() - 1, classroom);
    }

    public static void view() {
        view(classroomList, "List of classrooms");
    }

    public static boolean checkClassroomsAreValid() {
        for (Classroom classroom : classroomList) {
            if (!classroom.isActive()) {
                return false;
            }
        }
        return true;
    }

    public static List<Classroom> getInactiveClassrooms() {
        ArrayList<Classroom> classrooms = new ArrayList<>();
        for (Classroom classroom : classroomList) {
            if (!classroom.isActive()) {
                classrooms.add(classroom);
            }
        }
//        view(classrooms, "Inactive classrooms");
        return classrooms;
    }

    public static void printInactiveClassrooms() {
        view(getInactiveClassrooms(), "Inactive classrooms");
    }
}