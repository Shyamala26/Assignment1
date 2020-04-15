package pkg1;
public class Student {
	int roll_no;
	int age;
	
	public void display1()
	{
		System.out.println("welcome all");
	}
	public void display2()
	{
		System.out.println("welcome all of you ");
	}
	public static void main(String[] args)
	{
		Student stu =new Student();
		stu.display1();
		stu.roll_no=1034;
		stu.age = 15;
		System.out.println(stu.age);
		System.out.println(stu.roll_no);
		stu.roll_no=1099;
		stu.age=19;
		System.out.println(stu.roll_no);
		System.out.println(stu.age);
		stu.display2();
	}
}
