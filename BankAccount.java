public class BankAccount {
    private final String iban;
    private long balanceInCents;

    public BankAccount(String iban, long initialBalanceInCents) {
        if (iban == null || iban.isBlank()) throw new IllegalArgumentException("IBAN invalide");
        if (initialBalanceInCents < 0) throw new IllegalArgumentException("Solde initial négatif");
        this.iban = iban;
        this.balanceInCents = initialBalanceInCents;
    }

    public void deposit(long amountInCents) {
        if (amountInCents <= 0) throw new IllegalArgumentException("Montant ≤ 0");
        balanceInCents += amountInCents;
    }

    public void withdraw(long amountInCents) {
        if (amountInCents <= 0) throw new IllegalArgumentException("Montant ≤ 0");
        if (amountInCents > balanceInCents) throw new IllegalArgumentException("Solde insuffisant");
        balanceInCents -= amountInCents;
    }

    public long getBalanceInCents() {
        return balanceInCents;
    }

    public String getFormattedBalance() {
        return String.format("%.2f DH", balanceInCents / 100.0);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("FR7612345678901234567890123", 100000);
        acc.deposit(50000);
        acc.withdraw(20000);
        System.out.println("Solde = " + acc.getFormattedBalance());
    }
}