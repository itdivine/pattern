package cn.itdivine.pattern.create.factory.func;


import cn.itdivine.pattern.create.factory.Milk;
import cn.itdivine.pattern.create.factory.Telunsu;

/**
 * 事情变得越来越专业
 * Created by Tom on 2018/3/4.
 */
public class TelunsuFactory implements Factory {

    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
