package org.cryptocoinpartners.command;

import org.cryptocoinpartners.schema.Market;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * @author Tim Olson
 */
@SuppressWarnings("UnusedDeclaration")
public class MarketsCommand extends CommandBase {

    public String getUsageHelp() { return "markets"; }
    public String getExtraHelp() { return "prints a list of all available exchanges and listings"; }


    public void run() {
        List<String> symbols = new ArrayList<>();
        for( Market market : Market.findAll() )
            symbols.add(market.getSymbol());
        Collections.sort(symbols);
        out.printList(symbols);
    }


}
