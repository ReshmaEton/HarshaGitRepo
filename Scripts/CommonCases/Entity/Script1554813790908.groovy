import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Create Entity
WebUI.click(findTestObject('CRM/Create Entity/ClickCreateEntity'))

WebUI.setText(findTestObject('CRM/Create Entity/EntityLegalName'), EntLegalName)

WebUI.setText(findTestObject('CRM/Create Entity/EntityStatus'), EntStatus)

WebUI.setText(findTestObject('CRM/Create Entity/EntityType'), EntType)

WebUI.setText(findTestObject('CRM/Create Entity/EntityShortName'), EntShortName)

WebUI.setText(findTestObject('CRM/Create Entity/EntityTaxStatus'), EntTaxStatus)

WebUI.setText(findTestObject('CRM/Create Entity/EntityDueDiligenceType'), EntDueDeligenceType)

WebUI.setText(findTestObject('CRM/Create Entity/EntityCurrency'), EntCurrency)

WebUI.setText(findTestObject('CRM/Create Entity/EntityAccountingMethod'), EntAccMethod)

WebUI.setText(findTestObject('CRM/Create Entity/EntityChartofAccount'), EntChartOfAcc)

WebUI.setText(findTestObject('CRM/Create Entity/EntityCalender'), EntCalendr)

WebUI.sendKeys(findTestObject('CRM/Create Entity/EntityClosingGroup'), EntClosingGrup)

WebUI.sendKeys(findTestObject('CRM/Create Entity/EntityClosingGroup'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('CRM/Create Entity/EntityNotes'), EntNotes)

WebUI.sendKeys(findTestObject('CRM/Create Entity/EntityLegacyId'), EntLegacyId)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('CRM/Create Entity/button_EntitySubmitButton'), waitTime)

WebUI.click(findTestObject('CRM/Create Entity/button_EntitySubmitButton'))

WebUI.delay(5)

WebUI.click(findTestObject('CRM/Create Entity/button_EntityFinalApprovalButton'))

WebUI.delay(5)

WebUI.takeScreenshot()

