package com.bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.CustomerDetail;
import com.bank.serviceI.CustomerDetailI;

@RestController
public class CustomerDetailController {

	@Autowired
	private CustomerDetailI cd;

	@PostMapping("/addDetail")
	public CustomerDetail addcustomerdetail(@RequestBody CustomerDetail customerdetail) {
		return cd.addCustomerDetail(customerdetail);
	}

	@GetMapping("/getallDetail")
	public List<CustomerDetail> getalldeatils() {
		List<CustomerDetail> customerDetails = cd.getAllcustomer();
		return customerDetails;

	}

	@DeleteMapping("/deleteCustomerdetail/{customer_id}")
	public List<CustomerDetail> deletebyId(@PathVariable int customer_id) {
		cd.deletebyId(customer_id);
		List<CustomerDetail> clist = getalldeatils();

		return clist;
	}

	@PutMapping("/updateCustomer")
	public CustomerDetail updateCustomer(@RequestBody CustomerDetail customerDetail) {
		CustomerDetail cc = cd.updatecustomerdetail(customerDetail);
		return cc;

	}

}