package com.PigeonHole.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PigeonHole_DashboardPage {

	@FindBy(how = How.CSS, using = ".pigeonhole-listview__list-link-classy")
	public static WebElement eventName;

	@FindBy(how = How.CSS, using = ".workspace-tooltip__dismiss")
	public static WebElement gotItButton;

	@FindBy(how = How.CSS, using = ".pigeonhole-listview__add-btn")
	public static WebElement addPigeonHoleButton;

	@FindBy(how = How.CSS, using = ".pigeonhole-listview--addbasic-btn")
	public static WebElement basicPigeonHoleButton;

	@FindBy(how = How.CSS, using = "[placeholder=\"Your Event Name\"]")
	public static WebElement eventNameInput;

	@FindBy(how = How.CSS, using = ".random-passcode-button")
	public static WebElement randomPassCodeLink;

	@FindBy(how = How.CSS, using = ".modal-affirmative-button ")
	public static WebElement continueButton;

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
