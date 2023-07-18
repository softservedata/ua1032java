package com.softserve.pract03;

public class Student {
    private String name;
    private double rating;

    public Student() {
        name = "";
        rating = 0;
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public static double avgRating(Student... students) {
        double sum = 0;
        for (Student current : students) {
            sum = sum + current.getRating();
        }
        return sum / students.length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = '" + name + '\'' +
                ", rating = " + rating +
                '}';
    }
}
