package com.example.bankromanova;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MyListAdapter extends BaseAdapter {
    private LayoutInflater LInflater;
    private ArrayList<DataBanks> list;

    public  MyListAdapter(Context context, ArrayList<DataBanks> data)
    {
        list = data;
        LInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public DataBanks getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        View v = convertView;

        if (v == null){
            holder =  new ViewHolder();
            v = LInflater.inflate(R.layout.items_banks, parent, false);

            holder.address = (TextView) v.findViewById(R.id.twAddress);
            holder.tip = (TextView) v.findViewById(R.id.txTip);
            holder.time = (TextView) v.findViewById(R.id.twTime);
            holder.work = (TextView) v.findViewById(R.id.twCloseOrOpen);
            v.setTag(holder);
        }

        holder = (ViewHolder) v.getTag();
        DataBanks dataBanks = getData(position);

        holder.address.setText(v.getResources().getString(dataBanks.getAdderessID()));
        holder.tip.setText(v.getResources().getString(dataBanks.getTipIDID()));
        holder.time.setText(v.getResources().getString(dataBanks.getTimeIDID()));
        holder.work.setText(v.getResources().getString(dataBanks.getCloseOrOpenIDID()));

        return  v;
    }

    DataBanks getData(int position){
        return  (getItem(position));
    }

    private  static class ViewHolder{
        private  TextView address, tip, time, work;
    }
}
