public class Phone {
	    private String manufacturer;
	    private String model;
	    private String operatingSystem;
	    private int uniqueID;
	    private static int count;

	    /**
	     * Constructor of class Phone.
	     *
	     * @param manufacturer	manufacturer of the phone
	     * @param mode	model of the phone
	     * @param operatingSystem	operating system of the phone
	     * @param uniqueID
	     * @param count
	     */
	    public Phone(String manufacturer, String model, String operatingSystem) {
	        this.manufacturer = manufacturer;
	        this.operatingSystem = operatingSystem;
	        this.model = model;
	        this.uniqueID = 1234501 + count;
	        count++;
	    }

	    /**
	     * Returns the manufacturer of the phone.
	     * @return the manufacturer
	     */
	    public String getManufacturer() {
	        return manufacturer;
	    }

	    /**
	     * Returns the model of the phone.
	     * @return the model
	     */
	    public String getModel() {
	        return model;
	    }
	    
	    /**
	     * Returns the operating system of the phone.
	     * @return the operating system
	     */
	    public String getOperatingSystem() {
	        return operatingSystem;
			}
			
			/**
	     * Returns the unique ID of the phone.
	     * @return the unique ID
	     */
	    public String getUniqueID() {
				return uniqueID;
		}

	    @Override
	    public String toString() {
	        return manufacturer + " " + model + " " + operatingSystem + " " + "id: " + uniqueID;
	    }
	}