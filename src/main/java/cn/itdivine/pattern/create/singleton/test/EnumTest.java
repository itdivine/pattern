package cn.itdivine.pattern.create.singleton.test;

import cn.itdivine.pattern.create.singleton.enumobj.ServiceCode;

/**
 * Created by Tom on 2018/3/7.
 */
public class EnumTest {
    public static void main(String[] args) {
        System.out.println(ServiceCode.SYSTEM_NORMAL.getCode());
        System.out.println(ServiceCode.SYSTEM_NORMAL.getDesc());
    }
}