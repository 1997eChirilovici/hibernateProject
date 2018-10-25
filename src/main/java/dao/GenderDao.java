package dao;

import model.Gender;
import session.SessionManage;

import java.util.List;

public class GenderDao implements GenderDaoInterface <Gender,Integer> {

    SessionManage sessionManage =new SessionManage();

    public SessionManage getSessionManage() {
        return sessionManage;
    }

    public void persist(Gender entity) {
        sessionManage.getCurrentSession().save(entity);
    }

    public void update(Gender entity) {
        sessionManage.getCurrentSession().update(entity);
    }

    public Gender findById(Integer id) {
        Gender gender = (Gender) sessionManage.getCurrentSession().get(Gender.class, id);
        return gender;
    }

    public void delete(Gender entity) {
        sessionManage.getCurrentSession().delete(entity);
    }

    public List<Gender> findAll() {
        List<Gender> gender = (List<Gender>) sessionManage.getCurrentSession().createQuery("from Gender").list();
        return gender;
    }

    public void deleteAll() {
        List<Gender> entityList = findAll();
        for (Gender entity : entityList) {
            delete(entity);
        }
    }
}
