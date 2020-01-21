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

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Calendars/Clicking_On_Accounting'), waitTime)

WebUI.click(findTestObject('Object Repository/Accounting/Calendars/Clicking_On_Accounting'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Calendars/Clicking_On_Accounting_PeriodClosing'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Accounting/Calendars/Clicking_On_Accounting_PeriodClosing'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Calendars/Clicking_On_Accounting_PeriodClosing_Calendars'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Accounting/Calendars/Clicking_On_Accounting_PeriodClosing_Calendars'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Calendars/button_New Calendar_Under_Accounting_PerdClosng_Calndr'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Accounting/Calendars/button_New Calendar_Under_Accounting_PerdClosng_Calndr'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Calendars/input_CalendarName_CreateCalendar_NewCalendar'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Calendars/input_CalendarName_CreateCalendar_NewCalendar'), CalndrName)

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Calendars/input_CalendarName_CreateCalendar_NewCalendar'), Keys.chord(
        Keys.TAB))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Accounting/Calendars/select_Periods_CreateCalendar_NewCalendar'), 
    CalndrPeriod, false)

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Calendars/input_Starting_Date_CreateCalendar_NewCalendar'), 
    CalndrStartDate)

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Calendars/input_Starting_Date_CreateCalendar_NewCalendar'), 
    Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Calendars/input_Ending_Date_CreateCalendar_NewCalendar'), CalndrEndDate)

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Calendars/input_Ending_Date_CreateCalendar_NewCalendar'), Keys.chord(
        Keys.TAB))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Calendars/button_Save_CreateCalendar_NewCalendar'), 
    waitTime)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Accounting/Calendars/button_Save_CreateCalendar_NewCalendar'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Calendars/Three_Dot_Filter_CalendarName'), waitTime)

WebUI.click(findTestObject('Object Repository/Accounting/Calendars/Three_Dot_Filter_CalendarName'))

WebUI.mouseOver(findTestObject('Object Repository/Accounting/Calendars/Mouse_Hover_To_Filter_CalendarName'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Calendars/input_Search_CalendarName'), waitTime)

WebUI.sendKeys(findTestObject('Object Repository/Accounting/Calendars/input_Search_CalendarName'), CalndrName)

WebUI.delay(3)

WebUI.clickOffset(findTestObject('Object Repository/Accounting/Calendars/Click_CheckBox_After_Filtering_CalendarName'), 
    30, 10)

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Calendars/button_Filter_CalendarName'), waitTime)

WebUI.click(findTestObject('Object Repository/Accounting/Calendars/button_Filter_CalendarName'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Accounting/Calendars/View_StartDate_EndDate_Segregation'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/Accounting/Calendars/View_StartDate_EndDate_Segregation'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Accounting/Calendars/View_StartDate_EndDate_Segregation'))

WebUI.delay(5)

