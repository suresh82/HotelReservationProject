package com.wipro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.dao.HotelDAO;
import com.wipro.entity.Customer;
import com.wipro.entity.Hotel;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private HotelDAO hotelDAO;

	@Override
	@Transactional
	public List <Hotel> getHotelDetails(String city, String hotel, String date) {

		return hotelDAO.getHotelDetails(city,hotel,date);
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		hotelDAO.saveCustomer(theCustomer);
	}

}
