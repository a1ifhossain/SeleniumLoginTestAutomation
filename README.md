# 🚀 Selenium Login Test Automation

This is a basic Selenium automation project created using **Java**, **TestNG**, **Maven**, and **WebDriverManager**. It tests the login functionality of a sample website with both **valid** and **invalid** credentials.

---

## 📝 Project Description

The goal of this project is to demonstrate **UI test automation** using Selenium WebDriver.
This project performs:

* ✅ **Valid login test** — checks successful login with correct username and password
* ❌ **Invalid login test** — checks proper error message with wrong credentials

It automatically launches the Chrome browser, interacts with the page elements, verifies results, and closes the browser.

---

## 🔧 Technologies Used

| Tool               | Purpose                              |
| ------------------ | ------------------------------------ |
| Java               | Programming language                 |
| Selenium WebDriver | Browser automation                   |
| TestNG             | Test framework                       |
| Maven              | Dependency management and build tool |
| WebDriverManager   | Automatic browser driver setup       |

---

## 🌐 Test Website

Used [Practice Test Automation Site](https://practicetestautomation.com/practice-test-login/) for login form automation.

---

## 📁 Project Structure

```
SeleniumLoginTestAutomation/
├── pom.xml
└── src/
    └── test/
        └── java/
            └── tests/
                └── LoginTest.java
```

---

## 🧪 Test Scenarios

### ✅ Test Case 1: Valid Login

* Username: `student`
* Password: `Password123`
* Expected Result: Login successful message should appear

### ❌ Test Case 2: Invalid Login

* Username: `wrongUser`
* Password: `wrongPass`
* Expected Result: Error message should appear

---

## 👤 Author

Md Alif Hossain Parvez  
SQA Engineer  
Email: alifhossain5321@gmail.com  
LinkedIn: https://www.linkedin.com/in/md-alif-hossain-parvez-03727b340/


