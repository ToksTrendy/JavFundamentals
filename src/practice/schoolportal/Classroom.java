package practice.schoolportal;

import practice.schoolportal.datastore.ClassroomDatastore;
import practice.schoolportal.datastore.TeacherDatastore;

import java.util.ArrayList;
import java.util.List;

import static practice.schoolportal.Utils.validateInputString;

public class Classroom {

    private int id;
    private String name;
    private int capacity;
    private boolean isActive = false;
    private Teacher teacher;

    private List<Student> students = new ArrayList();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isActive() {
        return isActive;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
        this.isActive = true;
    }

    public Classroom(int id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    public Classroom(int id, String name, int capacity, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.teacher = teacher;
        this.isActive = true;
    }

    public void activate() {
        if(teacher != null) {
            isActive = true;
        }else {
            isActive = false;
        }
    }
    public static void createClassroom(String details) {
        String[] split = validateInputString(details, 2);
        String name = split[0].trim();
        int capacity = Integer.parseInt(split[1].trim());

        int id = ClassroomDatastore.getNewId();

        Classroom classroom = new Classroom(id, name, capacity);
        if (!TeacherDatastore.isEmpty()) {
            Teacher selectedTeacher = Message.getSelectedTeacher(TeacherDatastore.getAllTeachers());
            if (selectedTeacher != null) {
                classroom.setTeacher(selectedTeacher);
            }
        }
        int createdIndex = ClassroomDatastore.add(classroom);

        ClassroomDatastore.validateCreatedIndex(createdIndex, id);
        ClassroomDatastore.printList();
        System.out.println("Classroom created successfully");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Classroom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", isActive=" + isActive +
                '}');
        if (teacher != null) {
            sb.append(", teacher name =").append(teacher.getFullName());
        }
        if(students != null && !students.isEmpty()) {
            for (int i = 0; i < students.size(); i++) {
                if(i == 0) {
                    sb.append("Students : [\n");
                }
                Student student = students.get(i);
                sb.append(student.getFullName()).append("\n");

                if (i < students.size() - 1) {
                    sb.append("]");
                }
            }
        }
        return sb.toString();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
