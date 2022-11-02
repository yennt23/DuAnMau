package com.mycompany.shoponline.utilities;

import com.mycompany.shoponline.DomainModels.HoaDonChiTiet;
import com.mycompany.shoponline.DomainModels.GioHang;
import com.mycompany.shoponline.DomainModels.NhanVien;
import com.mycompany.shoponline.DomainModels.MauSac;
import com.mycompany.shoponline.DomainModels.KhachHang;
import com.mycompany.shoponline.DomainModels.CuaHang;
import com.mycompany.shoponline.DomainModels.SanPham;
import com.mycompany.shoponline.DomainModels.GioHangChiTiet;
import com.mycompany.shoponline.DomainModels.ChucVu;
import com.mycompany.shoponline.DomainModels.NSX;
import com.mycompany.shoponline.DomainModels.HoaDon;
import com.mycompany.shoponline.DomainModels.DongSP;
import com.mycompany.shoponline.DomainModels.ChiTietSP;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernatUtil {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServer2012Dialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "08102003");
        properties.put(Environment.SHOW_SQL, "true");
        //gen DB tự động
//        properties.put(Environment.HBM2DDL_AUTO, "update");

        conf.setProperties(properties);
        conf.addAnnotatedClass(ChiTietSP.class);
        conf.addAnnotatedClass(ChucVu.class);
        conf.addAnnotatedClass(CuaHang.class);
        conf.addAnnotatedClass(DongSP.class);
        conf.addAnnotatedClass(GioHang.class);
        conf.addAnnotatedClass(GioHangChiTiet.class);
        conf.addAnnotatedClass(HoaDon.class);
        conf.addAnnotatedClass(HoaDonChiTiet.class);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(MauSac.class);
        conf.addAnnotatedClass(NSX.class);
        conf.addAnnotatedClass(NhanVien.class);
        conf.addAnnotatedClass(SanPham.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        getFACTORY();
    }

}
