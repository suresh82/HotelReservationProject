package com.wipro.controller;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.entity.Customer;
import com.wipro.entity.Hotel;
import com.wipro.service.CustomerService;

@Controller
//@RequestMapping("/customer")
public class HotelController {

	@Autowired
	private CustomerService customerService;
	private String hotelName;


	@RequestMapping("/")
	public String test() {
		return "index";
	}

	@RequestMapping("/hotelStatus")
	public ModelAndView getHotelAvailability(HttpServletRequest request, HttpServletResponse response) {

		String city=(String) request.getParameter("City");
		String hotel=(String) request.getParameter("Hotel");
		String date=(String) request.getParameter("Date");
		hotelName=hotel;

		List<Hotel> hotels= customerService.getHotelDetails(city,hotel,date);
		ModelAndView modelView = new ModelAndView();

		if(!hotels.isEmpty()) {

			System.out.println("Query fetched the results: "+hotels.get(0).getRoomType());
			modelView.addObject("RoomType",hotels.get(0).getRoomType());
			modelView.addObject("Price",hotels.get(0).getPrice());
			modelView.addObject("GST",hotels.get(0).getGST());
			modelView.addObject("TotalPrice",Double.parseDouble(hotels.get(0).getPrice())+Double.parseDouble(hotels.get(0).getGST()));
			modelView.setViewName("HotelAvailable");

		} else {

			modelView.setViewName("HotelUnavailable");
		}
		return modelView;
	}

	@RequestMapping(value="/custReservation", params= "confirm")
	public String custReservationForm(Model theModel) {

		return "Reservation";
	}

	@RequestMapping(value="/custReservation", params= "back")
	public String showHotelMainScreen() {

		return "index";
	}


	@RequestMapping("/saveCustomer")
	public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer) {

		/*		Random rand = new Random();
		customer.setId(rand.nextInt(1000));*/
		customerService.saveCustomer(customer);

		ModelAndView mav = new ModelAndView();
		mav.addObject("Customer",customer.getName());
		mav.addObject("HotelName",hotelName);
		mav.setViewName("SuccReservation");

		return mav;
	}

}
