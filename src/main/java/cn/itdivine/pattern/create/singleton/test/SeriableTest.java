package cn.itdivine.pattern.create.singleton.test;

import cn.itdivine.pattern.create.singleton.seriable.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Tom on 2018/3/8.
 */
public class SeriableTest {
    public static void main(String[] args) {

        User s1 = null;
        User s2 = User.getUser();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("User.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();


            FileInputStream fis = new FileInputStream("User.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (User)ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
