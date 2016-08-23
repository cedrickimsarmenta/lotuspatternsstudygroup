package com.patterns.command.cedric;

public interface DrawCommand {
	void draw(Window window);
	void undo(Window window);
}
