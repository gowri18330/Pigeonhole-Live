package com.PigeonHole.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.PigeonHole.FunctionalLibrary.GenericMethods;

public class PigeonHole_AudienceWebAppPage extends GenericMethods {

	@FindBy(how = How.XPATH, using = "(//h2[text()=\"Technology and Corporate Communications\"]/..//a[contains(text(),\" Enter this Q&A\")])[1]")
	@CacheLookup
	public static WebElement enterThisQA_Button;

	@FindBy(how = How.CSS, using = ".question-input")
	@CacheLookup
	public static WebElement questionInput;

	@FindBy(how = How.CSS, using = ".question-input-btn")
	@CacheLookup
	public static WebElement askButton;

	@FindBy(how = How.CSS, using = ".modal-btn-ok")
	@CacheLookup
	public static WebElement confirmAskButton;

	@FindBy(how = How.CSS, using = ".question-content")
	@CacheLookup
	public static WebElement verifyQuestion;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'icon-qna-vote-outline')]")
	@CacheLookup
	public static WebElement voteButton;

	@FindBy(how = How.CSS, using = ".question-vote-count")
	@CacheLookup
	public static WebElement verifyVoteCount;

	@FindBy(how = How.XPATH, using = "(//div[@class=\"question-content allow-user-select\"])[2]")
	@CacheLookup
	public static WebElement secondQuestion;

	@FindBy(how = How.CSS, using = ".announcement-modal-text")
	@CacheLookup
	public static WebElement announcementPopUPText;

	@FindBy(how = How.CSS, using = ".model-bottom-section-button")
	@CacheLookup
	public static WebElement announcementPopUPCloseButton;

	@FindBy(how = How.XPATH, using = "(//span[@class=\"answered\"])[2]")
	@CacheLookup
	public static WebElement verifyAnsweredText;

	@FindBy(how = How.XPATH, using = "(//h2[@class=\"allow-user-select\"])[1]")
	@CacheLookup
	public static WebElement verifySessionName;

	@FindBy(how = How.XPATH, using = "(//a[contains(text(),\"Cast your vote\")])[1]")
	@CacheLookup
	public static WebElement casteYourVoteButton;

	@FindBy(how = How.XPATH, using = "(//div[contains(@class,\"poll-option-item\")])[5]")
	@CacheLookup
	public static WebElement firstVoteOptionButton;

	@FindBy(how = How.CSS, using = ".poll-question")
	@CacheLookup
	public static WebElement verifyPollQuestion;

	@FindBy(how = How.XPATH, using = "(//div[@class='poll-option-item-text'])[1]")
	@CacheLookup
	public static WebElement verifyVoteOption;

	@FindBy(how = How.XPATH, using = "(//div[@class='poll-option-item-percentage'])[1]")
	@CacheLookup
	public static WebElement verifyVotePercentage;

	@FindBy(how = How.CSS, using = ".next-button")
	@CacheLookup
	public static WebElement nextButton;

	@FindBy(how = How.CSS, using = "[value=\"4\"]")
	@CacheLookup
	public static WebElement numericInputOptionFourButton;

	@FindBy(how = How.CSS, using = ".confirm-button")
	@CacheLookup
	public static WebElement confirmVoteButton;

	@FindBy(how = How.XPATH, using = "(//span[@class=\"icon icon-star-solid\"])[7]")
	@CacheLookup
	public static WebElement iconRatingButton;

	@FindBy(how = How.CSS, using = ".poll-option-score span:nth-child(1)")
	@CacheLookup
	public static WebElement verifyIconRating;

	@FindBy(how = How.CSS, using = ".complete-text")
	@CacheLookup
	public static WebElement thankYouText;

	@FindBy(how = How.XPATH, using = "(//a[text()='Back'])[1]")   // .icon-very-good
	@CacheLookup
	public static WebElement backButton;
	
	@FindBy(how = How.CSS, using = ".modal-btn-cancel")   // .icon-very-good
	@CacheLookup
	public static WebElement skipButton;
	
	//------------------- 
	
//	@FindBy(how = How.XPATH, using = "(//h2[text()=\"Technology and Corporate Communications\"]/..//a[contains(text(),\" Enter this Q&A\")])[1]")
//	public static WebElement enterThisQA_Button;
//
//	@FindBy(how = How.CSS, using = ".question-input")
//	public static WebElement questionInput;
//
//	@FindBy(how = How.CSS, using = ".question-input-btn")
//	public static WebElement askButton;
//
//	@FindBy(how = How.CSS, using = ".modal-btn-ok")
//	public static WebElement confirmAskButton;
//
//	@FindBy(how = How.CSS, using = ".question-content")
//	public static WebElement verifyQuestion;
//
//	@FindBy(how = How.XPATH, using = "//div[contains(@class,'icon-qna-vote-outline')]")
//	public static WebElement voteButton;             
//	
//	@FindBy(how = How.CSS, using = ".question-vote-count")      
//	public static WebElement verifyVoteCount;
//	
//	@FindBy(how = How.XPATH, using = "(//div[@class=\"question-content allow-user-select\"])[2]")
//	public static WebElement secondQuestion;
//	
//	@FindBy(how = How.CSS, using = ".announcement-modal-text")       // 
//	public static WebElement announcementPopUPText;
//	
//	@FindBy(how = How.CSS, using = ".model-bottom-section-button")       
//	public static WebElement announcementPopUPCloseButton;
//	
//	@FindBy(how = How.XPATH, using = "(//span[@class=\"answered\"])[2]")       
//	public static WebElement verifyAnsweredText;
//	
//	@FindBy(how = How.XPATH, using = "//div[@class='sessionlist-item-button-wrapper  ']")   
//	@CacheLookup
//	public static WebElement casteYourVoteButton;
	
	@FindBy(how = How.XPATH, using = "(//div[@class=\"poll-option-region\"]//div[@class='poll-option-item-background'])[1]")  
	@CacheLookup
	public static WebElement answerOptionOne;
	
	@FindBy(how = How.XPATH, using = "//div[@class='viewer-image-wrapper show-layer']")   
	@CacheLookup
	public static WebElement enlargeIcon;
	
	@FindBy(how = How.XPATH, using = "//div[@class='viewer-image-wrapper show-layer active']//span[@class='icon icon-cross icon-cross-large']")
	@CacheLookup
	public static WebElement enlargeCloseButton;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Quiz paused!']")   
	@CacheLookup
	public static WebElement quizPauseTextField;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='poll-option-item-percentage-wrap'])[3]")   
	@CacheLookup
	public static WebElement appleAnswerField;
	
	@FindBy(how = How.XPATH, using = "//div[@class='modal-box-tick']//div[text()='You got the wrong answer.']")
	@CacheLookup
	public static WebElement sorryWorngAnswerPopup;
	
	@FindBy(how = How.XPATH, using = "//div[@class='ranking-summary']//div[text() ='1/2']")
	@CacheLookup
	public static WebElement finalScoreField;
	//--------------------------

	// --------------------
	
//	public void clickQA() {
//		enterThisQA_Button.click();
//	}
//
//	public void clickQuestionInput() {
//		Actions action = new Actions(driver);
//		action.moveToElement(questionInput).click().build().perform();
//		//questionInput.click();
//	}
//	
//	public void fillUpQuestion(String question) {
//		questionInput.sendKeys(question);
//	}
//
//	public void clickAsk() {
//		askButton.click();
//	}
//
//	public void clickConfirmAsk() {
//		confirmAskButton.click();
//	}
//	
//	public void clickVote() {
////		Actions action = new Actions(driver);
////		action.moveToElement(voteButton).click().build().perform();
////		
//		voteButton.click();
//	}
//	
//	public void clickAnnouncementPopUPClose() {
//		announcementPopUPCloseButton.click();
//	}
	
	public boolean validateSession(String sessionName)
	{
		return driver.findElement(By.xpath("//div[@class='sessionlist-item-outer']//div//h2[text() ='"+ sessionName +"']")).isDisplayed();
	}
//	public void clickOnCasteYourVote()
//	{
//		casteYourVoteButton.click();
//	}
	
	public void clickOnFirstQuestionAswer()
	{
		answerOptionOne.click();
	}
	public void clickOnEnlargeIcon() throws Throwable
	{
		enlargeIcon.click();
		Thread.sleep(1000);
		enlargeCloseButton.click();
	}
	
	public void clickOnApple()
	{
		appleAnswerField.click();
	}
	// -----------------------
	
	
	public void clickQA() {
		enterThisQA_Button.click();
	}

	public void clickQuestionInput() {
		Actions action = new Actions(driver);
		action.moveToElement(questionInput).click().build().perform();
	}

	public void fillUpQuestion(String question) {
		questionInput.sendKeys(question);
	}

	public void clickAsk() {
		askButton.click();
	}

	public void clickConfirmAsk() {
		confirmAskButton.click();
	}

	public void clickVote() {
		voteButton.click();
	}

	public void clickAnnouncementPopUPClose() {
		announcementPopUPCloseButton.click();
	}

	public void clickCasteYourVote() {
		casteYourVoteButton.click();
	}

	public void clickVoteOption() {
		Actions action = new Actions(driver);
		action.moveToElement(firstVoteOptionButton).click().build().perform();
	}

	public void clickNext() {
		nextButton.click();
	}

	public void clickNumericOption() {
		numericInputOptionFourButton.click();
	}

	public void clickVoteButton() {
		confirmVoteButton.click();
	}

	public void clickIconRating() {
		iconRatingButton.click();
	}

	public void clickBack() {
		backButton.click();
	}
	
	public void clickSkip() {
		skipButton.click();
	}
}
