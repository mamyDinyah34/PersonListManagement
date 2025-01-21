# 🐘 TP PostgreSQL 

# 📋 Person List Management

This project is a web application for managing a list of persons. It allows users to manage a list of persons with a clean and intuitive interface. All interactions (create, update, and delete) are performed using a modal.

## 🛠️ Technologies Used

- **⚙️ Spring Boot**: Backend framework for building Java applications.
- **📄 Thymeleaf**: Template engine for rendering HTML.
- **🌐 HTML**: Markup language for creating web pages.
- **🎨 Tailwind CSS**: Utility-first CSS framework for styling.
- **🖍️ JavaScript**: Provides interactivity for modals and other dynamic features.
- **🗄️ PostgreSQL**: Relational database for storing data.

## 📋 Prerequisites

- ☕ Java 21
- 📦 Maven
- 🐘 PostgreSQL

## ⚙️ Setup

1. **📂 Clone the repository**:
    ```sh
    git clone https://github.com/mamyDinyah34/PersonListManagement.git
    cd PersonListManagement
    ```

2. **🛠️ Configure the database**:
    - Create a PostgreSQL database.
    - Update the `application.properties` file with your database credentials:
        ```properties
        spring.datasource.url=jdbc:postgresql://localhost:5432/your-database
        spring.datasource.username=your-username
        spring.datasource.password=your-password
        spring.jpa.hibernate.ddl-auto=update
        ```

3. **🚀 Build and run the application**:
    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

4. **🌐 Access the application**:
    - Open your browser and go to `http://localhost:8080`.

## ✨ Features

- **➕ Add Person**: Add a new person using a modal.
- **✏️ Edit Person**: Update the details of an existing person directly via a modal.
- **❌ Delete Person**: Remove a person from the list with a confirmation dialog.
- **🔍 Search Person**: Quickly search for persons by name.

## 📸 Screenshots

![image](https://github.com/user-attachments/assets/4edf6c24-5760-4aef-900d-87d173075545)


## 📂 Project Structure

- `src/main/java/com/mamydinyah/DemoConnectionPostgres`: Contains the Java source code.
- `src/main/resources/templates`: Contains the Thymeleaf templates.
- `src/main/resources/application.properties`: Configuration file for the application.

---

### ©️ 2025 Mamy Dinyah Randriamanampisoa.
