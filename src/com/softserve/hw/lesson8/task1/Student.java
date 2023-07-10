package com.softserve.hw.lesson8.task1;

public class Student extends Person implements Cloneable {
    private int curse;

    public Student(FullName fullName, int age, int curse) {
        super(fullName, age);
        this.curse = curse;
    }

    public int getCurse() {
        return curse;
    }

    public void setCurse(int curse) {
        this.curse = curse;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public String info() {
        return super.info() + ", Course student: " + curse;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
