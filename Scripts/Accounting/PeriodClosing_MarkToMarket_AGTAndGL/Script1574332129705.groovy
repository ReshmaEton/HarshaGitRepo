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

WebUI.callTestCase(findTestCase('CommonCases/Login'), [('AppUrl') : AppUrl, ('UserName') : UserName, ('Password') : Password
        , ('SecurityAns') : SecurityAns], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Calendar'), [('CalndrName') : CalndrName, ('CalndrPeriod') : CalndrPeriod, ('CalndrStartDate') : CalndrStartDate
        , ('CalndrEndDate') : CalndrEndDate, ('waitTime') : waitTime], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Closing Group'), [('CalndrName') : CalndrName, ('ClosingGrupName') : ClosingGrupName
        , ('ClosingDesc') : ClosingDesc, ('waitTime') : waitTime], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Relationship'), [('RelationName') : RelationName, ('RelationDesc') : RelationDesc
        , ('RelationStatus') : RelationStatus, ('SourceOfWealth') : SourceOfWealth, ('RelationType') : RelationType, ('Notes') : Notes
        , ('waitTime') : waitTime], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Entity'), [('EntLegalName') : EntLegalName, ('EntStatus') : EntStatus, ('EntType') : EntType
        , ('EntShortName') : EntShortName, ('EntTaxStatus') : EntTaxStatus, ('EntDueDeligenceType') : EntDueDeligenceType
        , ('EntCurrency') : EntCurrency, ('EntAccMethod') : EntAccMethod, ('EntChartOfAcc') : EntChartOfAcc, ('EntCalendr') : CalndrName
        , ('EntClosingGrup') : ClosingGrupName, ('waitTime') : waitTime, ('EntNotes') : EntNotes, ('EntLegacyId') : EntLegacyId
        , ('waitTime') : waitTime], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Account'), [('AccNum') : AccNum, ('AccName') : AccName, ('AccType') : AccType
        , ('Custodian') : Custodian, ('TradingCustodian') : TradingCustodian, ('RollupNameStrategy') : RollupNameStrategy
        , ('AccCurrency') : AccCurrency, ('TransAuthority') : TransAuthority, ('AccStatus') : AccStatus, ('PledgedAcc') : PledgedAcc
        , ('TreasuryEdge') : TreasuryEdge, ('BillPayFlag') : BillPayFlag, ('ExpenseFlag') : ExpenseFlag, ('TaxCostMethod') : TaxCostMethod
        , ('AccAdvCustody') : AccAdvCustody, ('SECclass') : SECclass, ('PricDataSource') : PricDataSource, ('GLaccEqt') : GLaccEqt
        , ('GLaccCash') : GLaccCash, ('ANHstatus') : ANHstatus, ('CapitalAllocation') : CapitalAllocation, ('waitTime') : waitTime], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Operations/UploadingBulkFileAndVerifying'), [('RelationName') : RelationName, ('RelationType') : RelationType
        , ('EntLegalName') : EntLegalName, ('EntStatus') : EntStatus, ('EntType') : EntType, ('EntShortName') : EntShortName
        , ('EntCalendr') : CalndrName, ('EntClosingGrup') : ClosingGrupName, ('AccNum') : AccNum, ('AccName') : AccName, ('AccType') : AccType
        , ('waitTime') : waitTime, ('UploadFileLocation') : UploadFileLocation, ('Bulk_Relationship') : Bulk_Relationship, ('CusipId') : CusipId, ('EntFilterDropdown1') : EntFilterDropdown1, ('BulkTransactionUpload') : BulkTransactionUpload], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Mark_To_Market/Clicking_On_Accounting_Before_MarkToMarket'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Accounting/Mark_To_Market/Clicking_On_Accounting_Before_MarkToMarket'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Mark_To_Market/Clicking_On_PeriodClosing_Before_MarkToMarket'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Accounting/Mark_To_Market/Clicking_On_PeriodClosing_Before_MarkToMarket'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Mark_To_Market/Clicking_On_MarkToMarket'), waitTime)

WebUI.click(findTestObject('Object Repository/Accounting/Mark_To_Market/Clicking_On_MarkToMarket'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Mark_To_Market/input_ClosingGroup_MarkToMarket'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Mark_To_Market/input_ClosingGroup_MarkToMarket'), ClosingGrupName)

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Mark_To_Market/input_ClosingGroup_MarkToMarket'), Keys.chord(
        Keys.TAB))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Mark_To_Market/input_AsOfDate_criteriaBox_MarkToMarket'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Mark_To_Market/input_AsOfDate_criteriaBox_MarkToMarket'), AsofDate)

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Mark_To_Market/input_AsOfDate_criteriaBox_MarkToMarket'), Keys.chord(
        Keys.TAB))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Mark_To_Market/button_Search_Under_MarkToMarket'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Accounting/Mark_To_Market/button_Search_Under_MarkToMarket'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.delay(waitTime)

