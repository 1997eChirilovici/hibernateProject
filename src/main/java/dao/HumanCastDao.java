package dao;

import model.HumanCast;
import session.SessionManage;

import java.util.List;

public class HumanCastDao implements HumanCastDaoInterface <HumanCast,Integer> {
    SessionManage sessionManage = new SessionManage();

    public SessionManage getSessionManage() {
        return sessionManage;
    }

    @Override
    public void persist(HumanCast entity) {
        sessionManage.getCurrentSession().save(entity);
    }

    @Override
    public void update(HumanCast entity) {
        sessionManage.getCurrentSession().update(entity);
    }

    @Override
    public HumanCast findById(Integer integer) {
        return sessionManage.getCurrentSession().get(HumanCast.class, integer);
    }

    @Override
    public void delete(HumanCast entity) {
        sessionManage.getCurrentSession().delete(entity);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<HumanCast> findAll() {
        return sessionManage.getCurrentSession().createQuery("from HumanCast ").list();
    }

    @Override
    public void deleteAll() {
        for (HumanCast entity: findAll()){
            delete(entity);
        }
    }

}
