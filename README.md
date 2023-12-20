# LambdaEcommerceProject

## Table of Contents
- [Overview](#overview)
- [Testing Strategy](#testing-strategy)
- [Abstract Test Cases](#abstract-test-cases)
- [Report](#report)

## Overview
This repository houses the automated tests for the E-commerce Playground platform. The contents include documentation, such as the Test Strategy, a list of Test Cases in the Automation Backlog, and the Test Report file. The IntelliJ project contains automated tests covering various functionalities of the platform.

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

### Login Tests:

- **Test Case 6:** Verify that a registered user can successfully log in with valid credentials.
    - (Priority: Highest - 1)
- **Test Case 7:** Verify that a user cannot log in with invalid credentials.
    - (Priority: High - 2)
- **Test Case 8:** Validate the display of appropriate error messages for invalid login attempts.
    - (Priority: High - 2)
- **Test Case 9:** Login with empty fields.
   - (Priority: High - 2)


### Forgotten Password:

- **Test Case 10:** Check for the availability of a "Forgot Password" functionality.
     - (Priority: High - 2)
- **Test Case 11:** Verify that the reset password link sent to the user's email is functional.
   - (Priority: High - 2)
- **Test Case 12:** Try to login with changed password.
     - (Priority: High - 2)

### Search Tests:

- **Test Case 13:** Verify that the search functionality returns relevant results for a search query.
    - (Priority: High - 2)
- **Test Case 14:** Validate that relevant results are displayed when a valid search term is entered.
    - (Priority: High - 2)
- **Test Case 15:** Test Case 3: Check that no results are shown for an invalid search term.
    - (Priority: Medium - 3)
- **Test Case 16:** Verify that advanced search options (categories) work as expected.
    - (Priority: High - 2)

### Product Tests:

- **Test Case 17:** Verify that products can be sorted by size.
    - (Priority: Medium - 3)
- **Test Case 18:** Verify that products can be sorted by color.
    - (Priority: Medium - 3)
- **Test Case 19:** Add multiple products to the comparison list.
    - (Priority: High - 2)
- **Test Case 20:** Verify the functionality to sort products by name in ascending order (A-Z).
    - (Priority: High - 2)
- **Test Case 21:** Verify the functionality to sort products by price in ascending order (Low to High).
    - (Priority: High - 2)
- **Test Case 22:** Verify that the comparison screen displays the selected products.
    - (Priority: High - 2)
- **Test Case 23:** Remove products from the comparison list.
    - (Priority: High - 2)
- **Test Case 24:** Verify functionality of the "Buy Now" button.
    - (Priority: Highest - 2)
- **Test Case 25:** Verify functionality of the "Size Chart" button.
    - (Priority: High - 2)
- **Test Case 26:** Verify functionality of the "Ask a Question" button.
    - (Priority: Medium - 3)
- **Test Case 27:** Verify functionality of the "Write a Review" button.
   - (Priority: Medium - 3)

### Shopping Cart Tests:

- **Test Case 28:** Add items to the shopping cart from product pages.
    - (Priority: Highest - 1)
- **Test Case 29:** Verify that a user can change the quantity of a product in the shopping cart.
    - (Priority: High - 2)
- **Test Case 30:** Verify that the shopping cart displays the correct quantity and total price.
   - (Priority: Highest - 1)
- **Test Case 31:** Verify that a user can remove a product from the shopping cart.
    - (Priority: High - 2)
- **Test Case 32:** Ensure that the shopping cart is emptied after the checkout process.
   - (Priority: Highest - 1)
- **Test Case 33:** Verify that a flat shipping rate is recalculated based on the size of the items in the shopping cart.
   - (Priority: Highest - 1)
- **Test Case 34:** Verify the maximum number of items allowed in the shopping cart.
   - (Priority: Highest - 1)


### Wishlist Tests:

- **Test Case 35:** Verify that a user can add a product to their wishlist.
   - (Priority: Medium - 3)
- **Test Case 36:** Verify that a user can remove a product from their wishlist.
    - (Priority: Medium - 3)

### Compare Product Tests:

- **Test Case 37:** Verify that a user can add products to the comparison list.
    - (Priority: Medium - 3)
- **Test Case 38:** Verify that a user can remove products from the comparison list.
    - (Priority: Medium - 3)

### Checkout Tests:

- **Test Case 39:** Verify that a guest user can successfully complete the checkout process.
    - (Priority: High - 2)
- **Test Case 40:** Verify that a logged-in user can successfully complete the checkout process.
    - (Priority: Highest - 1)
- **Test Case 41:** Confirm that users can enter and save shipping information.
    - (Priority: Highest - 1)
- **Test Case 42:** Validate the accuracy of the order summary before payment.
    - (Priority: High - 2)
- **Test Case 43:** Complete guest checkout by registering an account during the checkout process.
     - (Priority: Medium - 3)
- **Test Case 44:** Successfully log in during the checkout process and complete the purchase.
     - (Priority: Medium - 3)
  - **Test Case 45:** Validate the accuracy of the "Your Personal Details" form during account creation.
     - (Priority: Highest - 1)
- **Test Case 46:** Successfully add comments about the order during the checkout process.
     - (Priority: Low - 4)
- **Test Case 47:** Validate that clicking the "Edit" button navigates to the previous page or step.
  - (Priority: Highest - 1)
- **Test Case 48:** Verify the display of a success message after confirming the order.
  - (Priority: High - 2)

### Quick View Tests:

- **Test Case 49:** Verify that the Quick View can be closed without issues.
    - (Priority: High - 2)
- **Test Case 50:** Check that the Quick View displays essential product information.
     - (Priority: High - 2)
- **Test Case 51:** Navigate to the Quick View from the product page.
   - (Priority: High - 2)
- **Test Case 52:** Verify that a user can change the quantity of a product from the Quick View.
   -  (Priority: High - 2)
- **Test Case 53:** Verify that a user can change the size of a product from the Quick View.
   -  (Priority: High - 2)
- **Test Case 54:** Verify that a user can change the color of a product from the Quick View.
   -  (Priority: High - 2)
- **Test Case 55:** Verify that a user can add a product to the cart from the Quick View.
   - (Priority: High - 2)
- **Test Case 56:** Ensure that the correct item with customized attributes is added to the cart.
   - (Priority: High - 2)
- **Test Case 57:** Validate that the cart reflects the correct quantity and total price.
   - (Priority: High - 2)
