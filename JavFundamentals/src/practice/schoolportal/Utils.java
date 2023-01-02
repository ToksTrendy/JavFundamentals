package practice.schoolportal;

public class Utils {
    public static String[] validateInputString(String adminDetails, int validLength) {
        String[] split = adminDetails.trim().split(",");//{"Ade", "Ola", "12", "adex", "Adex1234%%%"}
        if(split.length != validLength) {
            System.out.println("Invalid input, please try again");
            System.exit(0);
        }
        return split;
    }
}
