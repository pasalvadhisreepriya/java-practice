package com.comparator;

//Java Program to demonstrate the use of Java comparator
import java.util.*;

class Main{
    public static void main(String args[]){
//Creating a list of students
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Priya",23));
        al.add(new Student(103,"Sree",27));
        al.add(new Student(105,"Sreepriya",21));

        System.out.println("Sorting by Name");
//Using NameComparator to sort the elements
        Collections.sort(al,new NameComparator());
//Traversing the elements of list
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("sorting by Age");
//Using AgeComparator to sort the elements
        Collections.sort(al,new AgeComparator());
//Travering the list again
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

    }
}
