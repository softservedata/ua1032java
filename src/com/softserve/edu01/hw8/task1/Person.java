package com.softserve.edu01.hw8.task1;
    public abstract class Person {
        private FullName fullName;
        private int age;

        public Person(FullName fullName, int age) {
            this.fullName = fullName;
            this.age = age;
        }

        public FullName getFullName() {
            return fullName;
        }

        public void setFullName(FullName fullName) {
            this.fullName = fullName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public abstract String activity();

        public String info() {
            return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age;
        }
    }
