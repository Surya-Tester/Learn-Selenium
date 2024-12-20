# Selenium Learning Project

## Project Overview
This repository contains the progress of my learning journey with **Selenium WebDriver**. Each day, I work on a specific topic and create examples to understand how to use Selenium for automation testing. The code is organized into different packages for each day's practice.

## Concepts Covered

### **Day 1: Selenium WebDriver Setup and Locators**
- **Objective:** Set up the Selenium WebDriver and practice the basics like:
  - Connecting to ChromeDriver
  - Getting the page title and verifying it using an `if-else` condition
  - Learning different locators like ID, ClassName, Name, XPath
  - Using WebDriverWait
  - Sending keys to text fields

### **Day 2: Configuration using Properties File**
- **Objective:** Use configuration properties for managing URL and other input data dynamically. The properties file (`Or.properties`) stores the URL and locators, and the data is read and used in the automation code.

```java
File f1 = new File("D:\\selenium_cloudswan\\learn selenium\\Or.properties");
FileInputStream fis = new FileInputStream(f1);
Properties prop = new Properties();
prop.load(fis);
driver = new ChromeDriver();
driver.get(prop.getProperty("url1"));
```

### **Day 3: Automating a Web Application and File Upload**
**Objective:** Automate form filling, file upload, and interaction with different form elements using Selenium. The script uses various elements such as:
Text inputs (sendKeys)
- Radio buttons, checkboxes, dropdowns (using Select)
- File upload using sendKeys to input the file path

```java
WebElement nm = driver.findElement(By.xpath(prop.getProperty("name")));
nm.sendKeys("surya");
java```
WebElement fileInput = driver.findElement(By.xpath(prop.getProperty("file")));
fileInput.sendKeys("C:\\Users\\Documents\\New folder");
```

### **Day 4: Handling Alerts, Drag and Drop, and Selectable Items**
**Objective:** Learn about handling pop-up alerts, drag-and-drop actions, and multiple item selection using Selenium:
**Alert Handling:** Handling simple alerts and accepting them
**Drag and Drop:** Using the Actions class to drag and drop elements
**Selectable Items:** Using Actions to select multiple items using the CONTROL key

**Key Code for Drag and Drop:**
java```
Actions action = new Actions(driver);
action.clickAndHold(fromElement);
action.moveToElement(toElement);
action.release();
action.build().perform();
```

**Key Code for Alert Handling:**
java```
Alert alert = driver.switchTo().alert();
alert.accept();

### **Day 5: Using XML for Test Case Execution**
**Objective:** Learn how to execute multiple test cases using TestNG and XML files. The XML file is used to define the test suite and run the automation scripts:

**TestNG XML File:**
<?xml version="1.0" encoding="UTF-8"?>
<suite parallel="false" name="Suite">
  <test name="Test">
    <classes>
      <class name="day5.learnTest_bm_af"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->


**Key Features and Practices**
**WebDriverWait:** Used to wait for elements to become visible or clickable before interacting with them.
**Properties File:** Configuration is handled via properties files to make the automation code more flexible and reusable.
**Alert Handling:** Handles JavaScript alerts and confirms with the Alert interface.
**Drag and Drop:** Implements user-like interactions using the Actions class for drag-and-drop actions.
**TestNG Integration:** Sets up a simple TestNG suite for running test cases through XML files.

**Future Work**
**Continue automating more complex scenarios and applications.**
**Integrate with reporting frameworks like ExtentReports.**
**Explore advanced concepts such as Cross-browser Testing, Grid Setup, and Headless Testing.**




