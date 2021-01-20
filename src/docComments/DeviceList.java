package docComments;

import java.util.*;

public class DeviceList {

	public ArrayList<Phone> deviceList;
	
	
	/**
	 * 
	 * @param phone Already created instance of a phone.
	 */
	public void Add(Phone phone) {
		
		deviceList.add(phone);
		
	}

	
	/**
	 * Overload of Add method if no phone instance is created.
	 * 
	 * @param manufacturer Company that created the phone.
	 * @param model Which type of phone it is.
	 * @param operatingSystem What operating system it runs on. 
	 */
	public void Add(String manufacturer, String model, String operatingSystem) {
	
		deviceList.add(new Phone(manufacturer, model, operatingSystem));
		
	}
	
	/**
	 * 
	 * @param id Unique id of the device you want to remove from deviceList ArrayList.
	 */
	public void Remove(int id) {
		
		int index = 0;
		
		for (int i = 0; i < deviceList.size(); i++) {
			if (deviceList.get(i).getUniqueID() == id)
			{
				index = i;
				break;
			}
		}
		
		deviceList.remove(index);
		
		
	}
	
	/**
	 * 
	 * @return A single string that lists all devices stored in this DeviceList.
	 */
	public String showDevices() {
		String returner = "";
		
		for (int i = 0; i < deviceList.size(); i++) {
			
			returner += deviceList.get(i).toString() + "\n";
		}
		
		return returner;
	}
	
	public Phone deviceLookup(int id) {
		
		for (int i = 0; i < deviceList.size(); i++) {
			
			if (deviceList.get(i).getUniqueID() == id)
			{
				return deviceList.get(i);
			}
		}
		
	}
	
	
	public int numOfDevices() {
		
		return deviceList.size();
	}
	
	public void showCommands() {
		
		System.out.println("1. Show all devices\n"
				+ "2. Add a device\n"
				+ "3. Find a device\n"
				+ "4. Delete a device\n"
				+ "5. Number of devices \n"
				+ "6. Exit\n"
				+ "Enter your selection: ");
	}
	
	
	
}
