package com.example.danhmuc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by webmaster@dotnet.vn on 3/11/2018.
 */
public class DMAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Contact> ContactList;

    public DMAdapter(Context context, int layout, List<Contact> contactList) {
        this.context = context;
        this.layout = layout;
        ContactList = contactList;
    }

    @Override
    public int getCount() {
        return ContactList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(layout,null);
        TextView txtTen=(TextView) convertView.findViewById(R.id.tvName);
        TextView txtMota=(TextView) convertView.findViewById(R.id.tvMaSinhVien);
        ImageView anh=(ImageView) convertView.findViewById(R.id.tvAvatar);

        Contact contact=ContactList.get(position);
        txtTen.setText(contact.getTen());
        txtMota.setText(contact.getMota());
        anh.setImageResource(contact.getAnh());
        return convertView;
    }
}

