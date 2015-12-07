package edu.hlibbabii.mapdsl.command;

/**
 * Created by hlib on 12/7/15.
 */
public class EmptyCommand extends Command {
    @Override
    public void execute() {
        System.out.println("Nothing");
    }
}
