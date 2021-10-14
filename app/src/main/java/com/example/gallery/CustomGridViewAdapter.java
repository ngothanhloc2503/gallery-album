package com.example.gallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.gallery.custom_item_gridview.Custom_Item_GridView;

import java.util.List;

public class CustomGridViewAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Custom_Item_GridView> album;

    public CustomGridViewAdapter(Context context, int idLayout, List<Custom_Item_GridView> album) {
        this.context = context;
        this.idLayout = idLayout;
        this.album = album;
    }

    @Override
    public int getCount() {
        return album.size();
    }

    @Override
    public Object getItem(int position) {
        return album.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        TextView nameAlbum;
        ImageView imageView;

        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }

        nameAlbum = (TextView) convertView.findViewById(R.id.nameAlbum);
        imageView = (ImageView) convertView.findViewById(R.id.logo);
        final LinearLayout linearLayout = (LinearLayout) convertView.findViewById(R.id.custom_items);
        final Custom_Item_GridView items = album.get(position);

        if (album != null && !album.isEmpty()) {
            nameAlbum.setText(items.getName());
            int idAlbum = items.getId();
            switch (idAlbum) {
                case 1:
                    imageView.setImageResource(R.mipmap.ic_1);
                    break;
                case 2:
                    imageView.setImageResource(R.mipmap.ic_2);
                    break;
                case 3:
                    imageView.setImageResource(R.mipmap.ic_3);
                    break;
                case 4:
                    imageView.setImageResource(R.mipmap.ic_4);
                    break;
                default:
                    break;
                }
            }

        return convertView;
    }


}
