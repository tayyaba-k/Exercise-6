package test;
import java.io.*;



class InstanceMethod{
	
    public static void main(String[] args) {
    	//creating object of the class
    	InstanceMethod obj=new InstanceMethod();
    	//calling instance method
    	obj.display();
    	System.out.println("Tayyaba");
    }
    //instance method
    void display() {
    	int a=50;
    	System.out.println(a);
    }
    	
}