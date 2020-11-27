/**
 * ZooMAIN creates objects and interface
 * @author StevenDennis AlexandraSuarez KylerYates AbdouToure 
 *
 */
public class ZooMAIN {
	public static void main(String [] args) {
		
			Animals cheetah =
			         new Animals("Cheetah", "Big Cats Enviornment");
			Animals hippo =
			         new Animals("Hippo", "African Beasts");
			Animals lion =
			         new Animals("Lion", "Big Cats Enviornment");
			Animals tiger =
					new Animals ("Tiger", "Big Cats Enviornment");
			Animals rhino =
					new Animals ("Rhino", "African Beasts");
			Animals hyena =
					new Animals ("Hyena", "African Beasts");
			Animals jackal =
					new Animals ("Jackal", "African Beasts");
			Animals crocodile =
					new Animals ("Crocodile", "Reptile House");
			Animals alligator =
					new Animals ("Alligator", "Reptile House");
			Animals turtle =
					new Animals ("Turtle", "Reptile House");
			Animals snake =
					new Animals ("Snake", "Reptile House");
			Animals blbear =
					new Animals ("Black Bear", "Bear Territory");
			Animals pbear =
					new Animals ("Polar Bear", "Bear Territory");
			Animals brbear =
					new Animals ("Brown Bear", "Bear Territory");
			Animals dolphin =
					new Animals ("Dolphin", "Under the Sea");
			Animals penguins =
					new Animals ("Penguin", "Under the Sea");
			Animals whales =
					new Animals ("Whales", "Under the Sea");
			Animals babboon =
					new Animals ("Baboon", "Monkey Place");
			Animals chimp =
					new Animals ("Chimpanzee", "Monkey Place");
			Animals gorilla =
					new Animals ("Gorilla", "Monkey Place");
			Animals flamingo =
					new Animals ("Flamingo", "Birds of Paradise");
			Animals parrot =
					new Animals ("Parrot", "Birds of Paradise");
			Animals puffin =
					new Animals ("Puffin", "Birds of Paradise");
			
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
