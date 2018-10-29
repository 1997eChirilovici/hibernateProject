package dao;

import model.Human;
import session.SessionManage;

import java.util.List;

public class HumanDao implements HumanDaoInterface <Human,Integer>{

    SessionManage sessionManage = new SessionManage();

    public SessionManage getSessionManage() {
        return sessionManage;
    }

    @Override
    public void persist(Human entity) {
        sessionManage.getCurrentSession().save(entity);
    }

    @Override
    public void update(Human entity) {
        sessionManage.getCurrentSession().update(entity);
    }

    @Override
    public Human findById(Integer integer) {
        return sessionManage.getCurrentSession().get(Human.class,integer);
    }

    @Override
    public void delete(Human entity) {
        sessionManage.getCurrentSession().delete(entity);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Human> findAll() {
        return sessionManage.getCurrentSession().createQuery("from Human ").list();
    }

    @Override
    public void deleteAll() {
        for(Human entity: findAll()){
            delete(entity);
        }
    }

}
