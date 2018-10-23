package com.itbang.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/**
 * 字符串处理工具类
 *
 * @author zj
 * @version 1.0 
 *
 * 变更履历：
 *   v1.0 2018年7月31日 zj 初版
 */
public class StringUtil {

    /**
     * 获取uuid方法
     * 
     * @return uuid.
     */
    public static String getUUID32() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }

    /**
     * 生成随机数
     * 
     * @param digit
     *            想生成随机数的位数
     * @return 随机数
     */
    public static String getRandomNumber(int digit) {
        String random = "";
        Random r = new Random();
        int number = 0;
        for (int i = 0; i < digit; i++) {
            number = Math.abs(r.nextInt()) % 10;
            random += number;
        }
        // 保证第一个数字不为零
        if ("0".equals(random.substring(0, 1))) {
            String[] code = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "9" };
            number = Math.abs(r.nextInt()) % 10;
            random = random.replaceFirst("0", code[number]);
        }
        return random;
    }

    /**
     * 生成32位md5码
     * 
     * @param password
     *            密码
     * @return 密文.
     */
    public static String md5Password(String password) {

        try {
            // 得到一个信息摘要器
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] result = digest.digest(password.getBytes());
            StringBuffer buffer = new StringBuffer();
            // 把每一个byte 做一个与运算 0xff;
            for (byte b : result) {
                // 与运算
                int number = b & 0xff;// 加盐
                String str = Integer.toHexString(number);
                if (str.length() == 1) {
                    buffer.append("0");
                }
                buffer.append(str);
            }

            // 标准的md5加密后的结果
            return buffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }

    }

    /**
     * 工具类测试方法
     * 
     * @param args.
     */
    public static void main(String[] args) {
        // System.out.println(CommUtil.md5Password("123456"));;
        // System.out.println(CommUtil.getRandomNumber(10));
        System.out.println(getUUID32());
    }
}
