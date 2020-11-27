import java.util.Arrays;
import java.util.Scanner;

/**
 * ZooMAIN creates objects and interface
 * @author StevenDennis AlexandraSuarez KylerYates AbdouToure 
 *
 */
public class ZooMAIN {
	public static void main(String [] args) {
		
			Animals cheetah =
			         new StockRoom("Cheetah", "Big Cats Enviornment",14,150,"meat");
			Animals hippo =
			         new StockRoom("Hippo", "African Beasts",7,800,"grasses and fruit");
			Animals lion =
			         new StockRoom("Lion", "Big Cats Enviornment",30,150,"meat");
			Animals tiger =
					new StockRoom ("Tiger", "Big Cats Enviornment",6,150,"meat");
			Animals rhino =
					new StockRoom ("Rhino", "African Beasts",4,800,"grasses and fruit");
			Animals hyena =
					new StockRoom ("Hyena", "African Beasts",43,150,"meat");
			Animals jackal =
					new StockRoom ("Jackal", "African Beasts",7,150,"meat");
			Animals crocodile =
					new StockRoom ("Crocodile", "Reptile House",12,150,"meat");
			Animals alligator =
					new StockRoom ("Alligator", "Reptile House",13,150,"meat");
			Animals turtle =
					new StockRoom ("Turtle", "Reptile House",250,400,"insects, grasses and fruit");
			Animals snake =
					new StockRoom ("Snake", "Reptile House",200,150,"meat");
			Animals blbear =
					new StockRoom ("Black Bear", "Bear Territory",6,150,"meat");
			Animals pbear =
					new StockRoom ("Polar Bear", "Bear Territory",8,150,"meat");
			Animals brbear =
					new StockRoom ("Brown Bear", "Bear Territory",10,150,"meat");
			Animals dolphin =
					new StockRoom ("Dolphin", "Under the Sea",15,600,"fish");
			Animals penguins =
					new StockRoom ("Penguin", "Under the Sea",23,600,"fish");
			Animals whales =
					new StockRoom ("Whales", "Under the Sea",2,600,"fish");
			Animals babboon =
					new StockRoom ("Baboon", "Monkey Place",16,400,"insects, grasses and fruit");
			Animals chimp =
					new StockRoom ("Chimpanzee", "Monkey Place",22,400,"insects, grasses and fruit");
			Animals gorilla =
					new StockRoom ("Gorilla", "Monkey Place",5,400,"insects, grasses and fruits");
			Animals flamingo =
					new StockRoom ("Flamingo", "Birds of Paradise",11,600,"fish");
			Animals parrot =
					new StockRoom ("Parrot", "Birds of Paradise",30,300,"insects, nuts and seeds");
			Animals puffin =
					new StockRoom ("Puffin", "Birds of Paradise",21,600,"fish");
			
			Scanner keyboard = new Scanner (System.in);
			String searchedanimal;
			searchedanimal = keyboard.nextLine();
			
			String[] listofanimals = {"Cheetah","Lion","Black Bear","Polar Bear", "Brown Bear", "Flamingo", "Parrot",
					"Puffin", "Gorilla", "Chimpanzee", "Gorilla", "Babboon", "Whale", "Dolphin", "Penguin",
					"Snake", "Turtle", "Alligator", "Crocodile", "Jackal", "Hyena", "Rhino", "Hippo", "Tiger"};
			
			boolean contains = Arrays.stream(listofanimals).anyMatch(searchedanimal::equals);
		// TODO arraylist and loop can be used to create new objects
		// TODO interface probably switch
		
	}

}
