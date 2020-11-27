import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**
	 * ZooMAIN creates objects and interface
	 * @author StevenDennis AlexandraSuarez KylerYates AbdouToure TonyFarelli
	 *
	 */
	
	public class ZooMAIN {
		  
		public static void main(String [] args) {
			
			
			Scanner keyboard = new Scanner (System.in);
			String searchedanimal;
			String exhibit;
			String foodtype;
			int foodnumber;
			int numberofanimals;
			
			
			String[] listofanimals = {"Cheetah","Lion","Black Bear","Polar Bear", "Brown Bear", "Flamingo", "Parrot",
					"Puffin", "Gorilla", "Chimpanzee", "Gorilla", "Baboon", "Whale", "Dolphin", "Penguin",
					"Snake", "Turtle", "Alligator", "Crocodile", "Jackal", "Hyena", "Rhino", "Hippo", "Tiger"};
			
			System.out.println("Welcome to Carbondale's Zoo.");
			System.out.println("Please enter an animal in the singualar form, capitalized.");
			System.out.println("If nothing pops up, we may have the animal under a slightly more specific or general name, or we don't have that animal.");
			System.out.println("You can search up to five animals before the program ends.");
			searchedanimal = keyboard.nextLine();
			int forswitch = 0;
			
			for (int count = 0; count < listofanimals.length; count++)
			{
			    if (searchedanimal.equals(listofanimals[count]))
			    {
			        System.out.println(listofanimals[count] + "s is one of the animals within the zoo.");
			        forswitch = 1;
			    	 
			    
			        }
			}
			 switch (forswitch) {
			 case 0:
				 System.out.println("There is no such animal in the zoo. Restart the program.");
				 break;
			 
			 case 1:
				 
				 if (searchedanimal.equals("Cheetah") || searchedanimal.equals("Lion") || searchedanimal.equals("Tiger"))
	        		{
	        		exhibit = "Big Cats Enviornment";
	        		}
	        
				 else if (searchedanimal.equals("Hyena") || searchedanimal.equals("Jackal") || searchedanimal.equals("Hippo")|| searchedanimal.equals("Rhino"))
 				{
	        		exhibit = "African Beasts Experience";
	        	
 				}
	        
				 else if (searchedanimal.equals("Snake") || searchedanimal.equals("Turtle") || searchedanimal.equals("Crocodile")|| searchedanimal.equals("Alligator"))
					{
	        		exhibit = "Reptile House";
	        		
					}
				 
				 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Gorilla") || searchedanimal.equals("Chimpanzee"))
					{
	        		exhibit = "Monkey Place";
	        	
					}
				 else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Whale") || searchedanimal.equals("Penguin"))
					{
	        		exhibit = "Under the Sea";
	        	
					}
				 else if (searchedanimal.equals("Black Bear") || searchedanimal.equals("Polar Bear") || searchedanimal.equals("Brown Bear"))
					{
	        		exhibit = "Bear Territory";
	   
					}
				 else if (searchedanimal.equals("Puffin") || searchedanimal.equals("Parrot") || searchedanimal.equals("Flamingo"))
					{
	        		exhibit = "Birds of Paradise";
	        		
					}
	        
				 if (searchedanimal.equals("Cheetah") || searchedanimal.equals("Lion") 
	        		|| searchedanimal.equals("Tiger") || searchedanimal.equals("Hyena") 
	        		|| searchedanimal.equals("Jackal") || searchedanimal.equals("Crocodile")
	        		|| searchedanimal.equals("Brown Bear") || searchedanimal.equals("Black Bear")
	        		|| searchedanimal.equals("Polar Bear") || searchedanimal.equals("Snake")
	        		|| searchedanimal.equals("Alligator") || searchedanimal.equals("Tiger"))
	        	
	        	{foodtype = "meat";}
	        
	        
				 else if (searchedanimal.equals("Hippo") || searchedanimal.equals("Rhino"))
	        	
	        	{foodtype = "grasses and fruit";}
	        
				 else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Penguin")|| searchedanimal.equals("Whale")|| searchedanimal.equals("Flamingo") || searchedanimal.equals("Puffin"))
	        	
     			{foodtype = "fish";}
	        
	        
				 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Chimpanzee")|| searchedanimal.equals("Gorilla"))
	        	
				 {foodtype = "insects, grasses and fruits";}
	        
				 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Chimpanzee")|| searchedanimal.equals("Gorilla"))
	        	
				 {foodtype = "insects, nuts and seeds";}	
				 
				 Random rand = new Random(); 
				 foodnumber = rand.nextInt(500);
				 numberofanimals = rand.nextInt(50);
				 
				 StockRoom FirstAnimal =
						 new StockRoom(searchedanimal, exhibit, numberofanimals, foodnumber);
				 
				 
				 
				 
	        ;
	        
	    System.out.println("Please search another animal.")
	    
	    }
	 
	   
	    

				 
			 
			 }
		}
			    
	
		        
		        
		       
			

			

			
			
			
			
			
			
		
	
