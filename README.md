# DataguardAssignment

# DataGuard TODO List Challenge

This repository contains a minimal TODO List App.

Follow this README to create your solution, and use small, regular git
commits to document your progress.

Once complete, create a git bundle of this repository and send it back
to us. Please make sure that this repository is not publicly accessible.

## Requirements

- [nodejs version 10](https://nodejs.org/), although other versions may
  work too.
- Optional: [docker](https://docs.docker.com/) and [docker-compose](https://docs.docker.com/compose/)

## Run using Docker

```sh
docker-compose up --build -d
```

Open http://localhost:8080 in your browser

## Alternative: Run Natively

### Install

```sh
npm install
```

### Run

```sh
node app.js
```

Open http://localhost:8080 in your browser

## High-Level Specification

Users should be able to:

1. View the list of TODOs
2. Add items
3. Remove items
4. Modify items

### Tasks

1. Create E2E tests to verify that the app works according to the
   high-level specification.
2. Update this README with instructions on how to run the tests.

### Bonus

1. After running tests: Display test coverage
2. Create a failing E2E test for the XSS vulnerability of this app
3. Find other vulnerabilities in this app and create failing tests for
   them.

### Summarise your solution here

#Technologies used:

Selenium
Maven
TestNG  
Java 8


**Browsers : **

    Chrome (Default) or firefox 

#Chromedriver and Geckodriver are available under the project path

To change the browser, update the browser name in testng.xml file

#To run the test,

Open terminal and hit the below command

    mvn clean test

#Reports

After the test run, testNG report will be available under below folder,

    target -> surefire-reports -> index.html

get the absolute path of index.html and enter the url in any desired browser to view the report
