package com.capg.Sprint1.pms.ui;
import java.util.Scanner;

import com.capg.Sprint1.pms.dao.AccountNotFoundException;
import com.capg.Sprint1.pms.dao.EmployeeDaoImpl;
import com.capg.Sprint1.pms.model.Account;
import com.capg.Sprint1.pms.service.EmployeeServices;
import com.capg.Sprint1.pms.service.EmployeeServicesImpl;
public class CustomerUI {

		public EmployeeServices service =  new EmployeeServicesImpl();
		
		public EmployeeServices getService() {
			
			return service;
		}
		public void showOptions() {
			System.out.println("Press 1 to update name");
			System.out.println("Press 2 to update contact");
			System.out.println("Press 3 to update address");
			System.out.println("Press 4 to delete account");
			System.out.println("Press 5 to exit");
		}

		public Integer getOption(Scanner scanner) {
			 try {
		            Integer option = scanner.nextInt();
		            return option;
		        } catch (Throwable e) {
		            e.printStackTrace();
		            return -1;
		        }
		}
		 public void choose() {
		        boolean run = true;
		        while (run) {
		            showOptions();
		            Scanner scanner = new Scanner(System.in);
		            int option = getOption(scanner);
		            if (option == -1) {
		                run = false;
		            }
		            switch(option) {
		            	case 1: {
		            			try {    				
			            			
			            				System.out.println("Enter account id");
				            			long id = scanner.nextInt();
			            				//If there's already an account on that Id
			            				if(getService().updateName(id, null) != null) {
			            					throw new RuntimeException("Found an account using this Id");
			            				}
			            				
			            				System.out.println("Enter Name: ");
			            				
			            				String name = scanner.next();
	
			            				String accountType = scanner.next();
			            				
			            				Account account = new Account(id,name, balance, accountType);
			            				
			            				account.setAcNo(acNo);;
			            					
			            				getService().createAccount(account);
			            				
			            				System.out.println("Created Account successfully");
			            				
										System.out.println("Account Holder name="+account.getName());
										System.out.println("Account Balance="+account.getBalance());
										System.out.println("Account type="+account.getAccountType());
			            				
			            				
										}
			            				catch(AccountNotFoundException e){
											System.out.println("Account creation failure"+ e);
										}
										break;
									
									
									
									}
									case 2: {
										try {
											System.out.println("Enter account id");
											Integer id = scanner.nextInt();
											System.out.println("Enter deposited amount");
											Double amount = scanner.nextDouble();
											Account account = service.depositAmount(id, amount);
											System.out.println("Money depoisted succesfully in your account");
											System.out.println("AMOUNT DEPOSITED IN ACCOUNT NAME="+ account.getName()+"Available balance="+account.getBalance()+" Account Type="+account.getAccountType());
										}catch(TransactionFailedException e) {
											System.out.println("Deposit could not completed because of entered amount is either 0 or less than 0");
											
										}catch(AccountNotFoundException e) {
											System.out.println("Account Not Found for depositing amount");
										}
										
										
										break;
									}
									 
									
									case 3: {
										try {
											System.out.println("Enter account id");
											Integer id = scanner.nextInt();
											System.out.println("Enter amount for withdrawing");
											Double amount = scanner.nextDouble();
											Account account = service.withdrawAmount(id, amount);
											System.out.println("Money withdrawn succesfully in your account");
											System.out.println("AMOUNT WITHDRWAN IN ACCOUNT NAME="+ account.getName()+"Available balance="+account.getBalance()+"Account Type="+account.getAccountType());
										}catch(TransactionFailedException e) {
											System.out.println("Insufficient balance failed to withdraw");
											
										}catch(AccountNotFoundException e) {
											System.out.println("Account Not Found For Withdrawing amount");
										}
										
										
										break;
									}
									
									case 4:
									{
										try {
//											
											System.out.println("Enter account id1");
											Integer id1 = scanner.nextInt();
					                        Account account1 = service.getAccount(id1);
											System.out.println("Enter amount for transfer");
											Double amount = scanner.nextDouble();
											System.out.println("Enter account id2");
											Integer id2 = scanner.nextInt();
											
											Account account2 = service.getAccount(id2);
											service.FundTransfer(id1,id2,amount);
											
											System.out.println("Money from transfer to account="+account1.getName()+"of amount="+account1.getBalance()+"AccountType="+account1.getAccountType());
											
											
											System.out.println("Money transfered done to account="+account2.getName()+"of amount="+account2.getBalance()+"AccountType="+account2.getAccountType());
//										
										}catch(AccountNotFoundException e) {
											System.out.println("account not found for depositing");
											
										}catch(TransactionFailedException e) {
											System.out.println("Cannot Transfer amount because of less balance");
										}
									break;
									
									}
									case 5: {
										try {
											System.out.println("Enter account id");
											Integer id = scanner.nextInt();
											Double balance = service.ShowBalance(id);
											System.out.println("Current Balance="+balance);
											
										}catch(AccountNotFoundException e) {
											System.out.println("account not found for depositing");
											
										}
									break;
									
									
									}
									
								default: {
										run = false;
										
				  }
									 
			  }
		  }
		        
	}
		                        public static void main(String[] args) {
		                         MainUI main  =  new MainUI();
		                           main.choose();
		     	}
		    	
	       }
		        
		

