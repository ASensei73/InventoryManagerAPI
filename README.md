# 📦 InventoryManagerAPI

API REST empresarial para gestión de inventario, productos y stock.  
Desarrollada con **Java + Spring Boot + MySQL**.

---

## 🚀 Tecnologías

- Java 17  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- MySQL  
- Swagger (OpenAPI)

---

## 📘 Funcionalidades

- CRUD de productos  
- Gestión de stock  
- Categorías  
- Precios  
- Documentación automática con Swagger  

---

## 📂 Estructura del proyecto

- **controller** — Endpoints REST  
- **service** — Lógica de negocio  
- **repository** — Acceso a datos con JPA  
- **entity** — Modelos de base de datos  
- **config** — Configuración general  

---

## 🗄️ Base de datos

Tabla principal: **products**

Campos:

- id  
- nombre  
- categoria  
- stock  
- precio  

---

## 🔧 Cómo ejecutar

1. Crear base de datos `inventory_db` en MySQL  
2. Configurar `application.properties` con tu usuario y contraseña  
3. Ejecutar con IntelliJ o:

