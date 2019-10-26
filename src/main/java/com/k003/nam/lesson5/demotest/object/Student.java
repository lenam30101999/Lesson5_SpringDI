package com.k003.nam.lesson5.demotest.object;

import java.util.Map;

public class Student {
    private Map<Integer,String> listStudent;

    public Student(){

    }

    public Student(Map<Integer, String> listStudent) {
        this.listStudent = listStudent;
    }

    public Map<Integer, String> getListStudent() {
        return listStudent;
    }

    public void setListStudent(Map<Integer, String> listStudent) {
        this.listStudent = listStudent;
    }

    public void print(){
        for (Map.Entry map : listStudent.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
