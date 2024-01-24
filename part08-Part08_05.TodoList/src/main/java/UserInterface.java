import java.util.*;
public class UserInterface {
	//instance fields
	private TodoList list;
	private Scanner scanner;
	
	public UserInterface(TodoList list, Scanner scanner) {
		this.list = list;
		this.scanner = scanner;
	}
	
	public void start() {
		while (true) {
			System.out.println("Command: ");
			String command = scanner.nextLine();
			if (command.equals("stop")) {
				break;
			}
			
			if (command.equals("add")) {
				System.out.println("To add: ");
				String task = scanner.nextLine();
				list.add(task);
			}
			
			if (command.equals("list")) {
				list.print();
			}
			
			if (command.equals("remove")) {
				System.out.println("Which one is removed? ");
				int task = Integer.valueOf(scanner.nextLine());
				list.remove(task);
			}
		}
		
	}

}
