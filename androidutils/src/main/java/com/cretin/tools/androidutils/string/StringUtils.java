package com.cretin.tools.androidutils.string;

import android.text.TextUtils;
import android.widget.TextView;

/**
 * @date: on 2020-05-26
 * @author: cretin
 * @email: mxnzp_life@163.com
 * @desc: 字符串工具类
 */
public class StringUtils {
    /**
     * 字符串是否为空
     *
     * @param content
     * @return
     */
    public static boolean isEmpty(String content) {
        return TextUtils.isEmpty(content.trim());
    }

    /**
     * 所有传入参数都为空
     * @param content
     * @return
     */
    public static boolean isAllEmpty(String... content) {
        if (content == null) {
            return true;
        }
        for (String s : content) {
            if (!isEmpty(s)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 某个参数为空
     * @param content
     * @return
     */
    public static boolean isSomeOneEmpty(String... content){
        if (content == null) {
            return true;
        }
        for (String s : content) {
            if (isEmpty(s)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 所有参数都不为空
     * @param content
     * @return
     */
    public static boolean isAllNotEmpty(String... content) {
        if (content == null) {
            return false;
        }
        for (String s : content) {
            if (isEmpty(s)) {
                return false;
            }
        }
        return true;
    }
}
