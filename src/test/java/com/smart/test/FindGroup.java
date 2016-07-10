package com.smart.test;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sony on 2016/7/10.
 */
public class FindGroup {
    public static void main(String[] args){
        String str = "我本想求购一本疯狂讲义，尽快吝惜13457648981"+"交朋友，电话号码18912345433"+
                "出售二手电脑，联系方式18976543243";
        Matcher m = Pattern.compile("((13\\d)|(18\\d)\\d{8})").matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }

    }
}
