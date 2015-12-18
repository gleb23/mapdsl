package edu.hlibbabii.mapdsl;

import edu.hlibbabii.mapdsl.command.Command;
import edu.hlibbabii.mapdsl.interpreter.LexAn;
import edu.hlibbabii.mapdsl.interpreter.Syntan;

/**
 * Created by hlib on 12/7/15.
 */
public class Main {
    public static void main(String[] args) {
        LexAn lexAn = new LexAn();
        Syntan syntan = new Syntan(lexAn);

        lexAn.set("TOWNS");
        Command command = syntan.doAn();
        command.execute();

        lexAn.set("COUNTRIES");
        Command command2 = syntan.doAn();
        command2.execute();

        lexAn.set("CREATE COUNTRY Ukraine");
        Command command3 = syntan.doAn();
        command3.execute();

        lexAn.set("UKRAINE << KIEV * 4000000");
        Command command4 = syntan.doAn();
        command4.execute();

        lexAn.set("UKRAINE << Poltava");
        Command command5 = syntan.doAn();
        command5.execute();

        lexAn.set("REMOVE TOWN 565");
        Command command6 = syntan.doAn();
        command6.execute();
    }
}
