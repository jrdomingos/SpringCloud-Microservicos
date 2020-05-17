# SpringBoot - Microservicos Spring Cloud e Service Discovery Netflix

Desenvolvimento de uma Arquiterura Spring Cloud com o Eureka e Service Discovery criado pela Netflix para Microserviços

 # Procedimentos 

 - Criação do Eureka Server
-  Dependência Eureka Server - spring-cloud-netflix
- Classe main @EnableEurekaServer
- arquivo  application.yml  configuração de porta, host e Url
------------------------------------------------------------------------------------------------------------------- 
- Criação dos Spring Services
- Dependências spring web, eureka discovery client, 
- arquivo aplication properties configuração porta do serviço, nome do serviço e Url do servidor
- classe main @EnableEurekaClient instância and import do RestTemplate para comunicação entre serviços quando deseja utilizar métodos de outros microserviços com anotação @Bean , @LoadBalanced
- Partir disso construa as APIs Services como quiser
--------------------------------------------------------------------------------------------------------------------
- Todos, servidor e services startados pelo gitbash 

- Comandos de starters para server e microserviços    

             para projetos gradle -   ./gradlew bootRun

             para projetos maven  -   mvn spring-boot:run
             
             
             
********************************************************************************************************************************



# SpringBoot - Spring Cloud Microservices and Netflix Service Discovery

Development of a Spring Cloud Architecture with Eureka and Service Discovery created by Netflix for Microservices

 # Procedures

 - Creation of Eureka Server
- Eureka Server dependency - spring-cloud-netflix
- Main @EnableEurekaServer class
- application.yml port, host and Url configuration file
-------------------------------------------------- -------------------------------------------------- ---------------
- Creation of Spring Services
- Spring web facilities, eureka discovery client,
- application file properties configuration service port, service name and server url
- main class @EnableEurekaClient instance and import of RestTemplate for communication between services when you want to use methods from other microservices with @Bean, @LoadBalanced annotation
- From there build the APIs Services however you want
-------------------------------------------------- -------------------------------------------------- ----------------
- All, server and services started by gitbash

- Starter commands for servers and microservices

             for gradle projects - ./gradlew bootRun

             for maven projects - mvn spring-boot: run






