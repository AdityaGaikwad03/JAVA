import java.util.*;
class Matrix
{
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int M[][] = new int[a][b];
	void accept()
	{
		int a =
			this.a;
		int b = this.b;
		System.out.println("enter the "+(a*b)+ " values to matrix:");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				this.M[i][j] = sc.nextInt();
			}
		}
	}
	void display()
	{
		for(int i =0;i<a;i++)
		{
			for(int j =0;j<b;j++)
			{
				System.out.print(" "+this.M[i][j]);
			}
			System.out.println(" ");
		}
	}
	public static void main(String args[])
	{
		System.out.println("enter size 2*2 or 3*3 or ...");
		Matrix m1 = new Matrix();
		m1.accept();
		System.out.println("values to matrix 1:");
		m1.display();
		System.out.println("enter the size:");
		Matrix m2 = new Matrix();
		m2.accept();
		System.out.println("values to matrix 2:");
		m2.display();
		int choice;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Press 1: Addition, 2: Multiplication, 3: Exit");
			choice = scanner.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Addition is:" );
					for(int i=0;i<m1.a;i++)
					{
						for(int j=0;j<m1.b;j++)
						{
							System.out.print(" "+ (m1.M[i][j]+m2.M[i][j]));
						}
						System.out.println(" ");
					}
					break;
				case 2:
					System.out.println("Multiplication is:");
					for(int i=0;i<m2.a;i++)
					{
						for(int j=0;j<m2.b;j++)
						{
							System.out.print(" "+
									(m1.M[i][j]*m2.M[i][j]));
						}
						System.out.println(" ");
					}
					break;
				case 3:
					System.exit(0);
			}
		}
	}
}
