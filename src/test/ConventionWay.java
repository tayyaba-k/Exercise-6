package test;

import java.util.*;

//Student class implements comparable interface
class Student implements Comparable<Student> {

 Integer marks;

 Student(Integer marks) { 
	 this.marks = marks;
	 }

 // override toString method
 public String toString() { 
	 return (" " + this.marks); }

 // Override compareTo method to sort TreeSet in
 // ascending order
 public int compareTo(Student stu)
 {
     return this.marks.compareTo(stu.marks);
 }
 
}
class ConventionWay {
    public static void main(String[] args)
    {
 
        // New TreeSet
        TreeSet<Student> set = new TreeSet<>();
 
        // Adding elements to the set
        set.add(new Student(75));
        set.add(new Student(150));
        set.add(new Student(60));
        set.add(new Student(175));
        set.add(new Student(200));
 
        // Print TreeSet sorted in ascending order
        System.out.println("Sort elements in ascending order : " + set);
        
    }
}

