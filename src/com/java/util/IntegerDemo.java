package com.java.util;

/**
 * Integer类的练习
 * @author 陈宇航
 * 2019.3.12
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int num = 20;
        //调用Integer类的方法，将num进行进制转换
        //二进制
        String str1 = Integer.toBinaryString(num);
        System.out.println("二进制:" + str1);
        //八进制
        String str2 = Integer.toOctalString(num);
        System.out.println("八进制:" + str2);
        //十六进制
        String str3 = Integer.toHexString(num);
        System.out.println("十六进制:" + str3);
        //七进制
        String str4 = Integer.toString(num);
        System.out.println("七进制:" + str4);
        System.out.println("-------------------分割线，以下是自定义方法---------------");
        System.out.println("转换三进制：" + convert(20,3));
    }
    private static String convert(int num, int radix) {
        //创建一个StringBuffer，用来存放结果字符串
        StringBuffer stringBuffer = new StringBuffer();
        //被除数不为0，就循环
        while (num !=0){
            //求出余数
            int remainder = num % radix;
            //将余数转换为字符串，加入stringBuffer
            stringBuffer.append(String.valueOf(remainder));
            //更新被除数为商
            num = num / radix;
        }
        //将结果串取反返回
        return stringBuffer.reverse().toString();

    }

}
