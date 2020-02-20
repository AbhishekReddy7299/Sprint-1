package com.capg.Sprint1.pms.dao;

import com.capg.Sprint1.pms.model.Account;

public interface EmployeeDao {
	  boolean updateName(long id,String name);
	  
	  boolean updateContact(long id,long contact);

	  boolean updateAddress(long id,String address);
	  
	  boolean deleteAccount(long id);

}
