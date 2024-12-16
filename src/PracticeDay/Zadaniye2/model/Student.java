package PracticeDay.Zadaniye2.model;

import java.time.LocalDate;

public class Student {
    private Long id;
    private static Long incrementedID = 0L;
    private String firstName;
    private String email;
    private LocalDate yearOfBirth;
    private Double point;
    private String group;

    public Student() {
        this.id = ++incrementedID;
    }

    public Student(String firstName, String email, LocalDate yearOfBirth, Double point, String group) {
        this.id = ++incrementedID;
        this.firstName = firstName;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
        this.point = point;
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(LocalDate yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", point=" + point +
                ", group='" + group + '\n';
    }
}
