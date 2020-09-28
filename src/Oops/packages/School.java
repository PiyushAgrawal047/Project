package Oops.packages;

import Oops.packages.model.Student;
import Oops.packages.model.Teacher;

import java.util.*;



public class School {
    private List<Teacher> teachers=new ArrayList<>();
    private List<Student> students=new ArrayList<>();
    private static int totalEarned;
    private  static int totalMoneySpend;

    /**
     * new object create
     * @param teachers list of teachers
     * @param students  list of students
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalEarned=0;
        this.totalMoneySpend=0;

    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        this.students.add(student);
    }

    public int getTotalEarned() {
        return totalEarned;
    }

    public static  void updateTotalEarned(int moneyEarned) {
        totalEarned+= moneyEarned;
    }

    public int  getTotalMoneySpend() {
        return totalMoneySpend;
    }


    public static void updateTotalMoneySpend(int teacherSalary) {
        totalMoneySpend=totalEarned-teacherSalary;
    }

    public int  remainMoney(){
        return totalEarned-totalMoneySpend;
    }
    public static void moneySpent(){

    }
}
