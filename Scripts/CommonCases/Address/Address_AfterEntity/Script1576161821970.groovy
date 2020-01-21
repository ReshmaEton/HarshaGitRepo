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

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/tab-heading_Address_EntityScreen'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/tab-heading_Address_EntityScreen'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/button_Plus_CreateAddress_UnderEntityScreen'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/button_Plus_CreateAddress_UnderEntityScreen'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/select_Address_UnderEntityScreen'), 
    waitTime)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/select_Address_UnderEntityScreen'), 
    WebUI.concatenate(Add_Name, ' ', Address1), false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/select_AddressType_UnderEntityScreen'), 
    AddressType, false)

WebUI.sendKeys(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/input_EffectiveDate_ForAddress_UnderEntityScreen'), Address_EffectiveDate)

WebUI.sendKeys(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/input_EffectiveDate_ForAddress_UnderEntityScreen'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/input_EndDate_ForAddress_UnderEntityScreen'), Address_EndDate)

WebUI.sendKeys(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/input_EndDate_ForAddress_UnderEntityScreen'), Keys.chord(Keys.TAB))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/Clicking_On_AttachmentsTab_CreateAddress_UnderEntityScreen'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/Clicking_On_AttachmentsTab_CreateAddress_UnderEntityScreen'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/button_Upload_Attachments_CreateAddress_UnderEntityScreen'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/button_Upload_Attachments_CreateAddress_UnderEntityScreen'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/Choose_Files_AttachmentUpload_CreateAddress_UnderEntityScreen'), 
    waitTime)

WebUI.uploadFile(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/Choose_Files_AttachmentUpload_CreateAddress_UnderEntityScreen'), 
    Ent_UploadFileInAddressTab)

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/button_AddToQueue_Attachments_CreateAddress_UnderEntityScreen'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/button_AddToQueue_Attachments_CreateAddress_UnderEntityScreen'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/Clicking_On_StartUpload_Attachments_UnderEntityScreen'), 
    waitTime)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/Clicking_On_StartUpload_Attachments_UnderEntityScreen'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/button_Close_Attachments_CreateAddress_UnderEntityScreen'), 
    waitTime)

WebUI.verifyTextPresent(Ent_VerifyingTextAfterUploadingInAddressTab, false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/button_Close_Attachments_CreateAddress_UnderEntityScreen'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/Clicking_On_Comments_CreateAddress_UnderEntityScreen'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/Clicking_On_Comments_CreateAddress_UnderEntityScreen'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/button_AddComment_Comments_CreateAddress_UnderEntityScreen'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/button_AddComment_Comments_CreateAddress_UnderEntityScreen'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/textarea_AddComment_Editor_CreateAddress_UnderEntityScreen'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/textarea_AddComment_Editor_CreateAddress_UnderEntityScreen'), 
    Ent_AddCommentAddressTab)

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/button_Save_Comments_CreateAddress_UnderEntityScreen'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/button_Save_Comments_CreateAddress_UnderEntityScreen'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/Clicking_On_History_CreateAddress_UnderEntityScreen'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/button_Submit_CreateAddress_UnderEntityScreen'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/button_Submit_CreateAddress_UnderEntityScreen'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/button_FinalApproval_CreateAddress_UnderEntityScreen'), 
    waitTime)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/button_FinalApproval_CreateAddress_UnderEntityScreen'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/Clicking_On_BackButton_AfterFilling Address_UnderEntityScreen'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Address/CreateAddress_AfterEntity/Clicking_On_BackButton_AfterFilling Address_UnderEntityScreen'))

