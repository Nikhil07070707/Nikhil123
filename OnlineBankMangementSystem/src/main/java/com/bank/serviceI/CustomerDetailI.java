package com.bank.serviceI;

import java.util.List;

import com.bank.model.CustomerDetail;

public interface CustomerDetailI {

	public CustomerDetail addCustomerDetail(CustomerDetail customerdeatil);

	public List<CustomerDetail> getAllcustomer();

	public List<CustomerDetail> deletebyId(int Customer_id);

	public CustomerDetail updatecustomerdetail(CustomerDetail customerDetail);
}
