package SoftskillProjects_ClassNOTES;

public class TestingTypes {

    /*

  ***  What is testing ?
    - take measures to check the quality , performance or reliability of product before giving to user.

   **** Definition of software Testing ?
            - Checking software item ; expected result  vs actual result .
            - Expected result : requirement, what client/customer wants
            - Actual result: when you test the item, whatever you get is the actual result

     ****** what is  Backlog  ??
     == Product backlog-  list of user story , bugs, task



    ***   Testing Types *******
         * Manual Testing
         * Automation Testing
         * Dynamic Testing
         * UAT Testing
         * Smoke testing   > every morning 15-20 min . > 6-8 user stories / 60-80 TestCase > to check if application stable or not
                        ->> testing the main features ->> pull fromGithub to update your framework (codes)
                        -login / logout ,
                        - send message + upload a file
                        - task ,
                        - time-report
                        - employee
                        - Results sent thru email.


         * Regression Testing  > Verifies new updates working well and doesnt affect old module and fixed bugs working correctly.
                >> Regression test  > before release or end of each Sprint  > test manually and Automatically > duration  depend on items



          * Explore testing : Ad-Hoc testing (another name)
                  -  do not have any document
                  -  do not have any requirement
                  -  just use the app as an end user to understand it


  ******TESTING  STRUCTURES ****
     * Static Testing      (In first step we are doing when in STLC >   Reqr.gathering and Design steps)
             - Testing documents
             - Review , Walkthough , Inspection .

       Who does Static Testing ?
               - PO, Manager , BA, Client Partners and Designers .
               - If there is test case or test plan required than tester or test lead can involve.


     * Validation Process ( On STLC > coding and Testing steps )
             - Coding  >  Code and Build

         - Testing ; >>>>>>>>
            ->* Dynamic Testing
                        >* Functional Testing  > Any link , click or functionality of app testing
                                 >- Unit Testing     > Developers <
                                             ( check each unit functionality )
                                 >- Integration Testing    > Developers <
                                                ( check several unit functionality in same time )
                                 >- System Testing             > Tester <
                                        * GUI Testing
                                        * Usability Testing
                                        * Smoke Testing
                                        * Regression  Testing

                                 >- User Accepting Testing       > Tester ,Client , User  (UAT) <
                                             >>- Alpha Testing  > UAT team members
                                             >>- Beta Testing  > users
                                                     (database , APi , selenium ... application using for these test )
                                                     -UAT team's testers  - test functionality of the app
                                                      as webserver functions of the app are tested by one tester.

                        >* NON-Functional Testing
                                  - Stress Testing
                                  - Volume Testing
                                  - Security Testing
                                  - performance testing
                                  - Load Testing






     **************Environments :
     1.  Dev environment  -->
      for developers-  https://dev.amazon.com

     2. QA  / test environment  -->
      testers-  https://qa.amazon.comor-  https://tes.amazon.com

     3.  Staging environment / pre-production  -->
     testers-  https://stg.amazon.com       OR
     -  https://pre.amazon.com

      4. production -->
      end user-  https://www.amazon.com

      ==========================================
      Examples
       - https://qa2.vytrack.com    --> qa / or test environment- qa --> quality   assurance

        -  https://www.amazon.com ---> production environment

         -  https://www.OkTA.com -> production
           - https://www.qa.cybertekschool.okta.com --> qa env





           ++++++++++++++++++++++++++++++++++++++++++
           jira--> Testers :
           - can create tickets (story,bug, test case ..)
           - can not delete
           - can not config the jira
           - can see reports
           - can access to all the projects that your company has




         ***  Test Case Categories ;
         - Positive Test Case
         - Negative Test Case
         < not all test case both positive and negative test cases >

           *** Testing Data
           -> valid Test Data   >> real data provide by scrum team or developer
           -> Invalid Test Data  >> Dummy data website generated from google etc..

           *** Design Technique ;
           - BVA -> Boundary Value Analysis   < test range and limits >
           - ECP -> Equivalence Class Partitioning  <tester divide the input Ex, valid data / Invalid data >

     */
}
