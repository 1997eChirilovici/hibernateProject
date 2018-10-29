package service;

import dao.HumanCastDao;
import model.HumanCast;

import java.util.List;

public class HumanCastService {
    HumanCastDao humanCastDao;
    public HumanCastService(){
        humanCastDao = new HumanCastDao();
    }

    public void persist(HumanCast entity) {
        humanCastDao.getSessionManage().openCurrentSessionwithTransaction();
        humanCastDao.persist(entity);
        humanCastDao.getSessionManage().closeCurrentSessionwithTransaction();
    }

    public void update(HumanCast entity) {
        humanCastDao.getSessionManage().openCurrentSessionwithTransaction();
        humanCastDao.update(entity);
        humanCastDao.getSessionManage().closeCurrentSessionwithTransaction();
    }

    public HumanCast findById(Integer id) {
        humanCastDao.getSessionManage().openCurrentSession();
        HumanCast human = humanCastDao.findById(id);
        humanCastDao.getSessionManage().closeCurrentSession();
        return human;
    }

    public void delete(Integer id) {
        humanCastDao.getSessionManage().openCurrentSessionwithTransaction();
        HumanCast human = humanCastDao.findById(id);
        humanCastDao.delete(human);
        humanCastDao.getSessionManage().closeCurrentSessionwithTransaction();
    }

    public List<HumanCast> findAll() {
        humanCastDao.getSessionManage().openCurrentSession();
        List<HumanCast> human = humanCastDao.findAll();
        humanCastDao.getSessionManage().closeCurrentSession();
        return human;
    }

    public void deleteAll() {
        humanCastDao.getSessionManage().openCurrentSessionwithTransaction();
        humanCastDao.deleteAll();
        humanCastDao.getSessionManage().closeCurrentSessionwithTransaction();
    }
}
