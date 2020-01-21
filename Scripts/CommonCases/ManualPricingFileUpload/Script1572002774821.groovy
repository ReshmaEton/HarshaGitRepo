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

WebUI.click(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Clicking_on_Documents_in_Home_Tab'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Clicking_on_Upload_in_Manual_Pricing'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Clicking_on_Upload_in_Manual_Pricing'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Operations/ManualPricingUploadFile/input_Relationship Type_in_Manual_pricing'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadFile/input_Relationship Type_in_Manual_pricing'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadFile/input_Relationship Type_in_Manual_pricing'), 
    RelationType)

WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadFile/input_Relationship Type_in_Manual_pricing'), 
    Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadFile/input_Relationship_in_Manual_Pricing'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadFile/input_Relationship_in_Manual_Pricing'), 
    RelationName)

WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadFile/input_Relationship_in_Manual_Pricing'), 
    Keys.chord(Keys.TAB))

WebUI.verifyElementClickable(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Cancel_in_Uploading_in_Manual_Pricing'))

WebUI.uploadFile(findTestObject('Object Repository/Operations/ManualPricingUploadFile/clicking_on_Choose_Files_Manual_Pricing'), 
    UploadingFileForManualPricing)

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/ManualPricingUploadFile/button_Add To Queue_in_Manual_Pricing'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/ManualPricingUploadFile/button_Add To Queue_in_Manual_Pricing'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Operations/ManualPricingUploadFile/button_Clear Queue_in_Manual_Pricing'), 
    waitTime)

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Clicking_on_Start_Upload_in_Manual_Pricing'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Clicking_on_Start_Upload_in_Manual_Pricing'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Operations/ManualPricingUploadFile/button_Close_in_Manual_Pricing'), 
    waitTime)

WebUI.verifyTextPresent(DcoumentUploadedVerification, false)

WebUI.click(findTestObject('Object Repository/Operations/ManualPricingUploadFile/button_Close_in_Manual_Pricing'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Clicking_on_Home_My_Work'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Clicking_on_Home_My_Work'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Clicking_on_My_Tasks'), 
    waitTime)

WebUI.scrollToElement(findTestObject('Operations/ManualPricingUploadFile/ScrollPageToWorkInProgress'), waitTime)

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Three_dot_filtering_RelationshipName_HomeMyWork'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Three_dot_filtering_RelationshipName_HomeMyWork'))

WebUI.mouseOver(findTestObject('Object Repository/Operations/ManualPricingUploadFile/MouseHover_Relationship_Filter_HomeMyWork'))

WebUI.delay(waitTime)

WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadFile/input_RelationShip_Filter_Search'), 
    RelationName)

WebUI.clickOffset(findTestObject('Object Repository/Operations/ManualPricingUploadFile/click_checkBox_After_Filtering_HomeMyWork_RelationsName'), 
    50, 10)

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/ManualPricingUploadFile/button_Filter_RelationName_HomeMyWork'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Operations/ManualPricingUploadFile/button_Filter_RelationName_HomeMyWork'))

WebUI.verifyTextPresent(FileDescHomeMyWork, false)

if (WebUI.getText(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Validating_RelationName_HomeMyWork')).equalsIgnoreCase(
    RelationName)) {
    WebUI.mouseOver(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Validating_RelationName_HomeMyWork'))
	
	WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Validating_RelationName_HomeMyWork'))
}

WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/ManualPricingUploadFile/button_Approve_HomeMyWork'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadFile/input_DocumentTitle_HomeMyWork'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadFile/input_DocumentTitle_HomeMyWork'), DocumentTitle)

WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadFile/input_DocumentTitle_HomeMyWork'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadFile/input_Route_to_Workflow_Home_MyWork'), 
    RouteToWorkFlow)

WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadFile/input_Route_to_Workflow_Home_MyWork'), 
    Keys.chord(Keys.TAB))

boolean cusipIdPresence = WebUI.verifyElementPresent(findTestObject('Object Repository/Operations/ManualPricingUploadFile/input_Select Cusip_HomeMyWork'), waitTime)
/*
if (cusipIdPresence == true) 
{
    WebUI.sendKeys(findTestObject('Object Repository/Operations/ManualPricingUploadFile/input_Select Cusip_HomeMyWork'), 
        CusipShortName)

    WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Clicking _On_Value_Cusip_ListBox_HomeMyWork'), 
        waitTime)

    if (WebUI.getText(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Clicking _On_Value_Cusip_ListBox_HomeMyWork')).equalsIgnoreCase(CusipId)) 
	{
        WebUI.mouseOver(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Clicking _On_Value_Cusip_ListBox_HomeMyWork'))

        WebUI.click(findTestObject('Object Repository/Operations/ManualPricingUploadFile/Clicking _On_Value_Cusip_ListBox_HomeMyWork'))
    }    
}
else 
{
    WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/ManualPricingUploadFile/button_Approve_HomeMyWork'), waitTime)

    WebUI.click(findTestObject('Object Repository/Operations/ManualPricingUploadFile/button_Approve_HomeMyWork'))
}*/


WebUI.waitForElementClickable(findTestObject('Object Repository/Operations/ManualPricingUploadFile/button_Approve_HomeMyWork'),
	waitTime)

WebUI.click(findTestObject('Object Repository/Operations/ManualPricingUploadFile/button_Approve_HomeMyWork'))
