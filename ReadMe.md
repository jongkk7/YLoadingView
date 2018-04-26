# Loaing View Library

#### Introduce
This library helps you easily use LoadingView.<br>
I used Lottie Animation from AirBnB.<br>
It is much less memory than using gif or frame animation.<br>

#### ScreenShot
<img src="/res/loading01.gif" alt="Drawing" width= "24%"/> <img src="/res/loading02.gif" alt="Drawing" width= "24%"/> <img src="/res/loading03.gif" alt="Drawing" width= "24%"/> <img src="/res/loading04.gif" alt="Drawing" width= "24%"/> <img src="/res/loading05.gif" alt="Drawing" width= "24%"/> <img src="/res/loading06.gif" alt="Drawing" width= "24%"/>
#### Requirements
+ Android 5.0 or greater
+ minSdkVersion 21
+ targetSdkVersion 26

#### Dependencies
+ implementation 'com.android.support:appcompat-v7:26.1.0'
+ compile 'com.airbnb.android:lottie:2.5.4'

#### Installation
+ Gradle - build.gradle (Module:app) <br>
``` gradle
  compile 'com.yjk.'
```

#### Useable
+ Very Simple! <br>
``` java
  YLoadingView yLoadingView = new YLoadingView.Builder().builder(this, json); // Context, YLoadingStyle
  yLoadingView.show();
```

> tip!<br>
> You can download the Lottie animation and customize it.<br>
> Click here -> [Lottie Animation page](https://www.lottiefiles.com/popular)

#### Method
+ setCanceledOnTouchOutside(boolean cancel)
+ setCancelable(boolean cancel)

#### TODO
Add method & animaton styles
+ setLoadingSize(int size)
