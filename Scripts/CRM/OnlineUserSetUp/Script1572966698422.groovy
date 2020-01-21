import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.Keys as Keys
import org.stringtemplate.v4.compiler.STParser.element_return as element_return
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
/*
WebUI.callTestCase(findTestCase('CommonCases/Relationship'), [('RelationName') : RelationName, ('RelationDesc') : RelationDesc
        , ('RelationStatus') : RelationStatus, ('SourceOfWealth') : RelationStatus, ('RelationType') : RelationType, ('Notes') : Notes], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Entity'), [('EntLegalName') : EntLegalName, ('EntStatus') : EntStatus, ('EntType') : EntType, ('EntShortName') : EntShortName, ('EntTaxStatus') : EntTaxStatus, ('EntDueDeligenceType') : EntDueDeligenceType, ('EntCurrency') : EntCurrency, ('EntAccMethod') : EntAccMethod, ('EntChartOfAcc') : EntChartOfAcc, ('EntCalendr') : EntCalendr, ('EntClosingGrup') : EntClosingGrup, ('waitTime') : 10, ('EntNotes') : EntNotes, ('EntLegacyId') : EntLegacyId], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('CRM/OnlineTenantPortalUserSetup/button_SetupUser_Setting_OnlineAccess'), waitTime)

WebUI.click(findTestObject('CRM/OnlineTenantPortalUserSetup/button_SetupUser_Setting_OnlineAccess'))

WebUI.waitForElementClickable(findTestObject('CRM/OnlineTenantPortalUserSetup/button_Edit_Under_SetupUser'), waitTime)

WebUI.click(findTestObject('CRM/OnlineTenantPortalUserSetup/button_Edit_Under_SetupUser'))

WebUI.waitForElementClickable(findTestObject('CRM/OnlineTenantPortalUserSetup/button_Exit_Edits_SetupUser'), waitTime)

WebUI.click(findTestObject('CRM/OnlineTenantPortalUserSetup/button_Exit_Edits_SetupUser'))

WebUI.waitForElementClickable(findTestObject('CRM/OnlineTenantPortalUserSetup/button_View Edits_SetupUser'), waitTime)

WebUI.click(findTestObject('CRM/OnlineTenantPortalUserSetup/button_View Edits_SetupUser'))

WebUI.waitForElementClickable(findTestObject('CRM/OnlineTenantPortalUserSetup/input_Username_SetupUser'), waitTime)

WebUI.sendKeys(findTestObject('CRM/OnlineTenantPortalUserSetup/input_Username_SetupUser'), SetupUserName)

WebUI.sendKeys(findTestObject('CRM/OnlineTenantPortalUserSetup/input_User Email_SetupUser'), SetupEmail)

WebUI.selectOptionByLabel(findTestObject('CRM/OnlineTenantPortalUserSetup/select_PortalAccess_SetupUser'), SetupPortalAccess, 
    false)

WebUI.click(findTestObject('CRM/OnlineTenantPortalUserSetup/Clicking_CheckBox_ClientRelationshipManager'))

WebUI.click(findTestObject('CRM/OnlineTenantPortalUserSetup/Clicking_CheckBox_ClientServiceTeam'))

WebUI.click(findTestObject('CRM/OnlineTenantPortalUserSetup/Clicking_CheckBox_Tenant Manager'))

WebUI.click(findTestObject('CRM/OnlineTenantPortalUserSetup/Clicking_CheckBox_DocumentViewer'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('CRM/OnlineTenantPortalUserSetup/Clicking_On_Comments_SetupUser'), waitTime)

WebUI.click(findTestObject('CRM/OnlineTenantPortalUserSetup/Clicking_On_Comments_SetupUser'))

WebUI.waitForElementClickable(findTestObject('CRM/OnlineTenantPortalUserSetup/button_AddComment_Under_CommentsTab'), waitTime)

WebUI.click(findTestObject('CRM/OnlineTenantPortalUserSetup/button_AddComment_Under_CommentsTab'))

WebUI.waitForElementClickable(findTestObject('CRM/OnlineTenantPortalUserSetup/input_AddComment_Under_CommentsTab'), waitTime)

WebUI.sendKeys(findTestObject('CRM/OnlineTenantPortalUserSetup/input_AddComment_Under_CommentsTab'), AddCommentUserSetup)

WebUI.click(findTestObject('CRM/OnlineTenantPortalUserSetup/button_Save_AddedComment_UnderCommentsTab'))

WebUI.delay(2)

WebUI.takeScreenshot()

for (int i=0; i<ApprovalForUserSetup; i++)
{
	WebUI.waitForElementClickable(findTestObject('CRM/OnlineTenantPortalUserSetup/button_Approve_UserSetup'), waitTime)
	
	WebUI.click(findTestObject('CRM/OnlineTenantPortalUserSetup/button_Approve_UserSetup'))
	
	WebUI.waitForElementClickable(findTestObject('CRM/OnlineTenantPortalUserSetup/button_View Edits_SetupUser'), waitTime)
	
	WebUI.click(findTestObject('CRM/OnlineTenantPortalUserSetup/button_View Edits_SetupUser'))
	
	WebUI.waitForElementClickable(findTestObject('CRM/OnlineTenantPortalUserSetup/Clicking_On_History_SetupUser'), waitTime)
	
	WebUI.click(findTestObject('CRM/OnlineTenantPortalUserSetup/Clicking_On_History_SetupUser'))
	
	WebUI.delay(2)
	
	WebUI.takeScreenshot()
}

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/button_FinalApproval_UserSetup'), waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/button_FinalApproval_UserSetup'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Clicking_On_Close_After_UserSetup'), waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Clicking_On_Close_After_UserSetup'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/button_Clicking_On_Send_Welcome_Mail'))

WebUI.delay(waitTime)
*/
/*
// Visual Restrictions.

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Clicking_On_SetupTab'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Clicking_On_SetupTab'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Clicking_On_Staff_Under_SetupTab'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Clicking_On_Staff_Under_SetupTab'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Clicking_On_VisibilityRestrictions'), 
    waitTime)

WebUI.scrollToElement(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Clicking_On_VisibilityRestrictions'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Clicking_On_VisibilityRestrictions'))

WebUI.scrollToElement(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/button_Create_VisibilityRestriction'), 
    waitTime)

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/button_Create_VisibilityRestriction'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/button_Create_VisibilityRestriction'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/button_Create_VisibilityRestriction'), 
    waitTime)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/select_(Please Select)_User_VisibilityRestrictions'), 
    EntLegalName, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/select_(Please Select)_Hidden_Relationship_VisibilityRestrictions'), 
    RelationName, false)

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/button_AddComment_VisibilityRestrictions'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/button_AddComment_VisibilityRestrictions'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/textarea_AddaComment_editor_VisibilityResctrictions'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/textarea_AddaComment_editor_VisibilityResctrictions'), 
    WebUI.concatenate(RelationName, RestrictionAddComment))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/button_Save_AddComment_VisibilityResctrictions'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/button_Save_AddComment_VisibilityResctrictions'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/button_Create_SettingUp_Restriction'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/button_Create_SettingUp_Restriction'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Clicking_on_Home_Tab'), waitTime)

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Clicking_on_Home_Tab'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Clicking_on_Home_Tab'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Clicking_On_HomeMyWork'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Clicking_On_HomeMyWork'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Three_dot_Filtering_Relationship_HomeMyWork'), 
    waitTime)

WebUI.scrollToElement(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Move_To_Work In Progress_Under_HomeMyWork'), 
    waitTime)

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Three_dot_Filtering_Relationship_HomeMyWork'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Three_dot_Filtering_Relationship_HomeMyWork'))

WebUI.mouseOver(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Mouse_Hover_To_Filter_HomeMyWork_Relationship'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/input_Search_Text_For_HomeMyWork_Relationship'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/input_Search_Text_For_HomeMyWork_Relationship'), 
    RelationName)

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/click_checkBox_After_Filtering_HomeMyWork_RelationshipName'), 
    waitTime)

WebUI.clickOffset(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/click_checkBox_After_Filtering_HomeMyWork_RelationshipName'), 
    50, 10)

WebUI.waitForElementClickable(findTestObject('CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/button_Filter_HomeMyWork_RelationshipName'), 
    waitTime)

WebUI.click(findTestObject('CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/button_Filter_HomeMyWork_RelationshipName'))

for (int j = 0; j < ApprovalForVisibilityRestriction; j++) {
    if (WebUI.getText(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/validating_RelationshiName_HomeMyWork')).equalsIgnoreCase(
        RelationName)) {
        WebUI.mouseOver(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/validating_RelationshiName_HomeMyWork'))

        WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/validating_RelationshiName_HomeMyWork'))

        WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/button_Approve_HomeMyWork'), 
            waitTime)

        WebUI.takeScreenshot()

        WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Clicking_On_History_HomeMyWork'))

        WebUI.takeScreenshot()

        WebUI.delay(2)

        WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/button_Approve_HomeMyWork'))

        WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/Three_dot_Filtering_Relationship_HomeMyWork'), 
            waitTime)
    }
}

WebUI.delay(2)

WebUI.callTestCase(findTestCase('CommonCases/Logout'), [('waitTime') : 10], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)
*/

//Login To Newly Created User
WebUI.callTestCase(findTestCase('CommonCases/Login'), [('AppUrl') : AppUrl, ('UserName') : SetupUserName, ('Password') : Password
        , ('SecurityAns') : SecurityAns], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Clicking_On_RelationshipsTab'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Clicking_On_My Work_Under_RelationshipTab'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Clicking_On_My Work_Under_RelationshipTab'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Three_Dot_RelationshipFilter_Under_RelationshipMyWork'), 
    waitTime)

WebUI.scrollToElement(findTestObject('CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Move_To_Element_Work In Progress_Under_Relationship_HomeMyWork'), 
    waitTime)

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Three_Dot_RelationshipFilter_Under_RelationshipMyWork'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Three_Dot_RelationshipFilter_Under_RelationshipMyWork'))

WebUI.mouseOver(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Mouse_Hover_To_Filter_Under_RelationshipMyWork'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/input_SearchText_Under_RelationshipTab_MyWork'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/input_SearchText_Under_RelationshipTab_MyWork'), 
    RelationName)

WebUI.verifyTextNotPresent(RelationName, false)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Clicking_On_OperationsTab'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Clicking_On_OperationsTab'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Clicking_On_Operations_My Work'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Clicking_On_Operations_My Work'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Clicking_On_Initiated_Under_Operations_MyWork'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Three_Dot_Filtering_Relationship_Operations_MyWorkInitiated'))

WebUI.mouseOver(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/mouse_Hover_To_Filter_Operations_MyWork_Initiated_Relationship'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/input_SearchText_Operations_MyWork_Initiated_RelationshipName'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/input_SearchText_Operations_MyWork_Initiated_RelationshipName'), 
    RelationName)

WebUI.delay(2)

WebUI.verifyTextNotPresent(RelationName, false)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Clicking_On_Operations_TransactionsTab'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Clicking_On_Operations_TransactionsTab'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Clicking_On_Operations_Transactions_Global'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Clicking_On_Operations_Transactions_Global'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/input_Relationship_Operations_Transactions_Global'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/input_Relationship_Operations_Transactions_Global'), 
    RelationName)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/button_Search_Operations_Transactions_Global'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/button_Search_Operations_Transactions_Global'))

WebUI.delay(waitTime)

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Three_Dot_RelationshipFilter_Operations_Transactions_Global'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/Three_Dot_RelationshipFilter_Operations_Transactions_Global'))

WebUI.mouseOver(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/mouse_Hover_To_Filter_Relationship_Operations_Transactions_Global'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/input_SearchText_Operations_Transactions_Global'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/input_SearchText_Operations_Transactions_Global'), 
    RelationName)

WebUI.verifyTextNotPresent(RelationName, false)

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Object Repository/CRM/OnlineTenantPortalUserSetup/Setup/Setup_Staff/VisibilityResctrictions/LoginToNewlyCreatedUser/input_SearchText_Operations_Transactions_Global'), Keys.chord(Keys.PAGE_UP))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Login_logout/Page_logout/logoutoption arrow'), waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Login_logout/Page_logout/logoutoption arrow'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Login_logout/Page_logout/span_Log out'), waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Login_logout/Page_logout/span_Log out'))

WebUI.delay(5)

WebUI.closeBrowser()
