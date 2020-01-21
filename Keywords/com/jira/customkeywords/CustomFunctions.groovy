package com.jira.customkeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By.ById

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class CustomFunctions 
{
	@Keyword
	def uploadFileBillPayTransactionProcessing(TestObject to, String filePath) {

		WebUI.click(to)

		WebUI.delay(5)

		StringSelection stringSelection = new StringSelection(filePath)

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null)

		Robot robot = new Robot()

		robot.keyPress(KeyEvent.VK_CONTROL)

		robot.keyPress(KeyEvent.VK_V)

		robot.keyRelease(KeyEvent.VK_V)

		robot.keyRelease(KeyEvent.VK_CONTROL)

		robot.keyPress(KeyEvent.VK_ENTER)

		robot.keyRelease(KeyEvent.VK_ENTER)
	}
}
