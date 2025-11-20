public class Temperature {
    private double value;

    public Temperature(double value) {
        setValue(value);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value < -273.15) throw new IllegalArgumentException("Température inférieure au zéro absolu !");
        this.value = value;
    }

    public static void main(String[] args) {
        Temperature t = new Temperature(25.5);
        System.out.println("OK : " + t.getValue());

        try {
            new Temperature(-300);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception capturée : " + e.getMessage());
        }
    }
}