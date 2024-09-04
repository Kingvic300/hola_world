import java.util.Scanner;
public class Nokia{
public static void main(String[] args){
System.out.println("Welcome to your Nokia phone\nlist of menu functions\n1->Phone book\n2->Messages\n3->Chat\n4->Call register\n5->Tones\n6->Settings\n7->Call divert\n8->Games\n9->Calculator\n10->Reminders\n11->Clock\n12->Profiles\n13->SIM services\n");
System.out.println("menu");

Scanner input=new Scanner(System.in);
System.out.println("Input a number");
int choice =input.nextInt();

switch (choice) {
case 1:
	System.out.println("Phone book\n1: Search\n2: Service Nos.\n3: Add name\n4: Erase\n5: Edit\n6: Assign tone\n7: Send b'card\n8: Options\n9: Speed dials\n10: Voice tags");

switch(choices){
	case 1:
		System.out.println("Search"); 
			break;s
	case 2:
		System.out.println("Service Nos");
			 break;
	case 3:
		System.out.println("Add Name");
			 break;
	case 4:
		System.out.println("Erase"); 
			break;
	case 5:
		System.out.println("Edit");
			 break;
	case 6:
		System.out.println("Assign Tone");
			 break;
	case 7:
		System.out.println("Send b'card"); 
			break;
	case 8:
		System.out.println("Options");
			System.out.println("Input An Option:");
			System.out.println("1 Types Of View");
			System.out.println("2 Memory Status");
			Scanner Input = new Scanner(System.in);
			int Options =Input.nextInt();
			switch(Options) {
	case 1:
		System.out.println("Types Of View");
			 break;
	case 2:
		System.out.println("Memory Status");
			 break;
			}
			break;
	case 9:
		System.out.println("Speed Dials"); 
			break;
	case 10:
		System.out.println("Voice Tags"); 
			break;
		}
		
			break;
	//case 2:
	



//}







































































































































































































}
}
}	
