package com.softserve.homework.hw08.task1;

public abstract class AbstractPerson {
    private FullName fullName;
    private int age;
//--------------------------------------------------------------------------------------------------------------------
                        // Внутрішній клас
                        // Не статинчний Inner Class   FullName є нащадком Cloneable
                         class FullName implements Cloneable {
                            private String firstName;
                            private String lastName;



                            //Навіщо в конструкторі ми ініціалізуємо "", чому не створити просто порожній конструктор
                            public FullName ( ) {
                                this.firstName = "";
                                this.lastName = "";
                            }
                                public FullName ( String firstName, String lastName ) {
                                this.firstName = firstName;
                                this.lastName = lastName;
                            }
//--------------------------------------------------------------------------------------------------------------------
            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone(); // Виклик базового супер клон клас
            }


        //Getter & Setter FullName
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
       public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }



    // a constructor public Person(FullName fullName, int age) ;
    public AbstractPerson ( FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public AbstractPerson () {
        this.fullName = new FullName();
        this.age = 0;
    }


    //Getter & Setter AbstractPerson
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

    //an abstract public activity() method with a String return type.
    public abstract String activity();

    //info() method, which will return a string in the format
    public String info() {
        return "First name: " + fullName.getFirstName() +
        ", Last name: " + fullName.getLastName() +
        ", Age: " + getAge();
    }
}