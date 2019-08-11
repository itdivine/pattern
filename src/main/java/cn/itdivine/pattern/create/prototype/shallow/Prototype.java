package cn.itdivine.pattern.create.prototype.shallow;


/**
 * Cloneable  浅拷贝：拷贝的是引用（CloneTarget target），一旦修改，所有对象都会修改
 */
public class Prototype implements Cloneable {

    public String name;

    CloneTarget target = null;

}
