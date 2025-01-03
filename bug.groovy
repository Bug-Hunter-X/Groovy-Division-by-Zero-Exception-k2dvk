```groovy
class MyClass {
    def myMethod() {
        def x = 10
        def y = 0
        def result = x / y // This will throw a groovy.lang.GroovyRuntimeException: Cannot divide by zero
        println result
    }
}

new MyClass().myMethod()
```