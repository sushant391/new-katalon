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

WebUI.callTestCase(findTestCase('XEM/XEM_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Action_Manager_Build_Plan/span_Action'))

WebUI.delay(5)

WebUI.click(findTestObject('Action_Manager_Build_Plan/span_Action - 2'))

WebUI.click(findTestObject('Object Repository/Action_Manager_Build_Plan/img_Build a New Action'))

WebUI.delay(5)

WebUI.dragAndDropToObject(findTestObject('Action_Manager_Build_Plan/PRODUCTS'), findTestObject('Action_Manager_Build_Plan/Droppable Action manager canvas'))

WebUI.delay(5)

WebUI.dragAndDropToObject(findTestObject('Action_Manager_Build_Plan/LOCATIONS'), findTestObject('Action_Manager_Build_Plan/Droppable Action manager canvas'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Action_Manager_Build_Plan/span_Product Division'))

WebUI.delay(5)

WebUI.click(findTestObject('Action_Manager_Build_Plan/Product Catagory'))

String productCatagoryData = Location

productCatagoryClick = new TestObject('Object Repository/Action_Manager_Build_Plan/span_Product Division')

productCatagoryClick.addProperty('xpath', ConditionType.EQUALS, ('//span[text()=\'' + productCatagory) + '\']')

WebUI.click(productCatagoryClick)

WebUI.click(findTestObject('Action_Manager_Build_Plan/Product Divison'))

WebUI.click(findTestObject('Action_Manager_Build_Plan/ConfirmSelection'))

WebUI.delay(5)

WebUI.click(findTestObject('Action_Manager_Build_Plan/span_Locations'))

WebUI.focus(findTestObject('Action_Manager_Build_Plan/Location icon'))

WebUI.click(findTestObject('Action_Manager_Build_Plan/location_Catagory'))

WebUI.click(findTestObject('Action_Manager_Build_Plan/select_City'))

WebUI.setText(findTestObject('Action_Manager_Build_Plan/enter_City'), 'WEST NEW YORK')

WebUI.click(findTestObject('Action_Manager_Build_Plan/select_City_2'))

WebUI.delay(5)

WebUI.setText(findTestObject('Action_Manager_Build_Plan/enter_City'), 'NEWNAN')

WebUI.click(findTestObject('Action_Manager_Build_Plan/select_City_2'))

WebUI.click(findTestObject('Action_Manager_Build_Plan/ConfirmSelectionsBtn'))

WebUI.delay(5)

WebUI.click(findTestObject('Action_Manager_Review_Opportunities/Review_Opportunities'))

WebUI.delay(10)

if (true) {
    WebUI.verifyTextPresent('$', false)

    println('Values are present on Opportunities Preview tab')
} else {
    println('Reccomendation not found')
}

WebUI.click(findTestObject('Action_Manager_Review_Opportunities/tab Potential Revenue View'))

WebUI.delay(5)

if (true) {
    WebUI.verifyTextPresent('$', false)

    println('Values are present on Potential Revenue View tab')
} else {
    println('Reccomendation not found')
}

WebUI.click(findTestObject('Action_Manager_Review_Opportunities/tab Current Revenue View'))

WebUI.delay(5)

if (true) {
    WebUI.verifyTextPresent('$', false)

    println('Values are present on Current Revenue View tab')
} else {
    println('Reccomendation not found')
}

WebUI.click(findTestObject('Action_Manager_Review_Opportunities/tab Product View'))

WebUI.delay(5)

if (true) {
    WebUI.verifyTextPresent('$', false)

    println('Values are present on Product View tab')
} else {
    println('Reccomendation not found')
}

