# API_REST_BASICO_Java_SpringBoot


### Descripción:
 Implementación de _API Rest_ en Java con el Framework _Spring_ _Boot_ usando _MySQL_ y _JPA_.
 
 La configuración inicial se realizó solo usando el componente de Spring web, luego se añadieron los componentes
 _Spring JPA_ y _Mysql_ _Driver_ a traves de la modificacion del archivo POM.xml asi como se muestra a continuacion:

 ``` XML
    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		
		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>
```

---
*Se utilizó solo un controller una clase del model y una interzaz para el repositorio.*
 
