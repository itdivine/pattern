package cn.divine.pattern.create.prototype.deep;

import org.springframework.beans.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws Exception {

        QiTianDaSheng sourceDemo = new QiTianDaSheng();
        sourceDemo.jinGuBang = new JinGuBang();

        QiTianDaSheng targetDemo = new QiTianDaSheng();

        //Spring 方法一  最优方法
//        BeanUtils.copyProperties(sourceDemo, targetDemo);
//        System.out.println(sourceDemo.jinGuBang == targetDemo.jinGuBang);

        //apache 最优实现API
        targetDemo = (QiTianDaSheng)org.apache.commons.beanutils.BeanUtils.cloneBean(sourceDemo);
        System.out.println(sourceDemo.jinGuBang == targetDemo.jinGuBang);

        //apache  最优方法
//        org.apache.commons.beanutils.BeanUtils.copyProperties(sourceDemo, targetDemo);
//        System.out.println(sourceDemo.jinGuBang == targetDemo.jinGuBang);




    }
}
