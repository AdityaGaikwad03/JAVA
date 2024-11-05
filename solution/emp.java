import java.io.*;
import java.util.*;
class emp
{
	int eid;
	String name,dname;
	float salary;
	static int cnt =0;
	emp()
	{
		cnt ++;
	}
	emp(int eid,String name, String dname, float salary)
	{
		this.eid= eid;
		this.name=name;
		this.dname = dname;
		this.salary = salary;
		cnt++;
	}
	void display()
	{
		System.out.println("emp id is " +eid +"\n Employee name is :" +name + "\n Employee department is " +dname +"\n Employee salary is " +salary);
	}
	static void count()
	{
		System.out.println("Number of objects created are " +cnt);
	}
	public static void main(String args[])
	{
		int i,n,id;
		String name,dname;
		float salary;
		Scanner sc =new Scanner(System.in);
		System.out.println("****** Default constructor values are**********");
		emp e1 = new emp();
		e1.display();
		System.out.println("How many employee you want");
		n = sc.nextInt();
		emp e[] = new emp[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the id");
			id = sc.nextInt();
			System.out.println("Enter the name");
			name = sc.next();
			System.out.println("Enter the department name");
			dname = sc.next();
			System.out.println("Enter the salary");
			salary = sc.nextFloat();
			e[i] = new emp(id,name,dname,salary);
		}
		for(i=0;i<n;i++)
			e[i].display();
		e1.count();
	}
}