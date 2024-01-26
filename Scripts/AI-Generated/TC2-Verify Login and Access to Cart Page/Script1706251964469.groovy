import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page_home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '')

'Step 2: At Page home, click on input user name'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_user_name'))

'Step 3: At Page home, input on input user name'

WebUI.setText(findTestObject('AI-Generated/Page_home/input_user_name'), input_user_name)

'Step 4: At Page home, input on input password'

WebUI.setText(findTestObject('AI-Generated/Page_home/input_password'), input_password)

'Step 5: At Page home, click on input login button > navigate to Page inventory.html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_login_button'))

'Step 6: At Page inventory.html, click on hyperlink object > navigate to Page cart.html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/hyperlink_2'))

'Step 7: At Page cart.html, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/div_object'))

'Step 8: At Page cart.html, click on button react burger menu btn'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_react_burger_menu_btn'))

'Step 9: Add visual checkpoint at Page_cart.html'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Login and Access to Cart Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}