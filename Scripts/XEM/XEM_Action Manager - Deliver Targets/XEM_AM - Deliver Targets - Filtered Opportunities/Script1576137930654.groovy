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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('XEM/XEM_Action Manager - Review Opportunities'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Deliver Action Plan Target button'))

WebUI.delay(5)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Create Target Set button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Filtered Opportunities'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Action_Manager_Deliver_Targets/select Products'), 10)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/select Products'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/select Locations'))

WebUI.delay(5)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/select Product ConceptType'))

WebUI.delay(5)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Product ConceptType'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Product Pick Comparator dropdown'))

WebUI.delay(5)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/select Product Pick Comparator Value'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Product selection'))

WebUI.delay(5)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/choose Product'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Commit button under Product'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/select Locations ConceptType'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Location ConceptType'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Location Pick Comparator dropdown'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/select Location Pick Comparator Value'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/choose Location'))

WebUI.setText(findTestObject('Action_Manager_Deliver_Targets/enter City'), 'WEST NEW YORK')

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/select City from Location'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Commit button under Location'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Next Segment Target Button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Consolidated Radio Button'))

WebUI.sendKeys(findTestObject('Action_Manager_Deliver_Targets/Target Set Name Placeholder'), 'test')

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Select Target Set Name'))

WebUI.delay(5)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Set Metadata Button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Confirm and Generate button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Commit button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Commit button - two'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Commit button - Three'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Confirm and Generate button'))

WebUI.delay(10)

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Close button'))

WebUI.click(findTestObject('Action_Manager_Deliver_Targets/Monitor Outcomes Link'))

