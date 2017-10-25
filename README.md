# design-patterns
List of design patterns template

## Tecnologies

* Java 8
* Spring Boot
* Maven 3
  * Release plugin
  * FindBugs plugin
* JUnit

## Builds

To generate local builds with maven:
```bash
 mvn clean install
``` 
To generate versioned builds for production and homologation enviroments:
```
  mvn release:clean
  mvn release:prepare
```

## Design Pattern List

* Observer
* Decorator
* Factory
* Singleton
* Command
* Adapter
* Facade
* Template
* Iterator
* Composite
* State
* Proxy
