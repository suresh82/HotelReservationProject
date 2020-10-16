package com.wipro.dao;

import java.util.List;

import com.wipro.entity.Customer;
import com.wipro.entity.Hotel;

public interface HotelDAO {

    public List <Hotel> getHotelDetails(String city, String hotel, String date);

    public void saveCustomer(Customer theCustomer);

}
