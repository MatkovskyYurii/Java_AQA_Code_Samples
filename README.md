# This repository showcases my experience in automation testing.
It contains sample tests and code snippets that demonstrate my proficiency in using various automation tools and frameworks.
To explore each of these approaches, this project contains multiple branches, each with an appropriate name indicating the approach being used. 

#### [1. Cucumber with JUnit 5](https://github.com/MatkovskyYurii/Java_AQA_Code_Samples/tree/Cucumber)
#### [2. TestNG with the Page Factory pattern.](https://github.com/MatkovskyYurii/Java_AQA_Code_Samples/tree/PageFactoryTestNG)
#### [3. JUnit with the Page Object pattern.](https://github.com/MatkovskyYurii/Java_AQA_Code_Samples/tree/PageObjectJUnit)
#### [4. Rest-Assured for API testing.](https://github.com/MatkovskyYurii/Java_AQA_Code_Samples/tree/Rest-Assured)

You can navigate to the relevant branch to view the code and tests or click on links above

<img width="641" alt="Screenshot at Apr 20 13-27-31" src="https://user-images.githubusercontent.com/85128259/233342074-d5bb5a39-7322-4a92-bc0b-28de045ff066.png">

### To implement a modular and maintainable framework, I utilized concepts such as abstraction and inheritance. 
<img width="1474" alt="Screenshot at Apr 20 14-06-53" src="https://user-images.githubusercontent.com/85128259/233348191-a452083f-95db-442c-8c94-72e3976079bc.png">
I also organized the code into separate pages and frames, which were then described in a hierarchical manner to facilitate better understanding and organization.

### To create browser instances, I utilized both WebDriverCash and WebDriverFactory.
<img width="1284" alt="Screenshot at Apr 20 14-13-12" src="https://user-images.githubusercontent.com/85128259/233349859-77d947e8-3f8d-4ac7-b9d6-69b90144abed.png">
<img width="1173" alt="Screenshot at Apr 20 14-14-04" src="https://user-images.githubusercontent.com/85128259/233350192-2f6def74-d295-4f18-aa04-db35503b2511.png">

### I also developed a 'utils' package that includes functionality to close pop-ups that appear, as well as a set of custom wait methods.
<img width="446" alt="Screenshot 2023-04-20 at 14 20 45" src="https://user-images.githubusercontent.com/85128259/233351231-dd7642b2-4cbf-4430-804b-c179381af880.png">

## Depending on the testing framework used, different approaches were employed to manage the test runs. 

For example, for TestNG, annotations such as @BeforeClass, @AfterClass, and @Methods were utilized. Additionally, an [XML](https://github.com/MatkovskyYurii/Java_AQA_Code_Samples/blob/PageFactoryTestNG/src/test/resources/ActionMenuTests.xml) file was developed to manage and configure the test runs.
On the other hand, for Cucumber testing, Gherkin was used to define the test scenarios on [Feature file](https://github.com/MatkovskyYurii/Java_AQA_Code_Samples/blob/Cucumber/src/test/resources/Features/login.feature), and [Step Definitions](https://github.com/MatkovskyYurii/Java_AQA_Code_Samples/blob/Cucumber/src/test/java/stepdefinitions/LoginStepDefs.java) were implemented to execute the scenarios. Cucumber also generates HTML reports to display the results of the test runs.

## Test wich was developed
### [Cucumber:](https://github.com/MatkovskyYurii/Java_AQA_Code_Samples/tree/Cucumber/src/test)

- Two tests were designed to validate login functionality using different data providers. 
  - Test 1: Login with String input
  - Test 2: Login with Examples from a list

### [TestNG/](https://github.com/MatkovskyYurii/Java_AQA_Code_Samples/tree/PageFactoryTestNG/src/test/java/org)[JUnit:](https://github.com/MatkovskyYurii/Java_AQA_Code_Samples/tree/PageObjectJUnit/src/test/java/myapp)
- **Action Menu Test:** This test validates the action menu functionality of the application by performing the following tasks:
  - Opens the search field.
  - Shows the account submenu.
  - Opens the MyCard page.
  
- **Navigation Menu Tests:** This test verifies the navigation menu functionality of the application by performing the following tasks:
  - Verifies that the submenu is displayed by taking a String array of IDs and checking all buttons.
  - Navigates to the Sunglasses page.
  - Navigates to the Eyeglasses page.
  - Verifies the submenu navigation functionality.

- **Product PageTests:** This test validates the product page functionality of the application by performing the following tasks:
  - Verifies the sort functionality of the page by sorting the prices from lowest to highest.


## [API Framework]()
### Structure 
  - Created a basic URL configuration. 
  - Tests were organized into classes based on endpoints such as user, register, and login. 
  - The Rest-Assured (Given-When-Then) framework was used to structure each test scenario with clear statements of the test conditions, actions, and expected results. 
  - Data Transfer Objects (DTOs) were used to represent the request and response payloads for API calls, making the tests more organized and easier to maintain. 
  - In addition, **Lombok** was used to simplify the creation of DTOs by reducing the amount of boilerplate code needed for getters, setters, and constructors.
  
  <img width="1495" alt="Screenshot 2023-04-24 at 12 48 11" src="https://user-images.githubusercontent.com/85128259/233962374-2725f16d-5ce7-4485-b5bb-e10c07fc7752.png">

<img width="1495" alt="Screenshot 2023-04-24 at 12 47 49" src="https://user-images.githubusercontent.com/85128259/233962087-ee24b9eb-a6b4-4e72-9016-963ae4e7e6e2.png">

<img width="1477" alt="Screenshot 2023-04-24 at 12 24 48" src="https://user-images.githubusercontent.com/85128259/233956102-820eb7e4-6f5d-4edb-b264-2a61f68c827f.png">

### [Test User Request](https://github.com/MatkovskyYurii/Java_AQA_Code_Samples/blob/Rest-Assured/src/test/java/app/TestUserRequest.java) 
- **GET user data**
   - Validate response 200
   - Validate response with prepared test data

- **GET List of users**
  - Validate response 200
  - User list is not null
  - User list is not empty
  - Support field is not null
  - Support URL is not null or empty
  - Support text is null or empty

- **POST create user**
  - Validate response 201
  - Create user with test data and verify response data matches request data
### Thank You!
