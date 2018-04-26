package com.yjk.yloadingview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.yjk.yloadingviewlib.loading.YLoadingStyle;
import com.yjk.yloadingviewlib.loading.YLoadingView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private ArrayList<Integer> list;

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();
    }

    private void init(){
        list = new ArrayList<>();
        list.add(YLoadingStyle.SIMPE_LOADING_01);
        list.add(YLoadingStyle.SIMPE_LOADING_02);
        list.add(YLoadingStyle.SIMPE_LOADING_03);
        list.add(YLoadingStyle.SIMPE_LOADING_04);
        list.add(YLoadingStyle.SIMPE_LOADING_05);
        list.add(YLoadingStyle.COLOR_LOADING_01);
        list.add(YLoadingStyle.COLOR_LOADING_02);
        list.add(YLoadingStyle.COLOR_LOADING_03);
        list.add(YLoadingStyle.DYNAMIC_LOADING_01);
        list.add(YLoadingStyle.DYNAMIC_LOADING_02);
        list.add(YLoadingStyle.DYNAMIC_LOADING_03);

        Button button = (Button) findViewById(R.id.loadingButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(list.get(count));

                count++;
                if(count >= list.size()) count = 0;
            }
        });
    }

    private void show(int json){
        YLoadingView yLoadingView = new YLoadingView.Builder().builder(this, json);
        yLoadingView.show();
    }
}
