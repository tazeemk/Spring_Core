package com.nt.sbeans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.ToString;
@PropertySource(value="com/nt/commons/info1.properties")
@Component("emp")
@ToString
public class Employee 
{
	
	//values given through properties files
    @Value("101")
	private Integer empid;
    @Value("${per.name}")
	private String empName;
    @Value("${per.sal}")
	private Integer empSal;
    @Value("${per.dept}")
	private String deptno;
	@Value("${per.age}")
	private Integer empAge;
	@Value("${per.email}")
	private String email;
	
	
	//values given through system variable 
	@Value("${os.name}")
	private String osName;
	@Value("${os.user}")
	private String uname;
	
	@Value("${java.version}")
	private String java_Version;
	@Value("${java.runtime.version}")
	private String java_runtime_Version;
	
	
//	===================================================
	
		//values given through eniv variables
	
	 //@Value("${Path}") private String ph;
	 @Value("${user.name}")
	 private String usname;
	 @Value("${user.home}")
	private String userhome;
    @Value("${per.lelo}")
private List<String>list;

}
