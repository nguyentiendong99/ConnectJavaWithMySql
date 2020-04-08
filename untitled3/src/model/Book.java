package model;

public class Book {
    private String codebook;
    private String name;
    private String authority;
    private int quantity;

    public Book(String codebook, String name, String authority, int quantity) {
        this.codebook = codebook;
        this.name = name;
        this.authority = authority;
        this.quantity = quantity;
    }

    public Book() {
    }

    public String getCodebook() {
        return codebook;
    }

    public void setCodebook(String codebook) {
        this.codebook = codebook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return super.toString() + "book{" +
                "codebook='" + codebook + '\'' +
                ", name='" + name + '\'' +
                ", authority='" + authority + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
