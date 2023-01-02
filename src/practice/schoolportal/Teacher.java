package practice.schoolportal;

import practice.schoolportal.datastore.ClassroomDatastore;
import practice.schoolportal.datastore.TeacherDatastore;

public class Teacher {

    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public int getId() {
        return id;
    }

    private Classroom classroom;

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Teacher(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void createTeacher(String teacherDetails) {
        String[] inputString = Utils.validateInputString(teacherDetails, 3);
        String firstName = inputString[0];
        String lastName = inputString[1];
        int age = Integer.parseInt(inputString[2]);

        int id = TeacherDatastore.getNewId();
        Teacher teacher = new Teacher(id, firstName, lastName, age);

        if (!ClassroomDatastore.isEmpty()) {
            Classroom selectedClassroom = Message
                    .getSelectedClassroom(ClassroomDatastore.getAllClassrooms(), "teacher");
            if (selectedClassroom != null) {
                teacher.setClassroom(selectedClassroom);
                //update selectedClassroom
                selectedClassroom.setTeacher(teacher);
//                Classroom newClassroom = new Classroom(selectedClassroom.getId(), selectedClassroom.getName(), selectedClassroom.getCapacity()
//                        , teacher);
//                ClassroomDatastore.update(newClassroom);
                ClassroomDatastore.update(selectedClassroom);
            }
        }
        int createdIndex = TeacherDatastore.add(teacher);

        TeacherDatastore.validateCreatedIndex(createdIndex, id);
        TeacherDatastore.printList();
        System.out.println("Teacher created successfully");
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}');
        if (classroom != null) {
            sb.append(", classroom name=").append(classroom.getName())
                    .append(", classroom capacity=").append( classroom.getCapacity() );
        }
        return sb.toString();
    }
}
