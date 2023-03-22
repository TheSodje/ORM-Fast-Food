## Getting Started

ORM-Fast-Food

A simple web application for a small business. This application has the minimun requirements of CRUD actions. The web application is divided into an admin site & client site with pages such as: 
- Main (Home)
- Menu
- About
- Contact
- Orders
- Inventory
 
Hibernate JPA was used to innitialize the database and ORM. We will use Tomcat 10 as our designated server and as for our SDK, we will use Java JDK 17 with Maven as its build tool. If you want to change some settings, this can happen in the pom.xml .

## Set up the application

- Before set up, run a quick check in the terminal "mvn clean install" . This command cleans the Maven project by deleting the target directory.

- Set up the Tomcat configuration settings. In my case I used port :8888 on the localhost, but you are free to set up any open port that u want. On Tomcat configuration include the artifactid (war & war_exploded).

- To start the application, you must first create a empty schema / database or you can run this query in a mysql database or a similar database system:

  "CREATE DATABASE IF NOT EXISTS fastfood1;" .

- Update persistence.xml file with your database configuration credentials.

- In persistence.xml set property value to "create-update" .

- Run application.

- In src/main/database there are sql files available in case you need some quick data.

- If the configurations are set up correctly, Tomcat will serve the application in the browser.

Keep in mind that in order for the API calls to work, you should recheck the given port number. 
