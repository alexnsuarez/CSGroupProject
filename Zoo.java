/**
 * Zoo handles enclosures aggregation with Animals
 * @author StevenDennis AlexandraSuarez KylerYates AbdouToure 
 *
 */
public class Zoo
{
    private String enclosure;
    /**
     * accessor method for enclosure 
     * @return enclosure
     */
    public String getEnclosure() {
        return this.enclosure;
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
     * @param enclosure
     */
    public Zoo(String enclosure) {
        this.enclosure = enclosure;
    }
}