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

/*WebUI.callTestCase(findTestCase('CommonCases/Login'), [('AppUrl') : AppUrl, ('UserName') : UserName, ('Password') : Password
        , ('SecurityAns') : SecurityAns], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Relationship'), [('RelationName') : RelationName, ('RelationDesc') : RelationDesc
        , ('RelationStatus') : RelationStatus, ('SourceOfWealth') : SourceOfWealth, ('RelationType') : RelationType, ('Notes') : Notes
        , ('waitTime') : waitTime], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Entity'), [('EntLegalName') : EntLegalName, ('EntStatus') : EntStatus, ('EntType') : EntType
        , ('EntShortName') : EntShortName, ('EntTaxStatus') : EntTaxStatus, ('EntDueDeligenceType') : EntDueDeligenceType
        , ('EntCurrency') : EntCurrency, ('EntAccMethod') : EntAccMethod, ('EntChartOfAcc') : EntChartOfAcc, ('EntCalendr') : EntCalendr
        , ('EntClosingGrup') : EntClosingGrup, ('waitTime') : waitTime, ('EntNotes') : EntNotes, ('EntLegacyId') : EntLegacyId], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Account'), [('AccNum') : AccNum, ('AccName') : AccName, ('AccType') : AccType
        , ('Custodian') : Custodian, ('TradingCustodian') : TradingCustodian, ('RollupNameStrategy') : RollupNameStrategy
        , ('AccCurrency') : AccCurrency, ('TransAuthority') : TransAuthority, ('AccStatus') : AccStatus, ('PledgedAcc') : PledgedAcc
        , ('TreasuryEdge') : TreasuryEdge, ('BillPayFlag') : BillPayFlag, ('ExpenseFlag') : ExpenseFlag, ('TaxCostMethod') : TaxCostMethod
        , ('AccAdvCustody') : AccAdvCustody, ('SECclass') : SECclass, ('PricDataSource') : PricDataSource, ('GLaccEqt') : GLaccEqt
        , ('GLaccCash') : GLaccCash, ('ANHstatus') : ANHstatus, ('CapitalAllocation') : CapitalAllocation, ('waitTime') : waitTime], 
    FailureHandling.CONTINUE_ON_FAILURE)
*/
WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/button_Close'), waitTime)

WebUI.click(findTestObject('Operations/BulkUpload/button_Close'))

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/Clicking_On_Operations'), waitTime)

WebUI.click(findTestObject('Operations/BulkUpload/Clicking_On_Operations'))

WebUI.click(findTestObject('Operations/BulkUpload/Clicking_On_Operations_Transactions'))

WebUI.click(findTestObject('Operations/BulkUpload/Clicking_On_Operations_Transactions_Global'))

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/Clicking_On_Operations_Transactions_Global_Bulk Upload'), 
    waitTime)

WebUI.click(findTestObject('Operations/BulkUpload/Clicking_On_Operations_Transactions_Global_Bulk Upload'))

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/clicking_on_choose_files'), waitTime)

WebUI.verifyElementNotClickable(findTestObject('Operations/BulkUpload/button_Upload'))

WebUI.uploadFile(findTestObject('Operations/BulkUpload/clicking_on_choose_files'), UploadFileLocation)

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/button_Upload'), waitTime)

WebUI.verifyElementClickable(findTestObject('Operations/BulkUpload/button_Upload'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Operations/BulkUpload/button_Upload'))

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/button_Run Validation'), waitTime)

WebUI.click(findTestObject('Operations/BulkUpload/button_Run Validation'))

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/button_Ok_Success'), waitTime)

WebUI.click(findTestObject('Operations/BulkUpload/button_Ok_Success'))

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/button_Approve'), waitTime)

WebUI.click(findTestObject('Operations/BulkUpload/button_Approve'))

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/span_My Work'), waitTime)

WebUI.click(findTestObject('Operations/BulkUpload/span_My Work'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/My_work_Bulk_Transactions'), waitTime)

WebUI.click(findTestObject('Operations/BulkUpload/My_work_Bulk_Transactions'))

WebUI.delay(waitTime)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/filtering_relationship_under_bulk_transactions'), waitTime)

WebUI.click(findTestObject('Operations/BulkUpload/filtering_relationship_under_bulk_transactions'))

WebUI.mouseOver(findTestObject('Operations/BulkUpload/span_Filter_Relationship_Under_Bulk_Transactions'))

WebUI.sendKeys(findTestObject('Operations/BulkUpload/input_search_bul_transactions'), Bulk_Relationship)

WebUI.waitForElementVisible(findTestObject('Object Repository/Operations/BulkUpload/click_checkBox_After_Filtering_Operations_Bulk_Relationship'), 
    waitTime)

WebUI.clickOffset(findTestObject('Object Repository/Operations/BulkUpload/click_checkBox_After_Filtering_Operations_Bulk_Relationship'), 
    50, 10)

WebUI.click(findTestObject('Operations/BulkUpload/button_Filter_bulk_transactions'))

WebUI.delay(waitTime)

WebUI.takeScreenshot()

for (int i = 1; i <= BulkTransactionUpload; i++) {
    WebUI.click(findTestObject('Operations/BulkUpload/my_work_Bulk_Transactions_Relationship_FilteredVal'))

    WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/button_Approve_my_work_Bulk_Transactions'), waitTime)

    WebUI.click(findTestObject('Operations/BulkUpload/button_Approve_my_work_Bulk_Transactions'))

    WebUI.delay(waitTime)
}

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/My_Work_Verification'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/My_work_Bulk_Transactions_Clicking_OneMoreTime'))

/*not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Operations/BulkUpload/my_work_global_relationship_filter'))

not_run: WebUI.mouseOver(findTestObject('Operations/BulkUpload/span_Filter_global'))

not_run: WebUI.sendKeys(findTestObject('Operations/BulkUpload/input_search_global'), RelationName)

not_run: WebUI.waitForElementVisible(findTestObject('Object Repository/Operations/BulkUpload/click_checkBox_After_Filtering_Operations_Global_Relationship'), 
    waitTime)

not_run: WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/click_checkBox_After_Filtering_Operations_Global_Relationship'))

not_run: WebUI.click(findTestObject('Operations/BulkUpload/button_Filter_global'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/BulkUpload/Approve_Filtered_Transaction_RelationshipName_Global'), 
    waitTime)

not_run: WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/Approve_Filtered_Transaction_RelationshipName_Global'))
*/
WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/Clicking_On_Operations_Transactions'), waitTime)

WebUI.click(findTestObject('Operations/BulkUpload/Clicking_On_Operations_Transactions_Global'))

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/operations_global_relationshipname'), waitTime)

WebUI.sendKeys(findTestObject('Operations/BulkUpload/operations_global_relationshipname'), RelationName)

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/operations_global_search_button'), waitTime)

WebUI.click(findTestObject('Operations/BulkUpload/operations_global_search_button'))

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/Clicking_On_Operations_Transactions_Global_Bulk Upload'), 
    waitTime)

WebUI.verifyTextPresent(RelationName, false)

WebUI.verifyTextPresent(EntShortName, false)

WebUI.verifyTextPresent(CusipId, false)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('CRM/Relationship/Relationships_LHS'))

WebUI.click(findTestObject('CRM/Relationship/Relationship_Mgmt_LHS'))

WebUI.waitForElementClickable(findTestObject('CRM/Create Account/Search Accounts/span_Accounts'), waitTime)

WebUI.click(findTestObject('CRM/Create Account/Search Accounts/span_Accounts'))

WebUI.delay(5)

WebUI.click(findTestObject('CRM/Create Account/Search Accounts/ThreeDot_CRM_AccountName'))

WebUI.waitForElementVisible(findTestObject('Operations/BulkUpload/span_Validating_Filter_CRM_AccountName'), waitTime)

WebUI.mouseOver(findTestObject('Operations/BulkUpload/span_Validating_Filter_CRM_AccountName'))

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/inputTextBox_For_Entering_AccountName_AccountsSearch'), 
    waitTime)

WebUI.sendKeys(findTestObject('Operations/BulkUpload/inputTextBox_For_Entering_AccountName_AccountsSearch'), AccName)

WebUI.callTestCase(findTestCase('CommonCases/Filtering dropdown values'), [('EntFilterDropdown1') : EntFilterDropdown1, ('EntFilterDropdown2') : ''
        , ('DropdownRelation') : ''], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Operations/BulkUpload/button_Filter_Validating_CRM_AccountName'))

WebUI.verifyTextPresent(AccNum, false)

String AccountNumber = WebUI.getText(findTestObject('Object Repository/Operations/BulkUpload/validating_and_clicking on_acc_num'))

if (AccountNumber.equalsIgnoreCase(AccNum)) {
    WebUI.click(findTestObject('Operations/BulkUpload/validating_and_clicking on_acc_num'))

    WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/flitering_accnum_clickonTransactions'), waitTime)

    WebUI.click(findTestObject('Operations/BulkUpload/flitering_accnum_clickonTransactions'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/BulkUpload/flitering_accnum_clickonTransactions'), 
        waitTime)

    WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/flitering_accnum_clickonTransactions'))

    WebUI.verifyTextPresent(AccountNumber, false)

    WebUI.verifyTextPresent(CusipId, false)

    WebUI.takeScreenshot( //WebUI.callTestCase(findTestCase('CommonCases/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        )
}

WebUI.click(findTestObject('Object Repository/Operations/BulkUpload/button_Close_Click_Again'))

WebUI.delay(5)

