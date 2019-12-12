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

WebUI.callTestCase(findTestCase('XEM/XEM_Action Manager - Review Opportunities'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Deliver Action Plan Target button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Create Target Set button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/all opportunities'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Next Segment Target Button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Consolidated Radio Button'))

WebUI.sendKeys(findTestObject('Action_Manager_Deliver_Targets/Target Set Name Placeholder'), 'High profit for Candy')

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Select Target Set Name'))

WebUI.delay(5)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Set Metadata Button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Confirm and Generate button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Commit button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Commit button - two'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Commit button - Three'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Confirm and Generate button'))

WebUI.delay(15, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Close button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Deliver Target link'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Preview button Deliver Target'))

println('Record previwed successfully')

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Review Opportunities All Target button'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

String tId = WebUI.getText(findTestObject('Action_Manager_Deliver_Targets/Target Id'))

println(tId)

not_run: WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Delete button Deliver Target'))

not_run: println('Deleted target ID ' + tId)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Edit button Deliver Target'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

if (true) {
    WebUI.verifyElementNotPresent(findTestObject('Action_Manager_Deliver_Targets/Filtered Opportunities'), 5)

    println('Record edited successfully')
} else {
    println('Unable to edit record')
}

