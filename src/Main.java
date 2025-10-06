import java.util.Properties;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Java Version " + System.getProperty("java.version"));
        String str = System.getProperty("os.name").toLowerCase();
        if(str.contains("win")){
            System.out.println("Portable");
        }
        else{
            System.out.println("Not Portable");
        }

        System.out.println(Runtime.getRuntime().availableProcessors());

        Properties props = System.getProperties();
        props.stringPropertyNames().stream()

                .filter(key -> key.startsWith("java"))
                .sorted()
                .forEach(key -> System.out.println(key + " = " + props.getProperty(key)));

        System.gc();

        Thread t1 = new Thread(() -> System.out.println("Thread 1"));
        Thread t2 = new Thread(() -> System.out.println("Thread 2"));
        t1.start();
        t2.start();

        String st = "My @#$%name i@#$%^ s Rahul123456";

        System.out.println(st.replaceAll("[0-9A-Za-z]",""));    


    }
}