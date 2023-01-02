package com.tutorial.java.fundamentals.staticExample;

public class StaticExampleRunner {

    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample(12);
        obj1.setAge(13);
        obj1.display();

        StaticExample.setName("Khadijah");
        obj1.display();

        StaticExample obj2 = new StaticExample(25);
        obj2.display();
        StaticExample.setName("Fatimoh");
        obj1.display();
        obj2.display();

        StaticExample obj3 = new StaticExample(100);
        obj3.display();

        obj1.changeName("Oritoke");
        obj1.display();
        obj2.display();
        obj3.display();


    }
}
