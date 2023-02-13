package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    public List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Murad",3,77.6);
        Student st2 = new Student("Huseyn",3,85.3);
        Student st3 = new Student("Revan",2,66);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Information about students :");
        System.out.println(students);
        return students;
    }

}
