package FlightControl;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUI;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
    	FlightControl f = new FlightControl();
    	Scanner scanner = new Scanner(System.in);
    	TextUI u = new TextUI(f, scanner);
    	u.start();
    }
}
