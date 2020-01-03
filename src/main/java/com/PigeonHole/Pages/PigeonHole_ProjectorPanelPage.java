package com.PigeonHole.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PigeonHole_ProjectorPanelPage {

	@FindBy(how = How.XPATH, using = "(//span[contains(text(),\"Technology and Corporate Communications\")])[4]")
	public static WebElement eventName;

	@FindBy(how = How.CSS, using = ".qna-content")
	public static WebElement questionName;

	@FindBy(how = How.XPATH, using = "(//div[@class=\"qna-content\"])[2]")
	public static WebElement secondQuestion;

	@FindBy(how = How.XPATH, using = "//div[@class=\"active-question-text\"]")
	public static WebElement activeQuestion;

	@FindBy(how = How.XPATH, using = "(//div[@class=\"sl-name\"])[2]/span")
	public static WebElement verifySessionName;

	@FindBy(how = How.XPATH, using = "(//span[contains(@class,\"icon-poll\")])[5]")
	public static WebElement verifySessionColor;

	@FindBy(how = How.XPATH, using = "(//div[@class='chart-label'])[1]")
	public static WebElement firstVoteOption;

	@FindBy(how = How.XPATH, using = "(//span[@class=\"percentage\"])[1]")
	public static WebElement firstVotePercentage;

	@FindBy(how = How.CSS, using = ".average-value")
	public static WebElement verifyAverageValue;

	@FindBy(how = How.CSS, using = ".average-score-value")
	public static WebElement verifyAverageScoreValue;

	@FindBy(how = How.CSS, using = ".total-participant")
	public static WebElement verifyTotalParticipants;

	@FindBy(how = How.XPATH, using = "(//div[@class=\"insight-data-count\"])[1]")
	public static WebElement verifyQuestionsPolled;

	@FindBy(how = How.XPATH, using = "(//div[@class=\"insight-data-count\"])[2]")
	public static WebElement verifyTotalVotes;

	public void clickEvent() {
		eventName.click();
	}

	public void clickSession() {
		verifySessionName.click();
	}
}
