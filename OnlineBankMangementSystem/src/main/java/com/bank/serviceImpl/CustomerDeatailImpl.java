package com.bank.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.CustomerDetail;
import com.bank.repositry.CustomerDeatilRepositry;
import com.bank.serviceI.CustomerDetailI;

@Service
public class CustomerDeatailImpl implements CustomerDetailI {

	@Autowired
	private CustomerDeatilRepositry cdrepo;

	@Override
	public CustomerDetail addCustomerDetail(CustomerDetail customerdeatil) {
		return cdrepo.save(customerdeatil);

	}

	@Override
	public List<CustomerDetail> getAllcustomer() {
		return cdrepo.findAll();

	}

	@Override
	public List<CustomerDetail> deletebyId(int Customer_id) {
		cdrepo.deleteById(Customer_id);
		List<CustomerDetail> clist = getAllcustomer();
		return clist;
	}

	@Override
	public CustomerDetail updatecustomerdetail(CustomerDetail customerDetail) {
		return cdrepo.save(customerDetail);

	}

}
