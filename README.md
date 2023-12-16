# LambdaEcommerceProject

## Table of Contents
- [Overview](#overview)
- [Testing Strategy](#testing-strategy)
- [Abstract Test Cases](#abstract-test-cases)

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

## Abstract Test Cases

