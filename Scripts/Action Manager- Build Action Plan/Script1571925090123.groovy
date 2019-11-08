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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('User Authentication'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Action_Manager_Build_Plan/span_Action'))

WebUI.click(findTestObject('Object Repository/Action_Manager_Build_Plan/img_Build a New Action'))

WebUI.delay(5)

WebUI.dragAndDropToObject(findTestObject('Action_Manager_Build_Plan/PRODUCTS'), findTestObject('Action_Manager_Build_Plan/Droppable Action manager canvas'))

WebUI.delay(5)

WebUI.dragAndDropToObject(findTestObject('Action_Manager_Build_Plan/LOCATIONS'), findTestObject('Action_Manager_Build_Plan/Droppable Action manager canvas'))

WebUI.delay(5)

WebUI.dragAndDropToObject(findTestObject('Action_Manager_Build_Plan/GOALS'), findTestObject('Action_Manager_Build_Plan/Droppable Action manager canvas'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Action_Manager_Build_Plan/span_Product Division'))

WebUI.delay(5)

WebUI.click(findTestObject('Action_Manager_Build_Plan/Product Catagory'))

WebUI.click(findTestObject('Action_Manager_Build_Plan/Product Divison'))

WebUI.click(findTestObject('Action_Manager_Build_Plan/ConfirmSelection'))

WebUI.click(findTestObject('Action_Manager_Build_Plan/span_Locations'))

WebUI.click(findTestObject('Action_Manager_Build_Plan/location_Catagory'))

WebUI.click(findTestObject('Action_Manager_Build_Plan/select_City'))

WebUI.setText(findTestObject('Action_Manager_Build_Plan/enter_City'), 'WEST NEW YORK')

WebUI.click(findTestObject('Action_Manager_Build_Plan/select_City_2'))

WebUI.click(findTestObject('Object Repository/Action_Manager_Build_Plan/button_Confirm Selections'))

WebUI.click(findTestObject('Action_Manager_Build_Plan/span_Goal'))

WebUI.click(findTestObject('Action_Manager_Build_Plan/ConfirmSelection'))

