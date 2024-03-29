/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cl.jorcarca.designpatterns;

import java.util.logging.Logger;

public class App {
    private static Logger logger = Logger.getLogger(App.class.getSimpleName());

    public String greetings() {
        return new StringBuilder().append("Hello world from ").append(this.getClass().getSimpleName()).toString();
    }

    public static void main(String[] args) {
        logger.info(new App().greetings());
    }
}