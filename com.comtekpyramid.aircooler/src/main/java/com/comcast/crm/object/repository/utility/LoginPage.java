package com.comcast.crm.object.repository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Tushar
 * Login page reletad Elements are present
 * 1:username textfield
 * 2:password textfield
 * 3:login button
 * login business Utility method present
 * 
 */
public class LoginPage {
	//initialization
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	//declaration
		
	@FindBy(name = "user_name")
	private WebElement userNameTextField;
	
	@FindBy(name = "user_password")
	private WebElement passwordTextField;
	
	@FindBy(id = "submitButton")
	private WebElement loginBtn;
	
	//utilization
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void login(String userName,String passWord)
	{
		userNameTextField.sendKeys(userName);
		passwordTextField.sendKeys(passWord);
		loginBtn.click();
	}




}
