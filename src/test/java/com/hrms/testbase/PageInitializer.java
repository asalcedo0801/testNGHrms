package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashBoardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;

public class PageInitializer extends BaseClass{
		
		public static LoginPageElements login;
		public static AddEmployeePageElements addEmp;
		public static DashBoardPageElements dashboard;
		public static PersonalDetailsPageElements pDetails;

		public static void initialize() {
			
			login = new LoginPageElements();
			dashboard = new DashBoardPageElements ();
			addEmp= new AddEmployeePageElements();
			pDetails = new PersonalDetailsPageElements();
		}
}
