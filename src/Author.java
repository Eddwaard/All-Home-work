public class Author {
    private String firstName;
    private String lostName;

    public Author(String firstName, String lostName) {
        this.firstName = firstName;
        this.lostName = lostName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLostName() {
        return this.lostName;
    }

}
