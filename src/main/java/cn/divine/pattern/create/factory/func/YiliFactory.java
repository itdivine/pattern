package cn.divine.pattern.create.factory.func;


import cn.divine.pattern.create.factory.Milk;
import cn.divine.pattern.create.factory.Yili;

/**
 * Created by Tom on 2018/3/4.
 */
public class YiliFactory implements Factory {

    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
