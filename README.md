# Spring Dependency Injection Exercises

This repository contains exercises related to Spring dependency injection. Each exercise explores different aspects of dependency injection using annotations such as `@Autowired`, `@Qualifier`, `@Primary`, and interface-based injection.

## Exercise Descriptions:

1. **Interface-based Injection Exercise**
    - Explore how dependencies can be injected using both interface and implementation types.
    - Investigate any peculiarities or unexpected behavior when referencing a dependency with a different type than it was defined with.

2. **Final Field Injection Exercise**
    - Attempt to use `@Autowired` injection on a field that is marked as final.
    - Observe the behavior of Spring when injecting dependencies into final fields.

3. **Bean Injection without @Qualifier Exercise**
    - Try to inject a correct bean without using the `@Qualifier` annotation.
    - Explore an alternative approach to specifying which bean to inject when there are multiple candidates of the same type.

4. **Dependency Injection by Guru SpringFramework**
    - Utilize the examples and exercises provided by Guru SpringFramework to deepen your understanding of Spring dependency injection.

## Question Descriptions:

## Tradeoffs of Different Approaches to Injecting Beans

**Explanation:** 
Different approaches to injecting beans in Spring come with their own tradeoffs in terms of flexibility, complexity, and maintainability. Constructor injection, setter injection, and field injection each have their own advantages and disadvantages.

- **Constructor Injection:** 
  - Advantages: Explicit dependencies, immutability, better for testing.
  - Disadvantages: Requires defining a constructor for each dependency, more verbose.

- **Setter Injection:** 
  - Advantages: Flexibility in setting dependencies, optional dependencies.
  - Disadvantages: More verbose than field injection, setters may be called multiple times.

- **Field Injection:** 
  - Advantages: Concise syntax, no need to write getters/setters.
  - Disadvantages: Breaks encapsulation, difficult to unit test, hidden dependencies.

**Tradeoffs:** 
- Constructor injection is considered the best practice for most scenarios due to its explicitness and immutability, but it can lead to verbose code.
- Setter injection provides flexibility but can lead to multiple calls to setters, making it less predictable.
- Field injection is concise but breaks encapsulation and makes testing more difficult.

## Need for @Qualifier when Multiple of the Same Type are Defined

**Explanation:** 
When multiple beans of the same type are defined in the Spring application context, Spring may not know which bean to inject by default. In such cases, you need to use the `@Qualifier` annotation to specify exactly which bean should be injected.

**Why Use @Qualifier:** 
- `@Qualifier` helps to disambiguate between beans of the same type.
- It allows you to specify the exact bean name or qualifier value to be injected.

## Avoiding Loading of Heavy Beans on Startup

**Explanation:** 
Loading heavy beans, such as caches or beans with heavy initialization logic, during application startup can increase the startup time and impact the application's performance. To avoid this, you can delay the initialization of such beans until they are actually needed.

**Strategies to Avoid Loading Heavy Beans on Startup:**
- **Lazy Initialization:** Mark heavy beans as lazy-initialized, so they are only instantiated when they are first accessed.
- **Asynchronous Initialization:** Load heavy beans asynchronously to allow the application to start quickly and continue initializing other beans while heavy beans are loading in the background.
- **Conditional Loading:** Use conditions or profiles to control when heavy beans are loaded based on specific criteria, such as environment or configuration.

## Spring Lifecycle Stages and Methods

**Explanation:** 
Spring beans go through various lifecycle stages, from creation to destruction, during their lifecycle. Each stage provides hooks for executing custom logic using lifecycle callback methods.

**Spring Bean Lifecycle Stages:**
1. **Initialization Phase:**
   - Bean instantiation
   - Dependency injection
   - Custom initialization methods (`@PostConstruct`, `InitializingBean`)
2. **Runtime Phase:**
   - Bean usage and interaction with other beans
3. **Destruction Phase:**
   - Custom destruction methods (`@PreDestroy`, `DisposableBean`)
   - Bean destruction (when the application context is closed)

**Lifecycle Callback Methods:**
- **Initialization Callbacks:**
  - `@PostConstruct` annotated method
  - Implementing `InitializingBean` interface
- **Destruction Callbacks:**
  - `@PreDestroy` annotated method
  - Implementing `DisposableBean` interface

---

These exercises aim to enhance your understanding of Spring dependency injection concepts and help you become proficient in managing bean dependencies effectively.
