package com.spring.demo.dao.impl;

import com.spring.demo.dao.IBaseDao;
import com.spring.demo.utils.JpaUtitls;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

/**
 * Created by admin on 2017/7/18.
 */
@Repository
public class BaseDao<T> implements IBaseDao<T> {
    @Override
    public int save(Object o) {

        return 0;
    }

    @Override
    public int saveList(List<T> dates) {
        EntityManager entityManager = JpaUtitls.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        return 0;
    }
}
