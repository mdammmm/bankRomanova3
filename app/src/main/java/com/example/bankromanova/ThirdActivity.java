package com.example.bankromanova;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.third_activity);
        ListView list = (ListView) this.findViewById(R.id.listView2);
        ArrayList<DataCurrency> list2 = new ArrayList<>();
        list2.clear();

        list2.add(new DataCurrency(R.string.pro1, R.string.pok1, R.drawable.ar, R.string.argentina, R.string.usd1));
        list2.add(new DataCurrency(R.string.pro2, R.string.pok2, R.drawable.au, R.string.australia, R.string.usd2));
        list2.add(new DataCurrency(R.string.pro3, R.string.pok3, R.drawable.ca, R.string.canada, R.string.usd3));
        list2.add(new DataCurrency(R.string.pro4, R.string.pok4, R.drawable.cz, R.string.chehia, R.string.usd4));
        list2.add(new DataCurrency(R.string.pro5, R.string.pok5, R.drawable.jp, R.string.japan, R.string.usd5));
        list2.add(new DataCurrency(R.string.pro6, R.string.pok6, R.drawable.kr, R.string.korea, R.string.usd6));
        list2.add(new DataCurrency(R.string.pro7, R.string.pok7, R.drawable.kz, R.string.kazahastan, R.string.usd7));
        list2.add(new DataCurrency(R.string.pro8, R.string.pok8, R.drawable.us, R.string.ssha, R.string.usd8));
        //list2.add(new DataCurrency(R.string.pro1, R.string.Vid1, R.string.time1, R.string.closeOrOpen));
        //list2.add(new DataCurrency(R.string.pro1, R.string.Vid2, R.string.time2, R.string.closeOrOpen));
        //list2.add(new DataCurrency(R.string.pro1, R.string.Vid1, R.string.time1, R.string.closeOrOpen));
        //list2.add(new DataCurrency(R.string.pro1, R.string.Vid1, R.string.time1, R.string.closeOrOpen));

        MyListAdapter2 myListAdapter2 = new MyListAdapter2(this, list2);
        list.setAdapter(myListAdapter2);

    }


}
