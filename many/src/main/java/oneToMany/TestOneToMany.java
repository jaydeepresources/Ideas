package oneToMany;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class TestOneToMany {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

//		--- Save Companies ---

//		Company company1 = new Company(0,"ITC",null);
//		Company company2 = new Company(0,"Britannia",null);
//		Company company3 = new Company(0,"Parle",null);
//
//		session.save(company1);
//		session.save(company2);
//		session.save(company3);

//		--- Save Products ---

//		Product product1 = new Product(0,"Parle-G Biscuit", 10, new Company(3,null,null));
//		session.save(product1);

//		--- Companies Data ---

//		Query query = session.createQuery("from Company");
//		ArrayList<Company> companies = (ArrayList<Company>) query.list();
//
//		for (Company company : companies) {
//			System.out.println("---Company---");
//			System.out.println(company);
//			System.out.println("---Products---");
//			for (Product product: company.getProducts())
//				System.out.println(product);
//
//			System.out.println();
//		}

//		--- Products Data ---

		Query query = session.createQuery("from Product");
		ArrayList<Product> products = (ArrayList<Product>) query.list();

		for (Product product: products) {
			System.out.println("---Products---");
			System.out.println(product);
			System.out.println("---Company---");
			System.out.println(product.getCompany());
		}

//		Product p = (Product)session.createCriteria(Product.class)
//		.add(Restrictions.eq("productName", "Parachute Oil"))
//		.list().get(0);
//		
//		System.out.println(p);

		transaction.commit();
		session.close();
	}

}