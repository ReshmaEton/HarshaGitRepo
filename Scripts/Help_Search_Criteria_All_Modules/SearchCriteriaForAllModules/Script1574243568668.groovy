import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
import org.openqa.selenium.By.ById as ById
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CommonCases/Login'), [('AppUrl') : AppUrl, ('UserName') : UserName, ('Password') : Password
        , ('SecurityAns') : SecurityAns], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Help_System_Search_Criteria_For_All_Modules/SearchCriteriaInAllModules/Clicking_On_SearchButton_BesideLogout'), 
    waitTime)

WebUI.click(findTestObject('Help_System_Search_Criteria_For_All_Modules/SearchCriteriaInAllModules/Clicking_On_SearchButton_BesideLogout'))

WebUI.waitForElementClickable(findTestObject('Help_System_Search_Criteria_For_All_Modules/SearchCriteriaInAllModules/Clicking_On_Search_Table_Of_Contents/input_Table Of Contents_Under_HelpSystem'), 
    waitTime)

WebUI.setText(findTestObject('Help_System_Search_Criteria_For_All_Modules/SearchCriteriaInAllModules/Clicking_On_Search_Table_Of_Contents/input_Table Of Contents_Under_HelpSystem'), 
    TextToSearchModules)

WebUI.delay(5)

if (WebUI.getText(findTestObject('Help_System_Search_Criteria_For_All_Modules/SearchCriteriaInAllModules/Clicking_On_Search_Table_Of_Contents/Validating_And_Clicking_On_Particular_Text')).equalsIgnoreCase(
    ValidateSearchResults)) {
    WebUI.mouseOver(findTestObject('Help_System_Search_Criteria_For_All_Modules/SearchCriteriaInAllModules/Clicking_On_Search_Table_Of_Contents/Validating_And_Clicking_On_Particular_Text'))

    WebUI.click(findTestObject('Help_System_Search_Criteria_For_All_Modules/SearchCriteriaInAllModules/Clicking_On_Search_Table_Of_Contents/Validating_And_Clicking_On_Particular_Text'))
}

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.takeScreenshot()

WebUI.closeWindowIndex(1)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/Help_System_Search_Criteria_For_All_Modules/SearchCriteriaInAllModules/Clicking_On_Search_Table_Of_Contents/closing_Help_Window'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('CommonCases/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

