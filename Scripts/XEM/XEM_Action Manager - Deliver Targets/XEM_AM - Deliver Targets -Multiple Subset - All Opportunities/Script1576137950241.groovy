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

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Multiple Subset Segmented'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Product Catagory Segmentation'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Set Segmentation Button'))

WebUI.sendKeys(findTestObject('Action_Manager_Deliver_Targets/Target Set Name Placeholder - Segmentation'), 'High profit for Candy')

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

WebUI.delay(15, FailureHandling.STOP_ON_FAILURE)

if (true) {
    WebUI.delay(15)

    WebUI.verifyTextPresent('Delivered', false)

    println('Target status is delivered')
} else {
    println('Target status is not delivered ')
}

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Monitor Outcomes Link'))

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Target Set To Include menu'))

WebUI.delay(5)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Page_R4 Technologies Portal/Target Set To Include record'))

if (true) {
    WebUI.delay(15)

    WebUI.verifyElementPresent(findTestObject('Action_Manager_Deliver_Targets/Page_R4 Technologies Portal/Revenue_Value'), 
        500)

    println('Data is available')
} else {
    println('data is not available ')
}

