import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('User Authentication'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Search/span_Search'))

WebUI.click(findTestObject('Object Repository/Search/div_Audience Home_pull-left search-btn search-btn1'))

//Read location from excel and variable and click on same
String classfound = Location

locationforSearch = new TestObject('LocationForSearch')

locationforSearch.addProperty('xpath', ConditionType.EQUALS, ('//span[text()=\'' + classfound) + '\']')

WebUI.click(locationforSearch)

WebUI.delay(5)

//WebUI.click(findTestObject('Search/LocationForSearch'))
WebUI.setText(findTestObject('Object Repository/Search/input_City_field-input binder suggest-box'), LocationName)

WebUI.setText(findTestObject('Search/searchTitle'), 'test')

WebUI.click(findTestObject('Object Repository/Search/div_Medium priority_add'))

WebUI.click(findTestObject('Object Repository/Search/div_Searching Group for Initiative_view-btn'))

