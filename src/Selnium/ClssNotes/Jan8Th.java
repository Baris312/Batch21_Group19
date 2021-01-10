package Selnium.ClssNotes;

public class Jan8Th {
}
/*
JAN 8TH, TGIF
TODAY'S SCHEDULE
- Review of past class
- 1 of the practices
- Introduction to TestNG
- Learn how to handle dropdowns using Selenium
--------------------------------------------------------------------------------
- RECAP
    - cssSelector
        - 1 of 8 locators of Selenium
        - cssSelector is different from the first 6 locators because it allows us to create custom locators with any given attribute and value
        - We are not limited to name, id, class, linkText etc...
        - There are 2 different types of syntaxes for cssSelector:
    #1- We use . and # to locate with cssSelector.
            - What does . mean in cssSelector?
                -> . means class attribute value.
            .value -> we are supposed to be passing class attribute value
        tagName.value --> we are being a little bit more specific because we are also passing the tagName as well.
        - What we are saying is "get me the tagName with given attribute value"
ex:
    <div class="ad99" id="ff22"> </div>
        .ad99
        div.ad99
        both of these are locating the same div above.
    - What does # mean in cssSelector?
        - # stands for id in cssSelector.
        tagName#value
        #ff22
        div#ff22
#2- Second cssSelector locator is more flexible than the first one.
    - Because we are not limited to class or id values when creating locators
    syntax: tagName[attribute='value']
    ex:
    <div class="ad99" id="ff22" for="something"> </div>
    1- div[class='ad99']
    2- div[id="ff22"]
    3- div[for="something"]
- All of the 3 examples above are locating the same web element using different attribute values.
- XPATH LOCATOR:
- How many different types of xpath do we have?
    - 2 different types.
#1- ABSOLUTE XPATH:
    - Starts with "/"
    - Which means starts from the root element "html"
    - It will go down 1 by 1 until reached to desired web element
    - Since it will be very long, it will be very easy for this to break with any minimal changes in the html structure
    - We should try avoid using it
    ex: /html/body/div/div/div[2]/div[5]/div
#2- RELATIVE XPATH
    - Starts with "//"
    - "//" means start from any given point in the html page
    - Since we are starting from almost directly from the web element we are looking for it is harder for this one to break.
    - To go from child to parent --> /..
    - To go from parent to child --> /
ex: //div[@class='ad99']
--> Commonly used xpath locators:
    1- //tagName[@attribute='value']
    2- //tagName[.='textValue'] : get me the web element with given tagName and textValue
        //tagName[text()='textValue']
    3- //*[@attribute='value']
        //*[.='textValue']
    - Whenever we say * in relative xpath we are saying ignore the type of tagName.
-------------------------------
P.I.Q:
 findElement vs findElements
 - .findElement():
    - Finds and returns SINGLE WebElement
    - Return type is WebElement (type coming from Selenium)
    - If it cannot find WebElement it throws NoSuchElementException
    - Even if the locator we provide returns multiple web elements, it will return us the first web element located
- .findElements();
    - This method can find and return multiple web elements
    - We need to provide web element that is returning multiple web elements
    - What is the return type of this?
        - List of WebElements
    - What happens when it cannot find a web element with given locator?
    - What kind of exception does it throw?
        - It will not throw exception
        - It will return empty List.
----------------
HOW TO HANDLE CHECKBOXES AND RADIOBUTTONS USING SELENIUM?
    - We just located it as any other web element using any of the locators and click to select (or unselect).
    - How do we verify if it is selected or not?
        - .isSelected() method to verify.
- .isSelected();
    -> Can be used with checkboxes and radio buttons.
    -> What is the return type?
        - boolean
    -> If the given checkbox/radiobutton is selected, it will return TRUE
    -> If the given checkbox/radiobutton is NOT selected, it will return FALSE
- .isEnabled();
    -> This method checks if the given web element is clickable or interactable
    -> If we are able to see the web element but not able to click it means it is not enabled.
    -> If webElement is enabled this method will return TRUE
    -> If webElement is NOT enabled this method will return FALSE
    driver.findElement(LOCATOR).isEnabled(); --> will return true if clickable
    driver.findElement(LOCATOR).isEnabled(); --> will return false if NOT clickable
------------------------------
--> IMPLICIT WAIT
    - driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    - implicit wait will apply to every time we use .findElement/S methods
    - By default it has value of 0.
    - When we change the value manually, the given time period will be used by our driver as additional wait time.
    - It does not have to wait for the WHOLE duration. It will wait until the condition happens.
    - When the condition happens, it will continue with execution.
    - How does it work?

        #1- We use implicit wait.
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        #2- We use driver.findElement() method
        #3- If findElement cannot find for any reason, it will have UPTO extra 15 seconds to wait before throwing NoSuchElementException
        #4- If findElement method can find the webElement it will keep continuing.
--> Thread.sleep();
    - Not selenium wait.
    - Not smart.
    - It does not look for any condition.
    - It will wait for the given duration no matter what
    - So if we say, Thread.sleep(5000); it will stop the execution of the code.
========================================================================
What is TestNG
Why do we learn TestNG
Get into basics of TestNG
----------------------------
--> If you are having issue with maven project after adding a dependency, try reloading project.
--> If that does not work, try:
#1- go to: .m2 file
#2- go to REPOSITORIES folder
#3- Delete everything in there
#4- Go to Maven project and "reload"
MAC: Go > Go To Folder > type: ~/.m2 > repositories > delete all files > reload project
WINDOWS: START > RUN > https://stackoverflow.com/questions/6081617/missing-maven-m2-folder
----------------------------
Adding TestNG to our project
#1- Go to: https://mvnrepository.com/
#2- search : TestNG
#3- select first one with TestNG
====================================================================================
What is TestNG?
    - TestNG is advanced unit testing tool that allows us creating test flow using annotations.
Why do we learn TestNG?
    - We learn testNG to take advantage of its annotaions and reports.
Basics of TestNG
@Test:
    - @Test annotation allows us to create independent tests in our Java class.
    - Each test will be inpedent from each other unless we specifically create dependency.
    - If a test fails, code will continue executing the next test in our "test suite."
    - By default the tests will run in the alphabetical order, unless we create "priority"
@BeforeClass/@AfterClass:
    - BeforeClass:
        - This method will run ONCE before everything else in the class.
        - Usually used for set up lines, such as: creating driver instance, opening browser, maximizing page, creating implicit waits etc.
    - AfterClass:
        - This method will run ONCE after everything else in the class.
        - Usually for closing stuff such as, driver.close() or driver.quit()
@BeforeMethod/@AfterMethod
    - BeforeMethod:
        - This method will run ONCE before each test in the class.
        - Usually used for set up lines, such as: creating driver instance, opening browser, maximizing page, creating implicit waits etc.
    - AfterMethod:
        - This method will run ONCE after each test in the class.
        - Usually for closing stuff such as, driver.close() or driver.quit()
ASSERTIONS:
    - Verification methods coming from Assert class in TestNG library.
    - Assert class' methods are static methods, so we don't have to creat object of the class to call the methods.
    - Assert.assertEquals(arg1, arg2 , "message");
        - Compares two values.
        - Fails if they are not equal
        - Optionally we are allowed to pass additional "message" as a third arg.
        - This message will only be printed out if the assertion fails.
    - Assert.assertTrue(boolean , "message");
        - Accepts/EXPECTS boolean value
        - Fails if the boolean value pass is "false"
        - Optionally we are allowed to pass additional "message" as a third arg.
        - This message will only be printed out if the assertion fails.
    - Assert.assertNotEquals(arg1, arg2 , "message");
        - expects the 2 arguments to not to be equal to pass the test.
    - Assert.assertFalse(boolean , "message");
        - Expects "false" boolean value to pass the test.
------------------------------------
HANDLING DROPDOWNS WITH SELENIUM
    - There are two types of dropdowns.
    WHAT CAN BE TESTED ABOUT A DROPDOWN?
        - What is selected by default?
        - What options are available in the dropdowns?
        - When you select an option, is it actually selected?
    #1- HTML Dropdowns:
        - If it is an HTML dropdown, meaning it is not <select> tag, we just locate it as any other web element, and click to it.
    #2- Select Dropdowns:
        - Select dropdowns are created using <select> tag.
        - How to handle Select dropdowns using selenium?
        #1- We need to locate the <select> dropdown
        #2- We need to create object of Select class (from selenium library)
        #3- Pass the web element into Select constructor.
        #4- We will be allowed to use select dropdown methods.
    Select select = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
How do we actually select from a SELECT dropdown?
- There are 3 ways of selecting.
    - selectByVisibleText()
        - this method accepts a string argument
        - then selects the given option with visible text
    syntax: select.byVisibleText("text goes here");

    - selectByValue
        - this method will select by the value of the attribute "value"
    syntax: select.byValue("1");
    - selectByIndex
        - this one selects by the index number of the <option>
        - index start from 0
    syntax: select.byIndex(2);
How do we get what is selected from the dropdown?
    - getFirstSelectedOption();
    - This method will get the option that is currently selected.
    - This method will return the currently selected option as a web element
How do we get all of the options in a dropdown?
    - .getOptions();
        - This method just returns all of the existing options in the dropdown.
        - Return type: List<WebElement>

    - .getAllSelectedOptions();
        - This method will return all of the selected options.

    - .deDeselectAll();
        - IF there are multiple options selected, it will de-selected whatever is selected.

 */