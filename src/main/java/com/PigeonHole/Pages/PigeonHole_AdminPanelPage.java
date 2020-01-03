package com.PigeonHole.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PigeonHole_AdminPanelPage {

	@FindBy(how = How.XPATH, using = "(//span[contains(text(),\"Technology and Corporate Communications\")])[4]")
	public static WebElement eventName;

	@FindBy(how = How.CSS, using = ".content")
	public static WebElement questionName;

	@FindBy(how = How.XPATH, using = "(//div[@class=\"icon-cross sidebar-icon-cross\"])[5]")
	public static WebElement crossIcon;

	@FindBy(how = How.XPATH, using = "(//div[@class=\"icon-tick sidebar-icon-tick\"])[5]")
	public static WebElement tickIcon;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),\"1 question pending approval\")]")
	public static WebElement questionPendingApprovalLink;

	@FindBy(how = How.XPATH, using = "(//div[@class=\"edit-text\"])[6]")
	public static WebElement allowButton;

	@FindBy(how = How.CSS, using = "a[data-routename=\"question_allowed\"]")
	public static WebElement allowedButton;

	@FindBy(how = How.XPATH, using = "(//div[@class=\"content\"])[1]")
	public static WebElement secondQuestion;

	@FindBy(how = How.XPATH, using = "(//span[@class=\"normal-icon icon-active\"])[1]")
	public static WebElement activeButton;

	@FindBy(how = How.XPATH, using = "(//div[contains(@class,\"admin-icon-button question-answered-button  inactive\")])[1]")
	public static WebElement answeredButton;

	@FindBy(how = How.CSS, using = "[class=\"icon-loudspeaker\"]")
	public static WebElement loudSpeakerIcon;

	@FindBy(how = How.CSS, using = ".announcement-message")
	public static WebElement announcementMessageInput;

	@FindBy(how = How.CSS, using = ".save-btn")
	public static WebElement saveLaterButton;

	@FindBy(how = How.CSS, using = ".announcement-content")
	public static WebElement verifyAnnouncementMessage;

	@FindBy(how = How.CSS, using = ".send-announcement")
	public static WebElement sendAnnouncementButton;

	@FindBy(how = How.CSS, using = ".modal-btn-ok")
	public static WebElement announcementConfirmButton;

	@FindBy(how = How.XPATH, using = "(//div[@class=\"announcement-content\"])[2]")
	public static WebElement sentAnnouncementMessage;

	@FindBy(how = How.CSS, using = ".view-count")
	public static WebElement verifyViewCount;

	@FindBy(how = How.CSS, using = ".click-count")
	public static WebElement verifyClickCount;

	@FindBy(how = How.XPATH, using = "(//div[@class=\"sl-name\"])[2]/span")
	public static WebElement verifySessionName;

	@FindBy(how = How.XPATH, using = "(//span[contains(@class,\"icon-poll\")])[5]")
	public static WebElement verifySessionColor;

	@FindBy(how = How.XPATH, using = "(//div[@class='sl-name'])[2]")
	public static WebElement sessionName;

	@FindBy(how = How.XPATH, using = "(//div[@class='simple-poll-content'])[1]")
	public static WebElement firstVoteOption;

	@FindBy(how = How.XPATH, using = "(//div[@class='poll-percentage'])[1]")
	public static WebElement firstVotePercentage;

	@FindBy(how = How.XPATH, using = "(//button[@class=\"btn btn-alternate next-question\"])[1]")
	public static WebElement nextButton;

	@FindBy(how = How.CSS, using = ".average-value")
	public static WebElement verifyAverageValue;

	@FindBy(how = How.CSS, using = ".average-score-value")
	public static WebElement verifyAverageScoreValue;

	@FindBy(how = How.CSS, using = ".total-participant-count")
	public static WebElement verifyTotalParticipants;

	@FindBy(how = How.XPATH, using = "(//div[@class=\"number\"])[1]")
	public static WebElement verifyQuestionsPolled;

	@FindBy(how = How.XPATH, using = "(//div[@class=\"number\"])[2]")
	public static WebElement verifyTotalVotes;

	public void clickEvent() {
		eventName.click();
	}

	public void clickQuestionPending() {
		questionPendingApprovalLink.click();
	}

	public void clickAllow() {
		allowButton.click();
	}

	public void clickAllowed() {
		allowedButton.click();
	}

	public void clickActive() {
		activeButton.click();
	}

	public void clickAnswered() {
		answeredButton.click();
	}

	public void clickLoudSpeaker() {
		loudSpeakerIcon.click();
	}

	public void fillAnnouncementMessage(String message) {
		announcementMessageInput.sendKeys(message);
	}

	public void clickSaveLater() {
		saveLaterButton.click();
	}

	public void clickSendAnnouncement() {
		sendAnnouncementButton.click();
	}

	public void clickAnnouncementConfirm() {
		announcementConfirmButton.click();
	}

	public void clickSession() {
		sessionName.click();
	}

	public void clickNext() {
		nextButton.click();
	}
}
