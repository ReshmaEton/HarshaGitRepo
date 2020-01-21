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

'For Logging Into App.'
WebUI.callTestCase(findTestCase('CommonCases/Login'), [('AppUrl') : AppUrl, ('UserName') : UserName, ('Password') : Password
        , ('SecurityAns') : SecurityAns], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(30)
'For Creating Relationship.'
WebUI.callTestCase(findTestCase('CommonCases/Relationship'), [('RelationName') : RelationName, ('RelationDesc') : RelationDesc
        , ('RelationStatus') : RelationStatus, ('SourceOfWealth') : SourceOfWealth, ('RelationType') : RelationType, ('Notes') : Notes], 
    FailureHandling.CONTINUE_ON_FAILURE)

'For Creating Entity.'
WebUI.callTestCase(findTestCase('CommonCases/Entity'), [('EntLegalName') : EntLegalName, ('EntStatus') : EntStatus, ('EntType') : EntType
        , ('EntShortName') : EntShortName, ('EntTaxStatus') : EntTaxStatus, ('EntDueDeligenceType') : EntDueDeligenceType
        , ('EntCurrency') : EntCurrency, ('EntAccMethod') : EntAccMethod, ('EntChartOfAcc') : EntChartOfAcc, ('EntCalendr') : EntCalendr
        , ('EntClosingGrup') : EntClosingGrup, ('waitTime') : 10, ('EntNotes') : EntNotes, ('EntLegacyId') : EntLegacyId], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('CRM/Create Entity/fill_entity_details/button_Edit'), waitTime)

if (EntType == 'Individual') {
    'For Filling the Data for Individual Under Entity Screen.'
    WebUI.click(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/button_Edit'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/input_Name Prefix_k-input ng-p'), 
        waitTime)

    WebUI.sendKeys(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/input_Name Prefix_k-input ng-p'), 
        IndivNamePrefix)

    WebUI.sendKeys(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/input_First name_ng-pristine n'), 
        IndivFirstName)

    WebUI.sendKeys(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/input_Middle name_ng-pristine'), 
        IndivMidName)

    WebUI.sendKeys(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/input_Last Name_ng-pristine ng'), 
        IndivLastName)

    WebUI.sendKeys(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/input_Name Suffix_k-input ng-p'), 
        IndivNameSuffix)

    WebUI.takeScreenshot()
		
	WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/tab-heading_Attachments_Individual_EntityScreen'), waitTime)
	
	WebUI.click(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/tab-heading_Attachments_Individual_EntityScreen'))
	
	WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/button_Upload_Attachments_Individual_EntityScreen'), waitTime)
	
	WebUI.click(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/button_Upload_Attachments_Individual_EntityScreen'))
	
	WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/Choose_Files_Attachments_Individual_EntityScreen'), waitTime)
	
	WebUI.uploadFile(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/Choose_Files_Attachments_Individual_EntityScreen'), UploadFileIndivEntityScreen)
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/button_AddToQueue_Attachments_Individual_EntityScreen'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/Clicking_On_Start Upload_Attachments_Individual_EntityScreen'))

	WebUI.delay(2)
	
	WebUI.verifyTextPresent(VerifyingFileUploadText, false)
	
	WebUI.click(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/button_Close_Attachments_Individual_EntityScreen'))
	
	WebUI.takeScreenshot()
	
	WebUI.click(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/tab-heading_Comments_Individual_EntityScreen'))
	
	WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/button_AddComment_Individual_EntityScreen'), waitTime)
	
	WebUI.click(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/button_AddComment_Individual_EntityScreen'))
	
	WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/textarea_AddComment_editor_Comments_Individual_EntityScreen'), waitTime)
	
	WebUI.sendKeys(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/textarea_AddComment_editor_Comments_Individual_EntityScreen'), AddCommentIndivEntityScreen)

	WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/button_Save_AddedComment_Individual_EntityScreen'), waitTime)
	
	WebUI.takeScreenshot()
	
	WebUI.click(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/button_Save_AddedComment_Individual_EntityScreen'))
	
	WebUI.delay(3)
	
	WebUI.takeScreenshot()	
	
	WebUI.click(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/tab-heading_History_Individual_EntityScreen'))
	
	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/button_Submit'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/button_Final Approval'), 
        waitTime)

	WebUI.click(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/tab-heading_History_Individual_EntityScreen'))

	WebUI.takeScreenshot()

    WebUI.click(findTestObject('Object Repository/CRM/Create Entity/fill_entity_individual_details/button_Final Approval'))

    WebUI.delay(4)

    WebUI.takeScreenshot()

    WebUI.waitForElementClickable(findTestObject('CRM/Create Entity/fill_entity_details/button_Edit'), waitTime)

    'For Filling Entity Details Under Entity Screen.'
    WebUI.click(findTestObject('CRM/Create Entity/fill_entity_details/button_Edit'))

    WebUI.waitForElementClickable(findTestObject('CRM/Create Entity/fill_entity_details/input_TaxpayerID_EntityScreen'), 
        waitTime)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_TaxpayerID_EntityScreen'), EntTaxPayerId)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_DateAddedAsProspect_EntityScreen'), EntDateAddAsProspect)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_EntityDateOfBirthInce_EntityScreen'), EntDOBIncepDate)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_DateAccepted_EntityScreen'), EntDateAccepted)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_GenerationLevel_EntityScreen'), EntGenLevel)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_DateClosed_EntityScreen'), EntDateClosed)

    WebUI.click(findTestObject('CRM/Create Entity/fill_entity_details/input_ConsentToElectDeliver_EntityScreen'))

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_ConsentToElectDeliver_EntityScreen'), Keys.chord(
            Keys.CONTROL, 'a'))

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_ConsentToElectDeliver_EntityScreen'), EntConsToElectDelivery)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_DateTermNoticeReceive_EntityScreen'), EntDateTermNotice)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_EntityAdvisor_EntityScreen'), EntityAdvisor)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_AdvisorCapacity_EntityScreen'), EntAdvisorCap)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_EntityNickname_EntityScreen'), EntNickName)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_ACHCompanyID_EntityScreen'), EntACHCompanyId)

    WebUI.sendKeys(findTestObject('Object Repository/CRM/Create Entity/fill_entity_details/input_OperatingAccount_EntityScreen'), 
        EntOperatingAccount)

    WebUI.takeScreenshot()

    WebUI.click(findTestObject('CRM/Create Entity/fill_entity_details/button_Submit'))

    WebUI.waitForElementVisible(findTestObject('CRM/Create Entity/fill_entity_details/button_Final Approval'), waitTime)

    WebUI.takeScreenshot()

    WebUI.click(findTestObject('CRM/Create Entity/fill_entity_details/button_Final Approval'))

    WebUI.delay(5)

    WebUI.takeScreenshot()
} else {
    'For Filling Entity Details Under Entity Screen.'
    WebUI.click(findTestObject('CRM/Create Entity/fill_entity_details/button_Edit'))

    WebUI.waitForElementClickable(findTestObject('CRM/Create Entity/fill_entity_details/input_TaxpayerID_EntityScreen'), 
        waitTime)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_TaxpayerID_EntityScreen'), EntTaxPayerId)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_DateAddedAsProspect_EntityScreen'), EntDateAddAsProspect)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_EntityDateOfBirthInce_EntityScreen'), EntDOBIncepDate)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_DateAccepted_EntityScreen'), EntDateAccepted)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_GenerationLevel_EntityScreen'), EntGenLevel)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_DateClosed_EntityScreen'), EntDateClosed)

    WebUI.click(findTestObject('CRM/Create Entity/fill_entity_details/input_ConsentToElectDeliver_EntityScreen'))

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_ConsentToElectDeliver_EntityScreen'), Keys.chord(
            Keys.CONTROL, 'a'))

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_ConsentToElectDeliver_EntityScreen'), EntConsToElectDelivery)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_DateTermNoticeReceive_EntityScreen'), EntDateTermNotice)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_EntityAdvisor_EntityScreen'), EntityAdvisor)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_AdvisorCapacity_EntityScreen'), EntAdvisorCap)

    WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_EntityNickname_EntityScreen'), EntNickName)

	WebUI.sendKeys(findTestObject('CRM/Create Entity/fill_entity_details/input_ACHCompanyID_EntityScreen'), EntACHCompanyId)
	
	WebUI.sendKeys(findTestObject('Object Repository/CRM/Create Entity/fill_entity_details/input_OperatingAccount_EntityScreen'), EntOperatingAccount)
	
    WebUI.takeScreenshot()

    WebUI.click(findTestObject('CRM/Create Entity/fill_entity_individual_details/button_Submit'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('CRM/Create Entity/fill_entity_individual_details/button_Final Approval'), 
        waitTime)

    WebUI.takeScreenshot()

    WebUI.click(findTestObject('CRM/Create Entity/fill_entity_individual_details/button_Final Approval'))

    WebUI.delay(5)

    WebUI.takeScreenshot()
}

'For Writting Notes Under Entity Screen.'
WebUI.waitForElementClickable(findTestObject('CRM/Create Entity/filling_notes_under_EntityScreen/div_New Note...'), waitTime)

WebUI.click(findTestObject('CRM/Create Entity/filling_notes_under_EntityScreen/div_New Note...'))

WebUI.delay(4)

WebUI.sendKeys(findTestObject('CRM/Create Entity/filling_notes_under_EntityScreen/input_Title_form-control ng-pr'), TitleForNotes)

WebUI.sendKeys(findTestObject('CRM/Create Entity/filling_notes_under_EntityScreen/handling_frame_note_desc/body_ClientDescrptionNote'), 
    DescForNotes)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/filling_notes_under_EntityScreen/a_Save'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/filling_notes_under_EntityScreen/button_Close_Under_EntityScreen'), 
    waitTime)

WebUI.click(findTestObject('CRM/Create Entity/filling_notes_under_EntityScreen/button_Close_Under_EntityScreen'))

WebUI.delay(5)

WebUI.callTestCase(findTestCase('CommonCases/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)