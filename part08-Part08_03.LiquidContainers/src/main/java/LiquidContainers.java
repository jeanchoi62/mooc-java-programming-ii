import java.util.*;

public class LiquidContainers {
	
	//main method
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LiquidContainerManager container = new LiquidContainerManager();
		
		while(true) {
			System.out.println(container);
			String input = scanner.nextLine();
			if (input.contains("quit")) {
				return;
			}
			String[] parts = input.split(" ");
			String command = parts[0];
			int amount = Integer.valueOf(parts[1]);
			
			if (command.equals("add")) {
				if (amount < 0) {
					continue;
				}
				container.add(amount);
			}
			
			if (command.equals("move")) {
				if (amount < 0 ) {
					continue;
				}
				container.move(amount);
			}
			
			if (command.equals("remove")) {
				if (amount < 0 ) {
					continue;
				}
				container.remove(amount);
			}

		}
	}
}