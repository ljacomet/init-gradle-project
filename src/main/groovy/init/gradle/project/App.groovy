/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package init.gradle.project

class App {
    String getGreeting() {
        return 'Hello world.'
    }

    static void main(String[] args) {
        println new App().greeting
    }
}
