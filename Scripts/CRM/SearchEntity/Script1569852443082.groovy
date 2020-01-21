import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.support.ui.Select as Select
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

WebUI.waitForElementClickable(findTestObject('CRM/Create Entity/Search Entity/span_Entities'), waitTime)

WebUI.click(findTestObject('CRM/Create Entity/Search Entity/span_Entities'))

WebUI.waitForElementClickable(findTestObject('CRM/Create Entity/Search Entity/ThreeDot_CRM_EntityName'), waitTime)

WebUI.click(findTestObject('CRM/Create Entity/Search Entity/ThreeDot_CRM_EntityName'))

WebUI.mouseOver(findTestObject('CRM/Create Entity/Search Entity/span_Filter_CRM_Entity_Name'))

WebUI.sendKeys(findTestObject('CRM/Create Entity/Search Entity/input1_CRM_EntityName_Contains1_Textbox'), EntLegalName)

WebUI.sendKeys(findTestObject('CRM/Create Entity/Search Entity/input2_CRM_EntityName_Contains2_Textbox'), EntLegalName)

WebUI.callTestCase(findTestCase('CommonCases/Filtering dropdown values'), [('EntFilterDropdown1') : EntFilterDropdown1, ('EntFilterDropdown2') : EntFilterDropdown2
        , ('DropdownRelation') : DropdownRelation], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('CRM/Create Entity/Search Entity/button_Filter_CRM_EntityName'), waitTime)

WebUI.takeScreenshot()

WebUI.click(findTestObject('CRM/Create Entity/Search Entity/button_Filter_CRM_EntityName'))

WebUI.takeScreenshot()

WebUI.verifyTextPresent(EntType, false)

WebUI.verifyTextPresent(EntLegalName, false)

WebUI.verifyTextPresent(EntStatus, false)

WebUI.verifyTextPresent(RelationName, false)

WebUI.scrollToElement(findTestObject('CRM/Create Entity/Search Entity/clear_Filters_EntityName'), waitTime)

WebUI.click(findTestObject('CRM/Create Entity/Search Entity/clear_Filters_EntityName'))

WebUI.takeScreenshot()

