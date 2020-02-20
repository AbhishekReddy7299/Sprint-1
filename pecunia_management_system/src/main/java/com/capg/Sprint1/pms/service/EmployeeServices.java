package com.capg.Sprint1.pms.service;

import com.capg.Sprint1.pms.model.Account;

public interface EmployeeServices {
	
	  
	  Account updateName(long id,String name);
	  
	  Account updateContact(long id,long contact);

	  Account updateAddress(long id,String address);
	  
	  Account deleteAccount(long id);
	  
	 // Account getAccount(Integer id);
	  

}
