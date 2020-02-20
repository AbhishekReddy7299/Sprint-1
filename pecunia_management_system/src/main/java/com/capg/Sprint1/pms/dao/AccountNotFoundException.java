package com.capg.Sprint1.pms.dao;

public class AccountNotFoundException extends RuntimeException{
    public AccountNotFoundException(String msge) {
    	super(msge);
    	
    }
}