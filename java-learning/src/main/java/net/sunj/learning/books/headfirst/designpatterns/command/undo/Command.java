package net.sunj.learning.books.headfirst.designpatterns.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
