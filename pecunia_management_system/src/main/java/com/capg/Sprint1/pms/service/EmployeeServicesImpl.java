package com.capg.Sprint1.pms.service;

import com.capg.Sprint1.pms.dao.EmployeeDao;
import com.capg.Sprint1.pms.dao.EmployeeDaoImpl;
import com.capg.Sprint1.pms.model.Account;

public class EmployeeServicesImpl implements EmployeeServices{
	EmployeeDao ed=new EmployeeDaoImpl();
	public EmployeeDao dao;
	
		public EmployeeDao  getDao() {
			return dao;
		
		}
	
		public void AccountService(EmployeeDao dao) {
			this.dao= dao;
		}

	

	@Override
	public Account updateName(long id, String name) {
		// TODO Auto-generated method stub
		return ed.updateName(id, name);
	}

	@Override
	public Account updateContact(long id, long contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account updateAddress(long id, String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account deleteAccount(long id) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Account getAccount(Integer id) {
//		
//		return null;
//	}

}
