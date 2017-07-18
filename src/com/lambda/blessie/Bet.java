package com.lambda.blessie;

/**
 * Created by blessie on 18/07/2017.
 */
public class Bet {

    private String desc;
    private String betType;
    private boolean isVirtual;
    private String feedCode;

    public Bet(String desc, String betType, boolean isVirtual, String feedCode){
        this.desc = desc;
        this.betType = betType;
        this.isVirtual = isVirtual;
        this.feedCode = feedCode;
    }

    public String getDesc(){
        return desc;
    }

    public String getBetType() {
        return betType;
    }

    public void setBetType(String betType) {
        this.betType = betType;
    }

    public boolean isVirtual() {
        return isVirtual;
    }

    public void setVirtual(boolean virtual) {
        isVirtual = virtual;
    }

    public String getFeedCode() {
        return feedCode;
    }

    public void setFeedCode(String feedCode) {
        this.feedCode = feedCode;
    }
}
