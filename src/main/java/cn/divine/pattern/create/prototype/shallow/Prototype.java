package cn.divine.pattern.create.prototype.shallow;


/**
 * Cloneable  浅拷贝：对象CloneTarget的引用是同一个，修改任意一个，其他都会改变
 *
 * Created by Tom on 2018/3/7.
 */
public class Prototype implements Cloneable {

    public String name;

    CloneTarget target = null;

}
