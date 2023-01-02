package practice.schoolportal;

import static practice.schoolportal.Datastore.baseOperation;
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
                if (Datastore.isAdminListEmpty()) {
                    System.out.println("No admin, please create an admin");
                }else {
                    Login.ensureSuccessfulLogin();
                    int adminOps = Message.selectAdminOperation();
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
