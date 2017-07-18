package com.lambda.blessie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by blessie on 18/07/2017.
 */
public class BetFilterMain {

    public static void main (String[] args){
        BetProcessor processor = new BetProcessor();

        List<Bet> bets = new ArrayList<>();
        bets.add(new Bet("bet1", "single", false, "FOOT"));
        bets.add(new Bet("bet2", "single", true, "GREY"));
        bets.add(new Bet("bet3", "forecast", false, "GREY"));
        bets.add(new Bet("bet4", "tricast", true, "HORS"));

        processor.filterBets(bets, bet -> bet.getBetType() == "single");
        System.out.println("--------");
        processor.filterBets(bets, bet -> bet.getFeedCode() == "GREY");
        System.out.println("--------");
        processor.filterBets(bets, bet -> bet.getBetType() == "single" && bet.getFeedCode() == "GREY");
        System.out.println("--------");
        processor.filterBets(bets, bet -> bet.isVirtual());


    }
}
