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
		String e = "Welcome to the Village of Redfell "+MC+"! This has been your home for your whole life. A year ago, you found your dog, "+dogname+", in the forest. \n You've lived a pretty boring life so far, excited by only the discovery of your dog and the coming birthdays.";
		JOptionPane.showMessageDialog(null,e);
		String ed = "At 3 am, there was a strange sound. You went down to investigate, holding your breath as you hear strange muttering from at least two people.";
		JOptionPane.showMessageDialog(null,ed);
		String intruders = "Any thoughts you've had so far are dashed as you creep down the stairs to see the intruders in your house. \n Even in the poor lighting, you can make out the embelym of King George on their clothing. \n Do you contront them in peace or ambush them? " +dogname+" will try to aid you in any way it can. Type either ambush or peace.";
		String poram = JOptionPane.showInputDialog(null,intruders);	
		//Try to make it so the peace or ambush thing is a button
		//this were the ambush route starts
		if (poram.toLowerCase().equals("ambush")) {
			ambush(dogname, MC);
		}
		//this is where the peace route starts
		if(poram.toLowerCase().equals("peace")) {
			peace(dogname, coins);
		}
	}
	//methods
	
	static void ambush(String dogname, String MC) {
		String reambush = "As quietly as possible, you grab the knife in the kitchen. \n They're in the room next to it but if you're lucky they won't notice.";
		JOptionPane.showMessageDialog(null,reambush);
		int ambushrate = new Random().nextInt(100);
		if(ambushrate <= 50 && ambushrate > 10) {
			//success
			String success = "They never see it coming. They're dead before they hit the ground. While the quick and hidden kill pleases you, a part of you knows that it won't be long till the authorities find out. \n You prepare a bag and get ready to leave the village. Both to hide the bodies and to leave before anyone notices the intruders' disapearence. \n" + dogname + " seems especcially troubled by the deaths of the intruders. You go and wash off the blood from every surface and clothing possible.";
			JOptionPane.showMessageDialog(null,success);
			String escapeV = "As you escape the village, you have the choice to head east or west. \n To the west is a very small and unknown village. Or it would be if it weren't for the manor of the Beast Lord in the area. Despite that, it was a small and quiet town. \n Outside of the distance it would take to reach the village, the other major problem of heading there was that any half-a-brain cell idiot could figure out a murderer of King George's personal would head there. \n To the east is a marsh. No one will expect you in the marsh as it's known for it's dangers. However, rumors of magic orignating from there are too intriguing for you, and you feel an innate desire to head there. \n Do you go east or west?";
			String lor = JOptionPane.showInputDialog(null,escapeV);	
			if(lor.toLowerCase().equals("west")) {
				west(dogname, MC);
		}
			else if(lor.toLowerCase().equals("west")) {
				east(dogname);
			}
		}
		if(ambushrate > 50 && ambushrate < 90) {
			//some story
			death();
		}
		else {
			prison(dogname);
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
			coins = coins-coinpay;
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
	static void prison(String dogname) {
		JOptionPane.showMessageDialog(null,"The intruders jump in surprise. Regaining their compusure, they rush at you and "+dogname +". \n One holds you back and as another pulls out a gleaming knife. You are forced to watch as the intruder kicks "+dogname+" in it's smoatch. He countinues to kick "+dogname+" until "+dogname+"'s whimpering quiets down. \n You watch as the intruder brings his knife to "+dogname+"'s body and he splits "+dogname+" in half. The other intruder knocks you out before you can relatiate.");
		JOptionPane.showMessageDialog(null, "When you wake up, you find yourself inside a jail cell, tossed up aganist the side of a wall. Your cellmate kicks you muttering, \"Wake up you idiot.\" \n You try to swat away their leg but end up being kicked in the smoutach. Your cellmate lifts you up and explains the rules of the prison to you. You listen intently as the events prior counitnue to haunt you. \n As the days pass, you build on your plan to escape the prison. ");
	}
	static void west(String dogname, String MC) {
		String renewV = "You head to the Village. Asten is a beautiful town, secluded in the forest and dappled with shadows, it has an air of mystersty and home.";
		JOptionPane.showMessageDialog(null,renewV);
		String relord = "While walking "+dogname+", you hear a shrill scream. \n "+dogname+" tugs you to the site. A part of you knows that the Lord's personal will take care of this situation and that your aid will put unnessarcy attention on you. \n Yet... Another, slightly quietier scream echoes across Asten. The people around you are starting to whisper and you tug your cloak to hide your face better. \n Do you help the person in distress or chose to not attaract attenion? Type either help or stay. ";
		String lord = JOptionPane.showInputDialog(null,relord);
		if (lord.toLowerCase().equals("stay")) {
			death();
		}
		else if(lord.toLowerCase().equals("help")) {
			savetheLord(MC,dogname);
		}
	}
	static void east(String dogname) {
		death();
	}
	static void savetheLord(String yourname, String dogname) {
		String start = "You decide to save the person. You run into the direction of the scream. "+dogname+" leds you, equally as intent on saving the person. \n When you reach, your mouth opens with shock. A shockingly beauiful man is being held by what you can only describe as a monster the size of mulitple rooms. \n Actually, you can describe it better. It's a ferret the size of a house. It has a barely viisble wizard hat on, in fact, the hat is the perfect size for a ferret not a house. The more stranger thing was the absoulute size of a golden monocle the ferret wore. \n You look up in shock and you fall to your knees silently. The ferret blots out a part of the sun. Horror is the only emotion you can describe. After a bit, you hear the mysterty hostage speak. \n \" Good sir, please let me down, \" he says with a weak laughter. \n The ferret looks at his soon-to-be meal. Instad of shock, he answers in the most austrailian accent ever, \" Petty human, do you realize I am planning to to throw ya on the barbie. Pop open a cold one and put some snags on the barbie. A perfect day. All you have to do is come along for sum' tea. \"";
		JOptionPane.showMessageDialog(null,start);
		String frosh = "The hostage struggles in the grip of the ferret, clearly not intending to be dinner for him. \n You belately realize that your only weapon is the knife you stabbed the intruders with. It's too small to have an effect on the ferret but you're sure you can hear shuffling of people in the bushes. "+dogname+" backs away from the ferret and runs in the bushes. You stumble after it but before you can enter the bushes, you hear the ferret speak. \n \"Is that another galah I hear? Oi, get here you little ankle biter,\" \n You scramble out of the way but you can see the looming shadow of the ferret's hand reaching to grab you. \" Don't be a drongo mate, I'm going save you for brekky.\" \n You have no idea what the ferret's saying. The ferret picks you up by the collar of your shirt. As you wriggle in his grip, the hostage in his other paw glances over at you with sympathy. He starts to talk again with the ferret. You resign yourself to your fate, knowing only a miracle can save you.";
JOptionPane.showMessageDialog(null,frosh);
String fresh = "Suddenly, you hear a woof. You watch in awe as "+dogname+" soaring through the air. It's holding a sword with it's teeth. You yell out but "+dogname+" lands perfectly beside you. From your vantage point, you can see a group of people hidden in the bushes. They are cheering silently as they watch "+dogname+"land beside you.\n "+dogname+" hands you the sword. With your free hand, you grab the sword. The hostage next to you keeps talking, distracting the ferret. \n You are about to enter combat against the ferret.";
		JOptionPane.showMessageDialog(null,fresh);
		ferretFight(yourname, dogname);
	}
	static void ferretFight(String yourname, String dogname) {
		// 1. Create some variables to hold health levels
				int playerHealth = 100;
				int ferrethealth = 100;
				//attacks
				int playerAttack = 0;
				int ferretAttack = 0;
				while (true) {
					String one = JOptionPane.showInputDialog("Would you like to attack with the ferret with a kick or with your sword?");
					if (one.equals("sword")) {
						Random ra = new Random();
						playerAttack = ra.nextInt(40);
					}
					if (one.equals("kick")) {
						Random t = new Random();
						playerAttack = t.nextInt(25);
					}
						ferrethealth = ferrethealth - playerAttack;
						Random r = new Random();
						ferretAttack = r.nextInt(45);
						playerHealth=playerHealth-ferretAttack;
						if (playerHealth < 1) {
							playerlost(yourname);
						}
						if (ferrethealth < 1) {
							JOptionPane.showMessageDialog(null, "The ferret recoils from your attacks and drops both you and his hostage. The hostage drops down with a graceful drop as you pant. \n The ferret's cracked monocle drops to the ground and the ferret turns around into the forest. ");
							JOptionPane.showMessageDialog(null, "The former hostage turns to thank you but before you could say anything, you collapse into their arms. When you wake up a minute later, you can see "+ dogname +" and the hostage's face cover your view of the sky. The hostage is wearing a cape similar to royalty's and their fairly long hair glitters slightly in the light. With soft voice, they ask you for your name. \n You mangage to croak out \""+ yourname+".\" \n They smile and nod as you get up. As they thank you for saving them, the people in the bushes slink out to meet you. ");
							//PLOT
						}
						String health = "You have "+playerHealth+" points of health. The ferret has "+ferrethealth+"points of health";
						JOptionPane.showMessageDialog(null,health);
						
				}
	}
	static void playerlost(String yourname) {
		//50:50 chance you die or get saved
		int lod = new Random().nextInt(100);
		if(lod >= 50) {
			death();
		}
		else {
			//you get saved
		}
	}
	static void death() {
		String de = "You die.";
		JOptionPane.showMessageDialog(null,de);
	}
}


