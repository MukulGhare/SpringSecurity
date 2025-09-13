# SpringSecurity

**Project purpose:**
A small learning project to explore Spring Security with JWT (JSON Web Token) authentication and authorization in a Spring Boot application.
---

## What it is

This repository demonstrates how to secure a Spring Boot REST API using Spring Security and JWTs. Typical features included in this kind of project:

* User registration and login
* JWT creation on successful authentication
* Stateless request authentication using the JWT passed in the `Authorization: Bearer <token>` header
* Role-based authorization (example: `ROLE_USER`, `ROLE_ADMIN`)
* Token expiration and validation


---

## Prerequisites

* Java 17 (or Java 11/17 depending on your `pom.xml`) — adjust if your project targets a different version
* Maven 3.6+
* (Optional) MySQL / PostgreSQL or H2 for local testing depending on your configuration
* Git

---

## Quick start

1. Clone the repo

```bash
git clone https://github.com/MukulGhare/SpringSecurity.git
cd SpringSecurity
```

2. Configure application properties
3. Build and run

```bash
# build
./mvnw clean package

# run
./mvnw spring-boot:run
```

Open `http://localhost:8080` (or the port set in your `application.properties`) and use the API endpoints to register/login.

---

## Build & run (Maven)

* Clean and package: `./mvnw clean package`
* Run: `./mvnw spring-boot:run` or `java -jar target/<artifact>.jar`

If you use an IDE (IntelliJ, Eclipse) import the project as a Maven project and run the main application class.

---

## How JWT is used here (high level)

1. User authenticates with username/password to the auth endpoint.
2. Server validates credentials and issues a signed JWT containing basic claims (subject, roles, issuedAt, expiration).
3. Client stores the JWT (e.g. in browser localStorage or mobile secure storage) and sends it in the `Authorization` header on subsequent requests.
4. A JWT filter on the server validates the token, extracts user details and populates the `SecurityContext` so Spring Security can perform authorization.

```
Author: Mukul Ghare
Repo: https://github.com/MukulGhare/SpringSecurity
```

---

*Last updated: 2025-09-13*
