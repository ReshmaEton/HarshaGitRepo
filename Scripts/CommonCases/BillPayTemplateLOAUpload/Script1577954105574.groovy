import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
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

/*WebUI.callTestCase(findTestCase('CommonCases/Login'), [('AppUrl') : AppUrl, ('UserName') : UserName, ('Password') : Password
        , ('SecurityAns') : SecurityAns], FailureHandling.CONTINUE_ON_FAILURE)
*/
WebUI.click(findTestObject('Operations/CreateBillPayTemplate/FileUploadForLOA/Clicking_On_HomeTab'))

WebUI.callTestCase(findTestCase('CommonCases/ManualPricingFileUpload'), [('waitTime') : waitTime, ('UploadingFileForManualPricing') : UploadingFileForManualPricing
        , ('DcoumentUploadedVerification') : DcoumentUploadedVerification, ('RelationName') : RelationName, ('RelationType') : RelationType
        , ('FileDescHomeMyWork') : FileDescHomeMyWork, ('RouteToWorkFlow') : RouteToWorkFlow, ('DocumentTitle') : DocumentTitle], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Operations/CreateBillPayTemplate/FileUploadForLOA/Validating_RelationName_HomeMyWork'), 
    waitTime)

WebUI.click(findTestObject('Operations/CreateBillPayTemplate/FileUploadForLOA/Validating_RelationName_HomeMyWork'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/Clicking_On_button_Content_Type'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/Clicking_On_button_Content_Type'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/input_Category_Under_Content_Type_HomeMyWork'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/input_Category_Under_Content_Type_HomeMyWork'), 
    Content_Category)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/input_Category_Under_Content_Type_HomeMyWork'), 
    Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/input_ContentType_Under_Content_Type'), 
    Content_Type)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/input_ContentType_Under_Content_Type'), 
    Keys.chord(Keys.TAB))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/button_Select_ContentType_HomeMyWork'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/button_Select_ContentType_HomeMyWork'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/Clicking_On_button_Target'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/input_Entity_Under_Target_HomeMyWork'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/input_Entity_Under_Target_HomeMyWork'), 
    EntLegalName)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/input_Entity_Under_Target_HomeMyWork'), 
    Keys.chord(Keys.TAB))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/button_Select_Target_HomeMyWork'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/button_Select_Target_HomeMyWork'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/input_SubType_HomeMyWork'), 
    Document_LOA_SubType)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/input_SubType_HomeMyWork'), 
    Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/input_Entity-All_HomeMyWork'), 
    Document_LOA_EntityAll)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/input_Entity-All_HomeMyWork'), 
    Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/input_DateAsOf_HomeMyWork'), 
    Document_LOA_DateAsOf)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/input_DateAsOf_HomeMyWork'), 
    Keys.chord(Keys.TAB))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/Clicking_On_Comments_HomeMyWork'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/button_AddComment_HomeMyWork'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/button_AddComment_HomeMyWork'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/textarea_AddComment_Editor_HomeMyWork'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/textarea_AddComment_Editor_HomeMyWork'), 
    Document_LOA_Comment)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/button_Save_Comments_HomeMyWork'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/button_Save_Comments_HomeMyWork'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/Clicking_On_History_HomeMyWork'), 
    waitTime)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/Clicking_On_History_HomeMyWork'))

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/button_Approve_LOA_HomeMyWork'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/button_Approve_LOA_HomeMyWork'))

WebUI.delay(waitTime)

WebUI.click(findTestObject('Operations/CreateBillPayTemplate/FileUploadForLOA/Validating_RelationName_HomeMyWork'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/button_Approve_LOA_HomeMyWork'), 
    waitTime)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/Clicking_On_Comments_FinalApproval_HomeMyWork'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/FileUploadForLOA/button_Approve_LOA_HomeMyWork'))

WebUI.delay(waitTime)

