import java.util.ArrayList;

/**
 * StockRoom handles amount of food and type of food child of Animals class
 * @author StevenDennis AlexandraSuarez KylerYates AbdouToure 
 *
 */
public class StockRoom extends Animals
{
    private int foodCount;
    private String foodType;

   /**
  * constructor with only inheritance
  * @param animal
  * @param enclosure
  * @param animalCount
  */
    public StockRoom(String animal,String enclosure,int animalCount) {
        super(animal,enclosure,animalCount);
    }
    /**
     * accessor method for foodType
     * @return foodType
     */
    public String getFoodType() {
		return foodType;
	}
    /**
     * mutator method for foodType
     * @param foodType
     */
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
    /**
     * accessor method for foodCount
     * @return foodCount
     */
    public int getFoodCount() {
        return this.foodCount;
    }
    /**
     * mutator method for foodCount
     * @param foodCount
     */
    public void setFoodCount( int foodCount) {
        this.foodCount = foodCount;
    }
    /**
     * constructor used when creating animal objects
     * @param foodCount
     * @param animal
     * @param foodType
     * @param enclosure
     * @param animalCount
     */
    public StockRoom(String animal, String enclosure,int animalCount,int foodCount,String foodType) {
        super(animal,enclosure,animalCount);
        this.foodCount = foodCount;
        this.foodType = foodType;
    }
    /**
     * adFood method provides a way to add food to foodCount
     * @param foodCount
     */
    public void addFood(int foodCount) {
        this.foodCount += foodCount;
    }
    /**
     * method to sort food by type
     * @param foodType
     */
    // method for showing related animals by enclosure
	public ArrayList<String> animalGroup(){
		ArrayList<String> group = new ArrayList<String>();
		//TODO logic for grouping animals by enclosure and adding them to the group array
		return (group);
		
	}
}
