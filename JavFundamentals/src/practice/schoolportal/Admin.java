package practice.schoolportal;

import com.tutorial.java.fundamentals.oop.encapstulation.Person;

import static practice.schoolportal.Utils.validateInputString;

public class Admin extends Person {

    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public Admin(String firstName, String lastName, int age,
                 String username, String password, int id) {
        super(firstName, lastName, age);
        this.username = username;
        this.password = password;
        this.id = id;
    }

    private static void create(String firstName, String lastName, int age,
                              String username, String password) {
        int id = Datastore.getNewAdminId();
        Admin admin = new Admin(firstName, lastName, age, username, password, id);
        //update datastore
        int createdIndex = Datastore.addAdminToList(admin);
        if (createdIndex + 1 != id) {
            System.out.println("Admin could not be created because of Id mismatch");
            System.exit(0);
        }
        Datastore.printAdminDetails(id);
    }

    public static void createAdmin(String adminDetails) {
        String[] split = validateInputString(adminDetails, 5);
        String firstName = split[0].trim();
        String lastName = split[1].trim();
        int age = Integer.parseInt(split[2].trim());
        String username = split[3].trim();
        String password = split[4].trim();

        create(firstName, lastName, age, username, password);
    }


    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + getFirstName() + '\'' +
                ", lastname='" + getLastName() + '\'' +
                ", age='" + getAge() + '\'' +
                '}';
    }
}
