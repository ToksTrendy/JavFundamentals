package practice.schoolportal;

import practice.schoolportal.datastore.AdminDatastore;
import practice.schoolportal.datastore.ClassroomDatastore;
import practice.schoolportal.datastore.TeacherDatastore;

import static practice.schoolportal.datastore.BaseDatastore.baseOperation;
import static practice.schoolportal.Message.displayWelcomeMessage;
import static practice.schoolportal.Message.selectBaseOperation;

public class ConsoleApp {

    public static void main(String[] args) {
        do {
            //display message
            displayWelcomeMessage();
            baseOperation = selectBaseOperation();
            if (baseOperation == 1) {
                String adminDetails = Message.getAdminDetails();
                Admin.createAdmin(adminDetails);
            }else if (baseOperation == 2) {
                if (AdminDatastore.isEmpty()) {
                    System.out.println("No admin, please create an admin");
                }else {
                    boolean flag = true;
                    Login.ensureSuccessfulLogin();
                    do {
                        int adminOps = Message.selectAdminOperation();
                        switch (adminOps) {
                            case 1:
                                String classroomDetails = Message.getClassroomDetails();
                                Classroom.createClassroom(classroomDetails);
                                break;
                            case 2:
                                String teacherDetails = Message.getTeacherDetails();
                                Teacher.createTeacher(teacherDetails);
                                break;
                            case 3:
                            String studentsDetails = Message.getStudentDetails();
                            Student.createStudent(studentsDetails);
                                break;
                            case 4:
                                ClassroomDatastore.view();
                                break;
                            case 5:
                                TeacherDatastore.view();
                                break;
                            case 6:
                                StudentDatastore.view();
                                break;
                            case -1:
                                flag = false;
                                break;
                            default:
                                System.out.println("Invalid input");
                                flag = false;
                                break;
                        }
                    }while (flag);
                }
            } else {
                baseOperation = -1;
            }

            //display 2 operations
            // 1. create an admin
            //2. login as admin
            //see dashboard
//        dashboard should contain(Create teacher,class,students)
            //get all (teacher,class,students)
            //get one(teacher,class,students)
//        update (teacher,class,students)
//        delete(teacher,class,students)
        }while (baseOperation != -1);

        System.out.println("Thank you for using our system");
    }
}