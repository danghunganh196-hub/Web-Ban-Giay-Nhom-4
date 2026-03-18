package vn.fpoly.web_bangiay.Repository;

import org.hibernate.Session;
import vn.fpoly.web_bangiay.Entity.Giay;
import vn.fpoly.web_bangiay.Utility.HibernateConfig;

import java.util.List;

public class GiayRepository {
    private Session session;

    public GiayRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }

    public List<Giay> getAll(){
        return session.createQuery("SELECT gi FROM Giay gi").list();
    }

    public Giay getById(Integer id){
        return session.find(Giay.class, id);
    }

}
