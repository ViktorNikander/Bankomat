package Person;

public abstract class Person {
    private String name;
    private String SocialSecurityNumber;

    public Person(String name, String socialSecurityNumber) {
        this.name = name;
        SocialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        SocialSecurityNumber = socialSecurityNumber;
    }
}
