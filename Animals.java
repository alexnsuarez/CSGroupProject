/**
 * Animals stores animals and enclosures parent of StockRoom 
 * @author StevenDennis AlexandraSuarez KylerYates AbdouToure 
 *
 */
import java.util.ArrayList;
public class Animals
{
    private String animal;
    private int animalCount;
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
	 * accessor method for animalCount
	 * @return animalCount
	 */
	public int getAnimalCount() {
		return animalCount;
	}
	/**
	 * mutator method for animalCount
	 * @param animalCount
	 */
	public void setAnimalCount(int animalCount) {
		this.animalCount = animalCount;
	}
	// method for showing related animals by enclosure
	public ArrayList<String> animalGroup(){
		ArrayList<String> group = new ArrayList<String>();
		//TODO logic for grouping animals by enclosure and adding them to the group array
		return (group);
		
	}

	/**
     * constructor
     * @param animal
     * @param enclosure
     * @param animalCount
     */
    public Animals(String animal, String enclosure, int animalCount) {
    	this.enclosure = enclosure;
        this.animal = animal;
        this.animalCount = animalCount;

}
    }
