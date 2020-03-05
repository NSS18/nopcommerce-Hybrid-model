$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/features/registration.feature");
formatter.feature({
  "name": "User should able to register successfully,",
  "description": "  so that he can use all user features from our website",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should able to register",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on register page",
  "keyword": "Given "
});
formatter.match({
  "location": "NopCommerceTesting.MyStepdefs.userIsOnRegisterPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters all registration details",
  "keyword": "When "
});
formatter.match({
  "location": "NopCommerceTesting.MyStepdefs.userEntersAllRegistrationDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({
  "location": "NopCommerceTesting.MyStepdefs.userClicksOnRegisterButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "NopCommerceTesting.MyStepdefs.userShouldAbleToRegisterSuccessfully()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: Registration not successful expected:\u003c[!!!!!]Your registration co...\u003e but was:\u003c[]Your registration co...\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat NopCommerceTesting.Utils.assertTextMessage(Utils.java:100)\r\n\tat NopCommerceTesting.RegistrationResultPage.verifyUserSeeRegistrationSuccessMessage(RegistrationResultPage.java:13)\r\n\tat NopCommerceTesting.MyStepdefs.userShouldAbleToRegisterSuccessfully(MyStepdefs.java:72)\r\n\tat ✽.user should able to register successfully(file:///C:/Users/sapan/IdeaProjects/NopCommerce%20Website%20Hybrid%20Model/./src/test/Resources/features/registration.feature:9)\r\n",
  "status": "failed"
});
formatter.write("!!!!!!!!!!!!...Scenario failed.Please see attached screenshot for the error");
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});