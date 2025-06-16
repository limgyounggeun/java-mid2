package generic.test.ex3;

public class GenericMethod {

    public static Object objMethod(Object obj){
        System.out.println("Object print : " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t){
        System.out.println("genericMethod print : " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t){
        System.out.println("numberMethod print : " + t);
        return t;
    }
}
