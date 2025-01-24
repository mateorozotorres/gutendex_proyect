# gutendex_proyect
Gutendex Project

Descripción

El proyecto Gutendex es una aplicación desarrollada en Spring Boot que integra diversas funcionalidades, incluyendo una conexión con bases de datos MySQL, el consumo de APIs externas utilizando OkHttp y el manejo de datos en formato JSON. El objetivo principal del proyecto es ofrecer un backend robusto que pueda gestionar datos de libros e interactuar con servicios externos para enriquecer la información.

Características Principales

Framework: Spring Boot 3.3.2.

Base de datos: MySQL, configurada para manejar persistencia y consultas.

Consumo de APIs externas: Implementado mediante la librería OkHttp.

Manejo de datos: Uso de Gson y Jackson para la serialización/deserialización de datos JSON.

Ejecución de pruebas: Integración de JUnit y Spring Boot Starter Test.

Tecnologías Utilizadas

Java 21: Lenguaje principal.

Spring Boot: Framework para desarrollo de aplicaciones.

MySQL: Sistema de gestión de bases de datos.

OkHttp: Cliente HTTP para el consumo de APIs.

Gson y Jackson: Herramientas para procesar JSON.

Maven: Sistema de gestión de dependencias y construcción del proyecto.

Instalación y Configuración

Prerrequisitos

Tener instalado Java 21.

Instalar Maven.

Tener acceso a una base de datos MySQL.

Configuración

Clonar el repositorio:

git clone https://github.com/tu_usuario/gutendex.git
cd gutendex

Configurar las credenciales de la base de datos en el archivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/nombre_de_base_de_datos
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update

Compilar y empaquetar el proyecto:

mvn clean install

Ejecutar la aplicación:

mvn spring-boot:run

Acceder a la aplicación desde el navegador en http://localhost:8080.

Endpoints

A continuación, algunos de los endpoints disponibles:

GET /books: Retorna la lista de libros.

POST /books: Permite agregar un nuevo libro.

Documentación detallada de los endpoints se encuentra en el código fuente o puedes usar herramientas como Postman para explorarlos.

Ejecución de Pruebas

El proyecto incluye pruebas unitarias y de integración. Para ejecutarlas, utiliza:

mvn test

Dependencias

Las dependencias principales del proyecto están definidas en el archivo pom.xml. Algunas de ellas son:

Spring Boot Starter Web: Desarrollo de aplicaciones web.

Spring Boot Starter Actuator: Monitorización y métricas.

OkHttp: Consumo de APIs externas.

Gson y Jackson: Manejo de JSON.

MySQL Connector: Conexión a la base de datos.
EVIDENCIAS DE FUNCIONAMIENTO:

![image](https://github.com/user-attachments/assets/37c832b2-80d5-495a-afbf-2557047720b1)
![image](https://github.com/user-attachments/assets/6595e885-5b3d-4e47-8246-a5f82bb0d0cd)
![image](https://github.com/user-attachments/assets/83f62da8-bddb-40f7-a5f3-0eaad3e2cbd8)
![image](https://github.com/user-attachments/assets/87d2cc88-864a-4232-8080-28a0a1c25a55)
![image](https://github.com/user-attachments/assets/5603737b-0f74-4f77-9e72-aa867e2aaa34)
![image](https://github.com/user-attachments/assets/d08cca78-2d8f-4ec7-9947-959cd6fb95b9)






