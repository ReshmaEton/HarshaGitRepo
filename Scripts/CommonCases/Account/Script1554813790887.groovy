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

//Account creation
WebUI.click(findTestObject('CRM/Create Account/ClickAccountsTab'))

WebUI.waitForElementClickable(findTestObject('CRM/Create Account/CreateAccountPlusIcon'), waitTime)

WebUI.click(findTestObject('CRM/Create Account/CreateAccountPlusIcon'))

WebUI.setText(findTestObject('CRM/Create Account/AccountNumber'), AccNum)

WebUI.setText(findTestObject('CRM/Create Account/AccountName'), AccName)

WebUI.setText(findTestObject('CRM/Create Account/AccountType'), AccType)

WebUI.setText(findTestObject('CRM/Create Account/Custodian'), Custodian)

WebUI.setText(findTestObject('CRM/Create Account/TradingCustodian'), TradingCustodian)

WebUI.setText(findTestObject('CRM/Create Account/RollupNameStrategy'), RollupNameStrategy)

WebUI.setText(findTestObject('CRM/Create Account/AccCurrency'), AccCurrency)

WebUI.setText(findTestObject('CRM/Create Account/TransactionAuthority'), TransAuthority)

WebUI.setText(findTestObject('CRM/Create Account/AccountStatus'), AccStatus)

WebUI.sendKeys(findTestObject('CRM/Create Account/PledgedAccount'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('CRM/Create Account/PledgedAccount'), PledgedAcc)

WebUI.sendKeys(findTestObject('CRM/Create Account/TreasuryEdge'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('CRM/Create Account/TreasuryEdge'), TreasuryEdge)

WebUI.sendKeys(findTestObject('CRM/Create Account/BillpayFlag'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('CRM/Create Account/BillpayFlag'), BillPayFlag)

WebUI.sendKeys(findTestObject('CRM/Create Account/ExpenseFlag'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('CRM/Create Account/ExpenseFlag'), ExpenseFlag)

WebUI.setText(findTestObject('CRM/Create Account/TaxCostMethod'), TaxCostMethod)

WebUI.setText(findTestObject('CRM/Create Account/AccountAdvisoryCustody'), AccAdvCustody)

WebUI.setText(findTestObject('CRM/Create Account/SECclass'), SECclass)

WebUI.setText(findTestObject('CRM/Create Account/Pricing Data Source'), PricDataSource)

WebUI.setText(findTestObject('CRM/Create Account/GL Account Equity'), GLaccEqt)

WebUI.setText(findTestObject('CRM/Create Account/GL Account Cash'), GLaccCash)

WebUI.setText(findTestObject('CRM/Create Account/ANH Status'), ANHstatus)

WebUI.setText(findTestObject('CRM/Create Account/Capital Allocation'), CapitalAllocation)

WebUI.waitForElementClickable(findTestObject('CRM/Create Account/Submit Btn Account'), waitTime)

WebUI.click(findTestObject('CRM/Create Account/Submit Btn Account'))

WebUI.delay(waitTime)

WebUI.click(findTestObject('CRM/Create Account/Final Approval Btn Account'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('CRM/Create Account/Clicking_Back_Button_After_AccountCreation'))

