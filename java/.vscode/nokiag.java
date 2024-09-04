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

System.out.println("phone book");
Scanner menu = new Scanner(System.in);
System.out.println("Input a number:");
int Phonebook = menu.nextInt();


switch (Phonebook) {
	case 1:
		System.out.println("Search"); 
			break;
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
		System.out.println("Options\ninput an option\n1 Types of view\n2 Memory status");
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
	case 2:
		System.out.println("Messages\n1:Write messages\n2:Inbox\n3:Outbox\n4:Picture messages\n5:Templates\n6:Smileys\n7:Message settings\n8:Info service\n9:Voice mailbox number\n10:Service command editor");

System.out.println("messsages");
Scanner map = new Scanner(System.in);
System.out.println("Input a number:");
int Messages = map.nextInt();

switch (Messages) {

	case 1:
		System.out.println("Write messages"); 
			break;
	case 2:
		System.out.println("Inbox");
			 break;
	case 3:
		System.out.println("Outbox");
			 break;
	case 4:
		System.out.println("Picture messages"); 
			break;
	case 5:
		System.out.println("Templates");
			 break;
	case 6:
		System.out.println("Smileys");
			 break;
	case 7:
System.out.println("Message settings"); 
System.out.println("input a number");
System.out.println("1.Set 1");
System.out.println("2.Common");

Scanner submenu = new Scanner(System.in);
int MessagesSettings = submenu.nextInt();
switch(MessagesSettings){
	case 1:
		System.out.println("Input an Options:");
		System.out.println("1.Message Centre Number");
		System.out.println("2.Message Sent As");
		System.out.println("3.Message Validity");

		Scanner menumap = new Scanner(System.in);
		int menumapnumber = menumap.nextInt();
		switch(menumapnumber){
	case 1:	
		System.out.println("Message Centre Number"); 
			break;
	case 2:
		System.out.println("Message Sent As");
			 break;
	case 3:
		System.out.println("Message Validity"); 
			break;
}
			break;
	case 2:
		System.out.println("Common");
		System.out.println("Input a number:");
		System.out.println("1.Delivery Reports");
		System.out.println("2.Reply Via Same Centre");
		System.out.println("3.Character Support");

		Scanner menumap2 = new Scanner(System.in);
		int menumapnumber2 = menumap2.nextInt();
		switch (menumapnumber2) {
	case 1:	
		System.out.println("Delivery Reports");
			 break;
	case 2:
		System.out.println("Reply Via Same Centre");
			 break;
	case 3:
		System.out.println("Character Support");
			 break;
}

			break;
} 
			break;

	case 8:
		System.out.println("Info sevice");
			break;
	case 9:
		System.out.println("Voice mailbox number");
			break;
	case 10:
		System.out.println("Service command editor");
}
			break;
	case 3:
		System.out.println("Chat");
			break;
	case 4:
		System.out.println("call register\n1:missed calls\n2:received calls\n3:Dialled number\n4:Erase recent call lists\n5:Show call duration\n6:Show call costs\n7:call cost settings\n8:prepaid credit");

	System.out.println("callregister");
	Scanner calls = new Scanner(System.in);
	System.out.println("Input a number:");
	int callregister = calls.nextInt();

	switch (callregister) {

		case 1:	
			System.out.println("missed calls");
				break;
		case 2:
			System.out.println("received calls");
				break;
		case 3:
			System.out.println("dialled numbers");
				break;
		case 4:
			System.out.println("erase recent call lists");
}
				break;
		case 5:
			System.out.println("1: last call duration");
			System.out.println("2:All calls'duration");
			System.out.println("3:Received calls'duration");
			System.out.println("4:dialled calls duration");
			System.out.println("5:clear timers");

	Scanner call = new Scanner(System.in);
	System.out.println("Input a number");
	int showcallduration = call.nextInt();

	switch (showcallduration) {

		case 1:	
			System.out.println("last call duration");
				break;
		case 2:
			System.out.println("all calls'duration");
				break;
		case 3:
			System.out.println("received calls'duration");
				break;
		case 4:
			System.out.println("dialled calls'duration");
				break;
		case 5:
			System.out.println("clear timers");			
}
				break;
		case 6:
			System.out.println("last call cost\nAll calls'cost\nClear counters");
	Scanner cost = new Scanner(System.in);
	System.out.println("Input a number");
	int ShowCallCost = cost.nextInt();

	switch (ShowCallCost) {
	
		case 1: 
			System.out.println("Last call cost");
				break;
		case 2:
			System.out.println("All calls'cost");
				break;
		case 3:
			System.out.println("Clear counters");
}
				break;
		case 7: 
			System.out.println("call costs settings\n1:call cost limit\n2:show costs in");
	Scanner costs = new Scanner(System.in);
	System.out.println("Input a number");
	int CallCostSettings = costs.nextInt();

	switch (CallCostSettings) {

		case 1:
			System.out.println("Call cost limit");
				break;
		case 2:
			System.out.println("Show costs in");
}
				break;
		case 8:
			System.out.println("Prepaid credit");

				break;
}	
	//	case 5:
		//`	System.out.println("

}			











































































































































































































}


