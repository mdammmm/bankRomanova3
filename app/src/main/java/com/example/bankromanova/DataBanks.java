package com.example.bankromanova;

import android.adservices.common.AdData;

public class DataBanks {
    private int adderessID;
    private int tipID;
    private int timeID;
    private int closeOrOpenID;

    public  DataBanks (int _adderessID, int _tipID, int _timeID, int _closeOrOpenID){
        adderessID = _adderessID;
        timeID = _timeID;
        tipID = _tipID;
        closeOrOpenID = _closeOrOpenID;
    }

    public  int getAdderessID(){
        return adderessID;
    }
    public  int getTimeIDID(){
        return timeID;
    }
    public  int getTipIDID(){
        return tipID;
    }
    public  int getCloseOrOpenIDID(){
        return closeOrOpenID;
    }
}
