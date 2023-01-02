package practice.schoolportal.datastore;

import practice.schoolportal.Admin;

import java.util.ArrayList;

public class AdminDatastore extends BaseDatastore {
    private static ArrayList<Admin> adminList = new ArrayList<>();

    public static int add(Admin admin) {
        adminList.add(admin);
        return adminList.indexOf(admin);
    }

    public static int getNewId() { //
        return adminList.size() + 1;
    }

    public static void printAdminDetails(int id) {
        System.out.println("Registration successful, " +
                "please proceed to login with your id and your password\n" +
                "id = " + id);
    }

    public static Admin getAdminById(int id) {
        ensureIdIsValid(adminList, id);
        return adminList.get(id - 1);
    }

    public static boolean isEmpty() {
        return adminList.isEmpty();
    }

    public static int getSize() {
        return adminList.size();
    }
}
