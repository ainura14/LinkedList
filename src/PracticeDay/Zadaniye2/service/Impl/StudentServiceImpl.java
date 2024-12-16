package PracticeDay.Zadaniye2.service.Impl;

import PracticeDay.Zadaniye2.dao.Impl.ServiceDaoImpl;
import PracticeDay.Zadaniye2.model.Student;
import PracticeDay.Zadaniye2.service.StudentService;

import java.util.LinkedList;

public class StudentServiceImpl implements StudentService {
    private final ServiceDaoImpl serviceDao;

    public  StudentServiceImpl(ServiceDaoImpl serviceDao){
        this.serviceDao = serviceDao;
    }
    @Override
    public String add(Student student) {
        return serviceDao.add(student);
    }

    @Override
    public LinkedList<Student> getAllStudents() {
        return serviceDao.getAllStudents();
    }

    @Override
    public String updateStudent(Long id, Student student) {
        return serviceDao.updateStudent(id, student);
    }

    @Override
    public String deleteStudent(Long id) {
        return serviceDao.deleteStudent(id);
    }

    @Override
    public LinkedList<Student> sortByName() {
        return serviceDao.sortByName();
    }

    @Override
    public LinkedList<Student> sortByPoint() {
        return serviceDao.sortByPoint();
    }

    @Override
    public LinkedList<Student> sortByGroup() {
        return serviceDao.sortByGroup();
    }
}
