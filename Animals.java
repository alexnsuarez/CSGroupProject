/**
 * Animals stores animals parent of StockRoom aggregation with Zoo
 * @author StevenDennis AlexandraSuarez KylerYates AbdouToure 
 *
 */
public class Animals
{
    private String animal;
    /**
     * accessor method for animal
     * @return animal
     */
    public String getAnimal() {
        return animal;
    }
    /**
     * mutator method for animal
     * @param animal
     */
    public void setAnimal( String animal) {
        this.animal = animal;
    }
    /**
     * constructor
     * @param animal
     */
    public Animals( String animal) {
        this.animal = animal;
    }
}