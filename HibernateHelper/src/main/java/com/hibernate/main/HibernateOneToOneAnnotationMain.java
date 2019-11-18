package com.hibernate.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.hibernate.model.ExportManifest;
import com.hibernate.model.ExportManifestItem;
import com.hibernate.util.HibernateUtil;
import com.sun.org.apache.xml.internal.security.signature.Manifest;

public class HibernateOneToOneAnnotationMain {

	public static void main(String[] args) {

		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		try {
			// Get Session
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			System.out.println("Session created using annotations configuration");

			tx = session.beginTransaction();

			
			
			
			/*
			 * Query query = session.
			 * createQuery("select em.id, em.manifestNumber, emi.id from ExportManifest em inner join em.manifestItems as emi "
			 * ); //query.setFirstResult(0); query.setMaxResults(2); List<ExportManifest>
			 * List<Object[]> list = query.list();
			 */
			 
			 

			
			
			/*
			 * Query query =session.
			 * createQuery("select em.id, em.manifestNumber, emi.id from ExportManifest em inner join em.manifestItems as emi"
			 * ); List<Object[]> list = query.list();
			 */
			/*
			 * Query query = session.createQuery("from ExportManifest");
			 * 
			 * 
			 * Criteria criteria = session.createCriteria(ExportManifest.class);
			 * //criteria.addOrder(Order.desc("id"));
			 * //criteria.add(Restrictions.eq("manifestNumber", "160520GATEBS")); Criterion
			 * manifestNumber =Restrictions.like("manifestNumber", "%GAT%"); Criterion id =
			 * Restrictions.gt("id",10000); LogicalExpression orExp =
			 * Restrictions.and(manifestNumber, id); criteria.add( orExp );
			 * //criteria.setProjection(Projections.rowCount()); List<ExportManifest> list =
			 * criteria.list();
			 * //criteria.setProjection(Projections.distinct(Projections.countDistinct(
			 * "manifestNumber"))); //List disList = criteria.list();
			 */

			  //List<ExportManifest> list = query.list();
			
			
			/*
			 * for(Object[] o:list) { System.out.println("Id:"+o[0]);
			 * System.out.println("Manifest Number:"+o[1]);
			 * System.out.println("Items:"+o[2]); // System.out.println("ItemNumber:"+o[3]);
			 * }
			 */
			 
			
			/*
			 * for(ExportManifest o: list) {
			 * //System.out.println("Manifest:"+String.valueOf(o));
			 * System.out.println("Id:"+o.getId());
			 * System.out.println("Manifest Number:"+o.getManifestNumber());
			 * System.out.println("Item Id:"+ o.getManifestItems());
			 * 
			 * }
			 */
			 
			 
			 

			// System.out.println("Id:"+disList.get(0));

			// System.out.println("Manifest Number:"+em.getManifestNumber());

			
			
			
			
			  ExportManifest exportManifest
			  =(ExportManifest)session.get(ExportManifest.class, 10042);
			  if(exportManifest!=null) {
				  List<ExportManifestItem> items=exportManifest.getManifestItems();
			  
			  if(items!=null) {
			  
			  for ( Iterator<ExportManifestItem> iter = items.iterator();iter.hasNext(); )
			  { 
				  ExportManifestItem manifestItem = (ExportManifestItem) iter.next();
			  System.out.println("Id:"+manifestItem.getId());
			  System.out.println("Manifest Items:"+manifestItem.getManifestId().getId()); }
			  } 
			  }
			  
			  //session.evict(exportManifest);
			  System.out.println(session.contains(exportManifest));

			  ExportManifest exportManifest1
			  =(ExportManifest)session.get(ExportManifest.class, 10042);
			  if(exportManifest1!=null) {
				  List<ExportManifestItem> items=exportManifest1.getManifestItems();
			  
			  if(items!=null) {
			  
			  for ( Iterator<ExportManifestItem> iter = items.iterator();iter.hasNext(); )
			  { 
				  ExportManifestItem manifestItem = (ExportManifestItem) iter.next();
			  System.out.println("Id1:"+manifestItem.getId());
			  System.out.println("Manifest Items1:"+manifestItem.getManifestId().getId()); }
			  } 
			  }
			  
			 

			/*
			 * Iterator<Object> it = list.iterator(); while(it.hasNext()) { Object em =
			 * it.next();
			 * 
			 * if(em instanceof ExportManifest) {
			 * System.out.println("Manifest Id:"+((ExportManifest) em).getId()); } if(em
			 * instanceof ExportManifestItem) {
			 * System.out.println("Manifest Item Id:"+((ExportManifestItem) em).getId()); }
			 * System.out.println(); }
			 */
			tx.commit();

			System.out.println("Connection created");

		} catch (Exception e) {
			System.out.println("Exception occured. " + e.getMessage());
			e.printStackTrace();
		} finally {
			if (sessionFactory != null && !sessionFactory.isClosed()) {
				System.out.println("Closing SessionFactory");
				sessionFactory.close();
			}
		}
	}

}
