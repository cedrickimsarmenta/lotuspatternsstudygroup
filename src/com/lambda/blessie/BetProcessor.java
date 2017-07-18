package com.lambda.blessie;

import java.util.List;

/**
 * Created by blessie on 18/07/2017.
 */
public class BetProcessor {

    public void filterBets(List<Bet> bets, BetFilter filter){
        for(Bet bet : bets){
            if(filter.filter(bet)){
                System.out.println("processing bet "+bet.getDesc());
            }
        }

    }
}
