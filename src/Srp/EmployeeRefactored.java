package Srp;

import java.util.PrimitiveIterator;

public class EmployeeRefactored {
    private String name;
    private int age;
    private  int id;
    private int doj;//date of joining

    public EmployeeRefactored(String name, int age, int id, int doj) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.doj = doj;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int getDoj() {
        return doj;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDoj(int doj) {
        this.doj = doj;
    }
}
