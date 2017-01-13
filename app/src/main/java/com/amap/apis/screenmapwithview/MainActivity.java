package com.amap.apis.screenmapwithview;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.MapView;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity implements View.OnClickListener, AMap.OnMapScreenShotListener {


    private MapView mMapView;
    private AMap mAMap;
    private Button mScreemShotButton, mShowscreenButton;
    private ViewGroup mViewGroupContainer;
    private View mScreemShotView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScreemShotButton = (Button) findViewById(R.id.screenshot);
        mScreemShotButton.setOnClickListener(this);
        mShowscreenButton = (Button) findViewById(R.id.showscreen);
        mShowscreenButton.setOnClickListener(this);
        mViewGroupContainer = (ViewGroup) findViewById(R.id.container);
        mScreemShotView = findViewById(R.id.screenshotview);
        mMapView = (MapView) findViewById(R.id.map);
        mMapView.onCreate(savedInstanceState);
        mAMap = mMapView.getMap();
        UiSettings uiSettings = mAMap.getUiSettings();
        uiSettings.setZoomControlsEnabled(false);
        mAMap.addPolyline(Utils.getTestData());
        mAMap.moveCamera(
                CameraUpdateFactory.newLatLngBounds(
                new LatLngBounds.Builder().include(
                        new LatLng(39.991533,116.379546)
                ).include(new LatLng(40.025367,116.407101)).build(),0)
        );
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.screenshot:
                mAMap.getMapScreenShot(this);
                break;
            case R.id.showscreen:
                showscreenshot();
        }
        
    }

    private void showscreenshot() {
        Intent intent = new Intent(MainActivity.this, ImageActivity.class);
        startActivity(intent);
    }

    @Override
    public void onMapScreenShot(Bitmap bitmap) {
        ScreenShotHelper.saveScreenShot(bitmap, mViewGroupContainer, mMapView, mScreemShotView);
        Toast.makeText(getApplicationContext(),"SD卡下查看截图后的文件",Toast.LENGTH_SHORT).show();
        mShowscreenButton.setVisibility(View.VISIBLE);
    }

    @Override
    public void onMapScreenShot(Bitmap bitmap, int i) {

    }
}
