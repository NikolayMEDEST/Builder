import java.util.OptionalInt;

public class Person {


    protected String address;
    protected int age;
    protected boolean hasAge;

    protected final String name;
    protected final String surname;
    //...

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        if (age > -1) {
            return true;
        }
        return false;
    }

    public boolean hasAddress() {
        if (address != null) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (age > -1) {
            age++;
        }
    }

    @Override
    public String toString() {
        if (this.surname == null) {
            return name + " c неизвестной фамилией";
        }
        return name + " " + surname;
    }

    @Override
    public int hashCode() {
        // пока не понимаю, зачем здесь нужно хэш код переопределять
        return 15;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder();
    }

}
