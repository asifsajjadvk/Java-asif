import java.util.*;
class Employee{
	int eNo;
	String eName;
	int eSalary;
	
	public void read(){
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter ID: ");
		eNo= Integer.parseInt(sc.nextLine());
		System.out.print("Enter Name;");
		eName =sc.nextLine();
		System.out.println("Enter monthly salary;");
		eSalary =Integer.parseInt(sc.nextLine());
	}
	
	public void display(){
		System.out.println("Name: "+eName);
		System.out.println("Name: "+eSalary);
	}
	public static void main(String []args){
		int i,n=3;
		int No;
		employee emp[]=new employee[n];
		for(i=0;i<n;i++){
			emp[i]=new employee();
			emp[i].read();
		}
		System.out.println("Search");
		while(true){
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter ID: ");
			No = Integer.parseInt(sc.nextLine());
			for(i=0;i<n;i++){
				if(emp[i].eNo==No){
					emp[i].display();
					break;
				}
			}
		}
	}
}
