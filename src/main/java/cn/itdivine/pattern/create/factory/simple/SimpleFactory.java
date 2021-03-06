package cn.itdivine.pattern.create.factory.simple;

import cn.itdivine.pattern.create.factory.Mengniu;
import cn.itdivine.pattern.create.factory.Milk;
import cn.itdivine.pattern.create.factory.Telunsu;
import cn.itdivine.pattern.create.factory.Yili;

/**
 * Created by Tom on 2018/3/4.
 */
public class SimpleFactory {

    public Milk getMilk(String name){
        if("特仑苏".equals(name)){
            return new Telunsu();
        }else if("伊利".equals(name)){
            return new Yili();
        }else if("蒙牛".equals(name)){
            return new Mengniu();
        }else {
            System.out.println("不能生产您所需的产品");
            return null;
        }
    }

}
