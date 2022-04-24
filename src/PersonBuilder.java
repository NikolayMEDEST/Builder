public class PersonBuilder {


    protected String address;
    protected int age;
    protected boolean hasAge;
    protected String name;
    protected String surname;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Указан неверный возраст");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }


    public Person build() throws IllegalStateException {

        if (this.name == null && this.surname == null) {
            throw new IllegalStateException("Недостаточно данных для создания пользователя");
        }

        if (age > -1) {
            return new Person(this.name, this.surname, this.age);
        }
        return new Person(this.name, this.surname);

    }


}
