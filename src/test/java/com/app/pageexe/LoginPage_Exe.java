package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.LoginPage_Locators;


public class LoginPage_Exe extends LoginPage_Locators{
	
	public static void username(String username) {
		BaseClass.input_Data(LoginPage_Locators.getuser(), username);
	}
	
	public static void password(String password) {
		BaseClass.input_Data(LoginPage_Locators.getpass(), password);
	}
	
	public static void login_button() {
		BaseClass.click_Value(LoginPage_Locators.getlogin_Button());
	}
	public static void studentReg(String data1,String data2) {
		BaseClass.input_Data(LoginPage_Locators.getStudentReg(data1), data2);
	}

}
