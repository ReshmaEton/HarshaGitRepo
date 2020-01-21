import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
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

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/Transaction Processing/Clicking_On_Operations'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/Transaction Processing/Clicking_On_Operations'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/Transaction Processing/Clicking_On_Transaction Processing'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/Transaction Processing/Clicking_On_Transaction Processing'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/Transaction Processing/button_UploadBills'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/Transaction Processing/button_UploadBills'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/Transaction Processing/Clicking_On_ClickHere'), 
    waitTime)

CustomKeywords.'com.jira.customkeywords.CustomFunctions.uploadFileBillPayTransactionProcessing'(findTestObject('Operations/Transaction Processing/Clicking_On_ClickHere'), 
    uploadingFile)

WebUI.delay(waitTime)

