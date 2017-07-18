package com.spring.demo.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    /**
     * 初始化一个ThreadLocal对象，ThreadLocal对象有get(),set()方法;
     */
    private static final ThreadLocal<Session> sessionTL = new ThreadLocal<Session>();


    private static SessionFactory sf;

    //静态代码块,只执行一次
    static {
        try {
            //创建sesssion工厂
            sf = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 得到session对象，同时设置session对象到ThreadLocal对象
     * 确保一个线程用一个session对象，而不是多个线程共享一个session对象
     *
     * @return 从ThradLocal对象中得到的session对象
     */
    public static Session getSession() {
        //多线程不公用session
        Session session = sessionTL.get();
        if (session == null) {
            //得到session对象
            session = sf.openSession();
            //将session对象保存到threadLocal对象中
            sessionTL.set(session);
        }
        return session;
    }

    /**
     * 关闭session ,同时从ThreadLocal对象中清除缓存
     */
    public static void closeSession() {
        Session session = sessionTL.get();
        sessionTL.set(null);//先清空threadLocal
        session.close();
    }

}