public class IdGenerator {
    private static long next = 1;

    public static synchronized long nextId() {
        return next++;
    }

    public static void main(String[] args) {
        System.out.println(IdGenerator.nextId()); // 1
        System.out.println(IdGenerator.nextId()); // 2
        System.out.println(IdGenerator.nextId()); // 3
    }
}