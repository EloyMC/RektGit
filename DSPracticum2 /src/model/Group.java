/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;

/**
 *
 * @author Serdar
 * @param <Student>
 */
public class Group<Student> {
    
    private String groupID;
    private LinkedList studentList;

    public Group(String groupID) {
        this.groupID = groupID;
        studentList = new LinkedList();
    }
    
    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public LinkedList getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }
    

    @Override
    public String toString() {
        return groupID;
    }
    
}
