# Loaing View Library

## Introduce
This library helps you easily use LoadingView.<br>
I used Lottie library from AirBnB.<br>
It is much less memory than using gif or frame animation.<br>

## ScreenShot
#### simple
<img src="/res/load_video/video_simple_01.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_simple_02.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_simple_03.gif" alt="Drawing" width= "23%"/>

#### material
<img src="/res/load_video/video_material_01.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_material_02.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_material_03.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_material_04.gif" alt="Drawing" width= "23%"/>

#### dynamic
<img src="/res/load_video/video_dynamic_01.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_dynamic_02.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_dynamic_03.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_dynamic_04.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_dynamic_05.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_dynamic_06.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_dynamic_07.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_dynamic_08.gif" alt="Drawing" width= "23%"/>


#### unique
<img src="/res/load_video/video_unique_01.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_unique_02.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_unique_03.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_unique_04.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_unique_05.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_unique_06.gif" alt="Drawing" width= "23%"/><img src="/res/load_video/video_unique_07.gif" alt="Drawing" width= "23%"/>


## Requirements
+ Android 5.0 or greater
+ minSdkVersion 21
+ targetSdkVersion 27

## Dependencies
+ implementation 'com.airbnb.android:lottie:2.5.4'

## Installation
+ Gradle - build.gradle (Module:app) <br>
``` gradle
  allprojects {
    repositories {
      ...
      maven { url 'https://jitpack.io' }
    }
  }

  dependencies {
  	        compile 'com.github.jongkk7:YLoadingView:2.0.0'
            // compile 'com.github.jongkk7:YLoadingView:{last version}'
  }
```

## Useable
+ Very Simple! <br>
``` java
  // YLoadingView yLoadingView = new YLoadingView.Builder().load(this, LoadingStyle.SIMPLE_LOADING_01).build();
  YLoadingView loadingView = new YLoadingView.Builder()
                .load(this, json)    // init
                .setScale(2.0f)      // size * 2.0f
                .setSpeed(2)         // speed * 2.0f
                .build();

  yLoadingView.show();
  // yLoadingView.dismiss();
```
> tip!<br>
> You can download the Lottie animation and customize it.<br>
> Click here -> [Lottie Animation page](https://www.lottiefiles.com/popular)
> new YLoadingView.Builder().builder(this, json).show();

## Styles
+ LoadingStyle.SIMPLE_LOADING_01 ~ 03<br>
+ LoadingStyle.MATERIAL_LOADING_01 ~ 04<br>
+ LoadingStyle.DYNAMIC_LOADING_01 ~ 08<br>
+ LoadingStyle.UNIQUE_LOADING_01 ~ 07<br>

## Method
+ setScale(float scale)
+ setSpeed(int speed)
+ setCanceledOnTouchOutside(boolean cancel)
+ setCancelable(boolean cancel)
+ show();
+ dismiss();

## TODO
Add method & animaton styles
+ setBackgroundColor
+ setColor
