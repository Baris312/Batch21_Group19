package Selnium;

public class LOCATORS {

}
/*
What is Selenium?
    - Selenium is basically some jar files(libraries, classes, methods) that allows us to automate browsers.

-> Difference between maven and selenium?
    - Maven is the tool that we use to create the JAVA PROJECT ITSELF.

*/
   //  *** What is maven ?
  //  - "BUILT AUTOMATION TOOL"
/*
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
#2- pom.xml : PROJECT OBJECT MODEL, pom.xml
    - pom.xml file is the MOST important file in a maven project
    - this file allows us to add and manage dependencies into our project
    - we can change and update the dependency versions from this file easily




    ** At the end of our tests, we are looking for comparing two things.
           ACTUAL RESULT VS EXPECTED RESULT


*/

 //  ****  Driver navigate ;
/*
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



 */
 //******* LOCATORS ****
/*



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
  * Id         >>> every class may not have ID or it could be dynamic ad change everytime . Best to use Xpath
  * classname  >>> className can not have space if there is space we can not use it . error will occur "Compound class name not permitted"
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
    -  -> This locator will return the web element (tagName) with given 'text'
    #4 - //*[@attribute='value']    =>         //*[.='textValue']
    - -> * in xpath means we are NOT looking for a specific tag name. we are looking for attributes and values.


* What is difference between relative and absolute Xpath ?
 -       Absolute Xpath                           VS                       Relative Xpath
    1- ABSOLUTE XPATH:
    # 1 - Starts with single slash "/"                                1 - Relative xpath starts with double slash "//"
    2 - Starts from the very root element from  HTML page           2 - "//" --> means you can start from anywhere in the code
    3 - Goes down to desired web element 1 by 1                     3 - start anywhere we want to start from, RELATIVE XPATH is very dependable.
    4 - It is usually very long                                     4 - You will only have problem with this only ->
    and for this reason it is easy to breakable                             if the attribute value you used in the locator is changing.


$x("") -> to check CSS
$("")  -> to check Xpath


Thread.sleep(3000); --> Which library is this coming from?

 */


 //   --> How to go from parent to child using xpath locator?
 /*   - We go from parent to child using "/"



    <div id="hh5" class="lol9" name="uu8" for="pp9">
        <a href="https://google.com"> GOOGLE </a>
    </div>
    //div[@class='lol9'] --> this is pointing to div web element
    //div[@class='lol9']/a --> this is pointing to <a> web element


--> Selecting which child we want to go when we have multiple options:
    - We just use [] and pass index numbers.

    //div[@class='container']/div[1] --> will go to first child
    //div[@class='container']/div[2] --> will go to second child
    //div[@class='container']/div[3] --> will go to third child




--> How to go from child to parent in xpath locator?
    - We use "/.." this goes from child to parent

*/

// What is different between findElement(); VS findElements();    :
/*
   *****************.findElement():                                       VS      ***********.findElements();
 1- Finds and returns SINGLE WebElement                                   1-This method can find and return multiple web elements
 2- Return type is WebElement                                             2 - returning multiple web elements (List of WebElements)
 3- If it cannot find WebElement it throws NoSuchElementException         3 - when it cannot find a web element
                                                                            -> It will not throw exception
                                                                            -> It will return empty List.
 4- Even if the locator we provide returns multiple web elements
 , it will return us the first web element located
*/

/*

 */

//HOW TO HANDLE CHECKBOXES AND RADIOBUTTON USING SELENIUM?
/*

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

 */


//- StaleElementReferenceException :
/*

        - This happens in 2 common scenarios:
        #1- When a previously located web element is deleted from the page
        #2- When navigation happened on a page: refresh(), forward(), back()
        - To solve this, we need to re-locate (refresh) the web element's reference



 */