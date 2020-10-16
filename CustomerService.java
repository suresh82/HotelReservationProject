package com.wipro.service;

import java.util.List;

import com.wipro.entity.Customer;
import com.wipro.entity.Hotel;

public interface CustomerService {

	public List <Hotel> getHotelDetails(String city, String hotel, String date);

	public void saveCustomer(Customer theCustomer);

}
