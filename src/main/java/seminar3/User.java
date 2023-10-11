package seminar3;

public class User {
    private String name;
    private String surname;
    private String patronymic;
    private String dateOfBirth;
    private long phoneNumber;
    private char sex;

    public User(String name, String surname, String patronymic, String dateOfBirth, long phoneNumber, char sex) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void printInfo() throws NullPointerException{
        try {
            System.out.printf("%s %s %s %s %d %s", surname, name, patronymic, dateOfBirth, phoneNumber, sex);
        } catch (NullPointerException e) {
            System.out.println("Введены не корректные данные, исправьте ошибки приведенные выше");
        }
    }
}
