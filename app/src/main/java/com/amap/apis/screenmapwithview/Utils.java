package com.amap.apis.screenmapwithview;

import android.graphics.Color;

import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yiyi.qi on 2016/10/31.
 */

public class Utils {

    //准备测试数据
    public static PolylineOptions getTestData(){
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions
                .add(new LatLng( 40.005848,116.38781))
                .add(new LatLng(         40.005848,116.38781))
                .add(new LatLng(         40.006168,116.387802))
                .add(new LatLng( 40.00617,116.388367))
                .add(new LatLng( 40.00676,116.388336))
                .add(new LatLng( 40.006767,116.388336))
                .add(new LatLng( 40.006767,116.388412))
                .add(new LatLng( 40.006802,116.389656))
                .add(new LatLng( 40.006847,116.391006))
                .add(new LatLng( 40.006859,116.391182))
                .add(new LatLng( 40.006908,116.39283))
                .add(new LatLng( 40.006924,116.393074))
                .add(new LatLng( 40.006981,116.3955))
                .add(new LatLng( 40.006981,116.3955))
                .add(new LatLng( 40.007084,116.395576))
                .add(new LatLng( 40.007214,116.39566))
                .add(new LatLng( 40.007843,116.396194))
                .add(new LatLng( 40.00816,116.396492))
                .add(new LatLng( 40.008415,116.396721))
                .add(new LatLng( 40.008537,116.396805))
                .add(new LatLng( 40.008698,116.396904))
                .add(new LatLng( 40.008965,116.397049))
                .add(new LatLng( 40.009125,116.397118))
                .add(new LatLng( 40.009171,116.397118))
                .add(new LatLng( 40.009293,116.397156))
                .add(new LatLng( 40.009628,116.397171))
                .add(new LatLng( 40.009731,116.397125))
                .add(new LatLng( 40.009777,116.397064))
                .add(new LatLng( 40.009804,116.397003))
                .add(new LatLng( 40.009827,116.396927))
                .add(new LatLng( 40.009853,116.396835))
                .add(new LatLng( 40.009865,116.396805))
                .add(new LatLng( 40.009888,116.39679))
                .add(new LatLng( 40.009914,116.396774))
                .add(new LatLng( 40.009964,116.396759))
                .add(new LatLng( 40.010094,116.396751))
                .add(new LatLng( 40.010315,116.396751))
                .add(new LatLng( 40.010414,116.396736))
                .add(new LatLng( 40.010414,116.396736))
                .add(new LatLng( 40.010429,116.39698))
                .add(new LatLng( 40.010456,116.397156))
                .add(new LatLng( 40.010677,116.39772))
                .add(new LatLng( 40.010796,116.398048))
                .add(new LatLng( 40.010845,116.398224))
                .add(new LatLng( 40.010868,116.398308))
                .add(new LatLng( 40.010872,116.398384))
                .add(new LatLng( 40.010872,116.39856))
                .add(new LatLng( 40.010868,116.398621))
                .add(new LatLng( 40.010868,116.398682))
                .add(new LatLng( 40.010918,116.398766))
                .add(new LatLng( 40.010956,116.398819))
                .add(new LatLng( 40.011101,116.398941))
                .add(new LatLng( 40.01128,116.399094))
                .add(new LatLng( 40.011654,116.399376))
                .add(new LatLng( 40.011719,116.399406))
                .add(new LatLng( 40.011906,116.399513))
                .add(new LatLng( 40.012211,116.399681))
                .add(new LatLng( 40.012379,116.399734))
                .add(new LatLng( 40.012474,116.39975))
                .add(new LatLng( 40.012543,116.39975))
                .add(new LatLng( 40.012924,116.399742))
                .add(new LatLng( 40.013054,116.399742))
                .add(new LatLng( 40.013298,116.399757))
                .add(new LatLng( 40.013454,116.399742))
                .add(new LatLng( 40.013569,116.399742))
                .add(new LatLng( 40.013645,116.39975))
                .add(new LatLng( 40.014038,116.39975))
                .add(new LatLng( 40.014202,116.399757))
                .add(new LatLng( 40.014374,116.399773))
                .add(new LatLng( 40.014828,116.399773))
                .add(new LatLng( 40.015343,116.399773))
                .add(new LatLng( 40.015522,116.399788))
                .add(new LatLng( 40.015625,116.399811))
                .add(new LatLng( 40.015751,116.399849))
                .add(new LatLng( 40.015839,116.399864))
                .add(new LatLng( 40.015938,116.399849))
                .add(new LatLng( 40.016052,116.399788))
                .add(new LatLng( 40.016064,116.399773))
                .add(new LatLng( 40.016148,116.399719))
                .add(new LatLng( 40.016285,116.399597))
                .add(new LatLng( 40.016346,116.399536))
                .add(new LatLng( 40.01656,116.399277))
                .add(new LatLng( 40.016624,116.399208))
                .add(new LatLng( 40.016785,116.399017))
                .add(new LatLng( 40.016842,116.398964))
                .add(new LatLng( 40.01693,116.398903))
                .add(new LatLng( 40.017044,116.398842))
                .add(new LatLng( 40.017044,116.398834))
                .add(new LatLng( 40.017094,116.398735))
                .add(new LatLng( 40.017235,116.398399))
                .add(new LatLng( 40.0173,116.398315))
                .add(new LatLng( 40.017487,116.398125))
                .add(new LatLng( 40.017567,116.398293))
                .add(new LatLng( 40.017986,116.398331))
                .add(new LatLng( 40.018059,116.398369))
                .add(new LatLng( 40.018154,116.398476))
                .add(new LatLng( 40.018291,116.398575))
                .add(new LatLng( 40.018402,116.398643))
                .add(new LatLng( 40.018448,116.398666))
                .add(new LatLng( 40.018528,116.398697))
                .add(new LatLng( 40.018555,116.398697))
                .add(new LatLng( 40.018837,116.398743))
                .add(new LatLng( 40.018837,116.398743))
                .add(new LatLng( 40.018875,116.398682))
                .add(new LatLng( 40.018929,116.398628))
                .add(new LatLng( 40.018944,116.398613))
                .add(new LatLng( 40.01902,116.398613))
                .add(new LatLng( 40.019131,116.398621))
                .add(new LatLng( 40.019154,116.398621))
                .add(new LatLng( 40.019203,116.398613))
                .add(new LatLng( 40.019352,116.398422))
                .add(new LatLng( 40.019405,116.398331))
                .add(new LatLng( 40.019436,116.39827))
                .add(new LatLng( 40.01944,116.398247))
                .add(new LatLng( 40.019444,116.398224))
                .add(new LatLng( 40.019444,116.39814))
                .add(new LatLng( 40.01944,116.398109))
                .add(new LatLng( 40.019417,116.398003))
                .add(new LatLng( 40.019402,116.397881))
                .add(new LatLng( 40.019402,116.39769))
                .add(new LatLng( 40.019413,116.397629))
                .add(new LatLng( 40.019447,116.39756))
                .add(new LatLng( 40.019478,116.39753))
                .add(new LatLng( 40.019661,116.397362))
                .add(new LatLng( 40.019733,116.397278))
                .add(new LatLng( 40.019787,116.397194))
                .add(new LatLng( 40.019814,116.397156))
                .add(new LatLng( 40.019825,116.397102))
                .add(new LatLng( 40.019836,116.397034))
                .add(new LatLng( 40.019836,116.396965))
                .add(new LatLng( 40.01981,116.396721))
                .add(new LatLng( 40.019802,116.396614))
                .add(new LatLng( 40.019802,116.396553))
                .add(new LatLng( 40.019836,116.396461))
                .add(new LatLng( 40.019882,116.396362))
                .add(new LatLng( 40.019913,116.396286))
                .add(new LatLng( 40.019928,116.396217))
                .add(new LatLng( 40.019932,116.396164))
                .add(new LatLng( 40.019932,116.396065))
                .add(new LatLng( 40.019917,116.395981))
                .add(new LatLng( 40.019878,116.395744))
                .add(new LatLng( 40.01984,116.395592))
                .add(new LatLng( 40.019836,116.395592))
                .add(new LatLng( 40.019859,116.395523))
                .add(new LatLng( 40.019886,116.395424))
                .add(new LatLng( 40.019913,116.39537))
                .add(new LatLng( 40.019958,116.395309))
                .add(new LatLng( 40.019997,116.395279))
                .add(new LatLng( 40.020077,116.39521))
                .add(new LatLng( 40.02023,116.395119))
                .add(new LatLng( 40.020237,116.395119))
                .add(new LatLng( 40.020164,116.394989))
                .add(new LatLng( 40.020142,116.394913))
                .add(new LatLng( 40.020134,116.394852))
                .add(new LatLng( 40.020126,116.3946))
                .add(new LatLng( 40.020081,116.394478))
                .add(new LatLng( 40.020073,116.394447))
                .add(new LatLng( 40.020073,116.394417))
                .add(new LatLng( 40.020081,116.394394))
                .add(new LatLng( 40.020111,116.394348))
                .add(new LatLng( 40.020199,116.394287))
                .add(new LatLng( 40.020226,116.394241))
                .add(new LatLng( 40.020229,116.39418))
                .add(new LatLng( 40.020226,116.394096))
                .add(new LatLng( 40.020222,116.394096))
                .add(new LatLng( 40.020321,116.394081))
                .add(new LatLng( 40.020401,116.394028))
                .add(new LatLng( 40.020451,116.393959))
                .add(new LatLng( 40.020489,116.393875))
                .add(new LatLng( 40.020508,116.393768))
                .add(new LatLng( 40.020538,116.3936))
                .add(new LatLng( 40.020584,116.393509))
                .add(new LatLng( 40.020721,116.393349))
                .add(new LatLng( 40.02108,116.393005))
                .add(new LatLng( 40.021355,116.392815))
                .add(new LatLng( 40.021381,116.392784))
                .add(new LatLng( 40.021389,116.392761))
                .add(new LatLng( 40.0214,116.392708))
                .add(new LatLng( 40.021416,116.392624))
                .add(new LatLng( 40.021416,116.392624))
                .add(new LatLng( 40.021461,116.39257))
                .add(new LatLng( 40.021484,116.392555))
                .add(new LatLng( 40.021622,116.392479))
                .add(new LatLng( 40.02174,116.392365))
                .add(new LatLng( 40.021896,116.392189));

        List<Integer> colors = new ArrayList<Integer>();
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.GREEN);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.YELLOW);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.RED);
        polylineOptions.width(10);
        polylineOptions.colorValues(colors);
        return  polylineOptions;
    }
}
