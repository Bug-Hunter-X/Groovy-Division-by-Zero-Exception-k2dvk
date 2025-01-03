```groovy
class MyClass {
    def myMethod() {
        def x = 10
        def y = 0
        try {
            def result = x / y
            println result
        } catch (groovy.lang.GroovyRuntimeException e) {
            println "Error: Division by zero. ${e.message}"
        }
    }
}

new MyClass().myMethod()
```