package cn.itdivine.pattern.create.singleton.seriable;

import java.io.Serializable;

/**
 * 反序列化时导致单例破坏
 */
public class User implements Serializable {


    //序列化就是说把内存中的状态通过转换成字节码的形式
    //从而转换一个IO流，写入到其他地方(可以是磁盘、网络IO)
    //内存中状态给永久保存下来了

    //反序列化
    //将已经持久化的字节码内容，转换为IO流
    //通过IO流的读取，进而将读取的内容转换为Java对象
    //在转换过程中会重新创建对象new


    public  final static User user = new User();

    private User(){}

    public static User getUser(){
        return user;
    }

    //如果实现了serializable接口的类中包含readResolve则返回true
    //防止单例被破坏
    private  Object readResolve(){
        return user;
    }

}
