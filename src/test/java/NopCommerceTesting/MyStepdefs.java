package NopCommerceTesting;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    //To Create object of home page
    HomePage homePage = new HomePage();
    //To Create object of registration page
    RegistrationPage registrationPage = new RegistrationPage();
    //To Create object of registration result page
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    //To Create object of electronics page
    ElectronicsPage electronicsPage = new ElectronicsPage();
    //To Create object of camera and photo page
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    //To Create object of camera and photo result page
    CameraAndPhotoResultPage cameraAndPhotoResultPage = new CameraAndPhotoResultPage();
    //To Create object of login page
    LoginPage loginPage = new LoginPage();

    //To Create object of product email a friend
    ProductEmailAFriend productEmailAFriend = new ProductEmailAFriend();
    //To Create object of product email a friend details
    ProductEmailAFriendDetails productEmailAFriendDetails = new ProductEmailAFriendDetails();
    //To Create object of user success email result--register user
    RegisterUserSuccessEmailResult productEmailResult = new RegisterUserSuccessEmailResult();
    //To Create object of user  email result--non register user
    NonRagisterUseremailResult nonRagisterUseremailResult = new NonRagisterUseremailResult();
    //To Create object of Book page
    BookPage bookPage=new BookPage();
    //To create object of cart page
    CartPage cartPage=new CartPage();
    //To create object of checkout as guest
    CheckoutAsGuest checkoutAsGuest=new CheckoutAsGuest();
    //To create object of fill checkout details
    FillCheckoutDetails fillCheckoutDetails=new FillCheckoutDetails();
    //To create object of checkout result
    CheckoutResult checkoutResult=new CheckoutResult();
    //To create object of news page
    NewsPage newsPage=new NewsPage();
    //To create object of new online store open page
    NewOnlineStoreIsOpenPage newOnlineStoreIsOpenPage=new NewOnlineStoreIsOpenPage();





//test case 1---------------->User should able to  register successfully and able to see successful registration message.
    @Given("user is on register page")
    public void userIsOnRegisterPage() {
        homePage.clickRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
    }

    @When("user enters all registration details")
    public void userEntersAllRegistrationDetails() {
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEnterRegistrationDetails();

    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        registrationPage.userClicksRegisterButton();
    }

    @Then("user should able to register successfully")
    public void userShouldAbleToRegisterSuccessfully() {
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();

    }




//test case 2 --------------->User should able to compare two products successfully and able to see 'compare products' text.



    @Given("User is on electronics page")
    public void user_is_on_electronics_page() {
        homePage.clickOnElectronics();
        //Verify user is  on electronics page
        electronicsPage.verifyUserIsOnElectronicsPage();

    }

    @When("User selects two products for comparision")
    public void user_selects_two_products_for_comparision() {
        electronicsPage.userClicksOnCameraAndPhoto();
        //Click on compare button for item 1
        cameraAndPhotoPage.clickOnCompareButtonForProduct1();
        cameraAndPhotoPage.verifyUserIsOnCameraAndPhotoPage();
        cameraAndPhotoPage.clickOnCompareButtonForProduct2();
        //Click on green product comparison link
        cameraAndPhotoPage.productComparision();

    }

    @Then("User should able to compare successfully")
    public void user_should_able_to_compare_successfully() {
        //Verify compare product success message
        cameraAndPhotoResultPage.verifyUserSeeCompareProductSuccessMessage();
    }

//Test case 3------------->User(Registered) should be able to refer a product to a friend and able to see message "Your message has been sent."

    @Given("User is on Home Page")
    public void user_is_on_Home_Page() {
        //To verify user is on homepage
        homePage.verifyUserIsOnHomepage();

    }

    @When("User selects product and fill all details")
    public void user_selects_product_and_fill_all_details() {
            //Click on login link
             homePage.clickOnLogin();
            //To verify user is on login page
            loginPage.verifyOnLoginPage();
            //Enter login details
            loginPage.loginDetails();
            //Click on electronics
            homePage.clickOnElectronics();
            //To verify we are on electronics page
            electronicsPage.verifyUserIsOnElectronicsPage();
            //Click on camera & photo
            electronicsPage.userClicksOnCameraAndPhoto();
            //To select product
            cameraAndPhotoPage.selectProduct();
        }

    @When("Clicks on send email button")
    public void clicks_on_send_email_button() {
        //To click on email a friend
        productEmailAFriend.emailAFriend();
        //To fill the details
        productEmailAFriendDetails.registerUserEnterFriendDetails();

    }

    @Then("User should able to see message {string}")
    public void user_should_able_to_see_message(String string) {

        //To check User should able to see message-"Your message has been sent.".
        productEmailResult.verifyRegisterUserSeeEmailSuccessMessage();
    }

//test case 4------>//To verify that non registered user should not be able to refer a product to a friend.

    @When("User\\(non register) selects product and fill all details")
    public void user_non_register_selects_product_and_fill_all_details() {
        homePage.clickOnElectronics();
        //To verify user is on electronics page
        electronicsPage.verifyUserIsOnElectronicsPage();
        //To click camera and photo
        electronicsPage.userClicksOnCameraAndPhoto();
        //To select product
        cameraAndPhotoPage.selectProduct();

    }

    @When("User Clicks on send email button")
    public void user_Clicks_on_send_email_button() {
        //To click email a friend
        productEmailAFriend.emailAFriend();
        //To fill details
        productEmailAFriendDetails.nonRegisterUserEnterFriendDetails();

    }

    @Then("User should  able to see unsuccessful message")
    public void user_should_able_to_see_unsuccessful_message() {
        //To verify User should able to see error message -"Only registered customers can use email a friend feature"
        nonRagisterUseremailResult.verifyNonRegisterUserSeeErrorMessage();

    }


//Test case 5----->//To verify user should be able to sort product high to low by price

    @When("User click on sort by filter and selects high to low filter")
    public void user_click_on_sort_by_filter_and_selects_high_to_low_filter() {
        //To click on books
        homePage.clickBooks();
        //To select short by filter for price high to low
        bookPage.selectHighToLowFromShortByFilter();

    }

    @Then("User should able to see sorted product price from high to low.")
    public void user_should_able_to_see_sorted_product_price_from_high_to_low() {
        //To print price high to low
        bookPage.verifyPriceHighToLowSorting();

    }



//testcase 6------>Guest user should be able to checkout successfully

    @When("User adds product in the cart")
    public void user_adds_product_in_the_cart() {
        //Click on book link
        homePage.clickOnBooksLink();
        //Click on add to cart
        bookPage.clickOnAddToCart();
        //Click on shopping cart
        bookPage.clickOnShoppingCart();
        //To accept on terms and condition
        cartPage.checkTermsAndCondition();


    }

    @When("User checkout as a guest")
    public void user_checkout_as_a_guest() {
        //Click on checkout
        cartPage.clickOnCheckout();
        //Click on checkout as guest
        checkoutAsGuest.clickOnCheckoutAsGuest();


    }

    @When("User fills all compulsory fields and clicks confirm")
    public void user_fills_all_compulsory_fields_and_clicks_confirm() {
        //To fill checkout details
        fillCheckoutDetails.fillCheckoutDetails();

    }

    @Then("User should able to see successful order message")
    public void user_should_able_to_see_successful_order_message() {
        //To verify success message
        checkoutResult.verifyCheckoutSuccessMessage();

    }

//test case 7---------------->Guest user should able to add new comment on nope commerce website


    @When("User selects product and add the comment")
    public void user_selects_product_and_add_the_comment() {
        //To click on view news archive
        homePage.ClickOnViewNewsArchive();
        //To click on details
        newsPage.clickOnDetails();

    }

    @When("User clicks on New comment button")
    public void user_clicks_on_New_comment_button() {
        //To add new comment
        newOnlineStoreIsOpenPage.addNewComment();

    }

    @Then("User should able to see successful message")
    public void user_should_able_to_see_successful_message() {
        //To verify New comment added
        newOnlineStoreIsOpenPage.verifySuccessMessageOfComment();
    }

    //testcase-8------->User should able to change the currency and able to see all products price with changed currancy.

    @When("User selects currency")
    public void user_selects_currency() {
        //To click on currency euro
        homePage.clickCurrencyEuro();
    }

    @Then("User should able to see product prices with that currency symbol")
    public void user_should_able_to_see_product_prices_with_that_currency_symbol() {
        //To verify Euro sign
        homePage.VerifyPriceHasEuroSign();

    }



 //test case 9-------> User should able to verify that Add to cart button is present on all homepage products

    @Then("User should able to see Add to cart button on all homepage products")
    public void user_should_able_to_see_Add_to_cart_button_on_all_homepage_products() {
        //To verify add to cart is present in all featured products
        homePage.verifyAddToCartPresentOnHomepageFeaturedItems();

    }



}
