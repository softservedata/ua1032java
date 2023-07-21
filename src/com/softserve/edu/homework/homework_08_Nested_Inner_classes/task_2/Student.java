package com.softserve.edu.homework.homework_08_Nested_Inner_classes.task_2;
import com.softserve.edu.homework.homework_08_Nested_Inner_classes.task_1.FullName;
import com.softserve.edu.homework.homework_08_Nested_Inner_classes.task_1.Person;
public class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age,int course) {
        super(fullName, age);
        this.course = course;
    }
    public void setCourse(int course){
        this.course = course;
    }
    @Override
    public String info(){
        return "First name : "+ fullName.getFirstName() + ";  Last name : " +fullName.getLastName()+";  Age : " + age+"\n"+
                "I am studying in the "+course+"st year of my course.";
    }

    @Override
    public String activity() {
        return "I study at university";
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
