package PracticeDay.Zadaniye2.dao.Impl;

import PracticeDay.Zadaniye2.dao.ServiceDao;
import PracticeDay.Zadaniye2.db.DataBase;
import PracticeDay.Zadaniye2.model.Student;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ServiceDaoImpl implements ServiceDao {
    private final DataBase dataBase = new DataBase();
    @Override
    public String add(Student student) {
        dataBase.students.add(student);
        return "Successfully added";
    }

    @Override
    public LinkedList<Student> getAllStudents() {
        return dataBase.students;
    }

    @Override
    public String updateStudent(Long id, Student newStudent) {
        for (Student student1 : dataBase.students) {
            if(student1.getId().equals(id)){
                student1.setFirstName(newStudent.getFirstName());
                student1.setEmail(newStudent.getEmail());
                student1.setGroup(newStudent.getGroup());
                student1.setPoint(newStudent.getPoint());
                student1.setYearOfBirth(newStudent.getYearOfBirth());
            }
        }
        return "Successfully updated";
    }

    @Override
    public String deleteStudent(Long id) {
        Iterator<Student> iterator = dataBase.students.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getId().equals(id)){
                iterator.remove();
                return "Successfully deleted";
            }
        }
        return "Student not found";
    }


    @Override
    public LinkedList<Student> sortByName() {
//        LinkedList<Student> students = new LinkedList<>();
//        for (Student student : dataBase.students) {
//            students.add(student);
//        }
        dataBase.students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        return dataBase.students;
    }

    @Override
    public LinkedList<Student> sortByPoint() {
        dataBase.students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getPoint().compareTo(o2.getPoint());
            }
        });
        return dataBase.students;
    }

    @Override
    public LinkedList<Student> sortByGroup() {
        dataBase.students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGroup().compareTo(o2.getGroup());
            }
        });
        return dataBase.students;
    }


}
