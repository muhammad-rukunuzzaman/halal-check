# Halal Check


This project provides a simple web application to check whether a food code is Halal, Haram or Mashbuh. It uses a React frontend served by Nginx and a Spring Boot backend connected to a Postgres database. All components run inside Docker containers using Docker Compose. Spring Data JPA automatically creates the required tables at startup and seeds sample food codes from `backend/src/main/resources/data.sql`.

## Prerequisites

* **Docker** and **Docker Compose** - required to run the application in containers.
* **JDK 17** and **Gradle** - only necessary if you want to build or test the backend outside of Docker.
* **Node.js** and **npm** - only necessary if you want to build the React frontend outside of Docker.


## Prerequisites

* **Docker** and **Docker Compose** - required to run the application in containers.
* **JDK 17** and **Gradle** - only necessary if you want to build or test the backend outside of Docker.
* **Node.js** and **npm** - only necessary if you want to build the React frontend outside of Docker.

## Usage


1. Build and start the services (the backend will create tables and load sample data on startup):


```bash
docker-compose up --build
```

2. Open `http://localhost` in a browser and enter a food code to see the result.

e1mvrz-codex/document-prerequisites-and-test/build-process

Postgres also exposes port `5432` if you want to connect using a local client.

### Building the frontend manually

If you want to rebuild the React app outside Docker, run:

```bash
cd frontend
npm install
npm run build
```

The Nginx image build will also perform these steps automatically.

### Building the Nginx image manually

If you only need to rebuild the frontend container, run:

```bash
docker-compose build nginx
```

The build context for the Nginx image is the project root. During this build the React application is compiled and copied into the container using `nginx/Dockerfile`.

## Running tests

To execute the backend unit tests using Gradle:

```bash
docker-compose run --rm backend gradle test
```

If building outside Docker, ensure JDK 17 and Gradle are installed and run `gradle test` inside the `backend` directory.
