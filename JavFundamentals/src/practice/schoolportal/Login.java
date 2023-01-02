package practice.schoolportal;

public class Login {
    public static void ensureSuccessfulLogin() {
        boolean isWrongFormat = false, isInvalidDetails = true;
        int counter = 3;
        do {
            if(counter == 0) {
                System.out.println("You have exhausted your number of trial");
                System.exit(0);
            }
            String loginDetails = Message.getStringFromUser("Please enter your id " +
                    "and password in this format: id,password");

            String[] split = loginDetails.trim().split(",");
            if (split.length != 2) {
                isWrongFormat = true;
                System.out.println("Invalid login format, please use the right format");
            }else {
                int id = Integer.parseInt(split[0]);
                String password = split[1];

                Admin admin = Datastore.getAdminById(id);
                if (admin.getId() == id && admin.getPassword().equals(password)) {
                    isInvalidDetails = false;
                }else {
                    System.out.println("Invalid login details, please try again you have " + --counter + "trial");
                }
            }
        }while (isWrongFormat || isInvalidDetails);
    }
}
