public class HelloWorld {
    public static String hello(String name) {
        if (name != null && !name.isEmpty()) {
            return "Hello, ".concat(name).concat("!");
        } else {
            return "Hello, World!";
        }
    }
}
