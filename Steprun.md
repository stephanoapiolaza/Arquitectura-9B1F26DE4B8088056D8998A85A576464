# Arquitectura-9B1F26DE4B8088056D8998A85A576464

## Pasos de Ejecucion para eclipse o consola
* Importar en eclipse como proyecto maven existente
* Descargar dependencias Alt + F5 (eclipse) o desde consola mvn update (path del proyecto)
* Generar Jar y War asociados, click derecho en el proyecto Padre -> run as -> maven install o desde consola mvn install
* Desde pestaña servidores añadir middleware y añadir war generado (controller-xps.war)
* Ejecutar servidor

## Ejecucion de Servicios REST
Hay distintas tareas para este trabajo como postman, rest api client, pero este proyecto se autodocumenta con swagger, para ejecutarlo y probar los servicios ingresar a 
<code>http://localhost:8080/controller-xps/swagger-ui.html#/</code>
