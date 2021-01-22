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
	public void showDevices() {
		
		for (int i = 0; i < deviceList.size(); i++) {
			
			System.out.println(deviceList.get(i).toString());
		}
		
	}
	
	/**
	 * 
	 * @param id Unique ID to look up phone in device list.
	 * @return Phone with that ID if found, or message saying that no phone was found.
	 */
	public String deviceLookup(int id) {
		
		for (int i = 0; i < deviceList.size(); i++) {
			
			if (deviceList.get(i).getUniqueID() == id)
			{
				return deviceList.get(i).toString();
			}
		}
		
		return "No Phone with that ID found.";
		
	}
	
	/**
	 * 
	 * @return The amount of devices stored in the DeviceList.
	 */
	public int numOfDevices() {
		
		return deviceList.size();
	}
	
	/**
	 * Shows the commands that are available within the Device List.
	 */
	public void showCommandMenu() {
		
		System.out.println("1. Show all Phones\n"
				+ "2. Add a Phone\n"
				+ "3. Find a Phone\n"
				+ "4. Delete a Phone\n"
				+ "5. Number of Phones \n"
				+ "6. Exit\n");
		
		System.out.print("Enter your selection: ");
	}
	
	
	
}
