package com.softserve.edu.practical.Practical_tasks_08_Nested_Inner_classes;

public class Department {
    public static String field;

    public static class Address implements Cloneable{
        public String city;
        protected   String street;
        public Address(String city, String street){
            this.city = city;
            this.street = street;
        }
        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    '}';
        }
    }
}
