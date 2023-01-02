package practice.schoolportal;

import java.util.ArrayList;

public class Datastore {
    public static int baseOperation = 1;
    private static ArrayList<Admin> adminList = new ArrayList<>();

    public static int addAdminToList(Admin admin) {
        adminList.add(admin);
        return adminList.indexOf(admin);
    }

    public static int getNewAdminId() { //
        return adminList.size() + 1;
    }

    public static void printAdminList() {
        System.out.println(adminList);
    }

    public static void printAdminDetails(int id) {
        System.out.println("Registration successful, " +
                "please proceed to login with your id and your password\n" +
                "id = " + id);
    }

    public static Admin getAdminById(int id) {
        if(adminList.isEmpty() ||id == 0 ||adminList.size() < id ) {
            System.out.println("Invalid id");
        }
        return adminList.get(id - 1);
    }

    public static boolean isAdminListEmpty() {
        return adminList.isEmpty();
    }

    public static int getAdminListSize() {
        return adminList.size();
    }
}
