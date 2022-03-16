package Memento;

public class UserCard implements SoldCard {
    private String surname;
    private String lastname;
    private int id;
    private String birthday;
    private String city;
    private float sold;

    public UserCard(String surname,String lastname, int id, String birthday, String city, float sold) {
        super();
        this.surname = surname;
        this.lastname = lastname;
        this.id = id;
        this.birthday = birthday;
        this.city = city;
        this.sold = sold;
    }

    public String getSurName() {
        return surname;
    }

    public void setSurName(String surname) {
        this.surname = surname;
    }
    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    @Override
    public Memento save() {
        return new UserMemento(sold);
    }

    @Override
    public void restore(Memento memento) {
        this.sold = memento.getSold();
    }

    @Override
    public String toString() {
        return "User Card: \n Name = " + lastname +" "+ surname +", id = " + id + ", Birthday" +
                " = " + birthday + ", City = " + city + ", Sold = "
                + sold + "]";
    }
}
