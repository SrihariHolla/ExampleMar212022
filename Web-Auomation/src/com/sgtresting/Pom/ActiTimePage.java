package com.sgtresting.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this );
	}

	//username Text field
	private WebElement username;
	public WebElement getusername()
	{
		return username;
	}

	//paswword text field
	private WebElement pwd;
	public WebElement getpwd()
	{
		return pwd;
	}
	//login button.
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
	public WebElement getlogin()
	{
		return login;
	}
	//minimizeflyoutwindow()

	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getminimizeflyoutwindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//logout text field

	private WebElement logoutLink;
	public WebElement getlogout()
	{
		return logoutLink;
	}
	//usericon
	@FindBy(xpath="	//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
	private WebElement usericon;
	public WebElement getAddusericon()
	{
		return usericon;
	}
	//AdduserButton

	@FindBy(xpath="//*[@id=\"createUserDiv\"]/div")
	private WebElement AdduserButton;
	public WebElement getAdduserButton()
	{
		return AdduserButton;
	}
	//firstName field
	private WebElement firstName;
	public WebElement getfirstName()
	{
		return firstName;
	}
	//lastName
	private WebElement lastName;
	public WebElement getlastName()
	{
		return lastName;
	}
	//email
	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}
	//userDataLightBox_usernameField
	private WebElement userDataLightBox_usernameField;
	public WebElement getusernameField()
	{
		return userDataLightBox_usernameField;
	}
	//password
	private WebElement password;
	public WebElement getpassword()
	{
		return password;
	}
	//passwordCopy
	private WebElement passwordCopy;
	public WebElement getpasswordCopy()
	{
		return passwordCopy;
	}

	//createUser button
	private WebElement userDataLightBox_commitBtn;
	public WebElement getCreateUser()
	{
		return userDataLightBox_commitBtn;
	}
	//userlist field
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")
	private WebElement userlist;
	public WebElement getuserlist()
	{
		return userlist;
	}
	//deleteuser

	@FindBy(xpath="//*[@id=\"userDataLightBox_accountInformationSection\"]/div[2]")
	private WebElement deleteuser;
	public WebElement getdeleteuser()
	{
		return deleteuser;
	}

	//savechanges

	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement saveChanges;
	public WebElement getsaveChanges()
	{
		return saveChanges;
	}
	//taskicon
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")
	private WebElement taskicon;
	public WebElement gettaskicon()
	{
		return taskicon;
	}
	//Addnew icon
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div")
	private WebElement Addnew;
	public WebElement getAddnew()
	{
		return Addnew;
	}
	//NewCustomer icon
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement NewCustomer;
	public WebElement getNewCustomer()
	{
		return NewCustomer;
	}
	//customername field
	private WebElement customerLightBox_nameField;
	public WebElement getcustomerLightBox_nameField()
	{
		return customerLightBox_nameField;
	}

	//CreateCustomer 
	private WebElement customerLightBox_commitBtn;
	public WebElement getcustomerLightBox_commitBtn()
	{
		return customerLightBox_commitBtn;
	}

	//customersetting
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement customersetting;
	public WebElement getcustomersetting()
	{
		return customersetting;
	}
	//customeraction
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")
	private WebElement customeraction;
	public WebElement getcustomeraction()
	{
		return customeraction;
	}

	//customerDelete
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement customerDelete;
	public WebElement getcustomerDelete()
	{
		return customerDelete;
	}
	//customerDeletePermanently
	@FindBy(xpath="//*[@id='customerPanel_deleteConfirm_submitBtn']/div")
	private WebElement customerDeletePermanently;
	public WebElement getcustomerDeletePermanently()
	{
		return customerDeletePermanently;
	}

	//CustomerNameModify

	@FindBy(xpath="	//*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement CustomerNameModify;
	public WebElement getCustomerNameModify()
	{
		return CustomerNameModify;
	}
	//customerNameinput
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement customerNameinput;
	public WebElement getcustomerNameinput()
	{
		return customerNameinput;
	}
	//newProject

	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement newProject;
	public WebElement getnewProject()
	{
		return newProject;
	}
	//ProjectName
	private WebElement projectPopup_projectNameField;
	public WebElement getProjectName()
	{
		return projectPopup_projectNameField;
	}
	//createProject
	private WebElement projectPopup_commitBtn;
	public WebElement getcreateProject()
	{
		return projectPopup_commitBtn;
	}
	//ProjectSetting
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement ProjectSetting;
	public WebElement getProjectSetting()
	{
		return ProjectSetting;
	}
	//ProjectAction
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement ProjectAction;
	public WebElement getProjectAction()
	{
		return ProjectAction;
	}
	//ProjectDelete
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement ProjectDelete;
	public WebElement getProjectDelete()
	{
		return ProjectDelete;
	}
	//ProjectDeletePermanently
	@FindBy(xpath="//*[@id='projectPanel_deleteConfirm_submitBtn']/div")
	private WebElement ProjectDeletePermanently;
	public WebElement getProjectDeletePermanently()
	{
		return ProjectDeletePermanently;
	}



	//ProjectModify
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[1]")
	private WebElement ProjectModify;
	public WebElement getProjectModify()
	{
		return ProjectModify;
	}
	//ProjectModifyName
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement ProjectModifyName;
	public WebElement getProjectModifyName()
	{
		return ProjectModifyName;
	}
	//Projectclose
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[1]")
	private WebElement Projectclose;
	public WebElement getProjectclose()
	{
		return Projectclose;
	}
	//AddNewTask
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div")
	private WebElement AddNewTask;
	public WebElement getAddNewTask()
	{
		return AddNewTask;
	}
	//CreateNewTask
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement CreateNewTask;
	public WebElement getCreateNewTaskk()
	{
		return CreateNewTask;
	}
	//Tasknamefield
	@FindBy(xpath="//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")
	private WebElement Tasknamefield;
	public WebElement getTasknamefield()
	{
		return Tasknamefield;
	}
	//createTaskButton
	private WebElement createTasksPopup_commitBtn;
	public WebElement getcreateTaskButton()
	{
		return createTasksPopup_commitBtn;
	}
	//Tasklist
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")
	private WebElement Tasklist;
	public WebElement getTasklist()
	{
		return Tasklist;
	}
	//TaskAction
	@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div")
	private WebElement TaskAction;
	public WebElement getTaskAction()
	{
		return TaskAction;
	}
	//TaskDelete
	@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div")
	private WebElement TaskDelete;
	public WebElement getTaskDelete()
	{
		return TaskDelete;
	}
	//TaskDeletePermanently
	@FindBy(xpath="//*[@id='taskPanel_deleteConfirm_submitBtn']/div")
	private WebElement TaskDeletePermanently;
	public WebElement getTaskDeletePermanently()
	{
		return TaskDeletePermanently;
	}
	//ExpolreActitime
	@FindBy(xpath="//*[@id='welcomeScreenBoxId']/div[3]/div")
	private WebElement ExpolreActitime;
	public WebElement getExpolreActitime()
	{
		return ExpolreActitime;
	}
	//Userlist2
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table")
	private WebElement Userlist2;
	public WebElement getUserlist2()
	{
		return Userlist2;
	}
	//Userlist3
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[4]/td[1]/table")
	private WebElement Userlist3;
	public WebElement getUserlist3()
	{
		return Userlist3;
	}
	//deleteuser2
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]")
	private WebElement deleteuser2;
	public WebElement getdeleteuser2()
	{
		return deleteuser2;
	}
	//deleteuser3
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]")
	private WebElement deleteuser3;
	public WebElement getdeleteuser3()
	{
		return deleteuser3;
	}
	//deleteuser1
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table")
	private WebElement deleteuser1;
	public WebElement getdeleteuser1()
	{
		return deleteuser3;
	}
}
