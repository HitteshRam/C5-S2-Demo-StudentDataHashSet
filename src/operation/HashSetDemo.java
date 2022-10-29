package operation;

import data.Student;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    Set<Student> studentSet = new HashSet<>();

    //insert;
    public boolean AddStudentData(Student student) {
        return studentSet.add(student);
    }

    //display method
    public void display() {
        System.out.println("Student name" + "\t\t" + "RollNo");
        Iterator<Student> iterator = studentSet.iterator();
        while (iterator.hasNext()) {

            Student student = iterator.next();

            System.out.println(student.getName() + "\t\t\t\t" + student.getRollNo());
        }

    }

    public Student remove(int rollNo) {
        Student response = null;
        Iterator<Student> iterator = studentSet.iterator();
        while (iterator.hasNext()) {

            Student student = iterator.next();
            if (student.getRollNo() == rollNo) {
                response = student;
                iterator.remove();
                break;
            }

        }
        return response;
    }

}
