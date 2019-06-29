package cn.zhou.hibernate;

import java.util.Date;
import java.util.UUID;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cn.zhou.core.bean.country.City;
import cn.zhou.core.bean.country.Province;
import cn.zhou.core.bean.country.Town;
import cn.zhou.core.bean.order.Detail;
import cn.zhou.core.bean.order.Order;
import cn.zhou.core.bean.product.Brand2;
import cn.zhou.core.bean.product.Color;
import cn.zhou.core.bean.product.Feature;
import cn.zhou.core.bean.product.Img;
import cn.zhou.core.bean.product.Product;
import cn.zhou.core.bean.product.Sku;
import cn.zhou.core.bean.product.Type;
import cn.zhou.core.bean.user.Addr;
import cn.zhou.core.bean.user.Buyer;
import cn.zhou.core.bean.user.Employee;

public class CreateTable {

//	private SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

	public static void main(String[] args) {
		CreateTable createTable = new CreateTable();

		City city = new City();
		city.setId(1);
		createTable.execute(city);

		Province province = new Province();
		province.setId(1);
		createTable.execute(province);

		Town town = new Town();
		town.setId(1);
		createTable.execute(town);

		Detail detail = new Detail();
		detail.setId(1);
		createTable.execute(detail);

		Order order = new Order();
		order.setId(1);
		createTable.execute(order);

		Brand2 brand2 = new Brand2();
		brand2.setId(1);
		createTable.execute(brand2);

		Color color = new Color();
		color.setId(1);
		createTable.execute(color);

		Feature feature = new Feature();
		feature.setId(1);
		createTable.execute(feature);

		Img img = new Img();
		img.setId(1);
		createTable.execute(img);

		Sku sku = new Sku();
		sku.setId(1);
		createTable.execute(sku);

		Type type = new Type();
		type.setId(1);
		createTable.execute(type);

		Addr addr = new Addr();
		addr.setId(1);
		createTable.execute(addr);
		createTable.execute(new Buyer());

		// 商品编号 商品名称 图片 新品 热卖 推荐 上下架 操作选项
		Product product = new Product();
		product.setId(001);
		product.setNo(UUID.randomUUID().toString());
		product.setName("依琦莲2014瑜伽服套装新款 瑜珈健身服三件套 广场舞蹈服装 女瑜伽服送胸垫 长袖紫色");
		product.setWeight(56.00);
		product.setIsNew(1); // 1是 0否
		product.setIsHot(1);
		product.setCreateTime(new Date());
		product.setCheckUserId("");
		product.setCheckTime(new Date());
		product.setCreateUserId("");
		product.setIsShow(1);
		product.setIsDel(1);
		product.setTypeId(1);
		product.setBrandId(1);
		product.setKeywords("");
		product.setSales(36);
		product.setDescription("不是东西");
		product.setPackageList("");
		product.setFeature("头角狰狞");
		product.setColor("blue");
		product.setSize("L"); // S,L,XXL
		createTable.execute(product);

		// insert into
		// Product(id,no,name,weight,isNew,isHot,sales,description,feature,size)value(1,"11xzc3568","依琦莲2014瑜伽服套装新款女瑜伽服送胸垫
		// 长袖紫色",36.12,1,1,110,"不是东西","头角狰狞","blue","L");

		Employee employee = new Employee();
		employee.setId(1);
		createTable.execute(employee);

	}

	public void execute(Object object) {
		// 1、加载Hibernate的核心配置文件：hibernate.cfg.xml
		Configuration configuration = new Configuration().configure("hibernate.xml");
		// 2、创建一个SessionFactory对象：类似于JDBC中的连接池
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		// 3、通过SessionFactory获取Session对象：类似JDBC中的Connection
		Session session = sessionFactory.openSession();

		// 4、手动开启事务
		org.hibernate.Transaction transaction = session.beginTransaction();

		// 5、编写代码
//		Customer customer = new Customer();
//		customer.setCust_name("love you.");

//		session.save(c);
		session.saveOrUpdate(object);

		// 6、事务提交
		try {
			transaction.commit();
		} catch (SecurityException e) {
			try {
				transaction.rollback();
			} catch (IllegalStateException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		// 7、资源释放
		session.close();
	}

}
