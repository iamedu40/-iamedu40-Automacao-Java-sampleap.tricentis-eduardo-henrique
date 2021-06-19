package pagina.web.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.edsoft.framework.base.web.BasePaginaWeb;
import com.edsoft.framework.base.web.DriverContextWeb;


public class HomePage extends BasePaginaWeb {
	
	
	
	
	@FindBy(how = How.ID, using = "make")
	public WebElement selectMake;

	@FindBy(how = How.ID, using = "model")
	public WebElement selectModel;
	
	@FindBy(how = How.ID, using = "cylindercapacity")
	public WebElement enterTextCylindercapacity;
	
	@FindBy(how = How.ID, using = "engineperformance")
	public WebElement enterTextEngineperformance;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"opendateofmanufacturecalender\"]/i")
	public WebElement clickDate;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[3]/a")
	public WebElement clickDate2;
	
	@FindBy(how = How.ID, using = "numberofseats")
	public WebElement selectNumberofseats; 
//	(selec)1
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span")
	public WebElement clickRighthanddriveyes; 

	@FindBy(how = How.ID, using = "numberofseatsmotorcycle")
	public WebElement selectNumberofseatsmotorcycle; 

	@FindBy(how = How.ID, using = "fuel")
	public WebElement selectfuel; 
//	(select)Petrol
	
	@FindBy(how = How.ID, using = "payload")
	public WebElement enterTextpayload; 
//	payload()1
	
	@FindBy(how = How.ID, using = "totalweight")
	public WebElement enterTextTotalweight; 
//	()120

	@FindBy(how = How.ID, using = "listprice")
	public WebElement enterTextlistprice; 
//	()501
	
	@FindBy(how = How.ID, using = "licenseplatenumber")
	public WebElement enterTextLicenseplatenumber;
	
	
	@FindBy(how = How.ID, using = "annualmileage")
	public WebElement enterTextAnnualmileage;
//	()201
	
	@FindBy(how = How.ID, using = "nextenterinsurantdata")
	public WebElement clickNextenterinsurantdata;
	
	
	
	public HomePage preencherVehicel(
			String Make, 
			String Model,
			String Cylindercapacity,
			String Engineperformance,
			String Numberofseats,
			String Numberofseatsmotorcycle,
			String fuel,
			String payload,
			String Totalweight,
			String listprice,
			String Licenseplatenumber,
			String Annualmileage
			) throws Exception {
		
		
		DriverContextWeb.selectElementByVisibleText(selectMake, Make);
		DriverContextWeb.selectElementByVisibleText(selectModel, Model);
		DriverContextWeb.WaitForElementVisible(enterTextCylindercapacity);
		enterTextCylindercapacity.sendKeys(Cylindercapacity);
		DriverContextWeb.WaitForElementVisible(enterTextEngineperformance);
		enterTextEngineperformance.sendKeys(Cylindercapacity);
		DriverContextWeb.WaitForElementVisible(clickDate);
		clickDate.click();
		DriverContextWeb.WaitForElementVisible(clickDate2);
		clickDate2.click();
		DriverContextWeb.selectElementByVisibleText(selectNumberofseats, Numberofseats);
		DriverContextWeb.selectElementByVisibleText(selectNumberofseats, Numberofseats);
		DriverContextWeb.WaitForElementVisible(clickRighthanddriveyes);
		clickRighthanddriveyes.click();
		DriverContextWeb.selectElementByVisibleText(selectNumberofseatsmotorcycle, Numberofseatsmotorcycle);
		DriverContextWeb.selectElementByVisibleText(selectfuel, fuel);
		DriverContextWeb.WaitForElementVisible(enterTextpayload);
		enterTextpayload.sendKeys(payload);
		DriverContextWeb.WaitForElementVisible(enterTextpayload);
		enterTextpayload.sendKeys(payload);
		DriverContextWeb.WaitForElementVisible(enterTextTotalweight);
		enterTextTotalweight.sendKeys(Totalweight);
		DriverContextWeb.WaitForElementVisible(enterTextlistprice);
		enterTextlistprice.sendKeys(listprice);
		DriverContextWeb.WaitForElementVisible(enterTextLicenseplatenumber);
		enterTextLicenseplatenumber.sendKeys(Licenseplatenumber);
		DriverContextWeb.WaitForElementVisible(enterTextAnnualmileage);
		enterTextAnnualmileage.sendKeys(Annualmileage);
		DriverContextWeb.WaitForElementVisible(clickNextenterinsurantdata);
		clickNextenterinsurantdata.click();
		return GetInstance(HomePage.class);
	}
	
	
	@FindBy(how = How.ID, using = "firstname")
	public WebElement EnterTextFirstname;

	@FindBy(how = How.ID, using = "lastname")
	public WebElement EnterTextLastname;
	
	@FindBy(how = How.ID, using = "birthdate")
	public WebElement EnterTextBirthdate;

	@FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")
	public WebElement clickMuscle;
	
	@FindBy(how = How.ID, using = "streetaddress")
	public WebElement enterTextStreetaddress;

	@FindBy(how = How.ID, using = "country")
	public WebElement selectCountry;

	@FindBy(how = How.ID, using = "zipcode")
	public WebElement enterTextZipcode;

	@FindBy(how = How.ID, using = "city")
	public WebElement enterTextCity;

	@FindBy(how = How.ID, using = "occupation")
	public WebElement selectOccupation;

	@FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")
	public WebElement click;
	
	@FindBy(how = How.ID, using = "website")
	public WebElement enterTextwebsite;

	@FindBy(how = How.ID, using = "nextenterproductdata")
	public WebElement clickNextenterproductdata;

	public HomePage preencherInsurant(
	        String Firstname, 
			String Lastname,
			String Birthdate,
			String Streetaddress,
			String Country,
			String Zipcode,
			String City,
			String Occupation
			) throws Exception {
		
		DriverContextWeb.barraDeRolagem(-500);
		
		DriverContextWeb.WaitForElementVisible(EnterTextFirstname);
		EnterTextFirstname.sendKeys(Firstname);

		DriverContextWeb.WaitForElementVisible(EnterTextLastname);
		EnterTextLastname.sendKeys(Lastname);

		DriverContextWeb.WaitForElementVisible(EnterTextBirthdate);
		EnterTextBirthdate.sendKeys(Birthdate);


		DriverContextWeb.WaitForElementVisible(clickMuscle);
		clickMuscle.click();

		
		DriverContextWeb.WaitForElementVisible(enterTextStreetaddress);
		enterTextStreetaddress.sendKeys(Streetaddress);

		DriverContextWeb.selectElementByVisibleText(selectCountry, Country);
		
		DriverContextWeb.WaitForElementVisible(enterTextZipcode);
        enterTextZipcode.sendKeys(Zipcode);
		
        DriverContextWeb.WaitForElementVisible(enterTextCity);
        enterTextCity.sendKeys(City);

		
		DriverContextWeb.selectElementByVisibleText(selectOccupation, Occupation);
		DriverContextWeb.selectElementByVisibleText(selectOccupation, Occupation);

		DriverContextWeb.barraDeRolagem(500);

		DriverContextWeb.WaitForElementVisible(click);
		click.click();

		DriverContextWeb.WaitForElementVisible(enterTextwebsite);
		enterTextwebsite.sendKeys("http://sampleapp.tricentis.com/101/app.php");

		DriverContextWeb.WaitForElementVisible(clickNextenterproductdata);
		clickNextenterproductdata.click();
		return GetInstance(HomePage.class);
	}
	
	@FindBy(how = How.ID, using = "startdate")
	public WebElement EnterTextstartdate;

	@FindBy(how = How.ID, using = "insurancesum")
	public WebElement selectInsurancesum;

	@FindBy(how = How.ID, using = "meritrating")
	public WebElement SelectMeritrating;

	@FindBy(how = How.ID, using = "damageinsurance")
	public WebElement SelectDamageinsurance;

	@FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")
	public WebElement checkboxOptions;

	@FindBy(how = How.ID, using = "courtesycar")
	public WebElement selectCourtesycar;

	@FindBy(how = How.ID, using = "nextselectpriceoption")
	public WebElement clickNextselectpriceoption;
	
	public HomePage preencherProductData(
			String startdate, 
			String Insurancesum,
			String Meritrating,
			String Damageinsurance,
			String Courtesycar
			) throws Exception {
		
		DriverContextWeb.barraDeRolagem(-500);
		
		DriverContextWeb.WaitForElementVisible(EnterTextstartdate);
		EnterTextstartdate.sendKeys(startdate);
		
		DriverContextWeb.selectElementByVisibleText(selectInsurancesum, Insurancesum);

		DriverContextWeb.selectElementByVisibleText(SelectMeritrating, Meritrating);

		DriverContextWeb.selectElementByVisibleText(SelectDamageinsurance, Damageinsurance);

		
		DriverContextWeb.WaitForElementVisible(checkboxOptions);
		checkboxOptions.click();
		
		DriverContextWeb.selectElementByVisibleText(selectCourtesycar, Courtesycar);
		
		DriverContextWeb.WaitForElementVisible(clickNextselectpriceoption);
		clickNextselectpriceoption.click();
		
		return GetInstance(HomePage.class);
	}
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span")
	public WebElement selectSilver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span")
	public WebElement selectGold;

	@FindBy(how = How.XPATH, using = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")
	public WebElement selectPlatinum;

	@FindBy(how = How.XPATH, using = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span")
	public WebElement selectUltimate;

	@FindBy(how = How.ID, using = "nextsendquote")
	public WebElement nextsendquote;
	
		
	public HomePage selecionarPriceOption(
			String selectOption
			) throws Exception {
		
		switch (selectOption) {
		case "Silve":
			DriverContextWeb.WaitForElementVisible(selectSilver);
			selectSilver.click();
			break;
		case "Gold":
			DriverContextWeb.WaitForElementVisible(selectGold);
			selectGold.click();
			break;
		case "Platinum":
			DriverContextWeb.WaitForElementVisible(selectPlatinum);
			selectPlatinum.click();
			break;
		case "Ultimate":
			DriverContextWeb.WaitForElementVisible(selectUltimate);
			selectUltimate.click();
			break;
		default:
           System.out.println("not select");
			break;
		}
		
		DriverContextWeb.WaitForElementVisible(nextsendquote);
		nextsendquote.click();
		return GetInstance(HomePage.class);
	}

	@FindBy(how = How.ID, using = "email")
	public WebElement enterTextEmail;

	@FindBy(how = How.ID, using = "phone")
	public WebElement enterTextPhone;

	@FindBy(how = How.ID, using = "username")
	public WebElement enterTextusername;

	@FindBy(how = How.ID, using = "password")
	public WebElement enterTextPassword;

	@FindBy(how = How.ID, using = "confirmpassword")
	public WebElement enterTextConfirmpassword;

	@FindBy(how = How.ID, using = "Comments")
	public WebElement enterTextComments;

	@FindBy(how = How.ID, using = "sendemail")
	public WebElement clickSendemail;
	
	
	public HomePage preemcherFormularioLogin(
			String Email,
			String Phone,
			String username,
			String Password,
			String Confirmpassword,
			String Comments) throws Exception {
		
			DriverContextWeb.WaitForElementVisible(enterTextEmail);
			enterTextEmail.sendKeys(Email);

			DriverContextWeb.WaitForElementVisible(enterTextPhone);
			enterTextPhone.sendKeys(Phone);

			DriverContextWeb.WaitForElementVisible(enterTextusername);
			enterTextusername.sendKeys(username);

			DriverContextWeb.WaitForElementVisible(enterTextPassword);
			enterTextPassword.sendKeys(Password);

			DriverContextWeb.WaitForElementVisible(enterTextConfirmpassword);
			enterTextConfirmpassword.sendKeys(Confirmpassword);

			DriverContextWeb.WaitForElementVisible(enterTextComments);
			enterTextComments.sendKeys(Comments);

			
			
		DriverContextWeb.WaitForElementVisible(clickSendemail);
		clickSendemail.click();
		return GetInstance(HomePage.class);
	}
	
	public String validaEmailComSucesso() throws Exception {
		Thread.sleep(5000);
		String text = DriverContextWeb.WaitUntilElementClicked(By.xpath("/html/body/div[4]/h2"));
		System.out.println("AQUIIIIIIIIIIII: " + text);
		return text;
	}
}
