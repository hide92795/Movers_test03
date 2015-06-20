package com.example.yukikayashima.movers_test03;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

public class MyListAdapter extends ArrayAdapter<String> {

    public MyListAdapter(Context context, int resource, int textViewResourceId,
            List<String> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public MyListAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
    }

    public MyListAdapter(Context context, int resource, int textViewResourceId, String[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public MyListAdapter(Context context, int resource, String[] objects) {
        super(context, resource, objects);
    }

    public MyListAdapter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public MyListAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public String getItem(int position) {
        return position + " " + super.getItem(position);
    }
}