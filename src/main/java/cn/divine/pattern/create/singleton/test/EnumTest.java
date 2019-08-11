package cn.divine.pattern.create.singleton.test;

import cn.divine.pattern.create.singleton.register.ServiceCode;

/**
 * Created by Tom on 2018/3/7.
 */
public class EnumTest {
    public static void main(String[] args) {
        System.out.println(ServiceCode.SYSTEM_NORMAL.getCode());
        System.out.println(ServiceCode.SYSTEM_NORMAL.getDesc());
    }
}