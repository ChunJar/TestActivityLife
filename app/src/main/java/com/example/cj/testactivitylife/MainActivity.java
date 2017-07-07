package com.example.cj.testactivitylife;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * onCreate:创建Activity的实例对象
 * onStart:启动当前的Activity实例对象
 * onResume:如果该方法执行，页面的实例就能和用户进行交互，获取焦点
 * onPause:如果该方法执行，页面的实例就不能和用户进行交互，但页面仍可见，失去焦点
 * onStop:页面不可见
 * onDestroy:销毁当前的Activity页面实例
 * onRestart: 将置于后台的Activity重新显示在前台的时候被调用，一般会连续调用onStart、onResume
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("TAG", "onCreate方法被执行");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG", "onStart方法被执行");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG", "onResume方法被执行");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG", "onPause方法被执行");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "onStop方法被执行");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "onDestroy方法被执行");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG", "onRestart方法被执行");
    }
}
