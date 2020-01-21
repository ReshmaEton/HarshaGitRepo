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
import org.openqa.selenium.Keys as Keys

'Login To Application.'
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

WebUI.callTestCase(findTestCase('CRM/Create Wire Instructions'), [('waitTime') : waitTime, ('WireInstructDesc') : WireInstructDesc
        , ('WiredInstructBankAccNum') : WiredInstructBankAccNum, ('WireType') : WireType, ('UploadAttachmentWireInstructions') : 'C:\\Users\\Harsha.Konduru\\Desktop\\Google.jpg'
        , ('ValidatingTextAfterUpload') : 'Upload Successful', ('AddCommentWiredInstruction') : AddCommentWiredInstruction
        , ('ABANumber') : ABANumber], FailureHandling.CONTINUE_ON_FAILURE)

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
	RelationName)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_Client_or_Fund_or_Payor_Relationship_Input'),
	Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_Client_or_Fund_or_Payor'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Summary/BillPay_Summary_Client_or_Fund_or_Payor_Input'),
	EntLegalName)

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

WebUI.delay(2)

//WireDetails
WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/CreateBillPayTemplate/WireDetails/WireDetails_CounterPartyRelationship'),
	WireDetailsCounterpartyRelationship, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/CreateBillPayTemplate/WireDetails/WireDetails_Counterparty'),
	WireDetailsCounterparty, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/CreateBillPayTemplate/WireDetails/WireDetails_WiringInstructions'),
	WireInstructDesc, false)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/WireDetails/WireDetails_ForFurtherCreditto'),
	Keys.chord(Keys.PAGE_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/WireDetails/WireDetails_ForFurtherCreditto'),
	WireDetailsForFurtherCreditto)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/WireDetails/WireDetails_ForFurtherCredittoACC'),
	WireDetailsForFurtherCredittoACC)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/WireDetails/WireDetails_ForFurtherCredittoAddress'),
	WireDetailsForFurtherCredittoAddress)

WebUI.takeScreenshot()

WebUI.delay(2)

'Enter Transaction Description details'
WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/TransactionDescription/TransactionDesc_Remittance'),
	TransactionDescRemittance)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/TransactionDescription/TransactionDesc_Description'),
	TransactionDescDescription)

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/TransactionDescription/TransactionDesc_Memo'),
	TransactionDescMemo)

WebUI.takeScreenshot()

WebUI.delay(2)

//WebUI.click(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/DeemedProcessing/BillPay_EnabledDeemedTransactions_CheckBox'))
//WebUI.click(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/DeemedProcessing/BillPay_DeemedProcessings_Template'))
'Enter Deemed Processing Details'
WebUI.sendKeys(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_PercToPrincipal'),
	Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_PercToPrincipal'),
	AccountingPerctoPrincipal)

WebUI.clearText(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_PercToIncome'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_PercToIncome'),
	AccountingPerctoIncome)

WebUI.selectOptionByLabel(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_ETCCode'),
	AccountingETCCode, false)

WebUI.selectOptionByLabel(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_TaxCodePrincipal'),
	AccountingTaxCodePrincipal, false)

WebUI.selectOptionByLabel(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_TaxCodeIncome'),
	AccountingTaxCodeIncome, false)

WebUI.selectOptionByLabel(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_OnBehalfOf'),
	EntLegalName, false)

WebUI.sendKeys(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_Cusip'), AccountingCusip)

WebUI.sendKeys(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_Cusip'), Keys.chord(
		Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_GLPayablesAccount'))

WebUI.sendKeys(findTestObject('Operations/CreateBillPayTemplate/Accounting/GLPayablesAccount_Input'), AccountingGLDebit)

WebUI.click(findTestObject('Operations/CreateBillPayTemplate/Accounting/GLPayablesAccount_Select'))

WebUI.click(findTestObject('Operations/CreateBillPayTemplate/Accounting/Accounting_GLExpenseAccount'))

WebUI.sendKeys(findTestObject('Operations/CreateBillPayTemplate/Accounting/GLExpenseAccount_Input'), AccountingGLCredit)

WebUI.click(findTestObject('Operations/CreateBillPayTemplate/Accounting/GLExpenseAccount_Select'))

WebUI.takeScreenshot()

WebUI.delay(2)

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

WebUI.verifyTextPresent(VerifyingAfterUploadBillPayTemplateAttachment, false)

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
WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Three_dot_Ops_MyWork_Templates_Filter_Relationship'),
	waitTime)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Three_dot_Ops_MyWork_Templates_Filter_Relationship'))

WebUI.mouseOver(findTestObject('Object Repository/Operations/CreateBillPayTemplate/MouseHover_To_Filter_Ops_MyWork_Templates_Relationship'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/input_SearchRelationshipText_Ops_MyWork_Templates'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/CreateBillPayTemplate/input_SearchRelationshipText_Ops_MyWork_Templates'),
	RelationName)

WebUI.delay(waitTime)

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

		WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Validating_Relationship_And_Clicking_Ops_MyWork_Templates'))

		WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_Approve_BillPayTemplate_Ops_MyWork_Template'),
			waitTime)

		WebUI.takeScreenshot()

		WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_Comments_BillPayTemplate'))

		WebUI.takeScreenshot()

		WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/Clicking_On_History_BillPayTemplate'))

		WebUI.takeScreenshot()

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/Operations/CreateBillPayTemplate/button_Approve_BillPayTemplate_Ops_MyWork_Template'))

		WebUI.delay(waitTime)
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

/*//Operations
'Navigating to Operations-My Work- For Document Processing'
WebUI.click(findTestObject('Global/Operations'))

WebUI.delay(1)

//Operations-Transactions
'Navigate to Operations-Transactions'
WebUI.click(findTestObject('Operations/Operations_Transactions'))

'Click on Templates Tab'
WebUI.click(findTestObject('Object Repository/Operations/Operations-Transactions/Operations-Transactions-Templates'))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Operations/Operations-Transactions/CreateBillPayTemplate/Templates_CreateBillPayTemplate'))

//Summary Details
'Enter Summary Details of Bill Pay Template'
WebUI.selectOptionByLabel(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Summary/BillPay_Summary_TemplateType'),
	SummaryTemplateType, false)

WebUI.sendKeys(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Summary/BillPay_Summary_TemplateName'),
	SummaryTemplateName)

'Enter Transaction Type Other than Fund Payee'
WebUI.selectOptionByLabel(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Summary/BillPay_Summary_TransactionType'),
	SummaryTransactionType, false)

'Enter Transaction Method as ACH, FedWire, Auto Withdrawal'
WebUI.selectOptionByLabel(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Summary/BillPay_Summary_TransactionMethod'),
	SummaryTransactionMethod, false)

WebUI.click(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Summary/BillPay_Summary_Client or Fund or Payor Relationship'))

WebUI.sendKeys(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Summary/BillPay_Summary_Client or Fund or PayorRelationship_Input'),
	SummaryClientorPayororFundRelationship)

WebUI.click(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Summary/BillPay_Summary_Client or Fund or PayorRelationship_Select'))

WebUI.click(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Summary/BillPay_Summary_Client or Fund or Payor'))

WebUI.sendKeys(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Summary/BillPay_Summary_Client or Fund or Payor - Input'),
	SummaryClientorPayororFund)

WebUI.click(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Summary/BillPay_Summary_Client or Fund or Payor - Select'))

WebUI.selectOptionByLabel(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Summary/BillPay_Summary_Client or Transaction Account'),
	SummaryClientorTransactionAccount, false)

WebUI.clearText(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Summary/BillPay_Summary_TaxWithholding'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Summary/BillPay_Summary_TaxWithholding'),
	SummaryTaxWithholding)

WebUI.sendKeys(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Summary/BillPay_Summary_SalesTax'),
	SummarySalesTax)

WebUI.sendKeys(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Summary/BillPay_Summary_WithholdingThreshold'),
	SummaryWithholdingThreshold)

//WebUI.selectOptionByLabel(findTestObject('Object Repository/Operations/Operations-Transactions/CreateBillPayTemplate/Summary/BillPay_Summary_Deliverable_Event'), 'None')
//WireDetails
WebUI.selectOptionByLabel(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/WireDetails/WireDetails_Counterparty Relationship'),
	WireDetailsCounterpartyRelationship, false)

WebUI.selectOptionByLabel(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/WireDetails/WireDetails_Counterparty'),
	WireDetailsCounterparty, false)

WebUI.selectOptionByLabel(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/WireDetails/WireDetails_WiringInstructions'),
	WireDetailsWiringInstructions, false)

WebUI.sendKeys(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/WireDetails/WireDetails_ForFurtherCreditto'),
	WireDetailsForFurtherCreditto)

WebUI.sendKeys(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/WireDetails/WireDetails_ForFurtherCredittoACC'),
	WireDetailsForFurtherCredittoACC)

WebUI.sendKeys(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/WireDetails/WireDetails_ForFurtherCredittoAddress'),
	WireDetailsForFurtherCredittoAddress)

WebUI.takeScreenshot()

'Enter Transaction Description details'
WebUI.sendKeys(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/TransactionDescription/TransactionDesc_Remittance'),
	TransactionDescRemittance)

WebUI.sendKeys(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/TransactionDescription/TransactionDesc_Description'),
	TransactionDescDescription)

WebUI.sendKeys(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/TransactionDescription/TransactionDesc_Memo'),
	TransactionDescMemo)

WebUI.takeScreenshot()

//WebUI.click(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/DeemedProcessing/BillPay_EnabledDeemedTransactions_CheckBox'))
//WebUI.click(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/DeemedProcessing/BillPay_DeemedProcessings_Template'))
'Enter Deemed Processing Details'
WebUI.clearText(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Accounting/Accounting_Perc to Income'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Accounting/Accounting_Perc to Income'),
	AccountingPerctoIncome)

//WebUI.selectOptionByLabel(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Accounting/Accounting_ETC Code'),     '', false)
WebUI.selectOptionByLabel(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Accounting/Accounting_TaxCodePrincipal'),
	AccountingTaxCodePrincipal, false)

WebUI.selectOptionByLabel(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Accounting/Accounting_Tax Code Income'),
	AccountingTaxCodeIncome, false)

WebUI.selectOptionByLabel(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Accounting/Accounting_On Behalf of'),
	AccountingOnBehalfof, false)

WebUI.sendKeys(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Accounting/Accounting_Cusip'), AccountingCusip)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/BillPay_Create'))

WebUI.delay(2)

//Approval Workflow
'Navigate to My Work List for approving Bill Pay template Created'
WebUI.click(findTestObject('Object Repository/Operations/Operations_MyWork'))

WebUI.delay(15)

'Navigate to Templates Tab'
WebUI.click(findTestObject('Object Repository/Operations/Operations-Transactions/Operations_MyWork/Operations_MyWork_Templates'))

WebUI.takeScreenshot()

'Select the processed Bill Pay Template from the Templates list'
WebUI.click(findTestObject('Object Repository/Operations/Operations-Transactions/Operations_MyWork/Operations_MyWork_Template_TemplateDesc_Table'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Operations/Operations-Transactions/Operations_MyWork/Operations_MyWork_Templates_Template_Approve Button'))

WebUI.delay(3)

WebUI.takeScreenshot()

'Verify the Template is available for next approval process'
System.out.println(WebUI.getText(findTestObject('Operations/Operations-Transactions/Operations_MyWork/Operations_MyWork_Template_TemplateDesc_Table')))

String Templatename = WebUI.getText(findTestObject('Operations/Operations-Transactions/Operations_MyWork/Operations_MyWork_Template_TemplateDesc_Table'))

if (SummaryTemplateName.equals(Templatename)) {
	WebUI.click(findTestObject('Object Repository/Operations/Operations-Transactions/Operations_MyWork/Operations_MyWork_Template_TemplateDesc_Table'))

	WebUI.takeScreenshot()

	WebUI.click(findTestObject('Object Repository/Operations/Operations-Transactions/Operations_MyWork/Operations_MyWork_Templates_Template_Approve Button'),
		FailureHandling.CONTINUE_ON_FAILURE)

	WebUI.delay(3)

	WebUI.takeScreenshot()
}

//Functionality for Verfying Bill Pay Transaction Approved
'Click on Templates Tab'
WebUI.click(findTestObject('Object Repository/Operations/Operations-Transactions/Operations-Transactions-Templates'))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Filter BillPay Template Created/Bill Pay Created_Template Name_Column'))

WebUI.click(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Filter BillPay Template Created/BillPay_Template_TemplateName_Filter'))

WebUI.delay(4)

WebUI.click(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Filter BillPay Template Created/Bill Pay Created_Template Name_Column'))

WebUI.click(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Filter BillPay Template Created/BillPay_Template_TemplateName_Filter'))

'Click on the search results from filters'
String TemplateName = SummaryTemplateName

String xpath = ('//*[@data-role="filtermulticheck"]/form/ul//input[@value="' + TemplateName) + '"]'

TestObject Templatenameresults = new TestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Filter BillPay Template Created/Bill Pay Template_Select_Search Results')

Templatenameresults.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.sendKeys(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Filter BillPay Template Created/BillPay_Template_TemplateName_Input'),
	SummaryTemplateName)

WebUI.click(Templatenameresults)

WebUI.click(findTestObject('Operations/Operations-Transactions/CreateBillPayTemplate/Filter BillPay Template Created/Bill Pay Template_Click Filter'))

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('Reusuable Test Cases/Logout-Eton'), [:], FailureHandling.STOP_ON_FAILURE)

*/