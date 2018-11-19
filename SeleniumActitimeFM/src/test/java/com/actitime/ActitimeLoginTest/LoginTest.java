package com.actitime.ActitimeLoginTest;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;

public class LoginTest extends BaseClass{
@Test	
public void ActitimeLoginTest()
{
System.out.println("LoginTest");
//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver=new FirefoxDriver();
driver.get("http://localhost/login.do");
driver.close();
}
}
