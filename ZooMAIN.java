/**
	 * ZooMAIN creates objects and interface
	 * @author StevenDennis AlexandraSuarez KylerYates AbdouToure 
	 *
	 */
	
	public class ZooMAIN {
		  
		public static void main(String [] args) {
			
			
			Scanner keyboard = new Scanner (System.in);
			String searchedanimal;
			String exhibit;
			
			
			String[] listofanimals = {"Cheetah","Lion","Black Bear","Polar Bear", "Brown Bear", "Flamingo", "Parrot",
					"Puffin", "Gorilla", "Chimpanzee", "Gorilla", "Babboon", "Whale", "Dolphin", "Penguin",
					"Snake", "Turtle", "Alligator", "Crocodile", "Jackal", "Hyena", "Rhino", "Hippo", "Tiger"};
			
			System.out.println("Welcome to Carbondale's Zoo.");
			System.out.println("Please enter an animal in the singualar form, capitalized.");
			System.out.println("If nothing pops up, we may have the animal under a slightly more specific or general name, or we don't have that animal.");
			System.out.println("You can search up to five animals before the program ends.");
			searchedanimal = keyboard.nextLine();
			
			for (int count = 0; count < listofanimals.length; count++)
			{
			    if (searchedanimal.equals(listofanimals[count]))
			    {
			        System.out.println(listofanimals[count] + "s is one of the animals within the zoo.");
			        
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
			        else if (searchedanimal.equals("Babboon") || searchedanimal.equals("Gorilla") || searchedanimal.equals("Chimpanzee"))
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
			       
			    }
			 
			    
		Animals animalone =
				new Animals (searchedanimal, exhibit);
		
		Animals animaltwo =
				new Animals (searchedanimal, exhibit);
		
		Animals animalthree =
				new Animals (searchedanimal, exhibit);
		
		Animals animalfour =
				new Animals (searchedanimal, exhibit);
		
		Animals animalfive =
				new Animals (searchedanimal, exhibit);
			    	 
			    
			        }
			 
			}
			

			

			
			
			
			
			// TODO interface probably switch
			
		}

	
