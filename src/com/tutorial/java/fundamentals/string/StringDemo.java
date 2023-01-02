package com.tutorial.java.fundamentals.string;

import java.util.stream.IntStream;

public class StringDemo {

    public static void main(String[] args) {
        char[] data = {'a', 'b', 'c'};

        String str = new String(data);
        String str2 = new String(data, 1, 1);

        String string = "Abc";

        System.out.println(str);
        System.out.println(string);
        System.out.println(str2);


        char c = str.charAt(2);
        System.out.println(c);

        int compareInt = str.compareToIgnoreCase(string);
        System.out.println(compareInt);

        if (compareInt == 0) {
            System.out.println("They are equal");
        }

        System.out.println(str.concat(" ").concat(string));

        System.out.println(str.contains("abc"));

        System.out.println(str.contentEquals(string.toLowerCase()));

        System.out.println(str.equals(string));

        System.out.println(str.endsWith("abc"));

        System.out.println(str.indexOf("abc"));

        System.out.println("".isBlank());

        System.out.println(" ".isEmpty());

        System.out.println("aeerrwe".lastIndexOf("e"));

        System.out.println("mabdulwasiihotmail.com".matches("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$"));

        System.out.println(str.repeat(5));

        System.out.println(str.replace("bc", "d"));

        String[] s = "Moronkola Adija".split(" "); // String [] s = {"Moronkola", "Adija"}
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
            System.out.print(" === ");
            System.out.println();
        }

        System.out.println("   Adijat    ".strip());


        System.out.println(str.substring(1));
        System.out.println(str.substring(1, 3));

        int i = 344553;
        String valueOf = String.valueOf(i);
        System.out.println(valueOf);

    }
}
