package com.cretin.tools.androidutils.openapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * @date: on 2020-05-26
 * @author: cretin
 * @email: mxnzp_life@163.com
 * @desc: 打开外部app工具
 */
public class OpenAppUtils {

    /**
     * 打开默认浏览器
     * @param context
     * @param url
     */
    public static void openDefaultBrowser(Context context, String url) {
        try {
            Uri uri = Uri.parse(url);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 打开指定浏览器 打开失败则打开默认浏览器
     * @param context
     * @param url
     * @param packageName
     * @param className
     */
    public static void openAimPackageBrowser(Context context,String url,String packageName,String className){
        try {
            Uri uri = Uri.parse(url);
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            intent.setClassName(packageName,className);
            context.startActivity(intent);
        }catch (Exception e){
            e.printStackTrace();
            openDefaultBrowser(context,url);
        }
    }

    /**
     * 打开系统自带的浏览器 打开失败则打开默认浏览器
     * @param context
     * @param url
     */
    public static void openPhoneBrowser(Context context, String url) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            Uri content_url = Uri.parse(url);
            intent.setData(content_url);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setClassName("com.android.browser","com.android.browser.BrowserActivity");
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            openDefaultBrowser(context,url);
        }
    }

}
