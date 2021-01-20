package docComments;

import java.util.*;

public class DeviceList {

	public ArrayList<Phone> deviceList;
	
	public void Add(Phone phone) {
		
		deviceList.add(phone)
		
	}

	
	/**
	 * 
	 * @param manufacturer
	 * @param model
	 * @param os
	 */
	public void Add(String manufacturer, String model, String os) {
	
		deviceList.add(new Phone(manufacturer, model, os));
		
	}
	
	/**
	 * 
	 * @param id Unique id of the device you want to remove from deviceList ArrayList.
	 */
	public void Remove(int id) {
		
		for (Phone phone : deviceList) {
			//if (phone.getUniqueID() == id)
			//{
			//	deviceList.
			//}
		}
		
	}
	
	public String showDevices()
	{
		String returner = "";
		
		for (int i = 0; i < deviceList.size(); i++) {
			
			returner += deviceList.get(i).toString() + "\n";
		}
		
		return returner;
	}
	
	
	
	
	
	/**
	 * 
	 * 	    private String manufacturer;
	    private String model;
	    private String operatingSystem;
	    private int uniqueID;
	    private int count;
	 * 
	 */
	
}
