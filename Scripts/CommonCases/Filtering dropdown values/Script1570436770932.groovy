import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.stringtemplate.v4.compiler.STParser.element_return

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

// For selecting fist dropdown in filtering.

WebUI.click(findTestObject('CRM/Create Entity/Search Entity/Select1_Contains_dropdown'))

WebUI.delay(2)

if (EntFilterDropdown1 == 'Contains' | EntFilterDropdown1 == '') 
{
	WebUI.mouseOver(findTestObject('CRM/Create Entity/Search Entity/li_Contains_dropdown1'))
	
	WebUI.click(findTestObject('CRM/Create Entity/Search Entity/li_Contains_dropdown1'), FailureHandling.CONTINUE_ON_FAILURE)
}
else
	if(EntFilterDropdown1 == 'Equal to' | EntFilterDropdown1 == '')
	{
		WebUI.mouseOver(findTestObject('CRM/Create Entity/Search Entity/li_Equal_to_dropdown1'))
		
		WebUI.click(findTestObject('CRM/Create Entity/Search Entity/li_Equal_to_dropdown1'), FailureHandling.CONTINUE_ON_FAILURE)	
	}
else
{
	WebUI.mouseOver(findTestObject('CRM/Create Entity/Search Entity/li_Less_than_dropdown1'))
	
	WebUI.click(findTestObject('CRM/Create Entity/Search Entity/li_Less_than_dropdown1'), FailureHandling.CONTINUE_ON_FAILURE)
}

// For Selecting relation between two dropdowns.

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Search Entity/relation_between_dropdown'))

WebUI.delay(2)

if (DropdownRelation == 'And' | DropdownRelation == '') 
{
	WebUI.mouseOver(findTestObject('Object Repository/CRM/Create Entity/Search Entity/li_And_relation'))
	
	WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Search Entity/li_And_relation'), FailureHandling.CONTINUE_ON_FAILURE)	
}
else
{
	WebUI.mouseOver(findTestObject('Object Repository/CRM/Create Entity/Search Entity/li_Or_relation'))
	
	WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Search Entity/li_Or_relation'), FailureHandling.CONTINUE_ON_FAILURE)
}

// For Selecting second dropdown in filtering.

WebUI.click(findTestObject('Object Repository/CRM/Create Entity/Search Entity/Select2_Contains_dropdown'))

WebUI.delay(2)

if (EntFilterDropdown2 == 'Contains' | EntFilterDropdown2 == '')
{
	WebUI.mouseOver(findTestObject('CRM/Create Entity/Search Entity/li_Contains_dropdown2'))
	
	WebUI.click(findTestObject('CRM/Create Entity/Search Entity/li_Contains_dropdown2'), FailureHandling.CONTINUE_ON_FAILURE)
}
else
	if(EntFilterDropdown2 == 'Equal to' | EntFilterDropdown2 == '')
	{
		WebUI.mouseOver(findTestObject('CRM/Create Entity/Search Entity/li_Equal_to_dropdown2'))
		
		WebUI.click(findTestObject('CRM/Create Entity/Search Entity/li_Equal_to_dropdown2'), FailureHandling.CONTINUE_ON_FAILURE)
	}
else
{
	WebUI.mouseOver(findTestObject('CRM/Create Entity/Search Entity/li_Less_than_dropdown2'))
	
	WebUI.click(findTestObject('CRM/Create Entity/Search Entity/li_Less_than_dropdown2'), FailureHandling.CONTINUE_ON_FAILURE)
}


	

