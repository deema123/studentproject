/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication104;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author hp
 */
public class JavaApplication104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Student[] students = {
            new ItStudent(111, "Ahmad", "cs", 86, 55, 90),
            new ItStudent(222, "Sami", "programming", 93, 88, 63),
            new ItStudent(333, "Reema", "cs", 99, 99, 55),
            new ArtStudent(444, "Jad", "pp", 69, 96, 60),
            new ArtStudent(555, "Noor", "ll", 100, 100, 99)
        };
     /*   List<Student> studentList = Arrays.asList(students)
                .stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .collect(Collectors.toList());
     */
        Student.ssort(students); // sorting by using the method above
        
        System.out.println("Sorted Student =");
        for (Student student : students) {
            System.out.println(student);
        }

        PrintWriter output = new PrintWriter(new File("src/JavaApplication104/std.data"));
        for (Student student : students) {
            output.println(student);
        }
        output.close();
        
/////////// Q2 /////////
        int num = Integer.parseUnsignedInt("4200200200");
        System.out.println(Integer.toUnsignedString(num));

    }

}

