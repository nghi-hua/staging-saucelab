import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '')

'Step 2: Login into Application'

TrueTestScripts.login()

'Step 3: At Page home, click on input user name'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_user_name'))

'Step 4: At Page home, input on input user name'

WebUI.setText(findTestObject('AI-Generated/Page_home/input_user_name'), input_user_name)

'Step 5: At Page home, input on input password'

WebUI.setText(findTestObject('AI-Generated/Page_home/input_password'), input_password)

'Step 6: At Page home, click on input login button > navigate to Page inventory html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_login_button'))

'Step 7: At Page inventory html, click on hyperlink item 4 img link > navigate to Page inventory-item html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/hyperlink_item_4_img_link'))

'Step 8: At Page inventory-item html, click on button add to cart sauce labs backpack'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory-item_html/button_add_to_cart_sauce_labs_backpack'))

'Step 9: Add visual checkpoint at Page inventory-item html'

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Inventory Item Page after Adding Item to Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
