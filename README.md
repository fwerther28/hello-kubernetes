# Hello Kubernetes - Spring Boot & Docker

A lightweight microservice built with **Java 21** and **Spring Boot 3** designed for deployment and load balancing demonstrations on **Kubernetes** clusters.

## Features
- **Health Check Endpoint (`GET /`)**: Returns service operational status (`{healthy:true}`).
- **Instance Identification Endpoint (`GET /hello-kubernetes`)**: Inspects the container/pod environment and extracts the unique instance identifier from `HOSTNAME`.
- Containerized using optimized Alpine Docker image (`eclipse-temurin:21-jdk-alpine`).

## Tech Stack
- Java 21
- Spring Boot 3
- Maven Wrapper
- Docker
- Kubernetes (Pods, Deployments, Services)

## Running Locally

### Via Docker
```bash
docker build -t hello-kubernetes:v1 .
docker run -d -p 8080:8080 --name meu-hello-k8s hello-kubernetes:v1