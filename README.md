# Azure Webinar example

This is a simple full stack Azure example, which connects to a SQL Server database running in Azure, with the example data set. The Spring Boot application connects to that database using Spring Data's repository helpers and a Vaadin UI lets end users view and modify the data.

If you want to try out this application:

 * Create SQL Server in azure, load the "Sample" data set which is used by this example
 * Change the connection string parameters (your server, user and password are different)
 * (Optional, for local running/development) In Azure web console, open Firewall for your database and use "Add client IP" to allow connections from your current IP address
 
