package by.bsu.lab2.controller;

import by.bsu.lab2.dao.UserAccessor.Role;
import by.bsu.lab2.ui.InventoryForm;
import by.bsu.lab2.ui.LoginForm;
import by.bsu.lab2.ui.OrderForm;
import by.bsu.lab2.ui.RequestForm;

public class FormController {
	
	private InventoryForm invForm;
	private LoginForm loginForm;
	private OrderForm orderForm;
	private RequestForm reqForm;
	
	public FormController(InventoryForm inv, LoginForm login, OrderForm ord, RequestForm req) {
		this.invForm = inv;
		this.loginForm = login;
		this.orderForm = ord;
		this.reqForm = req;
	}
	
	public void showForm(Role role){
		if(role.name().equals("CLERK"))
		{
			reqForm.setVisible(true);
		}
		else
		{
			if(role.name().equals("MANAGER"))
			{
				invForm.setVisible(true);
			}
			else{
				if(role.name().equals("SALESMAN"))
				{
					orderForm.setVisible(true);
				}
			}
		}
		
	}
	public void hideEverything()
	{
		invForm.setVisible(false);
		loginForm.setVisible(false);
		orderForm.setVisible(false);
		reqForm.setVisible(false);
	}

}