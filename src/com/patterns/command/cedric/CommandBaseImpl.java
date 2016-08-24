package com.patterns.command.cedric;

import java.util.Arrays;
import java.util.Stack;

/**
 * The invoker class.
 * 
 * Invokes command immediately as they are requested by the user, or, during undo/redo
 * 
 * @author cedric
 *
 */
public class CommandBaseImpl implements CommandBase {
	private final Stack<DrawCommand> commands = new Stack<DrawCommand>();
	private final Stack<DrawCommand> undoStack = new Stack<DrawCommand>();
	
	private static CommandBase SINGLETON;
	
	public static CommandBase getInstance() {
		if(SINGLETON==null) {
			SINGLETON = new CommandBaseImpl();
		}
		
		return SINGLETON;
	}
	@Override
	public void executeCommand(DrawCommand drawCommand) {
		drawCommand.draw();
		undoStack.clear();
		commands.push(drawCommand);
	}
	@Override
	public void undo() {
		DrawCommand command = commands.pop();
		command.undo();
		undoStack.push(command);
	}
	@Override
	public void redo() {
		DrawCommand command = undoStack.pop();
		command.draw();
		commands.push(command);
	}
	@Override
	public void showCurrentCommands() {
		System.out.println(Arrays.toString(commands.toArray()));		
	}
	

}
