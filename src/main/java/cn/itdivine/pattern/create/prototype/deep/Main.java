package cn.itdivine.pattern.create.prototype.deep;


public class Main {

    public static void main(String[] args) throws Exception {

        QiTianDaSheng sourceDemo = new QiTianDaSheng();
        sourceDemo.jinGuBang = new JinGuBang();

        QiTianDaSheng targetDemo = new QiTianDaSheng();

        //Spring 方法一  最优方法
        org.springframework.beans.BeanUtils.copyProperties(sourceDemo, targetDemo);
        System.out.println(sourceDemo.jinGuBang == targetDemo.jinGuBang);

        //apache 最优实现API
        targetDemo = (QiTianDaSheng)org.apache.commons.beanutils.BeanUtils.cloneBean(sourceDemo);
        System.out.println(sourceDemo.jinGuBang == targetDemo.jinGuBang);

        //apache  最优方法
        org.apache.commons.beanutils.BeanUtils.copyProperties(sourceDemo, targetDemo);
        System.out.println(sourceDemo.jinGuBang == targetDemo.jinGuBang);
    }
}
