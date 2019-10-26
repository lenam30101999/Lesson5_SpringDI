package com.k003.nam.lesson5.demotest.object;

import java.util.Set;

public class Employee {
    private String name;
    private int age;
    private Set<Account> accounts;

    public Employee(){

    }

    public Employee(String name, int age, Set<Account> account) {
        this.name = name;
        this.age = age;
        this.accounts = account;
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

    public Set<Account> getAccount() {
        return accounts;
    }

    public void setAccount(Set<Account> account) {
        this.accounts = account;
    }

    public void print() {
        System.out.println("Employer: " + this.name + "\nAge: " + this.age);
        System.out.println("Account: ");
        for (Account account : accounts){
            System.out.println(account);
        }
        System.out.println("++++++++++++++++++++++++++++++++++\n");
    }


}
