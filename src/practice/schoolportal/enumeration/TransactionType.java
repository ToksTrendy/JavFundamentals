package practice.schoolportal.enumeration;

public enum TransactionType {
    INTRA_TRANSFER("Fund movement from bank to another bank", "Intra transfer"),
    INTER_TRANSFER("Fund movement within the same bank", "inter transfer"),
    WITHDRAW("Withdraw from account", "Withdraw"),
    AIRTIME("Top up airtime", "Airtime"),
    FUND("Deposit into an account", "Deposit");

    private final String description;
    private String name;

    TransactionType(String description, String name) {
        this.description = description;
        this.name = name;
    }
}
