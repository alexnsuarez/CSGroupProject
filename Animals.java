/**
 * Animals stores animals parent of StockRoom aggregation with Zoo
 * @author StevenDennis AlexandraSuarez KylerYates AbdouToure 
 *
 */
public class Animals
{
    private String animal;
    // aggregation with Zoo
    Zoo animalEnclosure;
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
     * constructor with aggregation
     * @param animal
     */
    public Animals( String animal, Zoo enclosure) {
    	this.animalEnclosure = enclosure;
        this.animal = animal;
    }
    
