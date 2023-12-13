package com.app.stepdefition;

import java.util.List;
import java.util.Map;

import com.app.pageexe.LoginPage_Exe;

import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class DataTableCucumber extends LoginPage_Exe{
	// asList
		/*@When("Enter the username as passing datatbale")
		public void enter_the_username_as_passing_datatbale(DataTable data) {
			List<String> asList = data.asList();
			System.out.println(asList.get(0));
			System.out.println(asList.get(2));
			
		    
		}*/
		//asLists
		/*@When("Enter the username as passing datatbale")
		public void enter_the_username_as_passing_datatbale(DataTable data) {
			List<List<String>> asLists = data.asLists();
			System.out.println(asLists.get(0).get(1));
			
		}*/
		//asMap
		@When("Enter the username as passing datatbale")
		public void enter_the_username_as_passing_datatbale1(DataTable data) {
			Map<String, String> asMap = data.asMap(String.class, String.class);
			LoginPage_Exe.studentReg("Email", asMap.get("Email"));
			LoginPage_Exe.studentReg("Name", asMap.get("Name"));
		}
			
		//asMaps
		@When("Enter the username as passing datatbale")
		public void enter_the_username_as_passing_datatbale(DataTable data) {
			List<Map<String,String>> asMaps = data.asMaps();
			System.out.println(asMaps.get(0).get("data1"));
			
			
			
		}

}
