package com.example.bankromanova;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class MyListAdapter2 extends BaseAdapter {
    private LayoutInflater LInflater;
    private ArrayList<DataCurrency> list;

    public MyListAdapter2(Context context, ArrayList<DataCurrency> data){
        list = data;
        LInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public DataCurrency getItem(int position) {
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
            v = LInflater.inflate(R.layout.items_currency, parent, false);

            holder.pokupka = (TextView) v.findViewById(R.id.pokupka);
            holder.prodaja = (TextView) v.findViewById(R.id.prodaja);
            holder.nazvanie = (TextView) v.findViewById(R.id.tvNazvanie);
            holder.russian = (TextView) v.findViewById(R.id.tvRussian);
            holder.flag = (ImageView) v.findViewById(R.id.imageFlag);
            v.setTag(holder);
        }

        holder = (ViewHolder) v.getTag();
        DataCurrency dataCurrency = getData(position);

        holder.pokupka.setText(v.getResources().getString(dataCurrency.getPokupkaId()));
        holder.prodaja.setText(v.getResources().getString(dataCurrency.getProdajaId()));
        holder.nazvanie.setText(v.getResources().getString(dataCurrency.getNazvanieId()));
        holder.russian.setText(v.getResources().getString(dataCurrency.getRussianId()));
        holder.flag.setImageResource(dataCurrency.getImageId());

        return  v;
    }

    DataCurrency getData(int position){
        return (getItem(position));
    }

    private  static class ViewHolder{
        private  TextView prodaja, pokupka, nazvanie, russian;
        private ImageView flag;
    }
}
