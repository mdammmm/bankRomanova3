package com.example.bankromanova;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_activity);
        ListView listView = (ListView) this.findViewById(R.id.listView1);
        ArrayList<DataBanks> list = new ArrayList<>();
        list.clear();


        list.add(new DataBanks(R.string.osnovAddress, R.string.Vid1, R.string.time1, R.string.closeOrOpen));
        list.add(new DataBanks(R.string.osnovAddress, R.string.Vid2, R.string.time2, R.string.closeOrOpen));
        list.add(new DataBanks(R.string.osnovAddress, R.string.Vid1, R.string.time1, R.string.closeOrOpen));
        list.add(new DataBanks(R.string.osnovAddress, R.string.Vid1, R.string.time1, R.string.closeOrOpen));
        list.add(new DataBanks(R.string.osnovAddress, R.string.Vid2, R.string.time2, R.string.closeOrOpen));
        list.add(new DataBanks(R.string.osnovAddress, R.string.Vid1, R.string.time1, R.string.closeOrOpen));
        list.add(new DataBanks(R.string.osnovAddress, R.string.Vid2, R.string.time2, R.string.closeOrOpen));
        list.add(new DataBanks(R.string.osnovAddress, R.string.Vid1, R.string.time1, R.string.closeOrOpen));
        list.add(new DataBanks(R.string.osnovAddress, R.string.Vid1, R.string.time1, R.string.closeOrOpen));
        list.add(new DataBanks(R.string.osnovAddress, R.string.Vid2, R.string.time2, R.string.closeOrOpen));
        list.add(new DataBanks(R.string.osnovAddress, R.string.Vid1, R.string.time1, R.string.closeOrOpen));
        list.add(new DataBanks(R.string.osnovAddress, R.string.Vid2, R.string.time2, R.string.closeOrOpen));

        MyListAdapter myListAdapter = new MyListAdapter(this, list);
        listView.setAdapter(myListAdapter);



    }
}
