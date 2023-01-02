package com.tutorial.java.fundamentals.oop.encapstulation;

import com.tutorial.java.fundamentals.oop.encapstulation.customer.Customer;

public class EncapsulationRunner {

    public static void main(String[] args) {
        Person fatimoh = new Person("Fatimoh", "Moronkola", 12);
        fatimoh.display();

        Staff staff = new Staff(fatimoh, "Staff001", "Marketing");
        staff.display();

        Customer customer = new Customer("Khadijah", "Moronkola", 5, "Cus001", "New");
        Utility.display(customer);

        System.out.println(staff);
        System.out.println(customer);
        System.out.println(fatimoh);
    }

}
