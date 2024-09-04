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
	System.out.println("Phone book\n1:Search\n2:Service Nos.\n3:Add name\n4:Erase\n5:Edit\n6:Assign tone\n7:Send b'card\n8:Options\n9:Speed dials\n10:Voice tags");

System.out.println("Phonebook");
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

System.out.println("Messages");
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

			Scanner centre = new Scanner(System.in);
			int sent = centre.nextInt();

		switch(sent) {
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
		break;
	
		case 5:
			System.out.println("Tone\n1;Ringing tone\n2:Ringing volume\n3:Incoming call alert\n4:Composer\n5:Message alert tone\n6:Keypad tones\n7:Warning and game tones\n8:Vibrating alert\n9:Screen saver");
System.out.println("tones");
	Scanner tone = new Scanner(System.in);
	System.out.println("Input a number");
	int tones = tone.nextInt();

	switch (tones) {
		
		case 1:
			 System.out.println("Ringing tone");
				 break;
		case 2: 
			System.out.println("Ringing volume"); 
				break;
		case 3:
			System.out.println("Incoming Call Alert"); 
				break;
		case 4: 
			System.out.println("Composer");
				 break;
		case 5: 
			System.out.println("Message Alert Tone");
				 break;
		case 6: 
			System.out.println("Keypad Tones"); 
				break;
		case 7: 
			System.out.println("Warning And Game Tones");
				 break;
		case 8:
			 System.out.println("Vibrating Alert"); 
				break;
		case 9: 
			System.out.println("Screen Saver"); 
				break;
		}
				break;
		case 1:
			System.out.println("Call Settings\n1:Automatic redial\n2:Speed dialling\n3:Call waiting options\n4:Own number sending\n5:Phone line in use\n6:Automatic answer");
	System.out.println(call);

		Scanner caller = new Scanner(System.in);
		System.out.println("Input a number");
		int call = caller.nextInt();

		switch(call){

			case 1:
				 System.out.println("Automatic redial"); 
					break;
			case 2:
				 System.out.println("Speed dialling");
					 break;
			case 3: 
				System.out.println("Call waiting options");
					 break;
			case 4: 
				System.out.println("Own number sending");
					 break;
			case 5 :
				 System.out.println("Phone line in use");
					 break;
			case 6: 
				System.out.println("Automatic answer"); 
					break;
			}

			case 2:
				System.out.println("Phone settings\n1:Language\n2:Cell info display\n3:Welcome note\n4:Network selection\n5:Lights\n6:Confirm sim service actions");
		System.out.println(Phone);

		Scanner cell = new Scanner(System.in);
		System.out.println("Please Choose");
		int Phone = cell.nextInt();

		switch(Phone){

			case 1: 
				System.out.println("Language");
					 break;
			case 2: 
				System.out.println("Cell Info Display");
					 break;
			case 3: 
				System.out.println("Welcome note"); 
					break;
			case 4:
				 System.out.println("Network selection"); 
					break;
			case 5: 
				System.out.println("Lights");
					 break;
			case 6:
				 System.out.println("Confirm SIM service actions"); 
					break;
			} 
				break;

			case 3:
				System.out.println("Security settings\n1:Pin code request\n2:Call barring service\n3:Fixed dialing\n4:Closed user group\n5:Phone security\n6:Change access codes");

		System.out.println(Security);
		Scanner code = new Scanner(System.in);
		System.out.println("Input a number");
		int Security = code.nextInt();
			switch(Security) {
 
			case 1:
				 System.out.println("PIN code request");
					 break;
			case 2: 
				 System.out.println("Call barring service");
					 break;
			case 3:
				 System.out.println("Fixed dialling");
					 break;
			case 4: 
				System.out.println("Closed user group");
					 break;
			case 5:
				 System.out.println("Phone security"); 
					break;
			case 6: 
				System.out.println("Change access codes");
					 break;
			} 
					break;

			case 4:
				System.out.println("Restore Factory Settings");
}
			case 7:
				 System.out.println("Call divert");	
					 break;
			case 8:
				 System.out.println("Games");
					 break;
			case 9:
				 System.out.println("Calculator");
					 break;
			case 10: 
				System.out.println("Reminder"); 
					break;
			case 11: 
				System.out.println("Clock\n1:Alarm clock\n2:Clock settings\n3:Date setting\n4:Stopwatch\n5:Countdown timer\n6:Auto update of date and time");
		System.out.println(clock);

		Scanner alarm = new Scanner(System.in);
		System.out.println("input a number");
		int clock = alarmnextInt();

		switch(clock) {
			case 1:
				 System.out.println("Alarm Clock"); 
					break;
			case 2: 
				System.out.println("Clock Setting");
					 break;
			case 3:
				 System.out.println("Date Setting"); 
					break;
			case 4:
				 System.out.println("Stopwatch"); 
					break;
			case 5: 
				System.out.println("Countdown Timer"); 
					break;
			case 6:
				 System.out.println("Auto update of date and time"); 
					break;
			}
					 break;
			case 12:
				 System.out.println("Profiles"); 
					break;
			case 13: 
				System.out.println("Sim Services");
					 break;



}
}