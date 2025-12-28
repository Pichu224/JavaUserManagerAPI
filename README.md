# Spring Boot Users API

API REST desarrollada con **Spring Boot** que implementa un CRUD básico de usuarios, siguiendo buenas prácticas de arquitectura y separación de responsabilidades.

Este proyecto forma parte de mi proceso de aprendizaje en backend con Java y Spring.

---

## 🚀 Tecnologías utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (en memoria)
- Maven

---

## 📂 Estructura del proyecto

El proyecto está organizado en capas, separando responsabilidades:

- **Controller**: manejo de requests HTTP
- **Handlers / Application**: lógica de casos de uso
- **Domain**: entidades de dominio
- **Repository**: acceso a datos mediante JPA

(Actualmente los DTOs están pendientes de implementación para evitar exponer entidades de dominio directamente.)

---

## 📌 Funcionalidades

- Crear usuario
- Obtener usuario por ID
- Obtener lista de usuarios
- Actualizar usuario
- Eliminar usuario

---

## ▶️ Cómo ejecutar el proyecto

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/tu-repo.git
Entrar al proyecto:

Copiar código
cd tu-repo
Ejecutar la aplicación:

Copiar código
./mvnw spring-boot:run
(En Windows también se puede usar mvnw.cmd)

La API queda disponible en:

Copiar código
http://localhost:8080

🛠 Base de datos
Se utiliza H2 en memoria, por lo que los datos se pierden al reiniciar la aplicación.

La consola de H2 está disponible en:

Copiar código
http://localhost:8080/h2-console

📌 Estado del proyecto


✔ CRUD funcional

✔ Arquitectura base definida

🔄 Pendiente: DTOs para requests y responses

🔄 Pendiente: validaciones y manejo de errores más avanzado

🔄 Pendiente: Migración a base de datos real (Postgress)
