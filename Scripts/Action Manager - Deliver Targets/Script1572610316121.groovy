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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('User Authentication'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Action Manager - Review Opportunities'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Deliver Action Plan Target button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Create Target Set button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/all opportunities'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Next Segment Target Button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Consolidated Radio Button'))

WebUI.sendKeys(findTestObject('Action_Manager_Deliver_Targets/Target Set Name Placeholder'), 'test')

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Select Target Set Name'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Set Metadata Button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Confirm and Generate button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Commit button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Commit button - two'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Commit button - Three'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Confirm and Generate button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Close button'))

