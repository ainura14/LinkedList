package TheoryDay.Task1;

import java.util.*;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {
        //Task 1
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 9, 10, 13));
//        LinkedList<Integer> integers = new LinkedList<>(List.of(1,2,3,4,5,6,7,8,9));
//        LinkedList<Integer> first = new LinkedList<>();
//        LinkedList<Integer> second = new LinkedList<>();
//         for (Integer integer : integers) {
//            if(integer % 2 == 0){
//                first.add(integer);
//            }else{
//                second.add(integer);
//            }
//        }
//        Collections.sort(first);
//         Collections.sort(second);
//
//        System.out.println(first);
//        System.out.println(second);
//
//        Collections.sort(numbers);
//        System.out.println(numbers);

        // Task 2
        List<Student> students = getDefaultStudent();
        List<Student> stud = new ArrayList<>();
        List<Student> students1 = new ArrayList<>();
        for (Student student : students) {
            if(student.getAge() > 16 && student.getAge() < 27) {
               stud.add(student);
            }
        }
//        for (int i = 0; i < stud.size(); i++) {
//
//        }

        System.out.println(stud);
    }
    public static List<Student> getDefaultStudent(){
        return new LinkedList<>(
                List.of(new Student("Aijamal", 21),
                        new Student("Kamelya", 12),
                        new Student("Aijan", 30),
                        new Student("Kanat", 13),
                        new Student("Aidar", 25)
        ));
    }
}
