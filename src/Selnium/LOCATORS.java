package Selnium;

public class LOCATORS {

}
/*
What is Selenium?
    - Selenium is basically some jar files(libraries, classes, methods) that allows us to automate browsers.

-> Difference between maven and selenium?
    - Maven is the tool that we use to create the JAVA PROJECT ITSELF.


What is maven ?
    - "BUILT AUTOMATION TOOL"
- WHAT IS BUILD?
    - Build is repeated steps when we are creating a java project.
- What are those repeated steps?
    - create a folder structure
    - compile
    - add libraries, jar files (whatever libraries you need)
    - deploy
--> All of the steps we write above combined together are called a "BUILD"


#1-  We get a pre configured project where there is already existing folder structure.
        - src
            - main : is used by developers to write java applications
            - test : is used by developers to write UNIT tests for the source code
#2- pom.xml : PROJECT OBJECT MODEL, pomxml
    - pom.xml file is the MOST important file in a maven project
    - this file allows us to add and manage dependencies into our project
    - we can change and update the dependency versions from this file easily




    ** At the end of our tests, we are looking for comparing two things.
           ACTUAL RESULT VS EXPECTED RESULT




Driver navigate ;

  *****      Driver.navigate().to();
    - This method is very similar to driver.get(); method
    - It gets the given URL.
    - There is a minor difference.
    - .get() method will wait the page to load before it continues to next step.
    - .to() method will not wait the page to load, it will immediately keep continuing for the rest of the code's execution.

    *driver.navigate().
    *driver.navigate().forward(); --> it takes the page to forward
    *driver.navigate().back(); --> it takes the page to back
    *driver.navigate().refresh(); --> it refresh the page


      ******* LOCATORS ****
  * .getTitle();
  * .getCurrentUrl();
  * .manage().window().maximize();
  * .close();
  * .quit();
  * .findElement();
  * linkText :
  * partialLinkText();
   (Which to methods from java we can compare these two methods(linkText vs partialLinkText)?
                                - .contains() vs .equals()
                                - .partialLinkText() vs linkText()    )

  *  name
  *  .sendKeys();
    -   Keys.ENTER;
  * Id
  * classname
  * tagName
  * gettext();
  * .getAttribute("attribute");
  * ================================
    .isDisplayed();
        - This method is checking if given WebElement is displayed on the page or not.
        - This method will return BOOLEAN value when used.
        - It will return 'true' if web element is displayed on the page.
        - It will return 'false' if web element is NOT displayed on the page.
        - It does not accept an argument
    ===================================

  ***   CSS__ Selector (LOCATOR)
      - cssSelector has its own syntax.
      - using cssSelector you will be able to locate any web element with any attribute value.
      - we are not just limited to name, id, class, linkText
      - There are two different types of syntax's for cssSelector.

   *  syntax ==>    tagName[attribute='value']
   *  syntax: this syntax is limited to use with id or class attribute value.

              attribute#value : # stands for id. so we can use this with id value
              attribute.value : . stands for class attribute. We can use this with class value

  EX:   #value --> #uk8
                  .value --> .ff2
              ex:
              for id --> a#uk8
              for class --> a.ff2


   * ==========================================================
   *** #8- xpath (LOCATOR)
           - xpath is one of eight locators of Selenium
           - xpath allows us to create our own custom locator using different attribute values
           - xpath has its own syntax
           - xpath syntax is different than cssSelector syntax
           - There are 2 types of xpath locators


    *   #1- ABSOLUTE XPATH:
           - Starts with single slash "/"
           - Starts looking from the very root element in the HTML page
           - Goes down to desired web element 1 by 1
           - It is usually very long and for this reason it is easy to breakable
           - For this reason, it is not recommended to use

   *  #2- RELATIVE XPATH:
         - Relative xpath starts with double slash "//"
         - "//" --> means you can start from anywhere in the code
         - Because we have the option to start anywhere we want to start from, RELATIVE XPATH is very dependable.
         - You will only have problem with this only if the attribute value you used in the locator is changing.


                      *** COMMONLY USED XPATH SYNTAXES:
    #1 - //tagName[@attribute='value']
    - -> We are saying, go get me the web element with given 'tagName' where 'attribute' has given 'value'
    #2 - //tagName[contains(@attribute, 'value')]
    - -> Looks for the tagName that has matching/containing attribute value
    #3 - //tagName[.='text']
    -  -> This locator will return the web element (tagname) with given 'text'
    #4 - //*[@attribute='value']
    - -> * in xpath means we are NOT looking for a specific tag name. we are looking for attributes and values.






Thread.sleep(3000); --> Which library is this coming from?
 */