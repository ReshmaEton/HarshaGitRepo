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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CommonCases/Login'), [('AppUrl') : AppUrl, ('UserName') : UserName, ('Password') : Password
        , ('SecurityAns') : SecurityAns], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CRM/Relationship/Relationships_LHS'))

WebUI.click(findTestObject('CRM/Relationship/Relationship_Mgmt_LHS'))

WebUI.waitForElementClickable(findTestObject('CRM/Relationship/SearchRelationship/ThreeDot_CRM_RelationshipName'), waitTime)

WebUI.click(findTestObject('CRM/Relationship/SearchRelationship/ThreeDot_CRM_RelationshipName'))

WebUI.mouseOver(findTestObject('CRM/Relationship/SearchRelationship/span_Filter_CRM_Relationship_Name'))

WebUI.sendKeys(findTestObject('CRM/Relationship/SearchRelationship/input_CRM_RelationName'), RelationName)

//WebUI.click(findTestObject('CRM/Relationship/SearchRelationship/click_checkBox_After_Filtering_CRM_RelationshipName'))
WebUI.clickOffset(findTestObject('CRM/Relationship/SearchRelationship/click_checkBox_After_Filtering_CRM_RelationshipName'), 
    50, 10)

WebUI.waitForElementClickable(findTestObject('CRM/Relationship/SearchRelationship/button_Filter_CRM_RealtionshipName'), 
    waitTime)

WebUI.takeScreenshot()

WebUI.click(findTestObject('CRM/Relationship/SearchRelationship/button_Filter_CRM_RealtionshipName'))

WebUI.verifyTextPresent(RelationName, false)

WebUI.verifyTextPresent(RelationType, false)

WebUI.verifyTextPresent(RelationStatus, false)

WebUI.verifyTextPresent(RelationDesc, false)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/CRM/Relationship/SearchRelationship/clear_filter_Relationship'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Relationship/SearchRelationship/clear_filter_Relationship'))

WebUI.takeScreenshot()

