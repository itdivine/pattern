package cn.divine.pattern.create.singleton.lazy;


/**
 * 懒汉式单例 - 史上最牛B的单例模式的实现方式
 * 特点：在外部类被调用的时候内部类才会被加载
 * 优点：兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
 *
 * 1、应用启动时，类不会初始化
 * 2、类被调用时（LazyThree.getInstance()），执行到LazyHolder.LAZY，内部类才会被加载
 *
 * 内部类：
 *      静态内部类和非静态内部类一样，都不会因为外部内的加载而加载，同时静态内部类的加载不需要依附外部类，
 *      在使用时才加载，不过在加载静态内部类的过程中也会加载外部类
 */
public class LazyThree {

    private LazyThree(){}

    /**
     * static 是为了使单例的空间共享
     * final保证这个方法不会被重写，重载
     * @return
     */
    public static final LazyThree getInstance(){
        return LazyHolder.LAZY; //主动调用了内部类
    }

    /**
     * 必须主动调用，否则不会加载
     * 1、应用启动时，不会加载
     * 2、外部类创建时，不会加载
     */
    private static class LazyHolder{
        private static final LazyThree LAZY = new LazyThree();
    }
}