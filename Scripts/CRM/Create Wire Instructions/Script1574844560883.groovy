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
WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/Clicking_On_Wire Instructions'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/Clicking_On_Wire Instructions'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/Creating_WireInstructions'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/Creating_WireInstructions'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/input_NameDescriptionForWiringInstructions'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/input_NameDescriptionForWiringInstructions'), WireInstructDesc)

WebUI.sendKeys(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/input_BankAccountNumber'), WiredInstructBankAccNum)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/select_(Please Select)Bill Pay'), 
    WireType, false)

WebUI.sendKeys(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/input_BankName_ABANumber'), ABANumber)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/input_BankName_ABANumber'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/Clicking_On_Attachments_Under_WireInstructions'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/Clicking_On_Attachments_Under_WireInstructions'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/button_Upload_Attachments_Under_WireInstructions'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/button_Upload_Attachments_Under_WireInstructions'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/UploadingFile_ChooseFiles'), 
    waitTime)

WebUI.uploadFile(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/UploadingFile_ChooseFiles'), UploadAttachmentWireInstructions)

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/button_AddToQueue_WireInstructions'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/button_AddToQueue_WireInstructions'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/Clicking_On_StartUpload_WireInstructions'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/Clicking_On_StartUpload_WireInstructions'))

WebUI.delay(5)

WebUI.verifyTextPresent(ValidatingTextAfterUpload, false)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/button_Close_WireInstructions'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/button_Close_WireInstructions'))

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/Clicking_On_Comments_Under_WireInstructions'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/Clicking_On_Comments_Under_WireInstructions'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/button_AddComment_WireInstructions'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/button_AddComment_WireInstructions'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/input_AddComment_editor'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/input_AddComment_editor'), AddCommentWiredInstruction)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/button_Save_Comment_WireInstructions'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/button_Save_Comment_WireInstructions'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/Clicking_On_History_WireInstructions'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/Clicking_On_History_WireInstructions'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/button_Submit_WireInstructions'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/button_Submit_WireInstructions'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/Clicking_On_History_WireInstructions'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/Clicking_On_History_WireInstructions'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/button_Final Approval_WireInstructions'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Wired_Instructions/button_Close_After_FinalApproval'))