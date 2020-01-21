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

//Create Address
WebUI.waitForElementClickable(findTestObject('CRM/Address/CreateAddress_AfterRelationship/AddressTab_AfterRelationship'), 
    waitTime)

WebUI.click(findTestObject('CRM/Address/CreateAddress_AfterRelationship/AddressTab_AfterRelationship'))

WebUI.click(findTestObject('CRM/Address/CreateAddress_AfterRelationship/AddressPlusIcon_AfterRelationship'))

WebUI.setText(findTestObject('CRM/Address/CreateAddress_AfterRelationship/AddressNameAndDescription_AfterRelationship'), 
    Add_Name)

WebUI.setText(findTestObject('CRM/Address/CreateAddress_AfterRelationship/AddressLine 1_AfterRelationship'), Address1)

WebUI.setText(findTestObject('CRM/Address/CreateAddress_AfterRelationship/AddressLine 2_AfterRelationship'), Address2)

WebUI.setText(findTestObject('CRM/Address/CreateAddress_AfterRelationship/AddressLine 3_AfterRelationship'), Address3)

WebUI.setText(findTestObject('CRM/Address/CreateAddress_AfterRelationship/City_AfterRelationship'), City)

WebUI.setText(findTestObject('CRM/Address/CreateAddress_AfterRelationship/State Province_AfterRelationship'), StateProvince)

WebUI.setText(findTestObject('CRM/Address/CreateAddress_AfterRelationship/ZipPostalCode_AfterRelationship'), ZipCode)

WebUI.setText(findTestObject('CRM/Address/CreateAddress_AfterRelationship/Zip 4_AfterRelationship'), Zip4)

WebUI.setText(findTestObject('CRM/Address/CreateAddress_AfterRelationship/AddressPhoneLandline_AfterRelationship'), AddressPhone)

WebUI.setText(findTestObject('CRM/Address/CreateAddress_AfterRelationship/AddressFaxLandline_AfterRelationship'), AddressFax)

WebUI.selectOptionByLabel(findTestObject('CRM/Address/CreateAddress_AfterRelationship/Address_Status_AfterRelationship'), 
    AddStatus, false)

WebUI.selectOptionByLabel(findTestObject('CRM/Address/CreateAddress_AfterRelationship/Address_Asset_AfterRelationship'), 
    AddAsset, false)

WebUI.setText(findTestObject('CRM/Address/CreateAddress_AfterRelationship/AddressDescription_AfterRelationship'), AddDesc)

WebUI.sendKeys(findTestObject('CRM/Address/CreateAddress_AfterRelationship/AddressNote_AfterRelationship'), AddNote)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('CRM/Address/CreateAddress_AfterRelationship/tab-heading_Attachments_Under_Relationship_AddressTab'))

WebUI.waitForElementClickable(findTestObject('CRM/Address/CreateAddress_AfterRelationship/button_Upload_Attachments_Under_Relationship_AddressTab'), 
    waitTime)

WebUI.click(findTestObject('CRM/Address/CreateAddress_AfterRelationship/button_Upload_Attachments_Under_Relationship_AddressTab'))

WebUI.waitForElementClickable(findTestObject('CRM/Address/CreateAddress_AfterRelationship/ChooseFiles_Attachments_Under_Relationship_AddressTab'), 
    waitTime)

WebUI.uploadFile(findTestObject('CRM/Address/CreateAddress_AfterRelationship/ChooseFiles_Attachments_Under_Relationship_AddressTab'), 
    Rel_UploadFileInAddressTab)

WebUI.waitForElementClickable(findTestObject('CRM/Address/CreateAddress_AfterRelationship/button_AddToQueue_Attachments_Under_Relationship_AddressTab'), 
    waitTime)

WebUI.click(findTestObject('CRM/Address/CreateAddress_AfterRelationship/button_AddToQueue_Attachments_Under_Relationship_AddressTab'))

WebUI.waitForElementClickable(findTestObject('CRM/Address/CreateAddress_AfterRelationship/Clicking_On_StartUpload_Attachments_Under_Relationship_AddressTab'), 
    waitTime)

WebUI.click(findTestObject('CRM/Address/CreateAddress_AfterRelationship/Clicking_On_StartUpload_Attachments_Under_Relationship_AddressTab'))

WebUI.waitForElementClickable(findTestObject('CRM/Address/CreateAddress_AfterRelationship/button_Close_After_File_Upload_Attachments_Under_Relationship_AddressTab'), 
    waitTime)

WebUI.verifyTextPresent(Rel_VerifyingTextAfterUploadingInAddressTab, false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('CRM/Address/CreateAddress_AfterRelationship/button_Close_After_File_Upload_Attachments_Under_Relationship_AddressTab'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('CRM/Address/CreateAddress_AfterRelationship/tab-heading_Comments_Under_Relationship_AddressTab'), 
    waitTime)

WebUI.click(findTestObject('CRM/Address/CreateAddress_AfterRelationship/tab-heading_Comments_Under_Relationship_AddressTab'))

WebUI.waitForElementClickable(findTestObject('CRM/Address/CreateAddress_AfterRelationship/button_AddComment_CommentsTab_Under_Relationship_AddressTab'), 
    waitTime)

WebUI.click(findTestObject('CRM/Address/CreateAddress_AfterRelationship/button_AddComment_CommentsTab_Under_Relationship_AddressTab'))

WebUI.waitForElementClickable(findTestObject('CRM/Address/CreateAddress_AfterRelationship/textarea_AddComment_Editor_Comments_Under_Relationship_AddressTab'), 
    waitTime)

WebUI.sendKeys(findTestObject('CRM/Address/CreateAddress_AfterRelationship/textarea_AddComment_Editor_Comments_Under_Relationship_AddressTab'), 
    Rel_AddCommentAddressTab)

WebUI.click(findTestObject('CRM/Address/CreateAddress_AfterRelationship/button_Save_AddComment_CommentTab_Under_Relationship_AddressTab'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('CRM/Address/CreateAddress_AfterRelationship/tab-heading_History_Under_Relationship_AddressTab'), 
    waitTime)

WebUI.click(findTestObject('CRM/Address/CreateAddress_AfterRelationship/tab-heading_History_Under_Relationship_AddressTab'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('CRM/Address/CreateAddress_AfterRelationship/Address_Submit_AfterRelationship'), 
    waitTime)

WebUI.click(findTestObject('CRM/Address/CreateAddress_AfterRelationship/Address_Submit_AfterRelationship'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('CRM/Address/CreateAddress_AfterRelationship/tab-heading_History_Under_Relationship_AddressTab'), 
    waitTime)

WebUI.click(findTestObject('CRM/Address/CreateAddress_AfterRelationship/tab-heading_History_Under_Relationship_AddressTab'))

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('CRM/Address/CreateAddress_AfterRelationship/Address_FinalApproval_AfterRelationship'), 
    waitTime)

WebUI.click(findTestObject('CRM/Address/CreateAddress_AfterRelationship/Address_FinalApproval_AfterRelationship'))

WebUI.delay(5)

WebUI.click(findTestObject('CRM/Address/CreateAddress_AfterRelationship/Clicking_On_Back_Button_After_FillingAddress'))

