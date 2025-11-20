public final class Email {
    private final String value;

    public Email(String value) {
        if (value == null || !value.contains("@"))
            throw new IllegalArgumentException("Email invalide");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static void main(String[] args) {
        Email e = new Email("nassour@example.com");
        System.out.println(e);
    }
}