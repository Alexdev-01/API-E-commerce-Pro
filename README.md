# 🛒 API E-commerce PRO

API REST de e-commerce desarrollada con **Spring Boot**, que gestiona usuarios, productos, categorías y pedidos, implementando autenticación JWT, control de stock transaccional, manejo global de errores, paginación y filtros dinámicos.

---

# 🚀 Tecnologías Utilizadas

- ☕ Java
- 🌱 Spring Boot
- 🔐 Spring Security + JWT
- 🗄️ Spring Data JPA (Hibernate)
- 🐬 MySQL / PostgreSQL
- 📦 Maven
- 🧪 Postman (testing)
- 📚 Swagger (OpenAPI)

---

# 📌 ¿Para Qué Sirve Esta API?

Esta API permite gestionar el backend de una tienda online con funcionalidades como:

✔ Registro y autenticación de usuarios\
✔ Seguridad mediante JWT\
✔ Roles de usuario (ADMIN / CLIENTE)\
✔ Gestión de categorías\
✔ Gestión de productos y stock\
✔ Creación de pedidos\
✔ Cálculo automático del total\
✔ Reducción automática del stock\
✔ Manejo global de errores\
✔ Paginación de resultados\
✔ Filtros dinámicos (categoría, precio)

---

# 🏗️ Arquitectura del Proyecto

La aplicación sigue una arquitectura en capas:

```
📡 Cliente
↓
📁 Controller
↓
📁 Service
↓
📁 Repository
↓
🗄️ Base de Datos
```

---

## 📦 Estructura de paquetes

```
com.tiendaonline.gestion
│
├── 📁 controller
├── 📁 service
├── 📁 service.impl
├── 📁 repository
├── 📁 model
├── 📁 dto
│ ├── auth
│ ├── producto
│ └── pedido
├── 📁 security
├── 📁 exception
```

---

# 📡 Endpoints Disponibles

## 🔐 Auth

- `POST /auth/register` → Registro de usuario
- `POST /auth/login` → Login y obtención de JWT

---

## 🗂️ Categorías (ADMIN)

- `POST /categorias`
- `GET /categorias`
- `PUT /categorias/{id}`
- `DELETE /categorias/{id}`

---

## 📦 Productos

- `GET /productos` → Listado público (paginado)
- `GET /productos/{id}`
- `POST /productos` (ADMIN)
- `PUT /productos/{id}` (ADMIN)
- `DELETE /productos/{id}` (ADMIN)

### 🔎 Filtros

- `GET /productos/filtrar?categoriaId=1`
- `GET /productos/filtrar?precioMin=100&precioMax=500`
- `GET /productos/filtrar?categoriaId=1&precioMin=100&page=0&size=5`

---

## 🛒 Pedidos

- `POST /pedidos` → Crear pedido (CLIENTE)
- `GET /pedidos/mis-pedidos` → Pedidos del usuario
- `GET /pedidos` → Todos los pedidos (ADMIN)

---

# 🛠️ Requisitos Previos

- Java 17+
- Maven
- MySQL o PostgreSQL
- Postman (opcional pero recomendado)

---

# ⚙️ Configuración del Proyecto

## 📄 application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tienda
spring.datasource.username=root
spring.datasource.password=1234

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 🧪 Probar la API con Postman
🔑 1. Login

POST /auth/login

Guardar token automáticamente:

let jsonData = pm.response.json();
pm.environment.set("token", jsonData.token);

---

🔐 2. Usar JWT

Header:

Authorization: Bearer {{token}}

🔄 Flujo recomendado
Registrar usuario
Login
Crear categoría
Crear producto
Listar productos
Crear pedido


📊 Modelo de Datos

Relaciones principales:

Usuario 1 ──── N Pedido
Pedido 1 ──── N DetallePedido
Producto 1 ──── N DetallePedido
Categoria 1 ──── N Producto


⚠️ Manejo de Errores

La API implementa manejo global de excepciones:

{
  "mensaje": "Stock insuficiente",
  "status": 400,
  "timestamp": "2026-04-20T12:00:00"
}


📚 Documentación Swagger

Disponible en:

http://localhost:8080/swagger-ui.html

Permite:

visualizar endpoints
probar requests
documentar la API automáticamente


# 👨‍💻 Autor

Desarrollado por **Alejandro Collado Severiano**

Backend Developer | Java | Spring Boot

---

# 🔗 Enlaces Útiles

Spring Boot
https://spring.io/projects/spring-boot

Spring Security
https://spring.io/projects/spring-security

JWT
https://jwt.io

Postman
https://www.postman.com/

Hibernate
https://hibernate.org

Swagger
https://swagger.io/
