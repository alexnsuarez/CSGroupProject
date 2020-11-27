/**
 * StockRoom handles amount of food and type of food child of Animals class
 * @author StevenDennis AlexandraSuarez KylerYates AbdouToure 
 *
 */
public class StockRoom extends Animals
{
    private int foodCount;
 /**
  * constructor with only inheritance
  * @param animal
  */
    public StockRoom(final String animal) {
        super(animal);
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
     * constructor
     * @param foodCount
     * @param animal
     */
    public StockRoom(int foodCount, String animal) {
        super(animal);
        this.foodCount = foodCount;
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
    public void sortFood(String foodType) {
    	// TODO logic for sorting food into types and assigning amounts
    }
}