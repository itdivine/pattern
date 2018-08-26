package cn.divine.pattern.create.factory.func;


import cn.divine.pattern.create.factory.Milk;
import cn.divine.pattern.create.factory.Mengniu;

/**
 * Created by Tom on 2018/3/4.
 */
public class MengniuFactory implements  Factory {


    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
