import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/ClosingGroups/Clicking_On_ClosingGroups'), waitTime)

WebUI.click(findTestObject('Object Repository/Accounting/ClosingGroups/Clicking_On_ClosingGroups'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/ClosingGroups/button_Create_Accounting_PeriodClosing_ClosingGroups'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Accounting/ClosingGroups/button_Create_Accounting_PeriodClosing_ClosingGroups'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/ClosingGroups/input_ClosingGroupName_CreateClosngGrup'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/Accounting/ClosingGroups/input_ClosingGroupName_CreateClosngGrup'), ClosingGrupName)

WebUI.sendKeys(findTestObject('Object Repository/Accounting/ClosingGroups/input_Description_CreateClosngGrup'), ClosingDesc)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Accounting/ClosingGroups/select_Calendar_CreateClosngGrup'), 
    CalndrName, false)

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/ClosingGroups/button_Save_CreateClosngGrup'), 
    waitTime)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Accounting/ClosingGroups/button_Save_CreateClosngGrup'))

WebUI.delay(5)

