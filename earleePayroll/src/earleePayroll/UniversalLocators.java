package earleePayroll;

import org.openqa.selenium.By;

public class UniversalLocators {
	public static final String URL = "https://earleepayroll.com/signin";
	public static final String emailAddress_creds = "kalawjerome1105@gmail.com";
	public static final String password_creds = "12345678";
	
	//Login 
	public static final By EMAIL = By.id("email1"); //email field
	public static final By PASSWORD = By.id("password1"); //email field
	public static final By LOGIN = By.xpath("//span[contains(text(), 'Log In')]");
	
	
	//My Organization Section
	public static final String companyName1 = "LibroLite";
	public static final String companyOwner1 = "Sample Owner";
	public static final String companyEmail1 = "sample@abc.com";
	public static final String companyContact1 = "11122233344";
	public static final String companyWebsite1 = "sample.com";
	public static final String foundingDate1 = "02/13/2025";
	public static final String companyAddress1 = "123 Example Village";
	public static final String companyCity1 = "Sample City";
	public static final String companyZipCode1 = "1234";
	public static final String companyRegion1 = "Sample Region";
	public static final String companyCountry1 = "Sample Country";
	public static final By companyIndustry1 = By.xpath("//*[@id=\"pr_id_31_list\"]/p-dropdownitem[3]/li");
	public static final By companyOrgType1 = By.xpath("//*[@id=\"pr_id_30_list\"]/p-dropdownitem[5]/li");
	
	public static final By MY_ORG_BUTTON = By.xpath("//div[contains(text(), 'My Organization')]");
	public static final By EDIT_MY_ORG_BUTTON = By.xpath("//span[contains(text(), 'Edit My Organization')]");
	public static final By companyName = By.xpath("//input[contains(@class, 'p-inputtext') and @formcontrolname='companyName']\r\n" + "");
	public static final By companyOwner = By.xpath("//input[contains(@class, 'p-inputtext') and @formcontrolname='companyOwner']\r\n"	+ "");
	public static final By companyEmail = By.xpath("//input[contains(@class, 'p-inputtext') and @formcontrolname='email']\r\n" + "");
	public static final By companyIndustry = By.id("pr_id_31_label");
	public static final By companyContact = By.xpath("//input[contains(@class, 'p-inputtext') and @formcontrolname='phoneNumber']\r\n" + "");
	public static final By companyOrgType = By.id("pr_id_30_label");
	public static final By companyWebsite = By.xpath("//input[contains(@class, 'p-inputtext') and @formcontrolname='website']\r\n" + "");
	public static final By foundingDate = By.xpath("//p-calendar[@formcontrolname='foundingDate']//input");
	public static final By companyAddress = By.xpath("//input[contains(@class, 'p-inputtext') and @formcontrolname='address']\r\n" + "");
	public static final By companyCity = By.xpath("//input[contains(@class, 'p-inputtext') and @formcontrolname='city']\r\n" + "");
	public static final By companyZipCode = By.xpath("//input[contains(@class, 'p-inputtext') and @formcontrolname='zipCode']\r\n" + "");
	public static final By companyRegion = By.xpath("//input[contains(@class, 'p-inputtext') and @formcontrolname='region']\r\n" + "");
	public static final By companyCountry = By.xpath("//input[contains(@class, 'p-inputtext') and @formcontrolname='country']\r\n" + "");
	public static final By SUBMIT = By.xpath("//button[.//span[text()='Submit']]");
	
	//My employees section
    public static final String TEMP_MAIL_URL = "https://temp-mail.io/en";
    public static final By TEMP_EMAIL_FIELD = By.id("email");
    public static final String FIRST_NAME_MEMBER = "Sheldon";
    public static final String LAST_NAME_MEMBER = "Cooper";
    public static final String ADDRESS_VAL = "123 Street, City";
    public static final String MOBILE_NUMBER_VAL = "09123456789";
    public static final String HEIGHT_VAL = "175";
    public static final String WEIGHT_VAL = "75";
    public static final String ZIP_CODE_VAL = "1234";
    public static final String AGE_VAL = "25";
    public static final String HIRE_DAY = "03/01/2025";
    public static final String BIRTHDAY = "12/25/1998";
    public static final String position = "Software Engineer";
    public static final String department = "IT Department";
    public static final String reportsTo = "Manager Doe";
    public static final String salary = "50000";
    public static final String employmentFrom = "01/01/2023";
    public static final String employmentTo = "12/31/2023";
    
 // Government details
    public static final String sssNumber = "1234567890";
    public static final String birNumber = "987654321";
    public static final String taxNumber = "654321987011";
    public static final String philHealthNumber = "1029384756";
    public static final String hfdmNumber = "0192837465";
    public static final String prcLicenseNumber = "5678901234";
    public static final String voterIdNumber = "A1234567";
    public static final String passportNumber = "P987654321";

    // Bank details
    public static final String bankName = "Bank of Testing";
    public static final String accountName = "Sheldon Cooper";
    public static final String accountNumber = "123456789012";

    // Emergency contact details
    public static final String fullName = "Missy Cooper";
    public static final String relationship = "Sister";
    public static final String mobileNumber = "09987654321";
    public static final String address = "123 Testing Street";
  //Team Member Locators
    public static final By TEAM = By.xpath("//div[contains(text(), 'Teams')]");
    public static final By MEMBER = By.xpath("//div[contains(text(),'Members')]");
    public static final By ADDMEMBER = By.xpath("//span[contains(@class, 'p-button-icon') and contains(@class, 'pi-plus')]");
    public static final By FIRST_NAME_MEMBER1 = By.id("firstName");
    public static final By LAST_NAME_MEMBER1 = By.id("lastName");
    public static final By GENDER = By.xpath("//span[text()='Select Gender']");
    public static final By GENDER_OPTION = By.xpath("//li[normalize-space()='Male']"); 
    public static final By EMAIL_MEMBER = By.id("email");
    public static final By SAVE_MEMBER_BUTTON = By.xpath("//span[text()='Save']");
    
    public static final By SEARCH = By.xpath("//input[@placeholder='Search']");
    public static final By SEARCH_NAME = By.xpath("(//div[contains(@class, 'group-list-item')])[1]");
    public static final By COMPLETE_BASIC_INFO = By.xpath("//strong[text()='Complete Employee Basic Info']");
    public static final By EMPLOYEE_DETAILS_TAB = By.xpath("//span[text()='Employee Details']");
    public static final By EMPLOYEE_DETAILS_EDIT = By.xpath("//button[span[text()='Edit details']]");
    
    
    public static final By HIRE_DATE1 = By.xpath("//p-calendar[contains(@class, 'ng-tns-c5-55')]//input[contains(@class, 'p-inputtext')]");
    public static final By BIRTHDATE1 = By.xpath("//p-calendar[contains(@class, 'ng-tns-c5-56')]//input[contains(@class, 'p-inputtext')]");
    static final By EMPLOYMENT_FROM1 = By.xpath("//span[contains(@class, 'ng-tns-c5-61 p-calendar')]//input");
    public static final By EMPLOYMENT_TO1 = By.xpath("//span[contains(@class, 'ng-tns-c5-62 p-calendar')]//input");
    
    
    public static final By HIRE_DATE = By.xpath("/html/body/p-dynamicdialog/div/div/div[2]/app-add-members-form/section/div[1]/div[2]/app-add-members-overview-form/form/div/div[4]/app-date-picker/form/div/p-calendar/span/input");
    public static final By MOBILE_NUMBER = By.id("mobileNo");
    public static final By BIRTHDATE = By.xpath("/html/body/p-dynamicdialog/div/div/div[2]/app-add-members-form/section/div[1]/div[2]/app-add-members-overview-form/form/div/div[7]/app-date-picker/form/div/p-calendar/span/input");
    public static final By ADDRESS = By.id("address");
    public static final By CIVIL_STATUS =  By.xpath("//span[text()='Select Civil Status']");
    public static final By CS_OPTION = By.xpath("//div[contains(@class, 'p-element') and normalize-space()='Single']");
    public static final By HEIGHT = By.id("height");
    public static final By WEIGHT = By.id("weight");
    public static final By ZIP_CODE = By.id("zipCode");
    public static final By AGE = By.id("age");
    public static final By NEXT_BUTTON = By.xpath("//span[text()='Next']");
    
    public static final By POSITION = By.id("position");
    public static final By DEPARTMENT = By.id("department");
    public static final By REPORTS_TO = By.id("reportsTo");
    public static final By PAYPERIOD = By.xpath("//span[text()='Select Pay Period']");
    public static final By PAYPERIOD_opt = By.xpath("//div[contains(@class, 'p-element') and normalize-space()='Daily']");
    public static final By CUTOFF = By.id("pr_id_177_label");
    public static final By SALARY = By.id("salary");
    public static final By EMPLOYMENT_FROM = By.xpath("/html/body/p-dynamicdialog/div/div/div[2]/app-add-members-form/section/div[1]/div[2]/app-add-members-compensation-form/form/div[2]/div[1]/app-date-picker/form/div/p-calendar/span/input");
    public static final By EMPLOYMENT_TO = By.xpath("/html/body/p-dynamicdialog/div/div/div[2]/app-add-members-form/section/div[1]/div[2]/app-add-members-compensation-form/form/div[2]/div[2]/app-date-picker/form/div/p-calendar/span/input");
    public static final By REGION = By.xpath("//span[contains(@class, 'p-dropdown-label') and normalize-space()='Select Region']");
    public static final By REGION_opt =  By.xpath("//div[contains(@class, 'p-element') and normalize-space()='NCR']");
    public static final By STATUS = By.xpath("//span[text()='Select Status']");
    public static final By STATUS_opt =  By.xpath("//div[contains(@class, 'p-element') and normalize-space()='Casual']");
    
    public static final By SSS_NUMBER = By.id("sssNo");
    public static final By BIR_NUMBER = By.id("birNo");
    public static final By TAX_NUMBER = By.id("taxIdNo");
    public static final By PHILHEALTH_NUMBER = By.id("philhealthNo");
    public static final By HFDM_NUMBER = By.id("hdmfNo");
    public static final By PRCLICENSE_NUMBER = By.id("prcLicenseNo");
    public static final By VOTER_ID_NUMBER = By.id("voterIDNo");
    public static final By PASSPORT_NUMBER = By.id("phPassportIdNo");
    
    
    public static final By BANK_NAME = By.id("bankName");
    public static final By ACC_NAME = By.id("accountName");
    public static final By ACC_NUMBER = By.id("accountNumber");
    
    public static final By FULLNAME = By.id("fullName");
    public static final By RELATIONSHIP = By.id("relationship");
    public static final By MOBILENUMBER = By.id("cellphone");
    public static final By ADDRESS1 = By.id("address");
    public static final By SAVE_BUTTON = By.xpath("//button[span[text()='Save']]"); 
    
    // Leave
    public static final By EMPLOYEELEAVE_TAB = By.xpath(" //a[span[text()='Employee Leave']]"); 
    public static final By ADDING_LEAVE = By.xpath("//button[span[text()='Add Leave']]"); 
    public static final By LEAVETYPE = By.xpath("//span[text()='Select Leave Type']"); 
    public static final By LEAVE_TYPE_OPT = By.xpath("//li[normalize-space()='Sick Leave']"); 
    public static final By LEAVENUMBER = By.xpath("//input[@formcontrolname='numberOfleave']");
    public static final By LEAVEBALANCE = By.xpath("//input[@formcontrolname='leaveBalance']");
    public static final String leaveNumber = "5";
    public static final String leaveBalance = "10";
}