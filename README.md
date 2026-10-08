# Online Grocery

A Spring Boot REST API for managing grocery customers and grocery order data. The project models customer, grocery item, and order relationships using JPA/Hibernate and follows a layered MVC architecture.

## Features

- Customer CRUD operations
- Grocery item and order data modeling
- One-to-many relationship between customers and orders
- Many-to-many relationship between orders and grocery items
- Automated total price calculation for orders
- MySQL database integration
- Validation support and centralized exception handling

## Tech Stack

- Java 21
- Spring Boot 4.0.6
- Spring Web
- Spring Data JPA
- MySQL
- Gradle
- Lombok

## Project Structure

```text
src/
  main/
    java/
      com/crio/onlineGrocery/
        controller/
        entity/
        exception/
        repository/
        service/
    resources/
      application.properties
```

## Database Configuration

The application uses MySQL. Update your database credentials in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/grocery_db
spring.datasource.username=root
spring.datasource.password=root123
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Make sure a MySQL server is running and the database `grocery_db` exists.

## Run the Application

From the project root:

```bash
./gradlew bootRun
```

The application will start on the default Spring Boot port:

```text
http://localhost:8080
```

## API Endpoints

### Customers

| Method | Endpoint | Description |
| --- | --- | --- |
| GET | `/api/customers` | Get all customers |
| GET | `/api/customers/{id}` | Get a customer by ID |
| POST | `/api/customers` | Create a customer |
| PUT | `/api/customers/{id}` | Update a customer |
| DELETE | `/api/customers/{id}` | Delete a customer |

### Example Request

Create customer:

```bash
curl -X POST http://localhost:8080/api/customers \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Alice Johnson",
    "email": "alice@example.com",
    "address": "123 Main St",
    "phone": "9876543210"
  }'
```

## Domain Model

- Customer
  - id
  - name
  - email
  - address
  - phone
  - orders

- GroceryItem
  - id
  - name
  - category
  - price
  - quantity
  - orders

- GroceryOrder
  - id
  - orderDate
  - totalPrice
  - customer
  - items

## Notes

This project demonstrates a clean service-oriented design using JPA relationships and a repository-service-controller structure. The order total is managed in the business layer to keep pricing logic separate from persistence concerns.


