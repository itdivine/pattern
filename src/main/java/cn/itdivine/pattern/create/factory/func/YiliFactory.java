package cn.itdivine.pattern.create.factory.func;


import cn.itdivine.pattern.create.factory.Milk;
import cn.itdivine.pattern.create.factory.Yili;

/**
 * Created by Tom on 2018/3/4.
 */
public class YiliFactory implements Factory {

    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
