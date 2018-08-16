package com.yjk.yloadingview.sample.util;

import com.yjk.yloadinglib.data.LoadingStyle;

import java.util.ArrayList;

public class LoadingStyleFactory {

    private ArrayList<Integer> simpleList;
    private ArrayList<Integer> materialList;
    private ArrayList<Integer> dynamicList;
    private ArrayList<Integer> uniqueList;

    public LoadingStyleFactory(){
        init();
    }

    public ArrayList<Integer> getSimpleList() {
        return simpleList;
    }

    public ArrayList<Integer> getMaterialList() {
        return materialList;
    }

    public ArrayList<Integer> getDynamicList() {
        return dynamicList;
    }

    public ArrayList<Integer> getUniqueList() {
        return uniqueList;
    }

    private void init(){
        simpleList = new ArrayList<>();
        materialList = new ArrayList<>();
        dynamicList = new ArrayList<>();
        uniqueList = new ArrayList<>();

        initSimple();
        initMaterial();
        initDynamic();
        initUnique();
    }

    private void initSimple(){
        simpleList.add(LoadingStyle.SIMPLE_LOADING_01);
        simpleList.add(LoadingStyle.SIMPLE_LOADING_02);
        simpleList.add(LoadingStyle.SIMPLE_LOADING_03);
    }
    private void initMaterial(){
        materialList.add(LoadingStyle.MATERIAL_LOADING_01);
        materialList.add(LoadingStyle.MATERIAL_LOADING_02);
        materialList.add(LoadingStyle.MATERIAL_LOADING_03);
        materialList.add(LoadingStyle.MATERIAL_LOADING_04);
    }
    private void initDynamic(){
        dynamicList.add(LoadingStyle.DYNAMIC_LOADING_01);
        dynamicList.add(LoadingStyle.DYNAMIC_LOADING_02);
        dynamicList.add(LoadingStyle.DYNAMIC_LOADING_03);
        dynamicList.add(LoadingStyle.DYNAMIC_LOADING_04);
        dynamicList.add(LoadingStyle.DYNAMIC_LOADING_05);
        dynamicList.add(LoadingStyle.DYNAMIC_LOADING_06);
        dynamicList.add(LoadingStyle.DYNAMIC_LOADING_07);
        dynamicList.add(LoadingStyle.DYNAMIC_LOADING_08);
        dynamicList.add(LoadingStyle.DYNAMIC_LOADING_09);
    }
    private void initUnique(){
        uniqueList.add(LoadingStyle.UNIQUE_LOADING_01);
        uniqueList.add(LoadingStyle.UNIQUE_LOADING_02);
        uniqueList.add(LoadingStyle.UNIQUE_LOADING_03);
        uniqueList.add(LoadingStyle.UNIQUE_LOADING_04);
        uniqueList.add(LoadingStyle.UNIQUE_LOADING_05);
        uniqueList.add(LoadingStyle.UNIQUE_LOADING_06);
        uniqueList.add(LoadingStyle.UNIQUE_LOADING_07);
    }


}
