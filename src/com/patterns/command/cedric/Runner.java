package com.patterns.command.cedric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Runner {
	private static final Stack<DrawCommand> commands = new Stack<DrawCommand>();
	public static void main (String[] args) throws IOException {
		Window window = new Window();
		window.init();
//		window.render();
//		List<DrawCommand> drawCommands = new ArrayList<DrawCommand>();
//		DotDrawer dot1 = new DotDrawer(0, 0);
//		DotDrawer dot2 = new DotDrawer(1, 1);
//		DotDrawer dot3 = new DotDrawer(2, 3);
//		DotDrawer dot4 = new DotDrawer(10, 19);
//		
//		drawCommands.add(dot1);
//		drawCommands.add(dot2);
//		drawCommands.add(dot3);
//		drawCommands.add(dot4);
//			
//		XDrawer x1 = new XDrawer(3, 4, 1);
//		XDrawer x2 = new XDrawer(5, 7, 2);
//		XDrawer x3 = new XDrawer(8, 13, 3);
//		
//		drawCommands.add(x1);
//		drawCommands.add(x2);
//		drawCommands.add(x3);
//		
//		
//		for(DrawCommand drawCommand : drawCommands) {
//			drawCommand.draw(window);	
//		}
//		
//		window.render();
//		x1.undo(window);
//		x2.undo(window);
//		x3.undo(window);
//		
//
//		window.render();
		
		while(true) {
			System.out.println("What do you want to do?");
			System.out.println("[1] Show screen");
			System.out.println("[2] Draw dot (2-x-y)");
			System.out.println("[3] Draw x (3-x-y-size)");
			System.out.println("[4] Undo last");
			System.out.println("[5] Show commands");
			System.out.println("[6] Exit");
			

		    InputStreamReader in=new InputStreamReader(System.in);
		    BufferedReader br=new BufferedReader(in);
		    String choice = br.readLine();
		    
		    if(choice.equals("6")) {
		       	System.out.println("See you later alligator");
		    	break;
		    } else if (choice.equals("1")) {
		    	window.render();
		    } else if (choice.startsWith("2")) {
		    	String[] parts = choice.split("-");
		    	DrawCommand command = new DotDrawer(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
		    	command.draw(window);
		    	commands.push(command);
		    } else if (choice.startsWith("3")) {
		    	String[] parts = choice.split("-");
		    	DrawCommand command = new XDrawer(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Integer.parseInt(parts[3]));
		    	command.draw(window);
		    	commands.push(command);
		    } else if (choice.equals("4")) {
		    	DrawCommand command = commands.pop();
		    	command.undo(window);
		    }else if (choice.equals("5")) {
		    	System.out.println(Arrays.toString(commands.toArray()));
		    } else {
		    	System.out.println("Unrecognized command");
		    }
		}
	}
}
