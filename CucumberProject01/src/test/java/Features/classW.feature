Feature: Class work

Background:
Given user land on NetBanking page

@SmokeTest @RegressionTest
Scenario: FirstLogin

And user login into application
Then Homepage is displayed
And Cards are displayed

@FunctionalTest
Scenario: SecondLogin

And user login into application with "admin" and "password123"
Then Homepage is displayed
And Cards are displayed

@ExploratoryTest @SmokeTest
Scenario: ThirdLogin

And user login into application with "user" and "password456"
Then Homepage is displayed
And Cards are displayed

@SanityTest
Scenario: FourthLogin

And user login into application with "user" and 12345678
Then Homepage is displayed
And Cards are displayed

@RegressionTest
Scenario Outline: MultipleLogin

And user login into application with "<username>" and <password>
Then Homepage is displayed
And Cards are displayed

Examples:
|	username	|	password	|
|	bayo			|	code12345	|
|	dayo			|	pass@234	|
|	esther		|	secret567	|
|	treasure	|	09876543	|
|	mercy			|	Joshua1:8	|

@SmokeTest
Scenario: FirstRegistration

And user signup into application
|	bayo	|
|	dauda	|
|	bayonle@gmail.com	|
|	bayonle@gmail.com	|
|	passCode123	|
|	passCode123	|
|	Male	|
|	0783123456789	|
Then Homepage is displayed
And Cards are displayed
