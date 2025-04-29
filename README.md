
# Kafka-Driven Food Order Management System

This project is a real-time food order management system built using Apache Kafka for asynchronous event handling and microservices architecture. It demonstrates scalable message-driven design with a modern frontend and robust backend stack.

## 🛠️ Tech Stack

- **Frontend:** Next.js (React)
- **Backend:** Spring Boot, Hibernate, PostgreSQL
- **Streaming:** Apache Kafka
- **Database:** PostgreSQL
- **ORM:** Hibernate
- **Message Broker:** Kafka (with multiple topics and consumers)

## 🚀 Features

- Real-time order placement, updates, and tracking
- Kafka topics for `order-create`, `order-update`, and `order-log`
- Multiple Kafka consumers handling workflows independently
- Spring Boot REST APIs to handle order and status logic
- Hibernate-based persistence to PostgreSQL
- Frontend UI built in Next.js to place and view food orders

## 📦 Kafka Architecture

- **Producer:** Publishes events for order creation and updates
- **Consumer 1:** Writes incoming order data to the PostgreSQL database
- **Consumer 2:** Logs events for auditing and analytics
