#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Swiggy Project Phase2
  I want to use this template for my project to get certificate

  @tag1
  Scenario: Order Biryani on Swiggy
	Given I am on the Swiggy website
	When I search for "Biryani"
	And I select the "Hyderabadi Biryani" option
	And I add it to my cart
	And I proceed to checkout
	When I enter my delivery address and payment details
	Then I should see the order confirmation page
	And my order for "Hyderabadi Biryani" should be placed successfully


  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
