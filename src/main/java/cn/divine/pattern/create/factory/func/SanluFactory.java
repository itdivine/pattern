package cn.divine.pattern.create.factory.func;


import cn.divine.pattern.create.factory.Milk;
import cn.divine.pattern.create.factory.Sanlu;

/**
 * Created by Tom on 2018/3/4.
 */
public class SanluFactory implements  Factory {
    @Override
    public Milk getMilk() {
        return new Sanlu();
    }
}
