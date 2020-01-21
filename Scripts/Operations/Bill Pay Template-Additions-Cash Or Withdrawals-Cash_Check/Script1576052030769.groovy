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
WebUI.callTestCase(findTestCase('CommonCases/Login'), [('AppUrl') : AppUrl, ('UserName') : Username, ('Password') : Password
        , ('SecurityAns') : SecurityAns], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Relationship'), [('RelationName') : RelationName, ('RelationDesc') : RelationDesc
        , ('RelationStatus') : RelationStatus, ('SourceOfWealth') : SourceOfWealth, ('RelationType') : RelationType, ('Notes') : Notes
        , ('waitTime') : waitTime], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Address/Address_AfterRelationship'), [('Add_Name') : Add_Name, ('Address1') : Address1, ('Address2') : Address2
        , ('Address3') : Address3, ('City') : City, ('StateProvince') : StateProvince, ('ZipCode') : ZipCode, ('Zip4') : Zip4
        , ('AddressPhone') : AddressPhone, ('AddressFax') : AddressFax, ('AddStatus') : AddStatus, ('AddAsset') : AddAsset
        , ('AddDesc') : AddDesc, ('AddNote') : AddNote, ('waitTime') : waitTime, ('UploadFileInAddressTab') : UploadFileInAddressTab
        , ('VerifyingTextAfterUploadingFileInAddressTab') : 'Upload Successful', ('AddCommentAddressTab') : AddCommentAddressTab], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Entity'), [('EntLegalName') : '', ('EntStatus') : '', ('EntType') : '', ('EntShortName') : ''
        , ('EntTaxStatus') : '', ('EntDueDeligenceType') : '', ('EntCurrency') : '', ('EntAccMethod') : '', ('EntChartOfAcc') : ''
        , ('EntCalendr') : '', ('EntClosingGrup') : '', ('waitTime') : 10, ('EntNotes') : '', ('EntLegacyId') : ''], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Account'), [('AccNum') : '', ('AccName') : '', ('AccType') : '', ('Custodian') : ''
        , ('TradingCustodian') : '', ('RollupNameStrategy') : '', ('AccCurrency') : '', ('TransAuthority') : '', ('AccStatus') : ''
        , ('PledgedAcc') : '', ('TreasuryEdge') : '', ('BillPayFlag') : '', ('ExpenseFlag') : '', ('TaxCostMethod') : ''
        , ('AccAdvCustody') : '', ('SECclass') : '', ('PricDataSource') : '', ('GLaccEqt') : '', ('GLaccCash') : '', ('ANHstatus') : ''
        , ('CapitalAllocation') : '', ('waitTime') : 10], FailureHandling.CONTINUE_ON_FAILURE)

