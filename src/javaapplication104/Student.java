/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication104;

/**
 *
 * @author hp
 */
public abstract class Student {
    protected int id;
    protected String name;
    protected String  major;
    protected double grade ;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

   
    @Override
    public String toString() {
        return  id + "   " + name + "   " +major + "     " +grade;
    }
    
     public  static void ssort(Student[] students ){
          for (int j = 0; j < students.length; j++) {
            for(int i=0; i< students.length-1; i++){
               if(students[i+1].getGrade() > 
                       students[i].getGrade()){
                   Student temp = students[i];
                   students[i]= students[i+1];
                   students[i+1] = temp;
               } 
            }             
        }
     }
}
