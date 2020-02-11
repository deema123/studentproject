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
public class ArtStudent extends Student {

    public ArtStudent(int id, String name, String major, double mid, double report,double finall) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.grade = mid*0.40 + report*0.10 + finall*0.5;
    }

}
