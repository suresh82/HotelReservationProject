package com.wipro.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.entity.Customer;
import com.wipro.entity.Hotel;

@Repository
public class HotelDAOImpl implements HotelDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Hotel> getHotelDetails(String city, String hotelName, String date) {

		Session session = sessionFactory.getCurrentSession();
		/*		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery < Customer > cq = cb.createQuery(Customer.class);
		Root < Customer > root = cq.from(Customer.class);
		cq.select(root);*/
		String hql="from Hotel where city= :cty and hotelname=:hName and date=:dt";
		Query query = session.createQuery(hql);
		query.setParameter("cty", city);
		query.setParameter("hName", hotelName);
		query.setParameter("dt", date);
		return query.getResultList();
	}


	@Override
	public void saveCustomer(Customer theCustomer) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theCustomer);
	}

}
