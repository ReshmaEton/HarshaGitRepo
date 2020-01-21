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

'Logs into Application.'
WebUI.callTestCase(findTestCase('CommonCases/Login'), [('AppUrl') : AppUrl, ('UserName') : UserName, ('Password') : Password
        , ('SecurityAns') : SecurityAns], FailureHandling.CONTINUE_ON_FAILURE)

'Clicks Relationship Tab.'
WebUI.click(findTestObject('CRM/Relationship/Relationships_LHS'))

'Clicks Relationship Management Sub-Tab under Relationship.'
WebUI.click(findTestObject('CRM/Relationship/Relationship_Mgmt_LHS'))

WebUI.waitForElementClickable(findTestObject('CRM/SearchAssets/span_AssetDesc'), waitTime)

'Clicks on Assets Panel in Relationship Management Sub-Tab.'
WebUI.click(findTestObject('CRM/SearchAssets/span_AssetDesc'))

WebUI.delay(waitTime)

'For Filtering clicks on three dots.'
WebUI.click(findTestObject('CRM/SearchAssets/ThreeDot_CRM_AssetDesc'))

'Mouse hovers to Filter option in three dots.'
WebUI.mouseOver(findTestObject('CRM/SearchAssets/span_Filter_CRM_AssetDesc'))

'Inputs the text.'
WebUI.sendKeys(findTestObject('CRM/SearchAssets/input_CRM_AssetDesc_TextBox'), AssetDesc)

/*String xpath = ('//div[@data-role=\'filtermulticheck\']/form/ul/li/label[text()=\'' + AssetDesc) + '\']/input'

TestObject to = new TestObject('SelectAssetDescCheckBox')

to.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.click(to)
*/

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/SearchAssets/click_checkBox_After_Filtering_CRM_AssetDesc'), waitTime)

//WebUI.click(findTestObject('Object Repository/CRM/SearchAssets/click_checkBox_After_Filtering_CRM_AssetDesc'))

WebUI.clickOffset(findTestObject('Object Repository/CRM/SearchAssets/click_checkBox_After_Filtering_CRM_AssetDesc'), 50, 10)

WebUI.waitForElementClickable(findTestObject('CRM/SearchAssets/button_Filter_CRM_AssetDesc'), waitTime)

WebUI.takeScreenshot()

'Click on Filter Button.'
WebUI.click(findTestObject('CRM/SearchAssets/button_Filter_CRM_AssetDesc'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent(AnhType, false)

WebUI.verifyTextPresent(SuperAssetClass, false)

WebUI.verifyTextPresent(AssetClass, false)

WebUI.verifyTextPresent(ProdType, false)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('CRM/SearchAssets/clear_Filter_AssetDesc'), waitTime)

'Clears the filters.'
WebUI.click(findTestObject('CRM/SearchAssets/clear_Filter_AssetDesc'))

WebUI.takeScreenshot()


