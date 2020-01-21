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

WebUI.click(findTestObject('CRM/Relationship/Relationships_LHS'))

WebUI.click(findTestObject('CRM/Relationship/Relationship_Mgmt_LHS'))

WebUI.waitForElementClickable(findTestObject('CRM/User_Preference/CRM_Relationships/DragAndDropColumnHeader_Relationship_Mgmt_Relationships'), 
    waitTime)
if(CRM_Tab == 'Relationships')
{
	if (UserPreference == 'Name') 
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Relationships/Name_Relationship_Mgmt_Relationships'), 
			waitTime)

		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Relationships/Name_Relationship_Mgmt_Relationships'), 
			findTestObject('CRM/User_Preference/CRM_Relationships/DragAndDropColumnHeader_Relationship_Mgmt_Relationships'))

		WebUI.delay(2)

		WebUI.takeScreenshot()
} 
	else if (UserPreference == 'Type') 
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Relationships/Type_Relationship_Mgmt_Relationships'), 
			waitTime)

		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Relationships/Type_Relationship_Mgmt_Relationships'), findTestObject('CRM/User_Preference/CRM_Relationships/DragAndDropColumnHeader_Relationship_Mgmt_Relationships'))

		WebUI.delay(2)

		WebUI.takeScreenshot()
} 
	else if (UserPreference == 'Status') 
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Relationships/Status_Relationship_Mgmt_Relationships'), 
			waitTime)

		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Relationships/Status_Relationship_Mgmt_Relationships'), 
			findTestObject('CRM/User_Preference/CRM_Relationships/DragAndDropColumnHeader_Relationship_Mgmt_Relationships'))

		WebUI.delay(2)

		WebUI.takeScreenshot()
} 
	else 
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Relationships/Description_Relationship_Mgmt_Relationships'), 
			waitTime)

		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Relationships/Description_Relationship_Mgmt_Relationships'), 
			findTestObject('CRM/User_Preference/CRM_Relationships/DragAndDropColumnHeader_Relationship_Mgmt_Relationships'))

		WebUI.delay(2)

		WebUI.takeScreenshot()
	}
}
else if(CRM_Tab == 'Entities')
{
	WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Entities/Clicking_On_Entities_Relationship_Mgmt'), waitTime)
	
	WebUI.click(findTestObject('Object Repository/CRM/User_Preference/CRM_Entities/Clicking_On_Entities_Relationship_Mgmt'))
	
	if(UserPreference == 'Relationship')
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Entities/Relationship_Relationship_Mgmt_Entities'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Entities/Relationship_Relationship_Mgmt_Entities'), findTestObject('Object Repository/CRM/User_Preference/CRM_Entities/DragAndDropColumnHeader_Relationship_Mgmt_Entities'))
	
		WebUI.delay(2)
	
		WebUI.takeScreenshot()
	}
	else if(UserPreference == 'Entity Name')
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Entities/EntityName_Relationship_Mgmt_Entities'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Entities/EntityName_Relationship_Mgmt_Entities'), findTestObject('Object Repository/CRM/User_Preference/CRM_Entities/DragAndDropColumnHeader_Relationship_Mgmt_Entities'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	else if(UserPreference == 'Entity Type')
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Entities/EntityType_Relationship_Mgmt_Entities'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Entities/EntityType_Relationship_Mgmt_Entities'), findTestObject('Object Repository/CRM/User_Preference/CRM_Entities/DragAndDropColumnHeader_Relationship_Mgmt_Entities'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	else
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Entities/EntityStatus_Relationship_Mgmt_Entities'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Entities/EntityStatus_Relationship_Mgmt_Entities'), findTestObject('Object Repository/CRM/User_Preference/CRM_Entities/DragAndDropColumnHeader_Relationship_Mgmt_Entities'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
}
else if(CRM_Tab == 'Accounts')
{
	WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Accounts/Clicking_On_Accounts_Relationship_Mgmt'), waitTime)
	
	WebUI.click(findTestObject('Object Repository/CRM/User_Preference/CRM_Accounts/Clicking_On_Accounts_Relationship_Mgmt'))
	
	if(UserPreference == 'Relationship')
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Accounts/Relationship_Relationship_Mgmt_Accounts'), waitTime)	
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Accounts/Relationship_Relationship_Mgmt_Accounts'), findTestObject('CRM/User_Preference/CRM_Accounts/DragAndDropColumnHeader_Relationship_Mgmt_Accounts'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	else if(UserPreference == 'Entity')
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Accounts/Entity_Relationship_Mgmt_Accounts'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Accounts/Entity_Relationship_Mgmt_Accounts'), findTestObject('CRM/User_Preference/CRM_Accounts/DragAndDropColumnHeader_Relationship_Mgmt_Accounts'))
	
		WebUI.delay(2)
		
		WebUI.takeScreenshot()	
	}
	else if(UserPreference == 'Account Name')
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Accounts/AccountName_Relationship_Mgmt_Accounts'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Accounts/AccountName_Relationship_Mgmt_Accounts'), findTestObject('CRM/User_Preference/CRM_Accounts/DragAndDropColumnHeader_Relationship_Mgmt_Accounts'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	else if(UserPreference == 'Account Number')
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Accounts/AccountNumber_Relationship_Mgmt_Accounts'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Accounts/AccountNumber_Relationship_Mgmt_Accounts'), findTestObject('CRM/User_Preference/CRM_Accounts/DragAndDropColumnHeader_Relationship_Mgmt_Accounts'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	else if(UserPreference == 'Account Type')
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Accounts/AccountType_Relationship_Mgmt_Accounts'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Accounts/AccountType_Relationship_Mgmt_Accounts'), findTestObject('CRM/User_Preference/CRM_Accounts/DragAndDropColumnHeader_Relationship_Mgmt_Accounts'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	else
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Accounts/AccountStatus_Relationship_Mgmt_Accounts'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Accounts/AccountStatus_Relationship_Mgmt_Accounts'), findTestObject('CRM/User_Preference/CRM_Accounts/DragAndDropColumnHeader_Relationship_Mgmt_Accounts'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
}
else if(CRM_Tab == 'Portfolios')
{
	WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Portfolios/Clicking_On_Portfolios_Relationship_Mgmt'), waitTime)
	
	WebUI.click(findTestObject('Object Repository/CRM/User_Preference/CRM_Portfolios/Clicking_On_Portfolios_Relationship_Mgmt'))
	
	if(UserPreference == 'Relationship')
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Portfolios/Relationship_Relationship_Mgmt_Portfolios'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Portfolios/Relationship_Relationship_Mgmt_Portfolios'), findTestObject('CRM/User_Preference/CRM_Portfolios/DragAndDropColumnHeader_Relationship_Mgmt_Portfolios'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()	
	}
	else if(UserPreference == 'Portfolio Name')
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Portfolios/PortfolioName_Relationship_Mgmt_Portfolios'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Portfolios/PortfolioName_Relationship_Mgmt_Portfolios'), findTestObject('CRM/User_Preference/CRM_Portfolios/DragAndDropColumnHeader_Relationship_Mgmt_Portfolios'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	else if(UserPreference == 'Portfolio Description')
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Portfolios/PortfolioDescription_Relationship_Mgmt_Portfolios'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Portfolios/PortfolioDescription_Relationship_Mgmt_Portfolios'), findTestObject('CRM/User_Preference/CRM_Portfolios/DragAndDropColumnHeader_Relationship_Mgmt_Portfolios'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	else if(UserPreference == 'Portfolio Type')
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Portfolios/PortfolioType_Relationship_Mgmt_Portfolios'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Portfolios/PortfolioType_Relationship_Mgmt_Portfolios'), findTestObject('CRM/User_Preference/CRM_Portfolios/DragAndDropColumnHeader_Relationship_Mgmt_Portfolios'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	else
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Portfolios/PortfolioStatus_Relationship_Mgmt_Portfolios'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Portfolios/PortfolioStatus_Relationship_Mgmt_Portfolios'), findTestObject('CRM/User_Preference/CRM_Portfolios/DragAndDropColumnHeader_Relationship_Mgmt_Portfolios'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
}

else if(CRM_Tab == 'Assets')
{	
	WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/Clicking_On_Assets_Relationship_Mgmt'), waitTime)
	
	WebUI.click(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/Clicking_On_Assets_Relationship_Mgmt'))
	
	if(UserPreference == 'Cusip')
	{
		WebUI.delay(waitTime)
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/Cusip_Relationship_Mgmt_Assets'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/Cusip_Relationship_Mgmt_Assets'), findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/DragAndDropColumnHeader_Relationship_Mgmt_Assets'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	
	else if(UserPreference == 'Asset Description')
	{
		WebUI.delay(waitTime)
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/AssetDescription_Relationship_Mgmt_Assets'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/AssetDescription_Relationship_Mgmt_Assets'), findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/DragAndDropColumnHeader_Relationship_Mgmt_Assets'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	
	else if(UserPreference == 'ANH Type')
	{
		WebUI.delay(waitTime)
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/ANHType_Relationship_Mgmt_Assets'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/ANHType_Relationship_Mgmt_Assets'), findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/DragAndDropColumnHeader_Relationship_Mgmt_Assets'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	
	else if(UserPreference == 'Super Asset Class')
	{
		WebUI.delay(waitTime)
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/SuperAssetClass_Relationship_Mgmt_Assets'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/SuperAssetClass_Relationship_Mgmt_Assets'), findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/DragAndDropColumnHeader_Relationship_Mgmt_Assets'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	
	else if(UserPreference == 'Asset Class')
	{
		WebUI.delay(waitTime)
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/AssetClass_Relationship_Mgmt_Assets'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/AssetClass_Relationship_Mgmt_Assets'), findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/DragAndDropColumnHeader_Relationship_Mgmt_Assets'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	
	else if(UserPreference == 'Sub Asset Class')
	{
		WebUI.delay(waitTime)
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/SubAssetClass_Relationship_Mgmt_Assets'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/SubAssetClass_Relationship_Mgmt_Assets'), findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/DragAndDropColumnHeader_Relationship_Mgmt_Assets'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	
	else if(UserPreference == 'GL Category')
	{
		WebUI.delay(waitTime)
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/GLCategory_Relationship_Mgmt_Assets'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/GLCategory_Relationship_Mgmt_Assets'), findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/DragAndDropColumnHeader_Relationship_Mgmt_Assets'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	
	else if(UserPreference == 'Asset Type')
	{
		WebUI.delay(waitTime)
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/AssetType_Relationship_Mgmt_Assets'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/AssetType_Relationship_Mgmt_Assets'), findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/DragAndDropColumnHeader_Relationship_Mgmt_Assets'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	
	else
	{
		WebUI.delay(waitTime)
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/ProductType_Relationship_Mgmt_Assets'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/ProductType_Relationship_Mgmt_Assets'), findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/DragAndDropColumnHeader_Relationship_Mgmt_Assets'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
}
else
{
	WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/Clicking_On_Projects_Relationship_Mgmt'), waitTime)
	
	WebUI.click(findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/Clicking_On_Projects_Relationship_Mgmt'))
	
	if(UserPreference == 'Project Name')
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/ProjectName_Relationship_Mgmt_Projects'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/ProjectName_Relationship_Mgmt_Projects'), findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/DragAndDropColumnHeader_Relationship_Mgmt_Projects'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()	
	}
	
	else if(UserPreference == 'Project Description')
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/ProjectDescription_Relationship_Mgmt_Projects'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/ProjectDescription_Relationship_Mgmt_Projects'), findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/DragAndDropColumnHeader_Relationship_Mgmt_Projects'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	
	else if(UserPreference == 'Project Status')
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/ProjectStatus_Relationship_Mgmt_Projects'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/ProjectStatus_Relationship_Mgmt_Projects'), findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/DragAndDropColumnHeader_Relationship_Mgmt_Projects'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	
	else if(UserPreference == 'Start Date')
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/StartDate_Relationship_Mgmt_Projects'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/StartDate_Relationship_Mgmt_Projects'), findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/DragAndDropColumnHeader_Relationship_Mgmt_Projects'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
	
	else
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/EndDate_Relationship_Mgmt_Projects'), waitTime)
		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/EndDate_Relationship_Mgmt_Projects'), findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/DragAndDropColumnHeader_Relationship_Mgmt_Projects'))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot()
	}
}

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/Clicking_On_User_PreferenceButton'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/User_Preference/Clicking_On_User_PreferenceButton'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/button_New_userPerfName_Relationship_Mgmt'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/User_Preference/button_New_userPerfName_Relationship_Mgmt'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/input_Name_userPrefName_Relationship_Mgmt'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/CRM/User_Preference/input_Name_userPrefName_Relationship_Mgmt'), PrefName)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CRM/User_Preference/button_save_userPerfName_Relationship_Mgmt'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/button_Ok_userPerfName_Relationship_Mgmt'), 
    waitTime)

WebUI.click(findTestObject('Object Repository/CRM/User_Preference/button_Ok_userPerfName_Relationship_Mgmt'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/Clicking_On_MyWork_Relationships'), waitTime)

WebUI.click(findTestObject('Object Repository/CRM/User_Preference/Clicking_On_MyWork_Relationships'))

WebUI.click(findTestObject('CRM/Relationship/Relationship_Mgmt_LHS'))

WebUI.delay(waitTime)

if(CRM_Tab == 'Entities')
{
	WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Entities/Clicking_On_Entities_Relationship_Mgmt'), waitTime)
	
	WebUI.click(findTestObject('Object Repository/CRM/User_Preference/CRM_Entities/Clicking_On_Entities_Relationship_Mgmt'))
}

else if(CRM_Tab == 'Accounts')
{
	WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Accounts/Clicking_On_Accounts_Relationship_Mgmt'), waitTime)
	
	WebUI.click(findTestObject('Object Repository/CRM/User_Preference/CRM_Accounts/Clicking_On_Accounts_Relationship_Mgmt'))
}

else if(CRM_Tab == 'Portfolios')
{
	WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Portfolios/Clicking_On_Portfolios_Relationship_Mgmt'), waitTime)
	
	WebUI.click(findTestObject('Object Repository/CRM/User_Preference/CRM_Portfolios/Clicking_On_Portfolios_Relationship_Mgmt'))
}

else if(CRM_Tab == 'Assets')
{
	WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/Clicking_On_Assets_Relationship_Mgmt'), waitTime)
	
	WebUI.click(findTestObject('Object Repository/CRM/User_Preference/CRM_Assets/Clicking_On_Assets_Relationship_Mgmt'))
	
	WebUI.delay(waitTime)	
}

else if(CRM_Tab == 'Projects')
{
	WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/Clicking_On_Projects_Relationship_Mgmt'), waitTime)
	
	WebUI.click(findTestObject('Object Repository/CRM/User_Preference/CRM_Projects/Clicking_On_Projects_Relationship_Mgmt'))
}

WebUI.click(findTestObject('Object Repository/CRM/User_Preference/Clicking_On_User_PreferenceButton'))

WebUI.waitForElementClickable(findTestObject('Object Repository/CRM/User_Preference/button_New_userPerfName_Relationship_Mgmt'), 
    waitTime)

WebUI.sendKeys(findTestObject('Object Repository/CRM/User_Preference/input_User Preferences_Relationship_Mgmt'), PrefName)

WebUI.sendKeys(findTestObject('Object Repository/CRM/User_Preference/input_User Preferences_Relationship_Mgmt'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/CRM/User_Preference/button_Ok_userPerfName_Relationship_Mgmt'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('CommonCases/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)