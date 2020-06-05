package com.cretin.rootnoandroidxproject;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.cretin.tools.androidutils.email.EmailUtils;
import com.cretin.tools.androidutils.openapp.OpenAppUtils;
import com.cretin.tools.androidutils.password.PswUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDefaultBrowser(View view) {
        OpenAppUtils.openDefaultBrowser(this, "https://www.baidu.com");
    }

    public void openAimPackageBrowser(View view) {
        //QQ浏览器目前包名类名信息 com.tencent.mtt com.tencent.mtt.MainActivity
        //UC浏览器目前包名类名信息 com.UCMobile com.uc.browser.InnerUCMobile
        OpenAppUtils.openAimPackageBrowser(this, "https://www.baidu.com", "com.tencent.mtt", "com.tencent.mtt.MainActivity");
    }

    public void openPhoneBrowser(View view) {
        OpenAppUtils.openPhoneBrowser(this, "https://www.baidu.com");
    }
}
