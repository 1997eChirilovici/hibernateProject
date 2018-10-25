package service;

import dao.GenderDao;
import model.Gender;

import java.util.List;

public class GenderService {
    private static GenderDao genderDao;

    public GenderService() {
        genderDao = new GenderDao();
    }

    public void persist(Gender entity) {
        genderDao.getSessionManage().openCurrentSessionwithTransaction();
        genderDao.persist(entity);
        genderDao.getSessionManage().closeCurrentSessionwithTransaction();
    }

    public void update(Gender entity) {
        genderDao.getSessionManage().openCurrentSessionwithTransaction();
        genderDao.update(entity);
        genderDao.getSessionManage().closeCurrentSessionwithTransaction();
    }

    public Gender findById(Integer id) {
        genderDao.getSessionManage().openCurrentSession();
        Gender book = genderDao.findById(id);
        genderDao.getSessionManage().closeCurrentSession();
        return book;
    }

    public void delete(Integer id) {
        genderDao.getSessionManage().openCurrentSessionwithTransaction();
        Gender book = genderDao.findById(id);
        genderDao.delete(book);
        genderDao.getSessionManage().closeCurrentSessionwithTransaction();
    }

    public List<Gender> findAll() {
        genderDao.getSessionManage().openCurrentSession();
        List<Gender> books = genderDao.findAll();
        genderDao.getSessionManage().closeCurrentSession();
        return books;
    }

    public void deleteAll() {
        genderDao.getSessionManage().openCurrentSessionwithTransaction();
        genderDao.deleteAll();
        genderDao.getSessionManage().closeCurrentSessionwithTransaction();
    }

    public GenderDao genderDao() {
        return genderDao;
    }
}
