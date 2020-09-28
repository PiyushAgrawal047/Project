package Oops.packages.model;

import Oops.packages.School;

import java.util.Scanner;

/**
 *
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int  feesPaid;
    private  int feesTotal;

    /**
     * here we have created a constructor for intialising object while invoking in main class using new keyword
     * @param id
     * @param name
     * @param grade
     */

    public Student(int id,String name, int grade){
        this.feesPaid=0;
        this.feesTotal=150000;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }
    //////////////////////////

    /**
     * getter for fields
     * @return
     */
    public String getName(){
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getId(){
        return id;
    }
    ////////////////////////

    /**
     * new fees to be paid and get updated in feesPaid method
     * @param fees
     */
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalEarned(feesPaid);
    }
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }



}
