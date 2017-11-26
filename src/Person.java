public class Person {
    public String name;
    public int age;

    public Person(){
        name = "Tanes CSC";
        age = 300;

        /**
         * Author: Patrick Nguyen
         * License: Public
         * Purpose: Compare Person Objects
         */
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }public String getName(){
        return name;
    }public void setName(String name){
        this.name = name;
    }public int getAge(){
        return age;
    }public void setAge(int age){
        this.age = age;
    }public String toString(){
        return "Name: " +this.name+ " Age: " + this.age;
    }
    }

