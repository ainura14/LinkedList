package PracticeDay.Zadaniye2;

import PracticeDay.Zadaniye2.dao.Impl.ServiceDaoImpl;
import PracticeDay.Zadaniye2.model.Student;
import PracticeDay.Zadaniye2.service.Impl.StudentServiceImpl;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServiceDaoImpl serviceDao = new ServiceDaoImpl();
        StudentServiceImpl service = new StudentServiceImpl(serviceDao);

        Scanner scannerInt = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        // add
        System.out.println(service.add(new Student("Ainura", "Aika@gmail.com", LocalDate.of(2004, 11, 14), 100.0, "Java")));
        service.add(new Student("Ainura", "Aika@gmail.com", LocalDate.of(2005, 11, 14), 100.0, "Java"));
        service.add(new Student("Akamaral", "akma@gmail.com", LocalDate.of(2008, 11, 14), 100.0, "JavaScript"));
        service.add(new Student("Jamal", "jama@gmail.com", LocalDate.of(2009, 11, 14), 100.0, "JavaScript"));
        service.add(new Student("Asyl", "as@gmail.com", LocalDate.of(2022, 11, 14), 100.0, "Java"));
        service.add(new Student("Chanbolot", "ch@gmail.com", LocalDate.of(2012, 11, 14), 100.0, "Java"));
        service.add(new Student("Kanat", "k@gmail.com", LocalDate.of(2000, 11, 14), 100.0, "JavaScript"));
        service.add(new Student("Saikal", "saku@gmail.com", LocalDate.of(2007, 11, 14), 100.0, "Java"));
        service.add(new Student("Fatima", "fati@gmail.com", LocalDate.of(2005, 11, 14), 100.0, "JavaScript"));
        service.add(new Student("Perizat", "peri@gmail.com", LocalDate.of(2002, 11, 14), 100.0, "Java"));

        // get all
        System.out.println("----------------- Get all ------------------");
        System.out.println(service.getAllStudents());


        System.out.println("Write the id to update: ");
        Long id = scannerInt.nextLong();
        scanner.nextLine();
        System.out.println(service.updateStudent(id, new Student("Aijamal", "aija@gmail.com", LocalDate.of(2004, 11, 9), 12.4, "JavaScript")));

        System.out.println("Write the id to delete: ");
        Long id1 = scannerInt.nextLong();
        scanner.nextLine();
        System.out.println(service.deleteStudent(id1));

        System.out.println(service.getAllStudents());
        System.out.println("Sort by name: ");
        System.out.println(service.sortByName());

        System.out.println("Sort by point: ");
        System.out.println(service.sortByPoint());

        System.out.println("Sort by group: ");
        System.out.println(service.sortByGroup());
    }
}
