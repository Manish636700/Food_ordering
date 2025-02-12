# **Online Food Delivery Project**

## Project Overview

The **Online Food Delivery System** is a Full-stack web Application designed to facilitate seamless food ordering and delivery. It provides a platform where customers can browse restaurants , explore food options , place orders , and track deliveries. Restaurant owners can manage their menus , process orders , and handle customer interactions . The system ensures security through role-based access control and authentication mechanisms. 


## Technologies Used

### Frontend

  - **React :** A JavaScript Library for building interactive and dynamic UI compoments.
  - **Tailwind CSS :** A utility-first CSS framework for responsive and customizable designs.
  - **MUI (Material UI) :** A component library providing pre-built, stylish UI components.
  - **Redux :** A state management library for handling application-wide state.
  - **Axios :** A promise-based HTTP client for making API requests.

### Backend

  - **Spring Boot** : A Java-based framework for building scalable and high-performance web applications.
  - **Spring Security** : Implements authentication and authorization with role-based access control
  - **JSON Web Token (JWT)** : Used for secure token-based authentication.
  - **Spring Starter Mail** : Enables email notifications for order confirmations and account-related actions.

### Database

  - **MySQL :** A relational database management system (RDBMS) used for storing and managing application data efficiently.


## Development Tools

  - **IntelliJ IDEA :** Used for backend development with Spring Boot.
  - **VS Code :** Used for frontend development with React.

## Project Features

### Customer Features
  - User authentication and role-based access.
  - Browse restaurants and their food menus.
  - Add food items to the cart and place orders.
  - Track order status and history.

### Restaurant Owner Features
  - Secure login with role-based access.
  - Add, update, and manage restaurant details.
  - Manage food items, categories, and ingredients.
  - View and process customer orders.

### Admin Features
  - Manage users , Restaurants , and food items .
  - Monitor and approve new restaurant registrations.

# Project Models
  - **User :** Represents customers and restaurant owners with authentication details.
  - **Restaurant :** Stores restaurant details such as name, location, and menu.
  - **Food :** Contains food item details, including name, price, and availability.
  - **Food Category :** Groups food items into categories.
  - **Ingredients :** Represents ingredients used in food items.
  - **Event :** Handles special events, discounts, or promotions.
  - **Order :** Stores order details, including customer information and total amount.
  - **Order Item :** Represents individual items within an order.
  - **Cart :** Temporary storage for items selected by the customer before checkout.
  - **Cart Item :** Represents individual food items added to the cart.
