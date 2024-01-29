import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page  inventory html'

WebUI.navigateToUrl(GlobalVariable.application_domain + 'inventory.html')

'Step 2: At Page inventory html, click on button add to cart sauce labs backpack'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_add_to_cart_sauce_labs_backpack'))

'Step 3: At Page inventory html, click on hyperlink 2 > navigate to Page cart html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/hyperlink_object'))

'Step 4: At Page cart html, click on button checkout > navigate to Page checkout-step-one html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_checkout'))

'Step 5: At Page checkout-step-one html, click on input firstname'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout-step-one_html/input_firstname'))

'Step 6: At Page checkout-step-one html, input on input firstname'

WebUI.setText(findTestObject('AI-Generated/Page_checkout-step-one_html/input_firstname'), input_firstname)

'Step 7: At Page checkout-step-one html, click on input lastname'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout-step-one_html/input_lastname'))

'Step 8: At Page checkout-step-one html, input on input lastname'

WebUI.setText(findTestObject('AI-Generated/Page_checkout-step-one_html/input_lastname'), input_lastname)

'Step 9: At Page checkout-step-one html, click on input postalcode'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout-step-one_html/input_postalcode'))

'Step 10: At Page checkout-step-one html, input on input postalcode'

WebUI.setText(findTestObject('AI-Generated/Page_checkout-step-one_html/input_postalcode'), input_postalcode)

'Step 11: At Page checkout-step-one html, click on input continue > navigate to Page checkout-step-two html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout-step-one_html/input_continue'))

'Step 12: At Page checkout-step-two html, click on button finish > navigate to Page checkout-complete html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout-step-two_html/button_finish'))

'Step 13: At Page checkout-complete html, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout-complete_html/div_object'))

'Step 14: At Page checkout-complete html, click on button react burger menu btn'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout-complete_html/button_react_burger_menu_btn'))

'Step 15: Add visual checkpoint at Page checkout-complete html'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Checkout Completion after Adding Item to Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
