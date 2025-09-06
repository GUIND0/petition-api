# Petition API

A RESTful API for a **Petition App** built with **Quarkus** and **Java**.  
This API allows users to create, sign, share, and manage petitions.

## Features

- Create a new petition
- Sign existing petitions
- Delete petitions
- Share petitions via links
- View all petitions or a single petition
- Track number of signatures per petition

## Technology Stack

- **Java 17+**
- **Quarkus** framework
- **Hibernate ORM / Panache** (optional for persistence)
- **RESTEasy / JAX-RS** for REST APIs
- **JSON** for request/response payloads
- **H2 / PostgreSQL / MySQL** for database

## Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+
- Docker (optional, for running database)

### Running Locally

1. Clone the repository:

```bash
git clone https://github.com/yourusername/petition-api.git
cd petition-api
