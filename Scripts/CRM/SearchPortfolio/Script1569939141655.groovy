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

WebUI.waitForElementClickable(findTestObject('CRM/Create Portfolio/Search Portfolio/span_PortfolioName'), waitTime)

WebUI.click(findTestObject('CRM/Create Portfolio/Search Portfolio/span_PortfolioName'))

WebUI.waitForElementClickable(findTestObject('CRM/Create Portfolio/Search Portfolio/ThreeDot_CRM_PortfolioName'), waitTime)

WebUI.click(findTestObject('CRM/Create Portfolio/Search Portfolio/ThreeDot_CRM_PortfolioName'))

WebUI.mouseOver(findTestObject('CRM/Create Portfolio/Search Portfolio/span_Filter_CRM_PortfolioName'))

WebUI.sendKeys(findTestObject('CRM/Create Portfolio/Search Portfolio/input1_CRM_PortfolioName_Contains1_Textbox'), PortfolioName)

WebUI.callTestCase(findTestCase('CommonCases/Filtering dropdown values'), [('EntFilterDropdown1') : EntFilterDropdown1, ('EntFilterDropdown2') : ''
        , ('DropdownRelation') : ''], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('CRM/Create Portfolio/Search Portfolio/button_Filter_CRM_PortfolioName'), waitTime)

WebUI.takeScreenshot()

WebUI.click(findTestObject('CRM/Create Portfolio/Search Portfolio/button_Filter_CRM_PortfolioName'))

WebUI.verifyTextPresent(PortDescription, false)

WebUI.verifyTextPresent(PortfolioStatus, false)

WebUI.verifyTextPresent(PortfolioType, false)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('CRM/Create Portfolio/Search Portfolio/clear_Filter_PortfolioName'), waitTime)

WebUI.click(findTestObject('CRM/Create Portfolio/Search Portfolio/clear_Filter_PortfolioName'))

WebUI.takeScreenshot()
