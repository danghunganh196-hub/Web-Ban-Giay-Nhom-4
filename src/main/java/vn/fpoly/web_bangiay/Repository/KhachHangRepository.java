package vn.fpoly.web_bangiay.Repository;

import org.hibernate.Session;
import vn.fpoly.web_bangiay.Entity.KhachHang;
import vn.fpoly.web_bangiay.Utility.HibernateConfig;

import java.util.List;

public class KhachHangRepository {
    private Session session;

    public KhachHangRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }

    public List<KhachHang> getAll(){
        return session.createQuery("SELECT kh FROM KhachHang kh").list();
    }

    public KhachHang getById(Integer id){
        return session.find(KhachHang.class, id);
    }
}
