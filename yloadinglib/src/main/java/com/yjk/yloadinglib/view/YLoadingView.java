package com.yjk.yloadinglib.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.Window;

import com.airbnb.lottie.LottieAnimationView;
import com.yjk.yloadinglib.R;
import com.yjk.yloadinglib.data.LoadingStyle;

public class YLoadingView extends Dialog {
    private final String TAG = "### YLoadingView";

    private final int DEFALUT_STYLE = LoadingStyle.SIMPLE_LOADING_01;
    private final float DEFAULT_SCALE = 1.0f;
    private final int DEFAULT_SPEED = 1;

    private LottieAnimationView loadingView;

    private int style = DEFALUT_STYLE;
    private float scale = DEFAULT_SCALE;
    private int speed = DEFAULT_SPEED;
    private String backgroundColor = "#888888";

    public YLoadingView(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    public static class Builder{
        private YLoadingView yLoadingView;
        public Builder load(Context context, int style){
            yLoadingView = new YLoadingView(context);
            yLoadingView.setStyle(style);
            return this;
        }
        public Builder setScale(float scale){
            yLoadingView.setLoadingScale(scale);
            return this;
        }
        public Builder setSpeed(int speed){
            yLoadingView.setSpeed(speed);
            return this;
        }
        public Builder setCanceledOnTouchOutside(boolean cancel){
            yLoadingView.setCanceledOnTouchOutside(cancel);
            return this;
        }
        public Builder setCancelable(boolean cancel){
            yLoadingView.setCancelable(cancel);
            return this;
        }
        public YLoadingView build(){
            return yLoadingView;
        }
    }


    /**************
     * settings
     ***************/
    private void init(){
        requestWindowFeature(Window.FEATURE_NO_TITLE);          // no title
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT)); // set background

        setContentView(R.layout.dialog_loading);

        setCanceledOnTouchOutside(true);
        setCancelable(true);

        loadingView = (LottieAnimationView) findViewById(R.id.loadingView);
    }

    // Set loading style    -   애니메이션 스타일 설정
    public void setStyle(int style){
        this.style = style;
    }

    // Set loading animation duration.  -   애니메이션 시간 설정
    public void setSpeed(int speed){
        this.speed = speed;
    }

    // set loading view size
    public void setLoadingScale(float scale){
        this.scale = scale;
    }

    // TODO : 배경색 설정
    public void setBackgroundColor(String color){

    }
    public void setBackgroundColor(int color){

    }

    // TODO : 로딩 컬러 변경
    public void setColor(int color){

    }

    public void update(){
        loadingView.setAnimation(style);

        loadingView.setSpeed(speed);
        loadingView.setScale(scale);

        loadingView.invalidate();

    }

    @Override
    public void show() {
        super.show();
        update();
    }


}
