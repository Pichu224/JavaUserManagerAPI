Spring Boot Users API

API REST desarrollada con Spring Boot que implementa un CRUD de usuarios, siguiendo buenas prácticas de arquitectura y separación de responsabilidades.

Este proyecto forma parte de mi proceso de aprendizaje en backend con Java y Spring.

🚀 Tecnologías utilizadas

Java 21

Spring Boot

Spring Web

Spring Data JPA

H2 Database (en memoria)

MapStruct

Lombok

Maven

📂 Estructura del proyecto

El proyecto está organizado en capas, separando responsabilidades:

Controller: manejo de requests HTTP

Application / Handlers: lógica de casos de uso

Domain: entidades de dominio

Repository: acceso a datos mediante JPA

DTOs & Mappers: contratos HTTP y mapeo entre capas

📌 Funcionalidades

Crear usuario

Obtener usuario por ID

Obtener lista de usuarios

Actualizar usuario

Eliminar usuario

▶️ Cómo ejecutar el proyecto

Clonar el repositorio:

git clone https://github.com/Pichu224/JavaUserManagerAPI.git


Entrar al proyecto:

cd JavaUserManagerAPI


Ejecutar la aplicación:

./mvnw spring-boot:run


(En Windows también se puede usar mvnw.cmd)

La API queda disponible en:

http://localhost:8080

🛠 Base de datos

Se utiliza H2 en memoria, por lo que los datos se pierden al reiniciar la aplicación.

La consola de H2 está disponible en:

http://localhost:8080/h2-console

📌 Estado del proyecto

✔ CRUD funcional
✔ Arquitectura base definida
✔ Uso de DTOs y MapStruct

🔄 Pendiente: manejo de errores más avanzado
🔄 Pendiente: migración a base de datos real (PostgreSQL)
🔄 Pendiente: Spring Security + JWT
