本工程为基于高德地图Android SDK进行封装，实现了需要同时截取地图显示信息与上层View显示信息等功能
## 前述 ##
- [高德官网申请Key](http://lbs.amap.com/dev/#/).
- 阅读[参考手册](http://a.amap.com/lbs/static/unzip/Android_Map_Doc/index.html).
- 工程基于Android 3D地图SDK实现

## 功能描述 ##
基于3D地图SDK进行封装，地图默认截图功能只能实现地图图面信息的截取，而在app开发中我们有时候还有些需要同时截取地图显示与上层一些View显示信息的需求。此工程就是为了解决这个问题进行开发的。

## 效果图如下 ##
### APP显示效果###

![Screenshot](https://raw.githubusercontent.com/amap-demo/android-screenshot-mapview-view/master/resource/screenshot.png)  

### 截图后效果 ###

![Screenshot](https://raw.githubusercontent.com/amap-demo/android-screenshot-mapview-view/master/resource/result.png)  

## 扫一扫安装##
![Screenshot]( https://raw.githubusercontent.com/amap-demo/android-screenshot-mapview-view/master/resource/download.png)  


## 使用方法##
###1:配置搭建AndroidSDK工程###
- [Android Studio工程搭建方法](http://lbs.amap.com/api/android-sdk/guide/creat-project/android-studio-creat-project/#add-jars).
- [通过maven库引入SDK方法](http://lbsbbs.amap.com/forum.php?mod=viewthread&tid=18786).

###2:接口使用###

``` java
 /**
     * 组装地图截图和其他View截图，需要注意的是目前提供的方法限定为MapView与其他View在同一个ViewGroup下
     *@param    bitmap             地图截图回调返回的结果
     *@param   viewContainer      MapView和其他要截图的View所在的父容器ViewGroup
     *@param   mapView            MapView控件
     *@param   views              其他想要在截图中显示的控件
     * */
public static Bitmap getMapAndViewScreenShot(Bitmap bitmap, ViewGroup viewContainer, MapView mapView, View...views){
    int width = viewContainer.getWidth();
    int height = viewContainer.getHeight();
    final Bitmap screenBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
    Canvas canvas = new Canvas(screenBitmap);
    canvas.drawBitmap(bitmap, mapView.getLeft(), mapView.getTop(), null);
    for (View view:views){
        view.setDrawingCacheEnabled(true);
        canvas.drawBitmap(view.getDrawingCache(), view.getLeft(), view.getTop(), null);
    }

    return screenBitmap;
}
 
```