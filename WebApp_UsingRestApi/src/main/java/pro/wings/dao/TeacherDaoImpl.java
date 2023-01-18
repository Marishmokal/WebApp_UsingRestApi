package pro.wings.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pro.wings.model.Teacher;

@Repository
public class TeacherDaoImpl implements TeacherDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void createTeacher(Teacher teacher) {
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		session.save(teacher);
		txn.commit();
		session.close();
		
		
	}

	@Override
	public void deleteTeacher(int id) {
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		Teacher t=session.get(Teacher.class, id);
		session.delete(t);
		txn.commit();
		session.close();
		
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		session.saveOrUpdate(teacher);
		txn.commit();
		session.close();
		
	}

	@Override
	public List<Teacher> getTeacher() {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		List<Teacher> teacherList = null;
		try {

			tx = session.beginTransaction();
			Query<Teacher> query = session.createQuery("from Teacher");
			teacherList = query.list();
			
			tx.commit();

		} catch (HibernateException ex) {
			if (tx != null) {
				tx.rollback();
			}
			System.out.println("Exception: " + ex.getMessage());
			ex.printStackTrace(System.err);
		} 
		finally 
		{
			session.close();
			return teacherList;
		}
	}

	@Override
	public Teacher getTeacher(int id) {
		
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		Teacher t=session.get(Teacher.class, id);
	//	session.save(t);
		txn.commit();
		session.close();
		return t;
	}

	@Override
	public List<Teacher> getAllTeacher(long phone) {
		Session session=sessionFactory.openSession();
		Transaction txn= txn=session.beginTransaction();
		 javax.persistence.Query query=session.createQuery(" from Teacher t where t.phone.phone= :phone");
		 List<Teacher>t1=query.setParameter("phone",phone ).getResultList();
		txn.commit();
		return t1;
		
	}		
}
