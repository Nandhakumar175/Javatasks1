package com.Ebrain;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cust {
    private String name;
    private String email;
    private String city;
    private String state;
    private String country;

    public Cust(String name, String email, String city, String state, String country) {
        this.name = name;
        this.email = email;
        this.city = city;
        this.state = state;
        this.country = country;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of customers: ");
        int numCustomers = input.nextInt();

        HashMap<String, Integer> cityCounts = new HashMap<String,Integer>();

        for (int i = 0; i < numCustomers; i++) {
        	
            System.out.printf("Enter details for customer %d:%n", i+1);
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Email: ");
            String email = input.next();
            System.out.print("City: ");
            String city = input.next();
            System.out.print("State: ");
            String state = input.next();
            System.out.print("Country: ");
            String country = input.next();

            
            Cust customer = new Cust(name, email, city, state, country);

            
            int count = cityCounts.getOrDefault(city, 0);
            cityCounts.put(city, count + 1);
        }

     
        System.out.println("----------------------------------------City counts:----------------------------------------");
        for (String city : cityCounts.keySet()) {
            int count = cityCounts.get(city);
            System.out.printf("%s: %d%n", city, count);
        }
    }
}
