package com.amap.apis.screenmapwithview;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;

/**
 * Created by my94493 on 2017/1/13.
 */

public class ImageActivity extends Activity {
    private ImageView iv;
    private Bitmap myBitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageshow);
        iv = (ImageView) findViewById(R.id.iv);
        Bitmap bitmap = getDiskBitmap(Environment.getExternalStorageDirectory().getAbsolutePath()+File.separator+"test1.png");
        if(bitmap != null){
            iv.setImageBitmap(bitmap);
        }else{
            Toast.makeText(ImageActivity.this, "没有图片",Toast.LENGTH_SHORT).show();
        }

    }

    private Bitmap getDiskBitmap(String pathString)
    {
        Bitmap bitmap = null;
        try
        {
            File file = new File(pathString);
            if(file.exists())
            {
                bitmap = BitmapFactory.decodeFile(pathString);
            }
        } catch (Exception e)
        {
            // TODO: handle exception
        }
        return bitmap;
    }
}
