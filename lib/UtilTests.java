/**
 * This class includes a bunch of static methods to help with testing
 */
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
public class UtilTests {
    
    /**
     * Returns whether the given class has a declared field with the given name
     * @param classInstance: the class
     * @param name: the name of the field
     * @return the result
     */
    static boolean classHasField(Class<?> classInstance, String name) {
        return classHasField(classInstance, name, false);
    }

    /**
     * Returns whether the given class has a field with the given name
     * @param classInstance: the class
     * @param name: the name of the field
     * @param declaredOnly: consider only declared members
     * @return the result
     */
    static boolean classHasField(Class<?> classInstance, String name, boolean declaredOnly) {
        Field[] fields = (declaredOnly ? classInstance.getDeclaredFields() : classInstance.getFields());
        for (Field field: fields) {
            if (field.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns whether the given class has a public declared field with the given name
     * @param classInstance: the class
     * @param name: the name of the field
     * @return the result
     */
    static boolean classHasPublicField(Class<?> classInstance, String name) {
        return classHasPublicField(classInstance, name, false);
    }

    /**
     * Returns whether the given class has a public field with the given name
     * @param classInstance: the class
     * @param name: the name of the field
     * @param declaredOnly: consider only declared members
     * @return the result
     */
    static boolean classHasPublicField(Class<?> classInstance, String name, boolean declaredOnly) {
        Field[] fields = (declaredOnly ? classInstance.getDeclaredFields() : classInstance.getFields());
        for (Field field: fields) {
            if (field.getName().equals(name)) {
                return Modifier.isPublic(field.getModifiers());
            }
        }
        return false;
    }

    /**
     * Returns whether the given class has a private declared field with the given name
     * @param classInstance: the class
     * @param name: the name of the field
     * @return the result
     */
    static boolean classHasPrivateField(Class<?> classInstance, String name) {
        System.out.println("XXX trying private");
        Field[] fields = classInstance.getDeclaredFields();
        for (Field field: fields) {
            System.out.println("Trying field " + field);
            if (field.getName().equals(name)) {
                return Modifier.isPrivate(field.getModifiers());
            }
        }
        return false;
    }


}
