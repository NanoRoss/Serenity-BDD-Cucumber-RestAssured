## cencoAPI

### Contexto:
```
Este proyecto de pruebas utiliza Serenity BDD, Cucumber y RestAssured para realizar pruebas automatizadas de API.
Está diseñado para realizar validaciones sobre las solicitudes GET y POST en el sitio sonplaceholder.typicode.com.
```

### Tecnologia:

```
Tecnología
La tecnología utilizada en este proyecto es la siguiente:

Serenity BDD: Un framework de pruebas basado en comportamiento (BDD) que brinda un enfoque estructurado y escalable para escribir pruebas automatizadas.
Cucumber: Una herramienta de BDD que permite la escritura de escenarios de prueba en lenguaje natural y su ejecución automatizada.
RestAssured: Una biblioteca Java que simplifica las pruebas de API REST al proporcionar una sintaxis fluida para realizar solicitudes y verificar respuestas.
```

### Pruebas:

```
Pruebas
El proyecto incluye dos features con sus correspondientes escenarios de prueba. A continuación se describen brevemente los escenarios:

Validaciones sobre GET requests en sonplaceholder.typicode.com
Este escenario de prueba realiza solicitudes GET a la API de sonplaceholder.typicode.com utilizando diferentes IDs de publicaciones. Verifica que el código de estado de la respuesta sea 200 y que el título de la publicación contenga una determinada cadena de texto.

Validaciones sobre POST requests en sonplaceholder.typicode.com
Este escenario de prueba realiza una solicitud POST a la API de sonplaceholder.typicode.com con datos JSON. Luego, verifica que el código de estado de la respuesta sea 201 y que el título y el cuerpo de la respuesta coincidan con los valores proporcionados.
```
### Ejecucion General:

```
 mvn clean verify
```

### Reporte:

![1.png](src%2Ftest%2Fresources%2F1.png)
![2.png](src%2Ftest%2Fresources%2F2.png)
![3.png](src%2Ftest%2Fresources%2F3.png)