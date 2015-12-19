package edu.hlibbabii.mapdsl.command;

/**
 * Created by hlib on 19.12.15.
 */
public class SearchCommand extends Command {
    private String searchString;

    public SearchCommand(String searchString) {
        this.searchString = searchString;
    }



    @Override
    public void execute() {
        System.out.println("Search edu.hlibbabii.mapdsl.command "  + searchString);
    }
}
