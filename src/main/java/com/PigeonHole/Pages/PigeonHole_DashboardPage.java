package com.PigeonHole.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.PigeonHole.FunctionalLibrary.GenericMethods;

public class PigeonHole_DashboardPage {

	@FindBy(how = How.CSS, using = ".pigeonhole-listview__list-link-classy")
	@CacheLookup
	public static WebElement eventName;

	@FindBy(how = How.CSS, using = ".workspace-tooltip__dismiss")
	@CacheLookup
	public static WebElement gotItButton;

	@FindBy(how = How.CSS, using = ".pigeonhole-listview__add-btn")
	@CacheLookup
	public static WebElement addPigeonHoleButton;

	@FindBy(how = How.CSS, using = ".pigeonhole-listview--addbasic-btn")
	@CacheLookup
	public static WebElement basicPigeonHoleButton;

	@FindBy(how = How.CSS, using = "[placeholder=\"Your Event Name\"]")
	@CacheLookup
	public static WebElement eventNameInput;

	@FindBy(how = How.CSS, using = ".random-passcode-button")
	@CacheLookup
	public static WebElement randomPassCodeLink;

	@FindBy(how = How.CSS, using = ".modal-affirmative-button ")
	@CacheLookup
	public static WebElement continueButton;
	
	//-------------
	
//	@FindBy(how = How.CSS, using = ".pigeonhole-listview__list-link-classy")
//	@CacheLookup
//	public static WebElement eventName;
	
//	@FindBy(how = How.CSS, using = ".workspace-tooltip__dismiss")
//	@CacheLookup
//	public static WebElement gotItButton; 
	
//	@FindBy(how = How.CSS, using = ".pigeonhole-listview__add-btn")
//	@CacheLookup
//	public static WebElement addPigeonholeButton;
	
//	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-menu']//span[text()='Basic Pigeonhole']")
//	@CacheLookup
//	public static WebElement basicPigeonholeButton;
	
//	@FindBy(how = How.XPATH, using = "//input[@placeholder='Your Event Name']")
//	@CacheLookup
//	public static WebElement eventNameField;

//	@FindBy(how = How.XPATH, using = "//div[@class='col-md-5']//span[text() ='Use random passcode']")
//	@CacheLookup
//	public static WebElement randomPasscodeField;
	
//	@FindBy(how = How.XPATH, using = "//button[text() ='Continue']")
//	@CacheLookup
//	public static WebElement countinueButton;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"modal-footer\"]//button[@type=\"button\"]")
	@CacheLookup
	public static WebElement goToAgendaButton;
	
	@FindBy(how = How.CSS, using = ".confirmation-btn")
	@CacheLookup
	public static WebElement conformationButton; 
	
	@FindBy(how = How.XPATH, using = "//div[@class='btn-group add-session-container']")
	@CacheLookup
	public static WebElement addSessionButton;
	
	@FindBy(how = How.XPATH, using = "//label[@class='box-radio']//span[@class='box-radio-content box-poll_quiz']")
	@CacheLookup
	public static WebElement pollQuizeLabel;
	
	@FindBy(how = How.XPATH, using = "//textarea[@name='name']")
	@CacheLookup
	public static WebElement sessionNamefield;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-secondary btn-add-poll-qn  ']")
	@CacheLookup
	public static WebElement addQuestionButton;
	
	@FindBy(how = How.XPATH, using = "//input[@name='question']")
	@CacheLookup
	public static WebElement pullQuestionField;
	
	@FindBy(how = How.XPATH, using = "//div[@class='modal-poll-type-region']//div[@class='input-group__addon input-uploader-area hide-if-archived remove-image']//input")
	@CacheLookup
	public static WebElement imageIcon;
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12 validation-error-host']//input[@id='poll_option_-1']")
	@CacheLookup
	public static WebElement answerOptionFirstField;
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12 validation-error-host']//input[@id='poll_option_-2']")
	@CacheLookup
	public static WebElement answerOptionSecondField;
	
	@FindBy(how = How.XPATH, using = "//div[@data-id='-1']//span[text()='Mark as correct']")
	@CacheLookup
	public static WebElement markAsCurrectFirstField;
	
	@FindBy(how = How.XPATH, using = "//button[text() ='Save']")
	@CacheLookup
	public static WebElement saveButton;
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-group__addon input-uploader-area hide-if-archived ']//input[@id='file-input_poll_option_-1']")
	@CacheLookup
	public static WebElement firstOptionImage;
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-group__addon input-uploader-area hide-if-archived ']//input[@id='file-input_poll_option_-2']")
	@CacheLookup
	public static WebElement secondOptionImage;
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-group__addon input-uploader-area hide-if-archived ']//input[@id='file-input_poll_option_-3']")
	@CacheLookup
	public static WebElement thirdOptionImage;
	
	@FindBy(how = How.XPATH, using = "//div[@class='form-group validatable']//input[@id='poll-qn-option-input']")
	@CacheLookup
	public static WebElement answerOptionThirdField;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-secondary btn-add-poll-qn  ']")
	@CacheLookup
	public static WebElement addQuestionSecondButton;
	
	@FindBy(how = How.XPATH, using = "//input[@name='question']")
	@CacheLookup
	public static WebElement pullSecondQuestionField;
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12 validation-error-host']//input[@id='poll_option_-1']")
	@CacheLookup
	public static WebElement optionFirstField;
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12 validation-error-host']//input[@id='poll_option_-2']")
	@CacheLookup
	public static WebElement optionSecondField;
	
	@FindBy(how = How.XPATH, using = "//button[text() ='Save']")
	@CacheLookup
	public static WebElement saveButtonTwo;
	
	@FindBy(how = How.XPATH, using = "//div[@data-id='-2']//div[@class='poll-option-left ']")
	@CacheLookup
	public static WebElement markSecondField;
	
	@FindBy(how = How.XPATH, using = "//div[@class=' validation-error-host']//select")
	@CacheLookup
	public static WebElement timeLimitDropwon;
	
	@FindBy(how = How.XPATH, using = "//div[@class='checkbox-radio-wrap remove-margin-and-padding-if-archived  poll-leaderboard']//input")
	@CacheLookup
	public static WebElement leaderboardCheckBox;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	@CacheLookup
	public static WebElement addQuiz;
	
	@FindBy(how = How.XPATH, using = "//div[@class='session-name']//strong")
	@CacheLookup
	public static WebElement sessionNameField;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-secondary dropdown-toggle']")
	@CacheLookup
	public static WebElement sessionDropDown;
	
	@FindBy(how = How.XPATH, using = "//button[text() ='Start']")
	@CacheLookup
	public static WebElement startSessionButton;
	
	@FindBy(how = How.XPATH, using = "//div[@class='modal-footer form-btn-set']//button[text() ='Start']")
	@CacheLookup
	public static WebElement startButton;
	
	@FindBy(how = How.XPATH, using = "//div[@class='btn btn-secondary quick-run-button dropdown-toggle']")
	@CacheLookup
	public static WebElement runsLink;
	
	@FindBy(how = How.XPATH, using = "//a[text() ='Audience Web App']")
	@CacheLookup
	public static WebElement awalink;
	
	@FindBy(how = How.XPATH, using = "//a[text() ='Admin Panel']")
	@CacheLookup
	public static WebElement adminPannelLink;
	
	@FindBy(how = How.XPATH, using = "//a[text() ='Projector Panel']")
	@CacheLookup
	public static WebElement projectorPannelLink;
	
	//---------------

	
	//   methods-----
	
//	public void clickOnEvent() {
//		eventName.click();
//	}
//	
	public void clickOnGotItButton() 
	{
		gotItButton.click();
	}
//	public void clickOnAddPigeonHole()
//	{
//		addPigeonHoleButton.click();
//	}
	public void clickBasicPigeonhole()
	{
		clickOnGotItButton();
		clickOnAddPigeonHole();
		basicPigeonHoleButton.click();
	}
	public void setUpEvent(String eventName) throws Throwable
	{
		eventNameInput.sendKeys(eventName);
		randomPassCodeLink.click();
		GenericMethods.sychronizationinterval();
		continueButton.click();
		GenericMethods.sychronizationinterval();
		goToAgendaButton.click();
		GenericMethods.sychronizationinterval();
		GenericMethods.waitForElementClickable(conformationButton);
		conformationButton.click();
	}
	
	public void addNewSession(String sessionName) throws Throwable
	{
		addSessionButton.click();
		GenericMethods.sychronizationinterval();
		pollQuizeLabel.click();
		sessionNamefield.sendKeys(sessionName);
	}
	
	public void addPollQuestion(String question,String firstAnswer,String secondAnswer) throws Throwable
	{
		addQuestionButton.click();
		GenericMethods.sychronizationinterval();
		pullQuestionField.sendKeys(question);
		GenericMethods.sychronizationinterval();
		imageIcon.sendKeys(System.getProperty("user.dir")+"/FruitesImages/fruits.jpg");
		GenericMethods.sychronizationinterval();
		answerOptionFirstField.sendKeys(firstAnswer);
		GenericMethods.sychronizationinterval();
		answerOptionSecondField.sendKeys(secondAnswer);
		GenericMethods.sychronizationinterval();
		markAsCurrectFirstField.click();
		GenericMethods.sychronizationinterval();
		saveButton.click();
	}
	
	public void addAnswerOptionsWithImages(String question,String firstAnswer,String secondAnswer,String thirdAnswer, String timeValue) throws Throwable
	{
		addQuestionSecondButton.click();
		GenericMethods.sychronizationinterval();
		pullSecondQuestionField.sendKeys(question);
		GenericMethods.sychronizationinterval();
		optionFirstField.sendKeys(firstAnswer);
		GenericMethods.sychronizationinterval();
		firstOptionImage.sendKeys(System.getProperty("user.dir")+"/FruitesImages/animated-orange.gif");
		GenericMethods.sychronizationinterval();
		optionSecondField.sendKeys(secondAnswer);
		GenericMethods.sychronizationinterval();
		secondOptionImage.sendKeys(System.getProperty("user.dir")+"/FruitesImages/guava.jpg");
		Thread.sleep(8000);// wait required for uploading the image icon
		markSecondField.click();
		GenericMethods.sychronizationinterval();
		answerOptionThirdField.sendKeys(thirdAnswer);
		Thread.sleep(6000);
		thirdOptionImage.sendKeys(System.getProperty("user.dir")+"/FruitesImages/apple.png");
		Thread.sleep(8000);// wait required for uploading the image icon
		saveButtonTwo.click();
		GenericMethods.sychronizationinterval();
		Select time = new Select(timeLimitDropwon);
		GenericMethods.sychronizationinterval();
		time.selectByVisibleText(timeValue);
		GenericMethods.sychronizationinterval();
		selectLeaderboardCheckBox();
		GenericMethods.sychronizationinterval();
		addQuiz.click();
	}
	
	public void selectLeaderboardCheckBox()
	{
		if(!(leaderboardCheckBox.isSelected()))
		{
			leaderboardCheckBox.click();
		}
	}
	
	public void startSession() throws Throwable
	{
		sessionDropDown.click();
		GenericMethods.sychronizationinterval();
		startSessionButton.click();
		GenericMethods.sychronizationinterval();
		startButton.click();
	}
	
	public void clickOnRunsLink() throws Throwable
	{
		GenericMethods.sychronizationinterval();
		runsLink.click();
	}
	
	public void clickOnAwa()
	{
		awalink.click();
	}
	
	public void clickOnAdminPannel()
	{
		adminPannelLink.click();
	}
	
	public void clickOnProjectorPannel()
	{
		projectorPannelLink.click();
	}
	
	
	//  ------------end
	
	
	
	public void clickOnEvent() {
		eventName.click();
	}

	public void clickOnAddPigeonHole() {
		addPigeonHoleButton.click();
	}

	public void clickOnBasicPigeonHole() {
		basicPigeonHoleButton.click();
	}

	public void fillEventName(String name) {
		eventNameInput.sendKeys(name);
	}

	public void clickOnRandomPassCode() {
		randomPassCodeLink.click();
	}

	public void clickOnContinueButton() {
		continueButton.click();
	}
}
