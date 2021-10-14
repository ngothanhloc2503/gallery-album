package com.example.gallery;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import com.example.gallery.custom_item_gridview.Custom_Item_GridView;

import java.util.ArrayList;
import java.util.List;

public class Album extends Activity {
    Bundle myOriginalMemoryBundle;
    GridView gridView;
    List<Custom_Item_GridView> album;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        myOriginalMemoryBundle = savedInstanceState;

        gridView = (GridView) findViewById(R.id.gridview);

        album = new ArrayList<>();
        album.add(new Custom_Item_GridView(1, "Album 1"));
        album.add(new Custom_Item_GridView(2, "Album 2"));
        album.add(new Custom_Item_GridView(3, "Album 3"));
        album.add(new Custom_Item_GridView(4, "Album 4"));

        CustomGridViewAdapter adapter = new CustomGridViewAdapter(this, R.layout.custom_item_gridview, album);
        gridView.setAdapter(adapter);
    }
}