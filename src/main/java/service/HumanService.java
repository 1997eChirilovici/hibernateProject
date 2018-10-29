package service;

import dao.HumanDao;
import model.Human;

import java.util.List;

public class HumanService {
    private static HumanDao humanDao;

    public HumanService(){
        humanDao = new HumanDao();
    }

    public void persist(Human entity) {
        humanDao.getSessionManage().openCurrentSessionwithTransaction();
        humanDao.persist(entity);
        humanDao.getSessionManage().closeCurrentSessionwithTransaction();
    }

    public void update(Human entity) {
        humanDao.getSessionManage().openCurrentSessionwithTransaction();
        humanDao.update(entity);
        humanDao.getSessionManage().closeCurrentSessionwithTransaction();
    }

    public Human findById(Integer id) {
        humanDao.getSessionManage().openCurrentSession();
        Human human = humanDao.findById(id);
        humanDao.getSessionManage().closeCurrentSession();
        return human;
    }

    public void delete(Integer id) {
        humanDao.getSessionManage().openCurrentSessionwithTransaction();
        Human human = humanDao.findById(id);
        humanDao.delete(human);
        humanDao.getSessionManage().closeCurrentSessionwithTransaction();
    }

    public List<Human> findAll() {
        humanDao.getSessionManage().openCurrentSession();
        List<Human> human = humanDao.findAll();
        humanDao.getSessionManage().closeCurrentSession();
        return human;
    }

    public void deleteAll() {
        humanDao.getSessionManage().openCurrentSessionwithTransaction();
        humanDao.deleteAll();
        humanDao.getSessionManage().closeCurrentSessionwithTransaction();
    }

}
