package Bank;

// Defines an enum for account types
public enum AccountType {
    SAVINGS("Savings"), // Account type "Savings"
    CREDIT("Credit");  // Account type "Credit"

    private final String typeName; // Private field to store the account type name

    // Constructor for enum elements
    private AccountType(String typeName) {
        this.typeName = typeName; // Initialize the account type name field
    }

    // Method to get the account type name
    public String getTypeName() {
        return typeName; // Returns the account type name
    }
}
