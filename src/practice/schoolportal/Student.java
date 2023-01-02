package practice.schoolportal;

import practice.schoolportal.datastore.BaseDatastore;
import practice.schoolportal.datastore.ClassroomDatastore;
import practice.schoolportal.enumeration.Gender;

public class Student {

    private final int id;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final Gender gender;
    private final Classroom classroom;

    public  String getFullName() {
        return firstName + " " + lastName;
    }

    public Student(int id, String firstName, String lastName, int age, Gender gender, Classroom classroom) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.classroom = classroom;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public static void createStudent(String details) {
        String[] inputString = Utils.validateInputString(details, 3);
        String firstName = inputString[0];
        String lastName = inputString[1];
        int age = Integer.parseInt(inputString[2]);

        int id = StudentDatastore.getNewId();

        String genderString = Message.getStringFromUser("Enter student gender, male or female");
        Gender gender = Gender.valueOf(genderString.trim().toUpperCase());

        Classroom selectedClassroom = null;

        if (!ClassroomDatastore.isEmpty()) {
            selectedClassroom = Message
                    .getSelectedClassroom(ClassroomDatastore.getAllClassrooms(), "student");
        }

        Student student = new Student(id, firstName, lastName, age, gender, selectedClassroom);

        if (selectedClassroom != null) {
            //update selectedClassroom
            selectedClassroom.addStudent(student);
            ClassroomDatastore.update(selectedClassroom);
        }

        int createdIndex = StudentDatastore.add(student);

        BaseDatastore.validateCreatedIndex(createdIndex, id);
        StudentDatastore.printList();
        System.out.println("Student created successfully");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}');

        if (classroom != null) {
            sb.append(", classroom name=").append(classroom.getName())
                    .append(", classroom capacity=").append( classroom.getCapacity() );
        }
        return sb.toString();
    }
}
