import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflexao {

    private static void listarAtributos(Class<?> clazz) {
        System.out.println("Atributos:");
        Class<?> atual = clazz;
        while (atual != null) {
            for (Field field : atual.getDeclaredFields()) {
                System.out.println("- " + field.getName() + " (" + field.getType().getSimpleName() + ")");
            }
            atual = atual.getSuperclass();
        }
    }

    private static void listarMetodos(Class<?> clazz) {
        System.out.println("\nMétodos:");
        Class<?> atual = clazz;
        while (atual != null) {
            for (Method method : atual.getDeclaredMethods()) {
                System.out.println("- " + method.getName());
            }
            atual = atual.getSuperclass();
        }
    }

    public static void analisarObjeto(Object obj) {
        Class<?> clazz = obj.getClass();
        System.out.println("Classe: " + clazz.getName() + "\n");

        listarAtributos(clazz);
        listarMetodos(clazz);
    }
}
