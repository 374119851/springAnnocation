package com.spring.demo.dao;

import java.util.List;

/**
 * Created by admin on 2017/7/18.
 */
public interface IBaseDao<T> {
    /*
    *保存单个对象
    * */
    int save(T t);
    int saveList(List<T> dates);

}
