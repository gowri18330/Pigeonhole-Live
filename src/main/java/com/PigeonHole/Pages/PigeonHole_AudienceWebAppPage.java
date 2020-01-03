package com.PigeonHole.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.PigeonHole.FunctionalLibrary.GenericMethods;

public class PigeonHole_AudienceWebAppPage extends GenericMethods {

	@FindBy(how = How.XPATH, using = "(//h2[text()=\"Technology and Corporate Communications\"]/..//a[contains(text(),\" Enter this Q&A\")])[1]")
	public static WebElement enterThisQA_Button;

	@FindBy(how = How.CSS, using = ".question-input")
	public static WebElement questionInput;

	@FindBy(how = How.CSS, using = ".question-input-btn")
	public static WebElement askButton;

	@FindBy(how = How.CSS, using = ".modal-btn-ok")
	public static WebElement confirmAskButton;

	@FindBy(how = How.CSS, using = ".question-content")
	public static WebElement verifyQuestion;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'icon-qna-vote-outline')]")
	public static WebElement voteButton;

	@FindBy(how = How.CSS, using = ".question-vote-count")
	public static WebElement verifyVoteCount;

	@FindBy(how = How.XPATH, using = "(//div[@class=\"question-content allow-user-select\"])[2]")
	public static WebElement secondQuestion;

	@FindBy(how = How.CSS, using = ".announcement-modal-text")
	public static WebElement announcementPopUPText;

	@FindBy(how = How.CSS, using = ".model-bottom-section-button")
	public static WebElement announcementPopUPCloseButton;

	@FindBy(how = How.XPATH, using = "(//span[@class=\"answered\"])[2]")
	public static WebElement verifyAnsweredText;

	@FindBy(how = How.XPATH, using = "(//h2[@class=\"allow-user-select\"])[1]")
	public static WebElement verifySessionName;

	@FindBy(how = How.XPATH, using = "(//a[contains(text(),\"Cast your vote\")])[1]")
	public static WebElement casteYourVoteButton;

	@FindBy(how = How.XPATH, using = "(//div[contains(@class,\"poll-option-item\")])[5]")
	public static WebElement firstVoteOptionButton;

	@FindBy(how = How.CSS, using = ".poll-question") 
	public static WebElement verifyPollQuestion;

	@FindBy(how = How.XPATH, using = "(//div[@class='poll-option-item-text'])[1]")
	public static WebElement verifyVoteOption;

	@FindBy(how = How.XPATH, using = "(//div[@class='poll-option-item-percentage'])[1]") 
	public static WebElement verifyVotePercentage;

	@FindBy(how = How.CSS, using = ".next-button") 
	public static WebElement nextButton;

	@FindBy(how = How.CSS, using = "[value=\"4\"]")
	public static WebElement numericInputOptionFourButton;

	@FindBy(how = How.CSS, using = ".confirm-button")
	public static WebElement confirmVoteButton;

	@FindBy(how = How.XPATH, using = "(//span[@class=\"icon icon-star-solid\"])[7]")
	public static WebElement iconRatingButton;

	@FindBy(how = How.CSS, using = ".poll-option-score span:nth-child(1)")
	public static WebElement verifyIconRating;

	@FindBy(how = How.CSS, using = ".complete-text")
	public static WebElement thankYouText;

	@FindBy(how = How.XPATH, using = "(//a[text()='Back'])[1]")
	public static WebElement backButton;

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
}
