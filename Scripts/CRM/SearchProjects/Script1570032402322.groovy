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

WebUI.waitForElementClickable(findTestObject('CRM/SearchProjects/span_ProjectName'), waitTime)

WebUI.click(findTestObject('CRM/SearchProjects/span_ProjectName'))

WebUI.waitForElementClickable(findTestObject('CRM/SearchProjects/ThreeDot_CRM_ProjectName'), waitTime)

WebUI.click(findTestObject('CRM/SearchProjects/ThreeDot_CRM_ProjectName'))

WebUI.mouseOver(findTestObject('CRM/SearchProjects/span_Filter_CRM_ProjectName'))

WebUI.sendKeys(findTestObject('CRM/SearchProjects/input_CRM_ProjectName_Textbox'), ProjName)

/*String xpath = ('//div[@data-role=\'filtermulticheck\']/form/ul/li/label[text()=\'' + ProjName) + '\']/input'

TestObject to = new TestObject('SelectProjCheckBox')

to.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.delay(2)

WebUI.click(to)
*/

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/SearchProjects/click_checkBox_After_Filtering_CRM_ProjectName'), waitTime)

WebUI.clickOffset(findTestObject('Object Repository/CRM/SearchProjects/click_checkBox_After_Filtering_CRM_ProjectName'), 50, 10)

WebUI.waitForElementClickable(findTestObject('CRM/SearchProjects/button_Filter_CRM_ProjectName'), waitTime)

WebUI.takeScreenshot()

WebUI.click(findTestObject('CRM/SearchProjects/button_Filter_CRM_ProjectName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent(ProjName, false)

WebUI.verifyTextPresent(ProjDesc, false)

WebUI.verifyTextPresent(ProjStatus, false)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('CRM/SearchProjects/clear_Filter_ProjectName'), waitTime)

WebUI.click(findTestObject('CRM/SearchProjects/clear_Filter_ProjectName'))

WebUI.takeScreenshot()

