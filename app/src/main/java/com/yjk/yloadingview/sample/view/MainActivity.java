package com.yjk.yloadingview.sample.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.yjk.yloadinglib.view.YLoadingView;
import com.yjk.yloadingview.R;
import com.yjk.yloadingview.sample.util.LoadingStyleFactory;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button simpleButton, dynamicButton, materialButton, uniqueButton;
    private ArrayList<Integer> simpleList, dynamicList, materialList, uniqueList;
    private int countSimple = 0, countDynamic = 0, countMaterial = 0, countUnique = 0;

    private LoadingStyleFactory factory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        factory = new LoadingStyleFactory();
        simpleList = factory.getSimpleList();
        materialList = factory.getMaterialList();
        dynamicList = factory.getDynamicList();
        uniqueList = factory.getUniqueList();

        simpleButton = (Button) findViewById(R.id.simple_button);
        materialButton = (Button) findViewById(R.id.material_button);
        dynamicButton = (Button) findViewById(R.id.dynamic_button);
        uniqueButton = (Button) findViewById(R.id.unique_button);

        simpleButton.setOnClickListener(this);
        materialButton.setOnClickListener(this);
        dynamicButton.setOnClickListener(this);
        uniqueButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.simple_button:
                show(simpleList.get(countSimple), countSimple, simpleList.size());

                countSimple++;
                if(countSimple >= simpleList.size()) countSimple = 0;
                break;
            case R.id.material_button:
                show(materialList.get(countMaterial), countMaterial, materialList.size());

                countMaterial++;
                if(countMaterial >= materialList.size()) countMaterial = 0;
                break;
            case R.id.dynamic_button:
                show(dynamicList.get(countDynamic), countDynamic, dynamicList.size());

                countDynamic++;
                if(countDynamic >= dynamicList.size()) countDynamic = 0;
                break;
            case R.id.unique_button:
                show(uniqueList.get(countUnique), countUnique, uniqueList.size());

                countUnique++;
                if(countUnique >= uniqueList.size()) countUnique = 0;
                break;
        }
    }

    private void show(int json, int count, int total){
        YLoadingView loadingView = new YLoadingView.Builder()
                .load(this, json)
                .setScale(2.0f)
                .setSpeed(2)
                .build();
        loadingView.show();

        Toast.makeText(this, (count+1) + "/" + total, Toast.LENGTH_SHORT).show();
    }
}
