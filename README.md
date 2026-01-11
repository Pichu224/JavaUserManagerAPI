# Spring Boot Users API

API REST desarrollada con **Spring Boot** que implementa un CRUD de usuarios, siguiendo buenas prácticas de arquitectura, separación de responsabilidades y diseño orientado a dominio.

---

## 🚀 Tecnologías utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA (Hibernate)
- PostgreSQL
- Flyway (Database Migrations)
- Docker
- MapStruct
- Lombok
- Maven

---

## 📂 Arquitectura del proyecto

El proyecto sigue una **arquitectura en capas**, inspirada en Clean Architecture / Hexagonal:

- **Controller**  
  Manejo de requests HTTP y validaciones básicas.

- **Application / Services (Handlers)**  
  Implementación de los casos de uso (Create, Update, Get, Delete).

- **Domain**  
  Entidades de dominio y lógica central del negocio.

- **Repository**  
  Acceso a datos mediante JPA.

- **DTOs & Mappers**  
  Contratos de entrada/salida y mapeo entre capas usando MapStruct.

Esta separación permite un código **mantenible, testeable y escalable**.

---

## 📌 Funcionalidades

- Crear usuario
- Obtener usuario por ID
- Obtener todos los usuarios
- Actualizar usuario
- Eliminar usuario

---

## ▶️ Cómo ejecutar el proyecto

### 1️⃣ Clonar el repositorio

```bash
git clone https://github.com/Pichu224/JavaUserManagerAPI.git
cd JavaUserManagerAPI

2️⃣ Levantar la base de datos con Docker
Asegurate de tener Docker Desktop corriendo.

docker run --name postgres-users -e POSTGRES_DB=users_db -e POSTGRES_USER=postgres 
-e POSTGRES_PASSWORD=postgres -p 5432:5432 -v postgres_users_data:/var/lib/postgresql/data -d postgres:17-alpine

Esto crea:

Base de datos: users_db

Usuario: postgres

Password: postgres

Puerto: 5432

3️⃣ Ejecutar la aplicación

./mvnw spring-boot:run
(En Windows también se puede usar mvnw.cmd)

La API quedará disponible en:

http://localhost:8080
🛠 Base de datos y migraciones
Se utiliza PostgreSQL como base de datos principal.

Las tablas se crean automáticamente mediante Flyway.

Los scripts de migración se encuentran en:

src/main/resources/db/migration

Ejemplo:

V1__create_users_table.sql
Flyway se ejecuta automáticamente al iniciar la aplicación y garantiza:

Versionado de la base de datos

Consistencia entre entornos

Evolución controlada del esquema

🔍 Ver las tablas de PostgreSQL
Podés inspeccionar la base de datos usando:

pgAdmin

DBeaver

IntelliJ Database Tool

Datos de conexión:

Host: localhost

Port: 5432

Database: users_db

User: postgres

Password: postgres

📌 Estado del proyecto
✔ CRUD completo y funcional
✔ PostgreSQL con Docker
✔ Migraciones con Flyway
✔ Arquitectura clara y desacoplada
✔ DTOs y mappers con MapStruct
✔ Manejo de errores básico

🔄 Pendiente:

Tests unitarios y de integración

Paginación y filtros

Spring Security + JWT

📎 Notas
Este proyecto está pensado como base profesional para entrevistas técnicas y crecimiento futuro, priorizando buenas prácticas desde el inicio.