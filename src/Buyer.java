
public class Buyer {
    private String name;
    private String surname;
    private String mail;
    private String password;
    private String phoneNumb;
    private String address;

    public Buyer(String name, String surname, String mail, String password, String phoneNumb, String address) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.phoneNumb = phoneNumb;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public String getAddress() {
        return address;
    }
}
