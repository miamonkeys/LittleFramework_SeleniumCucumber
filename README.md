# Selenium con Java y Cucumber: El curso definitivo.

Este es el framework que se desarrollo en el curso.

Link del curso: https://www.udemy.com/course/selenium-con-java-y-cucumber-el-curso-definitivo/

## Mejores prácticas en la automatización segun profesor The Free Range Tester

1. Las validaciones se hacen en los "steps definitions".
2. Se debe de tener una clase para modelar la página.
3. Se deben manejar los errores. Por ejemplo si no encontramos un elemento, debemos capturar ese error y mandar en la salida un mensaje coherente que entendamos nosotros o la persona que vaya a usar nuestra automatización. Esto se hace en la clase donde se moldea la página.
4. En la "base page" debemos escribir todas las funciones que vayamos a usar y estas las heredan las clases de pagina.
5.Usar "camel case" para las variables y funciones. Para las clases cada palabra empieza con mayúscula.
6. NO se deberia de usar "sleep()". Para eso existe la espera implícita.

## Mejores prácticas con Cucumber

1. Cucumber fue concebido como una herramienta de colaboración de los 3 amigos: desarrolladores, probadores y analistas de negocio.
2. Por escenario solo debe de probarse una sola cosa.
3. Los tags se usan para probar lo que se tiene que probar y no demás.
4. Debe de usarse un lenguaje no técnico en la elaboración de los escenarios.
