package Oops.packages;

import Oops.packages.model.Teacher;
import Oops.packages.model.Student;


import java.util.*;

public class SchoolManagementSystem {
    public static void main(String[] args) {

        Teacher pardeep=new Teacher(1,"Dr. Pardeep Singh",10000);
        Teacher vasudev=new Teacher(2,"Dr. Vasudev",10000);
        Teacher shiv=new Teacher(3,"Dr.Shankar",10000);
        List<Teacher> teachers=new ArrayList<>();
        teachers.add(pardeep);
        teachers.add(vasudev);
        teachers.add(shiv);



        Student piyush=new Student(1,"Piyush Agrawal",8);
        Student nisha=new Student(2,"Nisha Agrawal",9);
        Student shweta=new Student(3,"Shweta Agrawal",10);

        List<Student>students=new ArrayList<>();
        students.add(piyush);
        students.add( nisha);
        students.add(shweta);

        School sps=new School(teachers,students);


piyush.payFees(120000);
nisha.payFees(150000);
shweta.payFees(100000);

        System.out.println("SPS has earned Rs: "+sps.getTotalEarned());
        pardeep.recieveSalary(pardeep.getSalary());
        vasudev.recieveSalary(vasudev.getSalary());
        shiv.recieveSalary(shiv.getSalary());

        System.out.println("SPS spent"+sps.getTotalMoneySpend());
        System.out.println("SPS have remaining amoount of RS."+sps.remainMoney());







    }


    }

