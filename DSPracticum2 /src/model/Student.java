/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.security.SecureRandom;
import java.util.Comparator;

/**
 *
 * @author Serdar
 */
public class Student implements Comparator<Student> {

    public static int studentNumStart = 50060000;
    private static final SecureRandom SEC = new SecureRandom();
    
    private int studentNum;
    private Group group;
    private double grade;

    public Student(Group group) {
        setStudentNum();
        this.grade = setGrade();
        this.group = group;
    }

    /*public static void assignToGroup() {
        int currentSpecialPos = 0;
        for (int i = 0; i < studentsList.size(); i++) {
            currentSpecialPos++;
            if (currentSpecialPos > 5) {
                currentSpecialPos = 1;
            }
            if (i % 5 == 0) {
                groupNumStart++;
            }
            studentsList.get(i).setGroup(currentSpecialPos + "I" + addSpecialization(currentSpecialPos) + groupNumStart);
        }
    }*/

    public static String addSpecialization(int current) {
        String special;
        switch (current) {
            case 1:
                special = "B";
                break;
            case 2:
                special = "G";
                break;
            case 3:
                special = "N";
                break;
            case 4:
                special = "S";
                break;
            case 5:
                special = "T";
                break;
            default:
                special = "B";
        }
        return special;
    }

    public int getStudentNum() {
        return studentNum;
    }

    private void setStudentNum() {
        studentNum = ++studentNumStart;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public double getGrade() {
        return grade;
    }

    private double setGrade() {
        //this.grade = (double) Math.round(1 + (Math.random() * 10) * 10d) / 10d;
        return SEC.nextInt(91) / 10.0 + 1;
    }
    
    @Override
    public String toString() {
        return "Studentnr: " + studentNum + "\tGrade: " + grade + "\tGroup: " + group;
    }
     
    /*public static int[] sortGrade(List lstStudents){
        int temp;
        for(int i=0; i < arr.length-1; i++){
 
            for(int j=1; j < arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    temp=arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }*/
    
    @Override
    public int compare(Student a, Student b) {
        if (b.getGrade() > a.getGrade()) {
            return 1;
        } else if (b.getGrade() < a.getGrade()) {
            return -1;
        } else {
            return 0;
        }
    }

}
