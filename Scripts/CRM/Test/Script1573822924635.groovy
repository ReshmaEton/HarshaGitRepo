import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

KeywordLogger log = new KeywordLogger()

WebUI.callTestCase(findTestCase('CommonCases/Login'), [('AppUrl') : AppUrl, ('UserName') : UserName, ('Password') : Password
        , ('SecurityAns') : SecurityAns], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CRM/Test/span_Relationships'))

WebUI.click(findTestObject('CRM/Test/span_Relationship Mgmt'))

WebUI.waitForElementClickable(findTestObject('CRM/Test/span_Entities'), 10)

WebUI.click(findTestObject('CRM/Test/span_Entities'))

WebUI.waitForElementClickable(findTestObject('CRM/Test/td_Rumbough'), 10)

WebUI.click(findTestObject('CRM/Test/td_Rumbough'))

WebUI.waitForElementClickable(findTestObject('CRM/Test/div_This user has already been'), 10)

String text = WebUI.getText(findTestObject('CRM/Test/div_This user has already been'))

println text

log.logInfo(text)

WebUI.delay(10)

