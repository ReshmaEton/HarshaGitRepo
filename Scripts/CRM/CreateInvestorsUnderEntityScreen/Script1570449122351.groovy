import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
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

'For Creating Relationship.'
WebUI.callTestCase(findTestCase('CommonCases/Relationship'), [('RelationName') : RelationName, ('RelationDesc') : RelationDesc
        , ('RelationStatus') : RelationStatus, ('SourceOfWealth') : SourceOfWealth, ('RelationType') : RelationType, ('Notes') : Notes], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonCases/Entity'), [('EntLegalName') : EntLegalName, ('EntStatus') : EntStatus, ('EntType') : EntType
        , ('EntShortName') : EntShortName, ('EntTaxStatus') : EntTaxStatus, ('EntDueDeligenceType') : EntDueDeligenceType
        , ('EntCurrency') : EntCurrency, ('EntAccMethod') : EntAccMethod, ('EntChartOfAcc') : EntChartOfAcc, ('EntCalendr') : EntCalendr
        , ('EntClosingGrup') : EntClosingGrup, ('waitTime') : 10, ('EntNotes') : EntNotes, ('EntLegacyId') : EntLegacyId], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('CRM/Create Entity/fill_entity_details/button_Edit'), waitTime)

WebUI.delay(3)

WebUI.click(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/click_Investors_tab'))

WebUI.click(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/button_click_plus_sign_to_add_investors'))

WebUI.waitForElementClickable(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Investor_k-input ng-pris'), 
    waitTime)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/CRM/Create Entity/Fill_Investors_Under_Entity_Screen/disabled_fund_in_investor'))

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Investor_k-input ng-pris'), Ent_Investor)

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Investor_k-input ng-pris'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Fund Class_k-input ng-va'), Ent_FundClass)

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_FATCA Date_ng-pristine n'), Ent_fatca_Date)

WebUI.click(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Tax Withholding_k-input'))

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Tax Withholding_k-input'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Tax Withholding_k-input'), Ent_Taxwithhold)

WebUI.click(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_GP_k-input ng-valid eton'))

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_GP_k-input ng-valid eton'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_GP_k-input ng-valid eton'), Ent_Gp)

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Fixed Pct 1_ng-pristine'), Ent_fixed_Pct1)

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Fixed Pct 2_ng-pristine'), Ent_fixed_Pct2)

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Cap Gains Pct_ng-pristin'), Ent_CapGains)

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Income Pct_ng-pristine n'), Ent_Income_Pct)

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Loss Pct_ng-pristine ng-'), Ent_Loss_Pct)

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Mgmt Fee Override_ng-pri'), Ent_Mgmt_fee)

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Perf Fee Override_ng-pri'), Ent_Perf_fee)

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Sales Fee Override_ng-pr'), Ent_Sales_Fee)

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Redemption Fee Override_'), Ent_Redem_Fee)

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Hurdle Override_ng-prist'), Ent_Hurdle_Fee)

WebUI.sendKeys(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/input_Hurdle Spread Override_n'), Ent_Hurdle_Spread)

WebUI.takeScreenshot()

WebUI.click(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/button_Submit'))

WebUI.delay(4)

WebUI.takeScreenshot()

WebUI.click(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/button_Final Approval'))

WebUI.delay(4)

WebUI.takeScreenshot()

WebUI.click(findTestObject('CRM/Create Entity/Fill_Investors_Under_Entity_Screen/Investor_backToEntity_Screen_Button'))

WebUI.delay(4)

