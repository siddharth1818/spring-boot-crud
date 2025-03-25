# Spring Boot CRUD API

This is a Spring Boot CRUD API that allows managing Categories and Products using a MySQL database.

## Features

- Supports CRUD operations for Categories and Products.
- Implements a One-to-Many relationship where one Category can have multiple Products.
- Server-side pagination for fetching records.
- RESTful API endpoints with JSON responses.
- Built using Spring Boot, Spring Data JPA, Hibernate, and MySQL.

## Prerequisites

- **Java 17+** - Required for running the Spring Boot application.
- **MySQL Server** - Database for storing categories and products.
- **Postman (Optional)** - For testing API endpoints.
- **VS Code (Optional)** - For development.
- **Git (Optional)** - For version control.

## How to Run the Project

### 1️⃣ Clone the Repository

```sh
git clone https://github.com/your-username/crud-task.git
cd crud-task
```

### 2️⃣ Configure Database

Update `application.properties` inside `src/main/resources/`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cruddb
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3️⃣ Install Dependencies

```sh
mvn clean install
```

### 4️⃣ Run the Application

```sh
mvn spring-boot:run
```

OR

```sh
java -jar target/CRUD-Task-0.0.1-SNAPSHOT.jar
```

## 5️⃣ API Endpoints

| Method | Endpoint             | Description                    |
| ------ | -------------------- | ------------------------------ |
| GET    | /api/categories      | Get all categories (paginated) |
| GET    | /api/categories/{id} | Get category by ID             |
| POST   | /api/categories      | Create a new category          |
| PUT    | /api/categories/{id} | Update category by ID          |
| DELETE | /api/categories/{id} | Delete category by ID          |
| GET    | /api/products        | Get all products (paginated)   |
| GET    | /api/products/{id}   | Get product by ID              |
| POST   | /api/products        | Create a new product           |
| PUT    | /api/products/{id}   | Update product by ID           |
| DELETE | /api/products/{id}   | Delete product by ID           |

## 6️⃣ Test API with Postman

Open Postman and send requests to:

- `http://localhost:8080/api/categories`
- `http://localhost:8080/api/products`

## 🚀 Technologies Used

- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Maven**

