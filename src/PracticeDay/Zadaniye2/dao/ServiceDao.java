package PracticeDay.Zadaniye2.dao;

import PracticeDay.Zadaniye2.model.Student;

import java.util.LinkedList;
import java.util.List;

public interface ServiceDao {
    String add(Student student);

    LinkedList<Student> getAllStudents();

    String updateStudent(Long id, Student student);

    String deleteStudent(Long id);

    LinkedList<Student> sortByName();

    LinkedList<Student> sortByPoint();

    LinkedList<Student> sortByGroup();
}
