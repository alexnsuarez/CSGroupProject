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
			String exhibit = null;
			String foodtype = null;
			int foodnumber=0;
			int numberofanimals = 0;
			
			
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
	        	
	        	{foodtype = "meat";
	        	foodnumber = 106;
	        	numberofanimals = 3;
	        	}
			
	        
	        
				 else if (searchedanimal.equals("Hippo") || searchedanimal.equals("Rhino"))
	        	
	        	{foodtype = "grasses and fruit";
	        	foodnumber = 78;
	        	numberofanimals = 3;}
	        
				 else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Penguin")|| searchedanimal.equals("Whale")|| searchedanimal.equals("Flamingo") || searchedanimal.equals("Puffin"))
	        	
     			{foodtype = "fish";
     			foodnumber = 95;
	        	numberofanimals = 5;}
	        
	        
				 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Chimpanzee")|| searchedanimal.equals("Gorilla"))
	        	
				 {foodtype = "insects, grasses and fruits";
				 foodnumber = 50;
		        	numberofanimals = 10;}
	        
				 else if (searchedanimal.equals("Flamingo") || searchedanimal.equals("Parrot")|| searchedanimal.equals("Puffin"))
	        	
				 {foodtype = "insects, nuts and seeds";
				 foodnumber = 30;
		        	numberofanimals = 15;}	
				 
				 
				 StockRoom FirstAnimal =
						 new StockRoom(searchedanimal, exhibit, numberofanimals, foodnumber, foodtype);
				 
				 System.out.println("The animal you searched for is a " + FirstAnimal.getAnimal() + ". It can be found in the "
				 					+ FirstAnimal.getEnclosure() + " enclosure. There are currently " + FirstAnimal.getAnimalCount() +
				 					" animals currently. We feed " + FirstAnimal.getAnimal() + "s " + FirstAnimal.getFoodType() + ", with the amount of "
				 							+ FirstAnimal.getFoodCount() + " pounds to keep them happy and healthy." );
				 
				 
				 
				 
	        ;
	        
	        
	        
	        
	        
	        
	        
	    System.out.println("Please search another animal.");
	    
	    searchedanimal = keyboard.nextLine();
	    forswitch = 0;
	    
	    for (int count = 0; count < listofanimals.length; count++)
		{
		    if (searchedanimal.equals(listofanimals[count]))
		    {
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
       	
       	{foodtype = "meat";
       	foodnumber = 106;
       	numberofanimals = 3;
       	}
		
       
       
			 else if (searchedanimal.equals("Hippo") || searchedanimal.equals("Rhino"))
       	
       	{foodtype = "grasses and fruit";
       	foodnumber = 78;
       	numberofanimals = 3;}
       
			 else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Penguin")|| searchedanimal.equals("Whale")|| searchedanimal.equals("Flamingo") || searchedanimal.equals("Puffin"))
       	
			{foodtype = "fish";
			foodnumber = 95;
       	numberofanimals = 5;}
       
       
			 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Chimpanzee")|| searchedanimal.equals("Gorilla"))
       	
			 {foodtype = "insects, grasses and fruits";
			 foodnumber = 50;
	        	numberofanimals = 10;}
       
			 else if (searchedanimal.equals("Flamingo") || searchedanimal.equals("Parrot")|| searchedanimal.equals("Puffin"))
       	
			 {foodtype = "insects, nuts and seeds";
			 foodnumber = 30;
	        	numberofanimals = 15;}	
			 
			 
			 StockRoom SecondAnimal =
					 new StockRoom(searchedanimal, exhibit, numberofanimals, foodnumber, foodtype);
			 
			 System.out.println("The animal you searched for is a " + SecondAnimal.getAnimal() + ". It can be found in the "
			 					+ SecondAnimal.getEnclosure() + " enclosure. There are currently " + SecondAnimal.getAnimalCount() +
			 					" animals currently. We feed " + SecondAnimal.getAnimal() + "s " + SecondAnimal.getFoodType() + ", with the amount of "
			 							+ SecondAnimal.getFoodCount() + " pounds to keep them happy and healthy." );
	    
	    
	    }
	 
	   
	    

				 
			 
			 
		
		
		
		  System.out.println("Please search another animal.");
		    
		    searchedanimal = keyboard.nextLine();
		    forswitch = 0;
		    
		    for (int count = 0; count < listofanimals.length; count++)
			{
			    if (searchedanimal.equals(listofanimals[count]))
			    {
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
	       	
	       	{foodtype = "meat";
	       	foodnumber = 106;
	       	numberofanimals = 3;
	       	}
			
	       
	       
				 else if (searchedanimal.equals("Hippo") || searchedanimal.equals("Rhino"))
	       	
	       	{foodtype = "grasses and fruit";
	       	foodnumber = 78;
	       	numberofanimals = 3;}
	       
				 else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Penguin")|| searchedanimal.equals("Whale")|| searchedanimal.equals("Flamingo") || searchedanimal.equals("Puffin"))
	       	
				{foodtype = "fish";
				foodnumber = 95;
	       	numberofanimals = 5;}
	       
	       
				 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Chimpanzee")|| searchedanimal.equals("Gorilla"))
	       	
				 {foodtype = "insects, grasses and fruits";
				 foodnumber = 50;
		        	numberofanimals = 10;}
	       
				 else if (searchedanimal.equals("Flamingo") || searchedanimal.equals("Parrot")|| searchedanimal.equals("Puffin"))
	       	
				 {foodtype = "insects, nuts and seeds";
				 foodnumber = 30;
		        	numberofanimals = 15;}	
				 
				 
				 StockRoom ThirdAnimal =
						 new StockRoom(searchedanimal, exhibit, numberofanimals, foodnumber, foodtype);
				 
				 System.out.println("The animal you searched for is a " + ThirdAnimal.getAnimal() + ". It can be found in the "
				 					+ ThirdAnimal.getEnclosure() + " enclosure. There are currently " + ThirdAnimal.getAnimalCount() +
				 					" animals currently. We feed " + ThirdAnimal.getAnimal() + "s " + ThirdAnimal.getFoodType() + ", with the amount of "
				 							+ ThirdAnimal.getFoodCount() + " pounds to keep them happy and healthy." );
		    
		    
		    }
		 
		    
		    
		    
		    
		    

			 
			 
			 
			
			
			
			  System.out.println("Please search another animal.");
			    
			    searchedanimal = keyboard.nextLine();
			    forswitch = 0;
			    
			    for (int count = 0; count < listofanimals.length; count++)
				{
				    if (searchedanimal.equals(listofanimals[count]))
				    {
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
		       	
		       	{foodtype = "meat";
		       	foodnumber = 106;
		       	numberofanimals = 3;
		       	}
				
		       
		       
					 else if (searchedanimal.equals("Hippo") || searchedanimal.equals("Rhino"))
		       	
		       	{foodtype = "grasses and fruit";
		       	foodnumber = 78;
		       	numberofanimals = 3;}
		       
					 else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Penguin")|| searchedanimal.equals("Whale")|| searchedanimal.equals("Flamingo") || searchedanimal.equals("Puffin"))
		       	
					{foodtype = "fish";
					foodnumber = 95;
		       	numberofanimals = 5;}
		       
		       
					 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Chimpanzee")|| searchedanimal.equals("Gorilla"))
		       	
					 {foodtype = "insects, grasses and fruits";
					 foodnumber = 50;
			        	numberofanimals = 10;}
		       
					 else if (searchedanimal.equals("Flamingo") || searchedanimal.equals("Parrot")|| searchedanimal.equals("Puffin"))
		       	
					 {foodtype = "insects, nuts and seeds";
					 foodnumber = 30;
			        	numberofanimals = 15;}	
					 
					 
					 StockRoom FourthAnimal =
							 new StockRoom(searchedanimal, exhibit, numberofanimals, foodnumber, foodtype);
					 
					 System.out.println("The animal you searched for is a " + FourthAnimal.getAnimal() + ". It can be found in the "
					 					+ FourthAnimal.getEnclosure() + " enclosure. There are currently " + FourthAnimal.getAnimalCount() +
					 					" animals currently. We feed " + FourthAnimal.getAnimal() + "s " + FourthAnimal.getFoodType() + ", with the amount of "
					 							+ FourthAnimal.getFoodCount() + " pounds to keep them happy and healthy." );
			    
			    
			    }
		   

				 
				 
				 
				
				
				
				  System.out.println("Please search another animal.");
				    
				    searchedanimal = keyboard.nextLine();
				    forswitch = 0;
				    
				    for (int count = 0; count < listofanimals.length; count++)
					{
					    if (searchedanimal.equals(listofanimals[count]))
					    {
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
			       	
			       	{foodtype = "meat";
			       	foodnumber = 106;
			       	numberofanimals = 3;
			       	}
					
			       
			       
						 else if (searchedanimal.equals("Hippo") || searchedanimal.equals("Rhino"))
			       	
			       	{foodtype = "grasses and fruit";
			       	foodnumber = 78;
			       	numberofanimals = 3;}
			       
						 else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Penguin")|| searchedanimal.equals("Whale")|| searchedanimal.equals("Flamingo") || searchedanimal.equals("Puffin"))
			       	
						{foodtype = "fish";
						foodnumber = 95;
			       	numberofanimals = 5;}
			       
			       
						 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Chimpanzee")|| searchedanimal.equals("Gorilla"))
			       	
						 {foodtype = "insects, grasses and fruits";
						 foodnumber = 50;
				        	numberofanimals = 10;}
			       
						 else if (searchedanimal.equals("Flamingo") || searchedanimal.equals("Parrot")|| searchedanimal.equals("Puffin"))
			       	
						 {foodtype = "insects, nuts and seeds";
						 foodnumber = 30;
				        	numberofanimals = 15;}	
						 
						 
						 StockRoom FifthAnimal =
								 new StockRoom(searchedanimal, exhibit, numberofanimals, foodnumber, foodtype);
						 
						 System.out.println("The animal you searched for is a " + FifthAnimal.getAnimal() + ". It can be found in the "
						 					+ FifthAnimal.getEnclosure() + " enclosure. There are currently " + FifthAnimal.getAnimalCount() +
						 					" animals currently. We feed " + FifthAnimal.getAnimal() + "s " + FifthAnimal.getFoodType() + ", with the amount of "
						 							+ FifthAnimal.getFoodCount() + " pounds to keep them happy and healthy." );
				    
				    
				    }

				    
				 System.out.println("Thank you for running our zoo search program. Please begin again if you wish to search more animals. Have a nice day.");
					 
				 
				 }
			
			}
	}
	
		        
