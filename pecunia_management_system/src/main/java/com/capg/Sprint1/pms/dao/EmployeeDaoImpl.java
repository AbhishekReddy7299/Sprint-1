package com.capg.Sprint1.pms.dao;

import java.util.HashMap;
import java.util.Map;

import com.capg.Sprint1.pms.model.Account;

public class EmployeeDaoImpl implements EmployeeDao{
	public Map<Integer,Account>accountEntry;

	
	public Map<Integer,Account> getAccountDetails(){
		return accountEntry;
		
	}
	public EmployeeDaoImpl() {
		accountEntry  = new HashMap<>();
		
		Account account1 = new Account(123456789123L,"Achyuth",9989689510L,"hyderabad");
		accountEntry.put(1234, account1);
		Account account2 = new Account(123456789123L,"Achyuth",9989689510L,"hyderabad");
		accountEntry.put(1245,account2);
		Account account3 = new Account(123456789123L,"Achyuth",9989689510L,"hyderabad");
		accountEntry.put(16675, account3);
	    Account account4 = new Account(123456789123L,"Achyuth",9989689510L,"hyderabad");
	    accountEntry.put(10002, account4);
	
	}
	

	@Override
	public  boolean updateName(long id, String name) {
		if(!accountEntry.containsKey(id)) {
			return false;
		}
		Account nameToUpdate=accountEntry.get(id);
		nameToUpdate.setName(nameToUpdate.getName());
		 return true;
	}

	@Override
	public boolean updateContact(long id, long contact) {
		if(!accountEntry.containsKey(id)) {
			return false;
		}
		Account contactToUpdate=accountEntry.get(id);
		contactToUpdate.setContact(contactToUpdate.getContact());
		 return true;
		 
	}

	@Override
	public boolean updateAddress(long id, String address) {
		if(!accountEntry.containsKey(id)) {
			return false;
		}
		Account addressToUpdate=accountEntry.get(id);
		addressToUpdate.setAddress(addressToUpdate.getAddress());
		 return true;

	}

	@Override
	public boolean deleteAccount(long id) {
		if(!accountEntry.containsKey(id)) {
			return false;
		}
		Account contactToUpdate=accountEntry.get(id);
		contactToUpdate.setContact(contactToUpdate.getContact());
		 return true;
		 
		return null;
	}

}
