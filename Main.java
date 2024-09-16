package application;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Opration O= new Opration();
		int a;
			System.out.println("1. press 1 for read all data");
			System.out.println("2. press 2 for add data");
			System.out.println("3. press 3 for update name");
			System.out.println("4. press 4 for update city");
			System.out.println("5. press 5 for delete");
				Scanner input= new Scanner(System.in);
				Scanner inputs= new Scanner(System.in);
				 a =input.nextInt();
				
			switch(a)
			{
			case 1: System.out.println("you select 1 opration");
			O.read();
			break;
			
			case 2: System.out.println("you select insert opration");
			System.out.println("enter name");
			String n=inputs.nextLine();
			System.out.println("enter city");
			String c=inputs.nextLine();
			O.add(n,c);
			System.out.println("updated successfully");
			break;
			
			case 3: 
				System.out.println("you select update name oparetion");
			System.out.println("enter new name");
			 n=inputs.nextLine();
			 System.out.println("enter id number where you want to update name");
			 int d=input.nextInt();
			 O.nameUpdate(d,n);
			 System.out.println("updated successfully");
			break;
			case 4: 
				System.out.println("you select update name oparetion");
			System.out.println("enter new city");
			 n=inputs.nextLine();
			 System.out.println("enter id number where you want to update city name");
			  d=input.nextInt();
			 O.nameName(d,n);
			 System.out.println("updated successfully");
			break;
			case 5: 
				System.out.println("you select delete oparetion");
			 System.out.println("enter name to delete the row");
			  String dd=inputs.nextLine();
			 O.delete(dd);
			 System.out.println("deleted successfully");
			break;
			
			default: System.out.println("out of choice");
			}
	

	}}