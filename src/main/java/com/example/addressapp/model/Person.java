package com.example.addressapp.model;



import javafx.beans.property.*;
import com.example.addressapp.util.LocalDateAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

public class Person {
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final ObjectProperty<LocalDate> birthday;

    public Person(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.birthday = new SimpleObjectProperty<>(LocalDate.of(1999, 2, 21));
    }

    // Геттеры, сеттеры и свойства
    public String getFirstName() { return firstName.get(); }
    public void setFirstName(String firstName) { this.firstName.set(firstName); }
    public StringProperty firstNameProperty() { return firstName; }

    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getBirthday() { return birthday.get(); }
    public void setBirthday(LocalDate birthday) { this.birthday.set(birthday); }
    public ObjectProperty<LocalDate> birthdayProperty() { return birthday; }
}
