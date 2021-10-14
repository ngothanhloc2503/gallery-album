package com.example.gallery;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class Gallery extends Activity {
    Bundle myOriginalMemoryBundle;
    GridView gridView;
    String[] items = {"Photo-1", "Photo-2", "Photo-3", "Photo-4"};
    Integer[] thumbnails = {
        R.mipmap.ic_1,
        R.mipmap.ic_2,
        R.mipmap.ic_3,
        R.mipmap.ic_4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        myOriginalMemoryBundle = savedInstanceState;

        gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new MyImageAdapter(this, thumbnails));
    }
}