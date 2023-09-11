package com.softserve.edu.CollectionPart1.UniversityStudents;

public enum Course {
    COURSE_1 ("1"),
    COURSE_2 ("2"),
    COURSE_3 ("3"),
    COURSE_4 ("4"),
    COURSE_5 ("5"),
    COURSE_6 ("6"),
    ;

    public String course;

    Course(String course) {
        this.course = course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public Course nextCourse(Course course){
        if(this == Course.COURSE_1) return Course.COURSE_2;
        if(this == Course.COURSE_2) return Course.COURSE_3;
        if(this == Course.COURSE_3) return Course.COURSE_4;
        if(this == Course.COURSE_4) return Course.COURSE_5;
        return Course.COURSE_6;
    }

    public static Course findValue(String value){
        for(Course course1: Course.values()){
            if(course1.getCourse().equals(value)){
                return course1;
            }
        }
        return COURSE_1;
     }
}
