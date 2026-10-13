# PROYECTO ACTUALIZADOR DE CAMBIOS EN USUARIOS DE BD

Aplicación de escritorio desarrollada en Java con interfaz gráfica Swing para gestionar y consultar información de una base de datos SQL Server. El sistema permite iniciar sesión, conectarse a la base de datos y visualizar consultas relacionadas con sucursales y datos de negocio.

## Descripción

Este proyecto fue desarrollado como una herramienta de escritorio que permite:

- Iniciar sesión con usuario y contraseña.
- Conectarse a una base de datos SQL Server.
- Consultar información desde la tabla `Sucursales`.
- Mostrar resultados en una tabla visual dentro de la aplicación.
- Navegar entre ventanas principales de la interfaz.

La aplicación está orientada al control de acceso y visualización de información según los permisos y credenciales del usuario.

---

## Tecnologías utilizadas

- Java
- Swing (interfaz gráfica)
- JDBC
- SQL Server
- NetBeans IDE

---

## Requisitos previos

Antes de ejecutar el proyecto asegúrate de tener instalado:

- Java JDK 19 o superior
- NetBeans IDE (recomendado) o cualquier IDE compatible con Java
- SQL Server con una base de datos accesible
- Driver JDBC de SQL Server

---

## Estructura del proyecto

```text
PROYECTO-ACTUALIZADOR-DE-CAMBIOS-EN-USUARIOS-DE-BD-
├── INTERFAZSAMSCLUB/
│   ├── build/
│   ├── dist/
│   ├── nbproject/
│   ├── src/
│   │   └── interfazsamsclub/
│   │       ├── IMAGENES/
│   │       ├── Usuario.java
│   │       ├── conexion.java
│   │       ├── consulta.java
│   │       ├── consulta.form
│   │       ├── interfazproyecto.java
│   │       └── interfazproyecto.form
│   ├── build.xml
│   ├── manifest.mf
│   └── ...
├── README.md
└── ...
