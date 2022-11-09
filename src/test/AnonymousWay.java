package test;
import java.io.*;
import java.util.*;

class students{

 private int marks;
 private String name;

 // constructor
 public students(int value, String name)
 {
     this.marks=value;
     this.name=name;
 }
 public String getName()
 {
     return name;
 }
 public void setName(String name)
 {
     this.name= name;
 }
  
 public int getMarks()
 {
     return marks;
 }
  
}

//Comparator class will override the compare
//method which will compare the two objects
//passed in the parameter
class myMarksComparator implements Comparator<students>
{

 public int compare(students s1, students s2)
 {
     return s1.getMarks()-s2.getMarks();
 }
}

class myNameComparator implements Comparator<students>
{
 public int compare(students s1, students s2)
 {
     return s1.getName().compareTo(s2.getName());
 }
}

class AnonymousWay{

 public static void main (String[] args){
      
     // Creating the TreeSet with Comparator object passed
	 // as the parameter which will sort the user defined
     // objects of TreeSet
     TreeSet<students> set = new TreeSet<students>(new myMarksComparator());
      
     set.add(new students(100,"Shweta"));
     set.add(new students(165,"Vipasha"));
     set.add(new students(400,"Tayyaba"));
     set.add(new students(320,"Riya"));
      
     System.out.println("increasing Order with the Marks");
      
     // Printing the TreeSet elements
     for(students stu: set)
     {
         System.out.print(stu.getName()+" "+stu.getMarks());
         System.out.println();
     }
      
      
   

 }
}

