package com.itheima.mobilesafe.com.itheima.mobilesafe.activity;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;

import com.itheima.mobilesafe.R;

public class SplashActivity extends Activity {
        TextView tv_version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_version = (TextView) findViewById(R.id.tv_version);
        tv_version.setText("版本号"+getVersionname());
    }
private  String getVersionname(){

    PackageManager packageManager = getPackageManager();
    try {
        PackageInfo packageInfo = packageManager.getPackageInfo(getPackageName(), 0);
        int versionCode = packageInfo.versionCode;
        String versionName = packageInfo.versionName;
        return versionName;
    } catch (PackageManager.NameNotFoundException e) {
        e.printStackTrace();
    }
    return "";

}

}
