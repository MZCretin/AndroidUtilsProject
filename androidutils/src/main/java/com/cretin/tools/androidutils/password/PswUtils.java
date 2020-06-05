package com.cretin.tools.androidutils.password;

import com.cretin.tools.androidutils.string.StringUtils;

/**
 * @date: on 2020-05-26
 * @author: cretin
 * @email: mxnzp_life@163.com
 * @desc: 密码相关工具类
 */
public class PswUtils {
    //数字
    private static final String REG_NUMBER = ".*\\d+.*";
    //小写字母
    private static final String REG_UPPERCASE = ".*[A-Z]+.*";
    //大写字母
    private static final String REG_LOWERCASE = ".*[a-z]+.*";
    //特殊符号(~!@#$%^&*()_+|<>,.?/:;'[]{}\)
    private static final String REG_SYMBOL = ".*[~!@#$%^&*()_+|<>,.?/:;'\\[\\]{}\"]+.*";

    /**
     * 包含【大写字母】【小写字母】【数字】【特殊字符】所有
     *
     * @return
     */
    public static boolean isContainsNumUpperLowerOtherCase(String psw, int minLength, int maxLength) {
        return isContainsNumUpperLowerOtherCaseWithAimCount(psw, 4, minLength, maxLength);
    }

    /**
     * 包含【大写字母】【小写字母】【数字】【特殊字符】中的两种
     *
     * @return
     */
    public static boolean isContainsNumUpperLowerOtherCaseWith2(String psw, int minLength, int maxLength) {
        return isContainsNumUpperLowerOtherCaseWithAimCount(psw, 2, minLength, maxLength);
    }

    /**
     * 包含【大写字母】【小写字母】【数字】【特殊字符】中的三种
     *
     * @return
     */
    public static boolean isContainsNumUpperLowerOtherCaseWith3(String psw, int minLength, int maxLength) {
        return isContainsNumUpperLowerOtherCaseWithAimCount(psw, 3, minLength, maxLength);
    }

    /**
     * 判断密码中
     *
     * @param password
     * @param count
     * @return
     */
    private static boolean isContainsNumUpperLowerOtherCaseWithAimCount(String password, int count, int minLength, int maxLength) {
        //密码为空及长度大于8位小于30位判断
        if (StringUtils.isEmpty(password)) return false;
        if (password.length() < minLength || password.length() > maxLength) return false;
        int i = 0;
        if (password.matches(REG_NUMBER)) i++;
        if (password.matches(REG_LOWERCASE)) i++;
        if (password.matches(REG_UPPERCASE)) i++;
        if (password.matches(REG_SYMBOL)) i++;
        if (i < count) return false;
        return true;
    }
}
