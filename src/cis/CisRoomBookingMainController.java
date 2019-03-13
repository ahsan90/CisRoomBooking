package cis;

import cis.bo.ComputerLab;
import cis.bo.Room;
import cis.util.CisUtility;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * A starting project which we can use for applications that need a menu driven
 * program. Note that the name of the project should be modified to reflect the
 * specific requirements.
 *
 * @author bjmaclean
 * @since 20181115
 */
public class CisRoomBookingMainController {
    
    public static final String EXIT = "X";
    
    private static ArrayList<Room> rooms = new ArrayList();
    
    private static final String MENU
            = "-------------------------\n"
            + "- CIS Menu\n"
            + "- A-Add A Room\n"
            + "- B-Reserve A Room\n"
            + "- C-View All Rooms\n"
            + "- X-eXit\n"
            + "-------------------------\n"
            + "Option-->";
    
    public static void main(String[] args) {

        //Add a loop below to continuously promput the user for their choice 
        //until they choose to exit.
        String option = "";
        do {
            option = CisUtility.getInputString(MENU);
            processMenuOption(option);
        } while (!option.equalsIgnoreCase(EXIT));
        
    }

    /**
     * This method will process the menu option specified in the input
     * parameter. It will call appropriate functionality based on its value.
     *
     * @param option The menu option
     * @since 20171102
     * @author cis1201b
     *
     */
    public static void processMenuOption(String option) {
        //Add a switch to process the option
        switch (option.toUpperCase()) {
            case "A":
                int choice = CisUtility.getInputInt("Do you want a room or a computer lab?\n0 - Room, 1 - Computer Lab");
                switch(choice) {
                    case 0:
                        rooms.add(new Room());
                        break;
                    case 1:
                        rooms.add(new ComputerLab());
                        break;
                    default:
                        CisUtility.display("Invalid input.");
                }
                break;
            case "B":
                int roomNumber = CisUtility.getInputInt("Enter the room number you want to book:");
                boolean flag = false;
                for (Room current: rooms) {
                    if (current.getRoomNumber() == roomNumber) {
                        if (!current.isBooked()) {
                            current.setBooked(true);
                            flag = true;
                            break;
                        }
                    }
                }
                if (!flag) {
                    CisUtility.display("Sorry, the room is unavailable.");
                } else {
                    CisUtility.display("The room has been reserved!");
                }
                break;
            case "C":
                for (Room current: rooms) {
                    CisUtility.display(current.toString());
                }
                break;
            case "X":
                CisUtility.display("User picked x");
                break;
            default:
                CisUtility.display("Invalid entry");
        }
    }
    
}
