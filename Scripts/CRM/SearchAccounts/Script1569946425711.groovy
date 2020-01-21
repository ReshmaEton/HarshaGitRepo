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

WebUI.callTestCase(findTestCase('CommonCases/Login'), [('AppUrl') : AppUrl, ('UserName') : UserName, ('Password') : Password
        , ('SecurityAns') : SecurityAns], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CRM/Relationship/Relationships_LHS'))

WebUI.click(findTestObject('CRM/Relationship/Relationship_Mgmt_LHS'))

WebUI.waitForElementClickable(findTestObject('CRM/Create Account/Search Accounts/span_Accounts'), waitTime)

WebUI.click(findTestObject('CRM/Create Account/Search Accounts/span_Accounts'))

WebUI.waitForElementClickable(findTestObject('CRM/Create Account/Search Accounts/ThreeDot_CRM_AccountName'), waitTime)

WebUI.click(findTestObject('CRM/Create Account/Search Accounts/ThreeDot_CRM_AccountName'))

WebUI.mouseOver(findTestObject('CRM/Create Account/Search Accounts/span_Filter_CRM_AccountName'))

WebUI.sendKeys(findTestObject('CRM/Create Account/Search Accounts/input1_CRM_AccountName_Contains1_Textbox'), AccName)

WebUI.callTestCase(findTestCase('CommonCases/Filtering dropdown values'), [('EntFilterDropdown1') : EntFilterDropdown1, ('EntFilterDropdown2') : ''
        , ('DropdownRelation') : ''], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('CRM/Create Account/Search Accounts/button_Filter_CRM_AccountName'))

WebUI.verifyTextPresent(AccNum, false)

WebUI.verifyTextPresent(AccType, false)

WebUI.verifyTextPresent(AccStatus, false)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('CRM/Create Account/Search Accounts/account_name_clear_filter'), waitTime)

WebUI.click(findTestObject('CRM/Create Account/Search Accounts/account_name_clear_filter'))

WebUI.takeScreenshot()

