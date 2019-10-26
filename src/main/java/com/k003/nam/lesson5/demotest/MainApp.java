package com.k003.nam.lesson5.demotest;

import com.k003.nam.lesson5.demotest.object.Employee;
import com.k003.nam.lesson5.demotest.object.Employer;
import com.k003.nam.lesson5.demotest.object.Person;
import com.k003.nam.lesson5.demotest.object.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person= (Person) context.getBean("person");
        person.print();

        Person person1 = (Person) context.getBean("person2");
        person1.print();

        Employer employer = (Employer) context.getBean("employer1");
        employer.print();

        Employer employer1 = (Employer) context.getBean("employer2");
        employer1.print();

        Employee employee = (Employee) context.getBean("employee");
        employee.print();

        Student students = (Student) context.getBean("student");
        students.print();
    }
}
