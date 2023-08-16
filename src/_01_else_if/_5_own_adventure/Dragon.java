package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;
import java.util.Random;

public class Dragon {
	public static void main(String[] args) {
//story goes as such: You are the MC, so pane one is name. Pane 2 is your dog's name. MC wakes up to raiders in the house. Option one: Come out in peace or option 2: grab knife and ambush them. 
//If peace: 50% chance of being let go with no problems, 40% of paying 20-100 (random number) of coins, 10% they kill your dog and take 50 coins. 
//if ambush: 50% success, 50% fail, if fail, 50% chance of dying and 50% chance of getting put in prison. They kill your dog too. 
//if let go in peace, you get a basic story. Rescue the the lord of the castle from King George and retrieve their dragon. You gain artifact Naegling.
		int coins = 200;
		String re = "What is your dog's name?";
		String dogname = JOptionPane.showInputDialog(null,re);
		String rde = "What is your name?";
		String MC = JOptionPane.showInputDialog(null,rde);
		String e = "Welcome to the Village of Redfell "+MC+"! This has been your home for your whole life. A year ago, you found your dog, "+dogname+", in the forest. You've lived a pretty boring life so far, excited by only the discovery of your dog and the coming birthdays.";
		JOptionPane.showMessageDialog(null,e);
		String ed = "At 3 am, there was a strange sound. You went down to investigate, holding your breath as you hear strange muttering from at least two people.";
		JOptionPane.showMessageDialog(null,ed);
		String intruders = "Any thoughts you've had so far are dashed as you creep down the stairs to see the intruders in your house. Even in the poor lighting, you can make out the embelym of King George on their clothing. Do you contront them in peace or ambush them? " +dogname+" will try to aid you in any way it can. Type either ambush or peace.";
		String poram = JOptionPane.showInputDialog(null,intruders);	
		//this were the ambush route starts
		if (poram.toLowerCase().equals("ambush")) {
			ambush();
		}
		//this is where the peace route starts
		if(poram.toLowerCase().equals("peace")) {
			peace(dogname, coins);
		}
	}
	//methods
	
	static void ambush()
	{
		String reambush = "As quietly as possible, you grab the knife in the kitchen. They're in the room next to it but if you're lucky they won't notice.";
		JOptionPane.showMessageDialog(null,reambush);
		int ambushrate = new Random().nextInt(100);
		if(ambushrate <= 50) {
			//success
		}
		if(ambushrate > 50 && ambushrate < 90) {
			death();
		}
		else {
			//prison route
		}
		
	}
	static void peace(String dogname, int coins)
	{
		String ere = "You walk down confindently and ask what the intruders are doing in your house. They turn and look at you confused. "+dogname+" stays close to you.";
		JOptionPane.showMessageDialog(null,ere);
		int peacerate = new Random().nextInt(100);
		if(peacerate <= 50) {
			//no problems
			String noproblems = "The intruders jump and glance at "+dogname+". In fear, they escape your house as quickly as possible, giving you no time to pursue them or interograte them. You pat "+dogname+" and double check to see if they stole anything.";
			JOptionPane.showMessageDialog(null, noproblems);
		}
		if(peacerate > 50 && peacerate < 90) {
			//pay random amount
			int coinpay = new Random().nextInt(100)+20;
			String red = "The intruders hold a knife to your throat. The intruders demand "+coinpay+" coins from you. As you pay, "+dogname+" looks furious.";
			JOptionPane.showMessageDialog(null,red);
			String minus = "You pay up, not daring to breath. The king's army are famous for their poorly concealed corruption.";
			JOptionPane.showMessageDialog(null,minus);
			coins = coins -coinpay;
		}
		if (peacerate >= 90) {
			//pay 50 coins, dog is killed
			String bad = "The intruders jump in surprise but regain their compusure. In their desperation, one grabs you and pins to the wall while the other grabs "+dogname+". You are forced to watch as they brutally murder "+dogname+".";
			JOptionPane.showMessageDialog(null,bad);
			String two = "You manage break out of the intruder's grip but they escape out of your house with 50 coins.";
			JOptionPane.showMessageDialog(null,two);
			coins = coins - 50;
		
		}
	}
	static void dogalivepeace(String dogname) {
		
	}
	static void death() {
		String de = "You die.";
		JOptionPane.showMessageDialog(null,de);
	}
}

