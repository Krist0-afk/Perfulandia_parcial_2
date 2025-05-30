
**🧾 Proyecto: Transformación Digital - Perfulandia SPA**

### 📦 Descripción General del Proyecto

Sistema de microservicios para Perfulandia SPA que reemplaza un monolito antiguo. Resuelve problemas de escalabilidad y mantenimiento, ofreciendo mayor agilidad en despliegues y actualizaciones independientes por servicio.

### 🧩 Arquitectura de Microservicios

Sistema dividido en 4 microservicios independientes:

- usuarioservice: Gestión de usuarios (registro, login, perfiles).

- productoservice: CRUD de productos y categorías.

- pedidoservice: Procesamiento de pedidos y gestión de carritos.

- Repartidorservice: Envío de notificaciones por email/SMS.

### 🛠️ Tecnologías Utilizadas

- Spring Boot, Maven, MySQL.

- Postman (pruebas), GitHub .

### 🗄️ Configuración de Bases de Datos

- Motor: MySQL.

- Cada servicio tiene su propia base de datos configurada en application.properties:

properties:

# Ejemplo:
(usuarioservice)

spring.datasource.url=jdbc:mysql://localhost:3306/db_usuarios

spring.datasource.username=root

spring.datasource.password=roo

### 🧑‍💻 Integrantes del Equipo

Rodrigo ruiz: Microservicio de carrito

Cristobal valdebenito: Microservicio de pedidos

Luis Uribe: Microservicio de logística

### 📂 Estructura del Repositorio

```

📦 perfulandia-microservices

- usuarioservice       Microservicio de usuarios

- productoservice       Microservicio de productos

- pedidoservice        Microservicio de pedidos

- repartidorservice  Microservicio de logistica



```

### 👥 Colaboración en GitHub

- Ramas: `main` (producción), `develop` (integración), ramas por feature (`feature/login`).

- Commits diarios. Revisión de código (pull requests) antes de merge a `develop`.

### 📈 Lecciones Aprendidas

- Técnico: Transición a microservicios.

- Equipo: Coordinación efectiva mediante GitHub y reuniones diarias breves.
