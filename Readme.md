# Advanced JPA

We will lokk into **JPA Mapping** and **JPA Inheritance**.

## JPA Inheritance

In Spring Boot with JPA/Hibernate, inheritance mapping allows you to store and query entities that share common fields 
and behavior in an object-oriented way while persisting them efficiently in relational databases.

JPA supports three main inheritance strategies:
1. **SINGLE_TABLE** – All classes in the hierarchy are stored in one table (fastest, but can have many nullable columns).
2. **JOINED** – Each subclass has its own table, joined with the parent table (normalized, but more joins).
3. **TABLE_PER_CLASS** – Each subclass has its own table with all fields (no joins, but data duplication).


### Rules of JPA Inheritance

**Parent class must be an Entity class or a Mapped Super Class.** 

Parent class must use either 
`@Entity` and `@MappedSuperClass` annotation.

```java
import jakarta.persistence.Entity;

@Entity
public abstract class Base {
    private String message;
}
```

```java
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Base {
    private String message;
}
```

When using `@MappedSuperclass`
- No table is created or mapped for this
- Only used for property inheritance
    

**All child classess must be Entity classes**

**Inheritance Stratergy must be declared in the root**

Use `@Inheritance` annotation to mark Entity inheritance.

```java
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {
    
}
```
