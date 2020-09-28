package Oops.packages.model;

import Oops.packages.School;

public class Teacher {
    private  int teacherId;
    private String name;
    private static int salary;
    private  static  int salaryEarned;


    public Teacher(int teacherId,String name,int salary){
        this.teacherId=teacherId;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public static int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void updateSalary(int newSalary){
        this.salary+=newSalary;
    }
    public static int recieveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpend(salaryEarned);
        return salary;
    }
    public  static void totalSalary(int salary){
        int sum=recieveSalary(salary);
    }
}

