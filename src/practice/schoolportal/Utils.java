package practice.schoolportal;

import java.util.Arrays;

public class Utils {
    public static String[] validateInputString(String details, int validLength) {
        String[] split = details.trim().split(",");//{"Ade", "Ola", "12", "adex", "Adex1234%%%"}
        System.out.println(Arrays.toString(split));
        System.out.println(split.length);
        System.out.println("===============");
        if(split.length != validLength) {
            System.out.println("Invalid input, please try again");
            System.exit(0);
        }
        return split;
    }
}
