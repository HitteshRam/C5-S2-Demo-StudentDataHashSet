package Implementation;

import data.Student;
import operation.HashSetDemo;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {

        HashSetDemo hashSetDemo = new HashSetDemo(); //Creating object of the HashSetDemo class

        //inserting data into the student object
        Student s1 = new Student(123, "hitesh", 95.6f);
        Student s2 = new Student(456, "Ramesh", 85.6f);
        Student s3 = new Student(789, "shivesh", 55.5f);

        //Creating set of "student" obj type with name "studentSet" reference from HashSet (constuctor)
        Set<Student> studentSet = new HashSet<>();

        //Adding student object into set named studentSet
        hashSetDemo.AddStudentData(s1);
        hashSetDemo.AddStudentData(s2);
        hashSetDemo.AddStudentData(s3);

        hashSetDemo.display(); //calling display method

        System.out.println("------------------------------------------------\n");
        System.out.println("Removing data having rollno: 123) = " + hashSetDemo.remove(123));


        System.out.println("\nAfter deletion operation, displaying the data");
        hashSetDemo.display();
    }
}

