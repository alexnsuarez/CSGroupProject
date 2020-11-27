/**
 * Animals stores animals and enclosures parent of StockRoom 
 * @author StevenDennis AlexandraSuarez KylerYates AbdouToure 
 *
 */
public class Animals
{
    private String animal;
    private String enclosure;
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
     * accessor method for enclosure
     * @return enclosure
     */
    public String getEnclosure() {
		return enclosure;
	}
    /**
     * mutator method for enclosure
     * @param enclosure
     */
	public void setEnclosure(String enclosure) {
		this.enclosure = enclosure;
	}
	/**
     * constructor
     * @param animal
     */
    public Animals( String animal, String enclosure) {
    	this.enclosure = enclosure;
        this.animal = animal;
    }
    
}
