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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CRM/Entity_Individual_EntityDetail'), [('waitTime') : waitTime, ('AppUrl') : AppUrl, ('UserName') : UserName
        , ('Password') : Password, ('SecurityAns') : SecurityAns, ('RelationName') : RelationName, ('RelationDesc') : RelationDesc
        , ('RelationStatus') : RelationStatus, ('SourceOfWealth') : SourceOfWealth, ('RelationType') : RelationType, ('Notes') : Notes
        , ('EntLegalName') : EntLegalName, ('EntStatus') : EntStatus, ('EntType') : EntType, ('EntShortName') : EntShortName
        , ('EntTaxStatus') : EntTaxStatus, ('EntDueDeligenceType') : EntDueDeligenceType, ('EntCurrency') : EntCurrency, ('EntAccMethod') : EntAccMethod
        , ('EntChartOfAcc') : EntChartOfAcc, ('EntCalendr') : EntCalendr, ('EntClosingGrup') : EntClosingGrup, ('IndivNamePrefix') : IndivNamePrefix
        , ('IndivFirstName') : IndivFirstName, ('IndivMidName') : IndivMidName, ('IndivLastName') : IndivLastName, ('IndivNameSuffix') : IndivNameSuffix
        , ('EntTaxPayerId') : EntTaxPayerId, ('EntDOBIncepDate') : EntDOBIncepDate, ('EntGenLevel') : EntGenLevel, ('EntConsToElectDelivery') : EntConsToElectDelivery
        , ('EntityAdvisor') : EntityAdvisor, ('EntNickName') : EntNickName, ('EntDateAddAsProspect') : EntDateAddAsProspect
        , ('EntDateAccepted') : EntDateAccepted, ('EntDateClosed') : EntDateClosed, ('EntDateTermNotice') : EntDateTermNotice
        , ('EntAdvisorCap') : EntAdvisorCap, ('TitleForNotes') : TitleForNotes, ('DescForNotes') : DescForNotes, ('EntNotes') : EntNotes
        , ('EntLegacyId') : EntLegacyId], FailureHandling.CONTINUE_ON_FAILURE)

