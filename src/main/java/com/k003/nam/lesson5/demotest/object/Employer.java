package com.k003.nam.lesson5.demotest.object;

import java.util.List;

public class Employer {
    private String name;
    private int age;
    private List<Address> addresses;
    private List<String> emails;

    public Employer(){

    }

    public Employer(String name, int age, List<Address> addresses,
                    List<String> emails) {
        this.name = name;
        this.age = age;
        this.addresses = addresses;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public void print() {
        System.out.println("Employer: " + this.name + " Age: " + this.age);
        System.out.println("Address: ");
        for (Address address : addresses) {
            System.out.println(address);
        }
        System.out.println("Email:");
        for (String email : emails) {
            System.out.println(email);
        }
        System.out.println("++++++++++++++++++++++++++++++++++\n");
    }
}
