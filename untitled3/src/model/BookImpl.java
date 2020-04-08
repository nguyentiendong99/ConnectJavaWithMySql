package model;

public class BookImpl extends Book {
    private String code;
    private String typebook;

    public BookImpl(String codebook, String name, String authority, int quantity, String code, String typebook) {
        super(codebook, name, authority, quantity);
        this.code = code;
        this.typebook = typebook;
    }

    public BookImpl(String code, String typebook) {
        this.code = code;
        this.typebook = typebook;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTypebook() {
        return typebook;
    }

    public void setTypebook(String typebook) {
        this.typebook = typebook;
    }

    public BookImpl(String codebook, String name, String authority, int quantity) {
        super(codebook, name, authority, quantity);
    }

    @Override
    public String toString() {
        return super.toString() + "bookImpl{" +
                "code='" + code + '\'' +
                ", typebook='" + typebook + '\'' +
                '}';
    }
}
