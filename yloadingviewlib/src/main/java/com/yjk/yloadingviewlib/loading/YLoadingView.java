package com.yjk.yloadingviewlib.loading;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.Window;

import com.airbnb.lottie.LottieAnimationView;
import com.yjk.yloadingviewlib.R;

/**
 * Created by yjk on 2018. 4. 25..
 */

public class YLoadingView extends Dialog {
    private final String TAG = "### YLoadingView";

    private int style;
    private int size;
    private int duration;

    private boolean canceledOnTouchOutside = true;
    private boolean cancelable = true;

    public YLoadingView(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);          // no title
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT)); // set background
        setContentView(R.layout.dialog_loading);

        init();
    }

    public static class Builder{
        private YLoadingView yLoadingView;
        public YLoadingView builder(Context context, int style){
            yLoadingView = new YLoadingView(context);
            yLoadingView.setStyle(style);
            return yLoadingView;
        }
        public YLoadingView setSize(int size){
            yLoadingView.setLoadingSize(size);
            return yLoadingView;
        }
        public YLoadingView setDuration(int duration){
            yLoadingView.setDuration(duration);
            return yLoadingView;
        }
        public YLoadingView setCanceledOnTouchOutside(boolean cancel){
            yLoadingView.setCanceledOnTouchOutside(cancel);
            return yLoadingView;
        }
        public YLoadingView setCancelable(boolean cancel){
            yLoadingView.setCancelable(cancel);
            return yLoadingView;
        }
    }


    /**************
     * settings
     ***************/
    private void init(){
        setCanceledOnTouchOutside(true);
        setCancelable(true);

    }

    // Set loading style    -   애니메이션 스타일 설정
    public void setStyle(int style){
        this.style = style;
    }

    // Set loading animation duration.  -   애니메이션 시간 설정
    public void setDuration(int duration){

    }

    // set loading view size
    public void setLoadingSize(int size){
        this.size = size;
    }

    @Override
    public void setCancelable(boolean cancelable) {
        this.cancelable = cancelable;
    }
    @Override
    public void setCanceledOnTouchOutside(boolean canceledOnTouchOutside) {
        this.canceledOnTouchOutside = canceledOnTouchOutside;
    }

    @Override
    public void show() {
        super.show();
        LottieAnimationView loadingView = (LottieAnimationView) findViewById(R.id.loadingView);
        loadingView.setAnimation(style);
        loadingView.invalidate();
    }


}
