# LambdaEcommerceProject

## Table of Contents
- [Overview](#overview)
- [Testing Strategy](#testing-strategy)
- [Abstract Test Cases](#abstract-test-cases)
- [Surefire Report](#surefire-report)

## Overview
This repository houses the automated tests for the E-commerce Playground platform. The contents include documentation, such as the Test Strategy, a list of Test Cases in the Abstract Test Cases, and the Surefire Report file. The IntelliJ project contains automated tests covering various functionalities of the platform.

## Testing Strategy

### Scope
The scope of the automation includes testing critical functionalities widely used by users on the E-commerce Playground platform. Key areas to be covered are:

- **Registration:**
  - Validate the registration process.
  
- **Login:**
  - Validate the login functionality.
  
- **Search for Item:**
  - Implement tests for searching items.
  
- **Add Item to Cart:**
  - Test the process of adding items to the cart.
  
- **Checkout:**
  - Validate the checkout process.
  
- **Quick View:**
  - Change the quantity, size, and color from a Quick View.
  - Add the item to the cart from Quick View.

The tests will be conducted both independently and in groups to ensure thorough coverage. This scope statement outlines the primary functionalities to be automated, focusing on essential user interactions within the E-commerce Playground platform.

### Entry Criteria
- The E-commerce Playground platform is up and running.

### Exit Criteria
- All test cases prioritized as "Highest" have been successfully automated.
- The Surefire Report reporting mechanism provides comprehensive test results.
- The estimated time of completion (7 days).

### Levels of Testing
- **System Testing:**
  Testing of the entire system as a whole. It verifies that the integrated components work as expected and meet the specified requirements.

- **User Acceptance Testing (UAT):**
  Verify that the system aligns with user expectations and performs as intended in a real-world environment.

### Types of Testing
- Functional

### Test Design Techniques
- **Boundary Value Analysis (BVA)**
- **Equivalence Partitioning:**
- **Decision Table Testing:**
- **Use Case Testing:**
- **Exploratory Testing:**
- **Error Guessing:**

### Tools
- **Development Environment:**
  - IntelliJ IDEA integrated development environment for coding and scripting.

- **Version Control System:**
  - Git and GitHub for source code management and collaboration.

- **Automation Testing Tool:**
  - Selenium WebDriver for automated testing of web-based applications with JUnit 5 dependencies.

### Test Environment
- **Operating System:**
  - Windows 10 Pro: 64-bit operating system version 22H2.

- **Browsers:**
  - Google Chrome: Version 117.0.5938.92 (Official Build) (64-bit).
  - Mozilla Firefox: Version 117.0.1 (64-bit).
  - Microsoft Edge Version 117.0.2045.60 (Official build) (64-bit).

### Risks
- The testing team may not have a clear understanding of the business.
- Expanding the scope of automation beyond the defined boundaries may lead to delays and incomplete testing.

 ### Priority Levels
1. **Highest (1):**
   - A condition whereby a critical issue severely impairs the core functionality of the system, rendering it inoperable or significantly impacting multiple end users. No viable workaround is available, and immediate attention is required to restore normal system operation.

2. **High (2):**
   - A condition whereby a major issue disrupts system functionality or performance, affecting multiple end users. While a workaround exists, addressing the issue promptly is essential to minimize disruption and ensure a satisfactory user experience.

3. **Medium (3):**
   - A condition where system malfunctions or non-critical issues occur, causing some inconvenience to end users. Workaround options are available, and the problem does not significantly hinder day-to-day operations.

4. **Low (4):**
   - A condition involving non-critical system errors, minor documentation issues, or low-impact product inquiries. End-user functionality remains largely unaffected, and the problem may not be urgent.




## Abstract Test Cases

- **Remark:**
    - All automated tests are tagged with annotation `@Tag("TestCase-<test_number>")`.


### User Register:

- **Test Case 1:** Verify that users can register for a new account successfully.
    - (Priority: Highest - 1)
- **Test Case 2:** Verify that a user cannot register with an email address that is already registered.
    - (Priority: High - 2)
- **Test Case 3:** Verify that a user cannot register withouth clicking on agree privacy policy button.
    - (Priority: High - 2)
- **Test Case 4:** Verify that a user cannot register with a weak password.
    - (Priority: High - 2)
- **Test Case 5:** Verify that a error messages for fields.
    - (Priority: High - 2)    
- **Test Case 6:** Verify that user registration fails when the user does not click on the agree privacy policy button.
    - (Priority: Highest - 1)

### Login Tests:

- **Test Case 7:** Verify that a registered user can successfully log in with valid credentials.
    - (Priority: Highest - 1)
- **Test Case 8:** Verify that a user cannot log in with invalid credentials.
    - (Priority: High - 2)
- **Test Case 9:** Validate the display of appropriate error messages for invalid login attempts.
    - (Priority: High - 2)
- **Test Case 10:** Login with empty fields.
   - (Priority: High - 2)
- **Test Case 11:** Verify that a user cannot log in with an invalid username and a valid password.
    - (Priority: Highest - 1)
- **Test Case 12:** Verify that a user cannot log in with an invalid username and an invalid password.
    - (Priority: Highest - 1)

### Account Management:
- **Test Case 13:** Modify personal information (first name, last name, email, telephone).
    - (Priority: High - 2)
- **Test Case 14:** Edit an address in the address book with new valid information.
    - (Priority: Medium - 3)
- **Test Case 15:**  Delete an address from the address book and verify success message.
    - (Priority: Medium - 3)
- **Test Case 16:**  Purchase a gift certificate with valid information
    - (Priority: High - 2)

### Forgotten Password:

- **Test Case 17:** Check for the availability of a "Forgot Password" functionality.
     - (Priority: High - 2)
- **Test Case 18:** Verify that the reset password link sent to the user's email is functional.
   - (Priority: High - 2)
- **Test Case 19:** Try to login with changed password.
     - (Priority: High - 2)
- **Test Case 20:** Click on Forgotten Password, fill in a valid email address, and click Continue.
    - (Priority: Medium - 3)
- **Test Case 21:** Click on Forgotten Password, leave the email address field empty, and click Continue.
    - (Priority: Medium - 3)
- **Test Case 22:**  Click on Forgotten Password, fill in an invalid email address, and click Continue.
    - (Priority: Medium - 3)

### Search Tests:

- **Test Case 23:** Verify that the search functionality returns relevant results for a search query.
    - (Priority: High - 2)
- **Test Case 24:** Validate that relevant results are displayed when a valid search term is entered.
    - (Priority: High - 2)
- **Test Case 25:** Check that no results are shown for an invalid search term.
    - (Priority: Medium - 3)
- **Test Case 26:** Verify that advanced search options (categories) work as expected.
    - (Priority: High - 2)
- **Test Case 27:** Click Search button with an empty search bar.
    - (Priority: High - 2)
- **Test Case 28:** Click Search button with a single-term item.
    - (Priority: High - 2)
- **Test Case 29:** Click Search button with multiple-term item. 
    - (Priority: High - 2)
- **Test Case 30:** Click Search button with a search term containing special characters.
    - (Priority: Low - 4)
- **Test Case 31:** Select Manufacturer from presented suggestions.
    - (Priority: High - 2)
- **Test Case 32:** Select Availability from presented suggestions.
    - (Priority: High - 2)
- **Test Case 33:** Select Discount from presented suggestions.
    - (Priority: High - 2)
- **Test Case 34:** Select Rating from presented suggestions.
    - (Priority: High - 2)

### Product Tests:

- **Test Case 35:** Verify that products can be sorted by size.
    - (Priority: Medium - 3)
- **Test Case 36:** Verify that products can be sorted by color.
    - (Priority: Medium - 3)
- **Test Case 37:** Add multiple products to the comparison list.
    - (Priority: High - 2)
- **Test Case 38:** Verify the functionality to sort products by name in ascending order (A-Z).
    - (Priority: High - 2)
- **Test Case 39:** Select Sort by: Name (Z-A).
   - (Priority: Medium - 3)
- **Test Case 40:** Verify the functionality to sort products by price in ascending order (Low to High).
   - (Priority: High - 2)
- **Test Case 41:** Select Sort by: Price (High>Low).
   - (Priority: Medium - 3)
- **Test Case 42:** Select Sort by: Rating (Highest).
   - (Priority: High - 2)
- **Test Case 43:** Select Sort by: Rating (Lowest).
   - (Priority: High - 2)
- **Test Case 44:** Select Sort by: Best Seller.
   - (Priority: High - 2)
- **Test Case 45:** Select Sort by: Popular.
   - (Priority: Medium - 3)
- **Test Case 46:** Select Sort by: Newest.
   - (Priority: Medium - 3)
- **Test Case 47:** Verify that the comparison screen displays the selected products.
    - (Priority: High - 2)
- **Test Case 48:** Remove products from the comparison list.
    - (Priority: High - 2)
- **Test Case 49:** Verify functionality of the "Buy Now" button.
    - (Priority: Highest - 2)
- **Test Case 50:** Verify functionality of the "Size Chart" button.
    - (Priority: High - 2)
- **Test Case 51:** Verify functionality of the "Ask a Question" button.
    - (Priority: Medium - 3)
- **Test Case 52:** Verify functionality of the "Write a Review" button.
   - (Priority: Medium - 3)

### Shopping Cart Tests:

- **Test Case 53:** Add items to the shopping cart from product pages.
    - (Priority: Highest - 1)
- **Test Case 54:** Verify that the quantity refresh button updates the quantities correctly.
    - (Priority: Highest)
- **Test Case 55:** Verify that a user can change the quantity of a product in the shopping cart.
    - (Priority: High - 2)
- **Test Case 56:** Verify that the shopping cart displays the correct quantity and total price.
   - (Priority: Highest - 1)
- **Test Case 57:** Verify that the shopping cart displays the correct maximum number of items allowed.
   - (Priority: Medium)
- **Test Case 58:** Verify that a user can remove a product from the shopping cart.
    - (Priority: Highest)
- **Test Case 59:** Ensure that the shopping cart is emptied after the checkout process.
   - (Priority: Highest - 1)
- **Test Case 60:** Verify that a flat shipping rate is recalculated based on the size of the items in the shopping cart.
   - (Priority: Highest - 1)
- **Test Case 61:** Verify the maximum number of items allowed in the shopping cart.
   - (Priority: Highest - 1)
- **Test Case 62:** Apply a valid gift certificate code and verify the changes in the total price.
   - (Priority: Medium)
- **Test Case 63:** Apply an invalid gift certificate code and verify the error message.
   - (Priority: Medium)

### Wishlist Tests:
- **Test Case 64:** Add item to wishlist from the product page using the "Add to Wishlist" button. 
   - (Priority: Medium - 3)
- **Test Case 65:** Add item to wishlist from the search product page. 
   - (Priority: Medium - 3)
- **Test Case 66:** Remove item from wishlist using the "Add to Cart" icon on the Action field.
   - (Priority: Medium - 3)
- **Test Case 67:** Remove item from wishlist using the "Remove" icon on the Action field. 
    - (Priority: Medium - 3)

### Compare Product Tests:

- **Test Case 68:** Verify that a user can add products to the comparison list.
    - (Priority: Medium - 3)
- **Test Case 69:** Verify that a user can remove products from the comparison list.
    - (Priority: Medium - 3)

### Checkout Tests:

- **Test Case 70:** Verify that a guest user can successfully complete the checkout process.
    - (Priority: High - 2)
- **Test Case 71:** Verify that a logged-in user can successfully complete the checkout process.
    - (Priority: Highest - 1)
- **Test Case 72:** Confirm that users can enter and save shipping information.
    - (Priority: Highest - 1)
- **Test Case 73:** Validate the accuracy of the order summary before payment.
    - (Priority: High - 2)
- **Test Case 74:** Register a new account through the checkout page and complete the checkout process.
    - (Priority: High)
- **Test Case 75:** Complete guest checkout by registering an account during the checkout process.
    - (Priority: Medium - 3)
- **Test Case 76:** Successfully log in during the checkout process and complete the purchase.
     - (Priority: Medium - 3)
- **Test Case 77:** Validate that the images, product names, quantities, unit prices, and totals are displayed correctly on the checkout page.        - (Priority: Highest)
- **Test Case 78:** Confirm that VAT tax is calculated correctly for EU countries during checkout.
    - (Priority: Highest)
- **Test Case 79:**  Attempt to add an invalid comment with an empty field during checkout.
     - (Priority: Low)
 - **Test Case 80:** Try to check out without agreeing to the terms and privacy policy.
    - (Priority: Highest)
- **Test Case 81:** Validate the accuracy of the "Your Personal Details" form during account creation.
     - (Priority: Highest - 1)
- **Test Case 82:** Successfully add comments about the order during the checkout process.
     - (Priority: Medium - 3)
- **Test Case 83:** Attempt to add an invalid comment with more than the maximum allowed characters during checkout.
     - (Priority: Low)
- **Test Case 84:** Attempt to add an invalid comment with an empty field during checkout.
     - (Priority: Low)
- **Test Case 85:** Validate that clicking the "Edit" button navigates to the previous page or step.
     - (Priority: Highest - 1)
- **Test Case 86:** Ensure that the "Continue Shopping" button functions as expected.
     - (Priority: Medium)
- **Test Case 87:** Verify the display of a success message after confirming the order.
     - (Priority: High - 2)

### Quick View Tests:

- **Test Case 88:** Verify that the Quick View can be closed without issues.
    - (Priority: High - 2)
- **Test Case 89:** Check that the Quick View displays essential product information.
     - (Priority: High - 2)
- **Test Case 90:** Navigate to the Quick View from the product page.
   - (Priority: High - 2)
- **Test Case 91:** Verify that a user can change the quantity of a product from the Quick View.
   -  (Priority: High - 2)
- **Test Case 92:** Verify that a user can change the size of a product from the Quick View.
   -  (Priority: High - 2)
- **Test Case 93:** Verify that a user can change the color of a product from the Quick View.
   -  (Priority: High - 2)
- **Test Case 94:** Verify that a user can add a product to the cart from the Quick View.
   - (Priority: High - 2)
- **Test Case 95:** Ensure that the correct item with customized attributes is added to the cart.
   - (Priority: High - 2)
- **Test Case 96:** Validate that the cart reflects the correct quantity and total price.
   - (Priority: High - 2)
 
### Summary:  
- **Highest Priority Test Cases: 19 test cases** 
- **High Priority Test Cases: 38 test cases** 
- **Medium Priority Test Cases: 36 test cases** 
- **Low Priority Test Cases: 5 test cases**

- **Total Cases:** 
  - Total Test Cases: 98
 
- **Automated cases: 13** 
- **Pending automation: 85** 

- **Estimated Timeline:**
   - Estimated remaining time for completion of all tasks: 15 days
 
## Surefire Report
- **Double-Click to Run Tests:** 
  - Execute the tests by double-clicking on the surefireReport.bat file.
- **Generating HTML Report:**
  - The test report will be generated in the LambdaEcommerceProject\LambdaEcommerceProject\target\sitesurefire-report.html file.
