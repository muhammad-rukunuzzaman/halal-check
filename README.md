# Halal Check

This project provides a simple web application to check whether a food code is Halal, Haram or Mashbuh. It uses a React frontend served by Nginx and a Spring Boot backend connected to a Postgres database. All components run inside Docker containers using Docker Compose.

## Usage

1. Build and start the services:

```bash
docker-compose up --build
```

2. Open `http://localhost` in a browser and enter a food code to see the result.
