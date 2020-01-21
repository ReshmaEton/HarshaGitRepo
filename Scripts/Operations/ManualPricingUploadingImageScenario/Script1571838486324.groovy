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

WebUI.callTestCase(findTestCase('CommonCases/ManualPricingFileUpload'), [('waitTime') : waitTime, ('UploadingFileForManualPricing') : UploadingFileForManualPricing
        , ('DcoumentUploadedVerification') : ImageUploadedVerification, ('RelationName') : RelationName, ('RelationType') : RelationType
        , ('FileDescHomeMyWork') : FileDescHomeMyWork, ('RouteToWorkFlow') : RouteToWorkFlow, ('CusipId') : CusipId, ('CusipShortName') : CusipShortName
        , ('Purpose') : 'Image_Upload_Manual_Pricing', ('SelectCusipIdDocUpload') : 'Select Cusip:', ('DocumentTitle') : DocumentTitle], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Operations/BulkUpload/Clicking_On_Operations'), waitTime)

WebUI.click(findTestObject('Operations/BulkUpload/Clicking_On_Operations'))

WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/Clicking_on_Operations_My Work'))

WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/Clicking_on_Operations_MyWork_Manual_Pricing'), 
    waitTime)

WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/Clicking_on_Operations_MyWork_Manual_Pricing'))

WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/Three_dot_filtering_Description_Operations_Manual_Pricing'), 
    waitTime)

WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/Three_dot_filtering_Description_Operations_Manual_Pricing'))

WebUI.mouseOver(findTestObject('Operations/ManualPricingUploadImageScenario/Move_to_filter_For_Description_Operations_ManualPricing'))

WebUI.sendKeys(findTestObject('Operations/ManualPricingUploadImageScenario/input1_Operations_ManualPricing_Desc_Contains1_Textbox'), 
    CusipShortName)

WebUI.callTestCase(findTestCase('CommonCases/Filtering dropdown values'), [('EntFilterDropdown1') : EntFilterDropdown1, ('EntFilterDropdown2') : ''
        , ('DropdownRelation') : ''], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/button_Filter_Operations_ManualPrice_Desc'))

WebUI.delay(waitTime)

if (WebUI.getText(findTestObject('Operations/ManualPricingUploadImageScenario/validating_RelationName_Operations_ManualPrice')).equalsIgnoreCase(
    RelationName)) {
    WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/clicking_Operations_MyWork_ManualPricing_Desc_WorkFlowButton'))

    WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/button_Cancel_Final_Approval_Operations_MyWork_ManualPricing'), 
        waitTime)

    WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/Adding_New_Record'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/Clicking_On_price_manually_Operations_MyWork_ManualPricing'))

    not_run: WebUI.delay(3)

    WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadImageScenario/modifying_price_manually_Operations_MyWork_ManualPricing'), 
        Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadImageScenario/modifying_price_manually_Operations_MyWork_ManualPricing'), 
        ManualPriceChange1)

    WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadImageScenario/modifying_price_manually_Operations_MyWork_ManualPricing'), 
        Keys.chord(Keys.TAB))

    WebUI.delay(2)

    WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/Clicking_On_effectiveDate_manually_Operations_MyWork_ManualPricing'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Operations/ManualPricingUploadImageScenario/modifying_effectiveDate_manually_Operations_MyWork_ManualPricing'), 
        Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(findTestObject('Operations/ManualPricingUploadImageScenario/modifying_effectiveDate_manually_Operations_MyWork_ManualPricing'), 
        EffectiveDateForCusip)

    WebUI.sendKeys(findTestObject('Operations/ManualPricingUploadImageScenario/modifying_effectiveDate_manually_Operations_MyWork_ManualPricing'), 
        Keys.chord(Keys.TAB))

    WebUI.selectOptionByIndex(findTestObject('Operations/ManualPricingUploadImageScenario/Select_Account_In_Pricing_ValidationChecker_Operations_MyWork'), 
        0)

    WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/ManualPricingUploadImageScenario/ChangeDate_In_Pricing_ValidationChecker_Operations_MyWork'), 
        waitTime)

    WebUI.click(findTestObject('Object Repository/Operations/ManualPricingUploadImageScenario/ChangeDate_In_Pricing_ValidationChecker_Operations_MyWork'))

    WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadImageScenario/ChangeDate_In_Pricing_ValidationChecker_Operations_MyWork'), 
        DateForPriceValidation)

    WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadImageScenario/ChangeDate_In_Pricing_ValidationChecker_Operations_MyWork'), 
        Keys.chord(Keys.TAB))

    not_run: WebUI.verifyMatch(WebUI.getText(findTestObject('Operations/ManualPricingUploadImageScenario/Select_Account_In_PricingValidation_Operations_MyWork')), 
        Account_ManualPricing, false)

    WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/button_Approve_Final_Approval_Operations_MyWork_ManualPricing'), 
        waitTime)

    WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/button_Approve_Final_Approval_Operations_MyWork_ManualPricing'))
}

WebUI.delay(waitTime)

WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/clicking_Again_Operations_MyWork_ManualPricing_Desc_WorkFlowButton'))

WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/Select_Account_In_Pricing_ValidationChecker_Operations_MyWork'), 
    waitTime)

WebUI.selectOptionByIndex(findTestObject('Operations/ManualPricingUploadImageScenario/Select_Account_In_Pricing_ValidationChecker_Operations_MyWork'), 
    0)

WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/ChangeDate_In_Pricing_ValidationChecker_Operations_MyWork'), 
    waitTime)

WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/ChangeDate_In_Pricing_ValidationChecker_Operations_MyWork'))

WebUI.sendKeys(findTestObject('Operations/ManualPricingUploadImageScenario/ChangeDate_In_Pricing_ValidationChecker_Operations_MyWork'), 
    DateForPriceValidation)

WebUI.sendKeys(findTestObject('Operations/ManualPricingUploadImageScenario/ChangeDate_In_Pricing_ValidationChecker_Operations_MyWork'), 
    Keys.chord(Keys.TAB))

WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/button_Approve_Final_Approval_Operations_MyWork_ManualPricing_Clicking_Again'), 
    waitTime)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/button_Approve_Final_Approval_Operations_MyWork_ManualPricing_Clicking_Again'))

WebUI.delay(waitTime)

WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Clicking_On_Operations_ManualPricing'))

WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Filtering_Cusip_Under_Operations_ManualPricing_Prices'), 
    waitTime)

WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Filtering_Cusip_Under_Operations_ManualPricing_Prices'))

WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/input_Contains1_Cusip_Prices_Under_Operations_ManualPricing'), 
    waitTime)

WebUI.sendKeys(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/input_Contains1_Cusip_Prices_Under_Operations_ManualPricing'), 
    CusipShortName)

WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/button_Filter_Cusip_Prices_Under_Operations_ManualPricing'))

WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Clicking_On_Edit_Prices_ManualPricing_Operations'), 
    waitTime)

WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Clicking_On_Edit_Prices_ManualPricing_Operations'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Clicking_On_Modifying_Price_AfterClicking_On_Edit_Under_Prices'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Modifying_Price_AfterClicking_On_Edit_Under_Prices'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Modifying_Price_AfterClicking_On_Edit_Under_Prices'), 
    ManualPriceChange2)

WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Clicking_On_Update_After_Editing_Prices'), 
    waitTime)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Clicking_On_Update_After_Editing_Prices'))

WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/button_Approve_After_Edit_Operations_MyWork_ManualPricing'), 
    waitTime)

WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/button_Approve_After_Edit_Operations_MyWork_ManualPricing'))

WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Clicking_on_Operations_My Work_AfterEdit'), 
    waitTime)

WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Clicking_on_Operations_My Work_AfterEdit'))

WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Clicking_on_Operations_MyWork_Manual_Pricing_AfterEdit'), 
    waitTime)

WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Clicking_on_Operations_MyWork_Manual_Pricing_AfterEdit'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Three_dot_filtering_Description_Operations_Manual_Pricing_AfterEdit'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Three_dot_filtering_Description_Operations_Manual_Pricing_AfterEdit'))

WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Move_to_filter_For_Description_Operations_ManualPricing_AfterEdit'), 
    waitTime)

WebUI.mouseOver(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Move_to_filter_For_Description_Operations_ManualPricing_AfterEdit'))

WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/input1_Operations_ManualPricing_Desc_Contains1_Textbox_AfterEdit'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/input1_Operations_ManualPricing_Desc_Contains1_Textbox_AfterEdit'), 
    CusipShortName)

WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/button_Filter_Operations_ManualPrice_Desc_AfterEdit'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/button_Filter_Operations_ManualPrice_Desc_AfterEdit'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/clicking_Operations_MyWork_ManualPricing_Desc_WorkFlowButton_AfterEdit'), 
    waitTime)

WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/clicking_Operations_MyWork_ManualPricing_Desc_WorkFlowButton_AfterEdit'))

WebUI.waitForElementClickable(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/button_Approve_After_Edit_Operations_MyWork_ManualPricing'), 
    waitTime)

WebUI.selectOptionByIndex(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/Select_Account_In_Pricing_ValidationChecker_Operations_MyWork_AfterEdit'), 
    0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Operations/ManualPricingUploadImageScenario/Editing_Manual_Price/button_Approve_After_Edit_Operations_MyWork_ManualPricing'))

WebUI.delay(5)