package test;
interface Sayable {
	void show();
}

public class StaticMethod {

	public static void saySomething() {
		System.out.println("Hello,this is static method");
	}
	public static void main(String[] args) {
		//Referring static method
		Sayable student=StaticMethod::saySomething;
		//calling interface method
		student.show();
		

	}

}
