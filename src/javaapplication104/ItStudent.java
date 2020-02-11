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
public class ItStudent extends Student {

   public ItStudent(int id, String name, String major, double mid, double project,double finall) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.grade = mid*0.30 + project*0.30 + finall*0.4;
    }
    
}
