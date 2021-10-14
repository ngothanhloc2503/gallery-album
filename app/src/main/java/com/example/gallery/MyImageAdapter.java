package com.example.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MyImageAdapter extends BaseAdapter {
    private Context context;
    Integer[] smallImages;

    public MyImageAdapter(Context mainActivityContext, Integer[] thumbnails){
        context = mainActivityContext;
        smallImages = thumbnails;
    }

    @Override
    public int getCount() {
        return smallImages.length;
    }

    @Override
    public Object getItem(int position) {
        return smallImages[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context);
            //int gridSize = context.getResources().getDimensionPixelOffset(R.dimen.gridview_size);
            imageView.setLayoutParams(new GridView.LayoutParams(250, 250));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setPadding(5, 5, 5, 5);
        }
        else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(smallImages[position]);
        return imageView;
    }
}
