# Arquitectura-9B1F26DE4B8088056D8998A85A576464

## Pasos de Ejecucion para eclipse o consola
* Importar en eclipse como proyecto maven existente
* Descargar dependencias Alt + F5 (eclipse) o desde consola mvn update (path del proyecto)
* Generar Jar y War asociados, click derecho en el proyecto Padre -> run as -> maven install o desde consola mvn install
* Desde pestaña servidores añadir middleware y añadir war generado (controller-xps.war)
* Instalar mysql
* Ejecutar script de ejemplo <a href="https://github.com/stephanoapiolaza/Arquitectura-9B1F26DE4B8088056D8998A85A576464/blob/master/xps2.sql">sql </a>
* Asignar usuario a la base de datos
* Añadir datasource a middleware con los datos de la conexion
* Ejecutar servidor

## Ejecucion de Servicios REST
Este proyecto se autodocumenta con swagger, para ejecutarlo y probar los servicios ingresar a 
<code>http://localhost:8080/controller-xps/swagger-ui.html#/</code>

## NOTA
Si se necesita cambiar el motor de base de datos, modificar pom.xml de controller, actualizar dependencias y cambiar el pull de conexiones (datasource), recordar si se cambia el nombre de XPS2DS ir a controller/webapp/spring/spring-root modificar JNDI
