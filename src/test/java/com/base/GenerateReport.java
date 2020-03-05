package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateReport {
	
	public static void JVMReport(String jsonFile) {
		File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Report\\");
		Configuration con = new Configuration(loc,"Addacti Proiject");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Sprint No", "23");
		con.addClassifications("OS", "Windows 10 ");
		
		List<String>jsonFiles=new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder build = new ReportBuilder(jsonFiles,con);
		build.generateReports();
		

	}
	

}
