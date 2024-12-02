Feature: Login AMX
#  @fuct @all
#  Scenario: Verify Logo and login Page
#    Given user launch Browser
#    When AMX homepage displayed
#    Then Logo Present on HomePage
#    When user enters username
#    And user enters password
#    Then user click on Login

  @all @amin
  Scenario:Verify Admin Version
    Given user launch Browser
    When user Login to application
    When user click on About link
    Then user verify Admin version

#  @admin @all
#  Scenario:Verify Enviroment Creation
#    Given user launch Browser
#    When user Login to application
#    Then user click on infrastructure
#    Then user click on Enviroment
#    Then user click on New Env
#    Then user enter Env name

#  @admin @all
#  Scenario:Verify Host Creation
#    Given user launch Browser
#    When user Login to application
#    Then user click on infrastructure
#    Then user click on Host
#    And user click on New
#    And user enter host name
#    And user enter Management URL
#    Then user save host
#    And user install Host
#    And user Start Host

#    @fuct @all
#  Scenario:Verify Sub Variables
#    Given user launch Browser
#    When user Login to application
#    Then user click on shared objects
#    And user click on Substitution variables
#    Then user click on Add
#    And user enter name
#    And user enter data type
#    And user enter value
#    Then user save data

#  @admin @all
#  Scenario:Verify Health Check
#    Given user launch Browser
#    When user Login to application
#    Then user click on infrastructure
#    Then user click on Health check
#    Then user click on Deployment HealthCheck



