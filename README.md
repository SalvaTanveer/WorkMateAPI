# **WorkMate API**

A **Spring Boot REST API** for managing employees, supporting CRUD operations with **Spring Data JPA**.

## **Features**

✅ Retrieve employee details by ID\
✅ Fetch all employees\
✅ Add new employees\
✅ Update employee details\
✅ Delete employees

## **Tech Stack**

- **Java** (Spring Boot, Spring Data JPA)
- **MySQL** (Database)
- **Postman** (API Testing)
- **Maven** (Dependency Management)

## **Setup & Installation**

### **1. Clone the Repository**

```bash
git https://github.com/SalvaTanveer/WorkMateAPI.git
cd WorkMate-API
```

### **2. Configure Database**

- Update `application.properties` with your MySQL database details:
  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
  spring.datasource.username=your_username
  spring.datasource.password=your_password
  spring.jpa.hibernate.ddl-auto=update
  ```

### **3. Build & Run the Application**

```bash
mvn clean install
mvn spring-boot:run
```

## **API Endpoints & Testing with Postman**

### **1. Get Employee by ID**

- **Endpoint:** `GET /api/emp/byid/{id}`
- **Example Request:**
  ```http
  GET http://localhost:8080/api/emp/byid/1
  ```

### **2. Get All Employees**

- **Endpoint:** `GET /api/emp/all`
- **Example Request:**
  ```http
  GET http://localhost:8080/api/emp/all
  ```

### **3. Add a New Employee**

- **Endpoint:** `POST /api/emp/onboard`
- **Request Body (JSON):**
  ```json
  {
    "name": "John Doe",
    "email": "johndoe@example.com",
    "salary": 50000,
    "designation": "Software Engineer"
  }
  ```
- **Example Request (Postman):**
  - Select **POST** method
  - Enter `http://localhost:8080/api/emp/onboard`
  - Go to the **Body** tab → Select **raw** → Choose **JSON**
  - Paste the JSON data and send the request

### **4. Update an Employee**

- **Endpoint:** `PUT /api/emp/update`
- **Request Body (JSON):**
  ```json
  {
    "id": 1,
    "name": "John Doe",
    "email": "john.doe@example.com",
    "salary": 55000,
    "designation": "Senior Software Engineer"
  }
  ```

### **5. Delete an Employee**

- **Endpoint:** `DELETE /api/emp/remove/{id}`
- **Example Request:**
  ```http
  DELETE http://localhost:8080/api/emp/remove/1
  ```

## **Contributing**

Feel free to fork this repository and submit pull requests for any improvements! 😊

## **License**

This project is licensed under the **MIT License**.
