package docComments;
import java.util.Scanner;

public class DeviceApp {

    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        DeviceList myDeviceList = new DeviceList();

        do 
        {
            myDeviceList.showCommandMenu();
            int userInput = input.nextInt();

            switch (userInput) 
            {
                    case 1:
                        myDeviceList.showDevices();
                        break;

                    case 2:
                        input.nextLine();
                        System.out.print("Please enter the manufacturer of the device: ");
                        String userManufacturer = input.nextLine();
                        System.out.print("Please enter the model of the device: ");
                        String userModel = input.nextLine();
                        System.out.print("Please enter the operating system of the device: ");
                        String userOperatingSystem = input.nextLine();

                        myDeviceList.Add(userManufacturer, userModel, userOperatingSystem);
                        System.out.println("");
                        break;

                    case 3:
                        System.out.print("Please enter a device ID: ");
                        userInput = input.nextInt();
                        myDeviceList.deviceLookup(userInput);
                        break;

                    case 4:
                        System.out.print("Please enter a device ID: ");
                        userInput = input.nextInt();
                        myDeviceList.Remove(userInput);
                        break;

                    case 5:
                        myDeviceList.numOfDevices();
                        break;

                    case 6:
                    	System.out.println("\n\n\nTerminating program. Goodbye.");
                    	input.close();
                        System.exit(1);
                        break;
                    default:
                        System.out.println("Please enter a number between 1 and 6.\n");
                }
        } while (true);
    }
}
