# CRUD-OPERATION-USING-JDBC
CRUD stands for Create, Read, Update, and Delete, which are the basic operations that can be performed on data in a database or data storage system. Here's a brief overview of each operation:

1. Create: Add new data to the database.
2. Read: Retrieve existing data from the database.
3. Update: Modify existing data in the database.
4. Delete: Remove data from the database.

CRUD operations are essential for managing data in any application or system, and are commonly used in databases, APIs, and software development.

-------In DB do the following-------

mysql> use mydb;

Database changed

mysql> CREATE TABLE IF NOT EXISTS books (
    Book_Id INT,
    Title VARCHAR(255),
    Author VARCHAR(255),
    Genre VARCHAR(100),
    Publication_Year INT,
    Quantity INT
);

JDBC (Java Database Connectivity) is a Java-based technology that allows developers to connect and interact with relational databases, including MySQL. Here's a detailed description of how JDBC works with MySQL:

JDBC Architecture:

1. JDBC Driver: A software component that implements the JDBC API (Application Programming Interface) to interact with the MySQL database. The MySQL JDBC driver is called "mysql-connector-java".
2. JDBC API: A set of Java classes and interfaces that provide a standard way to access and manipulate database data.
3. MySQL Database: The relational database management system that stores and manages data.

JDBC Connection Process:

1. Loading the JDBC Driver: The application loads the MySQL JDBC driver using the Class.forName() method.
2. Establishing a Connection: The application creates a connection to the MySQL database using the DriverManager.getConnection() method, passing in the database URL, username, and password.
3. Creating a Statement: The application creates a Statement object using the Connection.createStatement() method to execute SQL queries.
4. Executing Queries: The application executes SQL queries using the Statement object's executeQuery() or executeUpdate() methods.
5. Processing Results: The application processes the results of the query using the ResultSet object.
6. Closing the Connection: The application closes the connection using the Connection.close() method.

