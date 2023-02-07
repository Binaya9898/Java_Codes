public class GenericConstructor<t> {
    GenericConstructor(t get){
        System.out.println("I get "+ get);
    }

    public static void main(String[] args) {
        new GenericConstructor<>("String");
        new GenericConstructor<>(123);
    }
}

