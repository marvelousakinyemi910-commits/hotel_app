Hotel Booking Management System

A Spring Boot-based Hotel Booking Management System designed to streamline hotel operations by managing rooms, guests, bookings, check-ins, and check-outs through a RESTful API architecture.

Features
Guest registration and management
Secure guest authentication and login
Room creation, update, retrieval, and deletion
Room availability tracking
Hotel room booking and reservation management
Guest check-in functionality
Guest check-out functionality
Booking cancellation
DTO-based request and response handling
Layered architecture (Controller, Service, Repository, Model)
Exception handling and validation
Maven-based project structure
RESTful API endpoints for easy integration
Technologies Used
Java
Spring Boot
Spring Data JPA
Maven
MySQL
Lombok
REST APIs
Architecture

The application follows a layered architecture:

Controller Layer – Handles incoming HTTP requests and API responses.
Service Layer – Contains business logic for bookings, guests, and room operations.
Repository Layer – Handles database interactions using JPA.
Model Layer – Represents entities such as Guests, Rooms, and Bookings.
DTO Layer – Transfers data between client and server while maintaining separation of concerns.
Core Workflow
Guests register and log into the system.
Administrators manage hotel rooms.
Guests can view available rooms.
Guests make room reservations.
Hotel staff can check guests in upon arrival.
Guests are checked out when their stay ends.
Reservations can be cancelled when necessary.
Room availability is automatically updated based on booking status.
Learning Objectives

This project demonstrates:

Object-Oriented Programming (OOP)
Layered Architecture
Dependency Injection
DTO Pattern
REST API Development
Database Integration with JPA
Maven Project Management
Clean Code and Separation of Concerns
Spring Boot Best Practices
