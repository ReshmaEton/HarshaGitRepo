import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CommonCases/Login'), [('AppUrl') : AppUrl, ('UserName') : UserName, ('Password') : Password
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

if (((SummaryTransactionType == 'Withdrawals-Cash') | (SummaryTransactionType == 'Withdrawals-Noncash')) & ((SummaryTransactionMethod == 'Cross-Entity Xfer - Cash') | (SummaryTransactionMethod == 'Cross-Entity Xfer - Non Cash'))) {
    WebUI.callTestCase(findTestCase('CommonCases/Account'), [('AccNum') : AccNum2, ('AccName') : AccName2, ('AccType') : AccType
            , ('Custodian') : Custodian, ('TradingCustodian') : TradingCustodian, ('RollupNameStrategy') : RollupNameStrategy
            , ('AccCurrency') : AccCurrency, ('TransAuthority') : TransAuthority, ('AccStatus') : AccStatus, ('PledgedAcc') : PledgedAcc
            , ('TreasuryEdge') : TreasuryEdge, ('BillPayFlag') : BillPayFlag, ('ExpenseFlag') : ExpenseFlag, ('TaxCostMethod') : TaxCostMethod
            , ('AccAdvCustody') : AccAdvCustody, ('SECclass') : SECclass, ('PricDataSource') : PricDataSource, ('GLaccEqt') : GLaccEqt
            , ('GLaccCash') : GLaccCash, ('ANHstatus') : ANHstatus, ('CapitalAllocation') : CapitalAllocation, ('waitTime') : waitTime], 
        FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_Close_AfterFinalApproval_FromEntityScreen'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_Close_AfterFinalApproval_FromEntityScreen'))

// Uploading File For Letter Of Authorization.
'Uploading File For LOA'
WebUI.callTestCase(findTestCase('CommonCases/BillPayTemplateLOAUpload'), [('UploadingFileForManualPricing') : UploadingFileForLOA
        , ('DcoumentUploadedVerification') : ValidatingTextAfterUpload, ('waitTime') : waitTime, ('RelationName') : RelationName
        , ('RelationType') : RelationType, ('FileDescHomeMyWork') : FileDescHomeMyWork, ('RouteToWorkFlow') : RouteToWorkFlow
        , ('DocumentTitle') : DocumentTitle, ('Content_Category') : Content_Category, ('Content_Type') : Content_Type, ('Document_LOA_SubType') : Document_LOA_SubType
        , ('EntLegalName') : EntLegalName, ('Document_LOA_EntityAll') : Document_LOA_EntityAll, ('Document_LOA_DateAsOf') : Document_LOA_DateAsOf
        , ('Document_LOA_Comment') : Document_LOA_Comment], FailureHandling.CONTINUE_ON_FAILURE)

//Operations
'Navigating to Operations-My Work- For Document Processing'
WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_Operations'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_Operations'))

//Operations-Transactions
'Navigate to Operations-Transactions'
WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_Transactions'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_Transactions'))

'Click on Templates Tab'
WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_Transactions_Templates'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_Transactions_Templates'))

WebUI.delay(waitTime)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Templates_CreateBillPayTemplate'))

//Summary Details
'Enter Summary Details of Bill Pay Template'
WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_TemplateType'), 
    waitTime)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_TemplateType'), 
    SummaryTemplateType, false)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_TemplateName'), 
    SummaryTemplateName)

'Enter Transaction Type Other than Fund Payee'
WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_TransactionType'), 
    SummaryTransactionType, false)

'Enter Transaction Method as ACH, FedWire, Auto Withdrawal'
WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_TransactionMethod'), 
    SummaryTransactionMethod, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/select_TransactionPostingType'), 
    SummaryTransactionPostingType, false)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_Client_or_Fund_or_Payor_Relationship'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_Client_or_Fund_or_Payor_Relationship_Input'), 
    SummaryClient_or_Payor_or_FundRelationship)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_Client_or_Fund_or_Payor_Relationship_Input'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_Client_or_Fund_or_Payor'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_Client_or_Fund_or_Payor_Input'), 
    SummaryClient_or_Payor_or_Fund)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_Client_or_Fund_or_Payor'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_Client_or_Transaction_Account'), 
    SummaryClient_or_TransactionAccount, false)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_TaxWithholding'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_TaxWithholding'), 
    SummaryTaxWithholding)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_TaxWithholding'), 
    Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_SalesTax'), SummarySalesTax)

WebUI.setText(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_WithholdingThreshold'), 
    SummaryWithholdingThreshold)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_Deliverable_Event'), 
    SummaryDeliverableEvent)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_Deliverable_Event'), 
    Keys.chord(Keys.TAB))

WebUI.takeScreenshot()

// Cross Transfer
if (((SummaryTransactionType == 'Withdrawals-Cash') | (SummaryTransactionType == 'Withdrawals-Noncash')) & ((SummaryTransactionMethod == 'Cross-Entity Xfer - Cash') | (SummaryTransactionMethod == 'Cross-Entity Xfer - Non Cash'))) {
    WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/CrossTransfer/select_Transferee_Or_ReceivingAccount_CrossTransfer_BillPayTemplate'), 
        waitTime)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/CreateBillPayTemplate/CrossTransfer/select_Transferee_Or_ReceivingAccount_CrossTransfer_BillPayTemplate'), 
        CrossTransfer_Transferee_Or_ReceivingAccount, false)

    WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/CrossTransfer/input_PercToPrincipal_CrossTransfer_BillPayTemplate'), 
        CrossTransfer_PercToPrincipal)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/CreateBillPayTemplate/CrossTransfer/select_TaxCodePrincipal_CrossTransfer_BillPayTemplate'), 
        CrossTransfer_TaxCodePrincipal, false)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/CreateBillPayTemplate/CrossTransfer/select_TaxCodeIncome_CrossTransfer_BillPayTemplate'), 
        CrossTransfer_TaxCodeIncome, false)

    WebUI.delay(2)

    WebUI.takeScreenshot()
} else {
    WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/CrossTransfer/select_TransfereeRelationship_CrossTransfer_BillPayTemplate'), 
        waitTime)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/CreateBillPayTemplate/CrossTransfer/select_TransfereeRelationship_CrossTransfer_BillPayTemplate'), 
        CrossTransfer_TransfereeRelationship, false)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/CreateBillPayTemplate/CrossTransfer/select_Transferee_Or_ReceivingAccount_CrossTransfer_BillPayTemplate'), 
        CrossTransfer_Transferee_Or_ReceivingAccount, false)

    WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/CrossTransfer/input_PercToPrincipal_CrossTransfer_BillPayTemplate'), 
        CrossTransfer_PercToPrincipal)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/CreateBillPayTemplate/CrossTransfer/select_TaxCodePrincipal_CrossTransfer_BillPayTemplate'), 
        CrossTransfer_TaxCodePrincipal, false)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/CreateBillPayTemplate/CrossTransfer/select_TaxCodeIncome_CrossTransfer_BillPayTemplate'), 
        CrossTransfer_TaxCodeIncome, false)

    WebUI.delay(2)

    WebUI.takeScreenshot()
}

'Enter Transaction Description Details'
WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/TransactionDescription/TransactionDesc_Remittance'), 
    TransactionDescRemittance)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/TransactionDescription/TransactionDesc_Description'), 
    TransactionDescDescription)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/TransactionDescription/TransactionDesc_Memo'), 
    TransactionDescMemo)

WebUI.takeScreenshot()

WebUI.delay(2)

'Enter Deemed Processing Details'
WebUI.sendKeys(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_PercToPrincipal'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_PercToPrincipal'), AccountingPercToPrincipal)

WebUI.clearText(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_PercToIncome'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_PercToIncome'), AccountingPercToIncome)

WebUI.selectOptionByLabel(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_ETCCode'), AccountingETCCode, 
    false)

WebUI.selectOptionByLabel(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_TaxCodePrincipal'), AccountingTaxCodePrincipal, 
    false)

WebUI.selectOptionByLabel(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_TaxCodeIncome'), AccountingTaxCodeIncome, 
    false)

WebUI.selectOptionByLabel(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_OnBehalfOf'), AccountingOnBehalfof, 
    false)

WebUI.sendKeys(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_Cusip'), AccountingCusip)

WebUI.sendKeys(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_Cusip'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_GLPayablesAccount'))

WebUI.sendKeys(findTestObject('Operations/CreateBillPayTemplate/Accounting/GLPayablesAccount_Input'), AccountingGLPayablesAccount)

WebUI.click(findTestObject('Operations/CreateBillPayTemplate/Accounting/GLPayablesAccount_Select'))

WebUI.click(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_GLExpenseAccount'))

WebUI.sendKeys(findTestObject('Operations/CreateBillPayTemplate/Accounting/GLExpenseAccount_Input'), AccountingGLExpenseAccount)

WebUI.click(findTestObject('Operations/CreateBillPayTemplate/Accounting/GLExpenseAccount_Select'))

WebUI.takeScreenshot()

WebUI.delay(2)

//Approving Created Bill Pay Template.
WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_LOA_Operations_Transactions_BillPayTemplate'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_AttachLOA_Operations_Transactions_BillPayTemplate'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Selecting_LetterOfAuthorization_Operations_Transactions_Templates_BillPayTemplate'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_Comments_BillPayTemplate'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_AddComment_BillPayTemplate'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_AddComment_BillPayTemplate'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/textarea_Add_a_Comment_editor_BillPayTemplate'), 
    BillPayTemplate_AddComment)

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_Save_AddingComment_BillPayTemplate'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_Save_AddingComment_BillPayTemplate'))

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_Attachments_BillPayTemplate'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_Attachments_BillPayTemplate'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_Upload_Attachments_BillPayTemplate'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/ChooseFiles_Attachments_UploadFile_BillPayTemplate'), 
    waitTime)

WebUI.uploadFile(findTestObject('Object Repository/Operations/CreateBillPayTemplate/ChooseFiles_Attachments_UploadFile_BillPayTemplate'), 
    BillPayTemplateAttachment)

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_AddToQueue_Attachments_Upload_BillPayTemplate'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_AddToQueue_Attachments_Upload_BillPayTemplate'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_StartUpload_Attachments_Upload_BillPayTemplate'))

WebUI.delay(5)

WebUI.verifyTextPresent(ValidatingTextAfterUpload, false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_Close_Attachments_Upload_BillPayTemplate'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_Create_BillPayTemplate'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_Create_BillPayTemplate'))

WebUI.delay(5)

//Approval Workflow
'Navigate to My Work List for approving Bill Pay template Created'
WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_Operations_MyWork'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_Operations_MyWork'))

WebUI.delay(5)

'Navigate to Templates Tab'
WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_Operations_MyWork_Templates'))

WebUI.delay(5)

WebUI.takeScreenshot()

'Select the processed Bill Pay Template from the Templates list'
WebUI.delay(waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Three_dot_Ops_MyWork_Templates_Filter_Relationship'))

WebUI.mouseOver(findTestObject('Object Repository/Operations/CreateBillPayTemplate/MouseHover_To_Filter_Ops_MyWork_Templates_Relationship'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/input_SearchRelationshipText_Ops_MyWork_Templates'))

WebUI.delay(waitTime)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/input_SearchRelationshipText_Ops_MyWork_Templates'), 
    RelationName)

WebUI.clickOffset(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Click_CheckBox_AfterFiltering_Ops_MyWork_Templates_Relationship'), 
    50, 10)

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_Filter_Ops_MyWork_Templates_Relationship'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_Filter_Ops_MyWork_Templates_Relationship'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.verifyTextPresent(RelationName, false)

for (int i = 1; i <= ApprovingCreateBillPayTemplate; i++) {
    if (WebUI.getText(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Validating_Relationship_And_Clicking_Ops_MyWork_Templates')).equalsIgnoreCase(
        RelationName)) {
        WebUI.mouseOver(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Validating_Relationship_And_Clicking_Ops_MyWork_Templates'))

        WebUI.delay(5)

        WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Validating_Relationship_And_Clicking_Ops_MyWork_Templates'))

        WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_Approve_BillPayTemplate_Ops_MyWork_Template'), 
            waitTime)

        WebUI.takeScreenshot()

        WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_LOA_Operations_Transactions_BillPayTemplate'))

        WebUI.delay(2)

        WebUI.takeScreenshot()

        WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_Comments_BillPayTemplate'))

        WebUI.takeScreenshot()

        WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_History_BillPayTemplate'))

        WebUI.takeScreenshot()

        WebUI.delay(2)

        WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_Approve_BillPayTemplate_Ops_MyWork_Template'))

        WebUI.delay(20)
    }
}

'Verifying Bill Pay Template is approved or not!'
WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_Transactions_Templates'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_Transactions_Templates'))

WebUI.delay(waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Three_Dot_Filtering_ClientEntity_Ops_Transactions_Templates_BillPayTemplate'))

WebUI.mouseOver(findTestObject('Object Repository/Operations/CreateBillPayTemplate/MouseHover_To_Filter_ClientEntity_Ops_Transactions_Templates_BillPayTemplates'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/input_SearchText_ClientEntity_Ops_Transactions_Templates_BillPayTemplate'), 
    EntLegalName)

WebUI.delay(2)

WebUI.clickOffset(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Click_CheckBox_AfterFiltering_Ops_Transactions_Templates_ClientEntity_BillPayTemplates'), 
    50, 10)

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_Filter_ClientEntity_Ops_Transactions_Templates_BillPayTemplates'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_Filter_ClientEntity_Ops_Transactions_Templates_BillPayTemplates'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('CommonCases/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

