package com.cretin.tools.androidutils.email;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * @date: on 2020-05-26
 * @author: cretin
 * @email: mxnzp_life@163.com
 * @desc: 邮件工具类 发送邮件
 */
public class EmailUtils {

    /**
     * 发送邮件
     * @param context
     * @param addresses
     * @param subject
     */
    public static void sendEmail(Context context, String[] addresses, String subject) {
        try {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:")); // only email apps should handle this
            intent.putExtra(Intent.EXTRA_EMAIL, addresses);
            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
