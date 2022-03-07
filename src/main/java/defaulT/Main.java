package defaulT;

import java.util.Scanner;

import CommandClasses.*;
import invokerAndRequest.*;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner keyboard = new Scanner(System.in);
		String keyboardRead;
		
		String command1 = "a";
		String command2 = "b";
		String command3 = "c";
		
		Folder folder = new Folder();
		Invoke invoke = new Invoke();
		
		while(true) {
			System.out.println("********************");
			System.out.println("********************");
			System.out.println("What do you wanna do");
			System.out.println("command1: add document");
			System.out.println("command2: delete document");
			System.out.println("command3: print document");
			System.out.println("press a command");
			keyboardRead = keyboard.nextLine();
			
			if(keyboardRead.equals(command1)) {
				System.out.println(invoke.execute(new AddDocument(folder)));
				System.out.println("done");
			}
			if(keyboardRead.equals(command2)) {
				System.out.println(invoke.execute(new DeleteCommand(folder)));
				System.out.println("done");
			}
			if(keyboardRead.equals(command3)) {
				System.out.println("Printing documents...");
				System.out.println(invoke.execute(new PrintDocument(folder)));
				System.out.println("done");
			}
			
		}
		
	}

}
