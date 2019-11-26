package ksb2hwk9mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document //must have dla nierelacyjnych baz danych
public class Toy {

    @Id  // @Id must have
    private String id;
    private String  name;
    private ToyType ToyType;

    public Toy() {
    }
//String id, nie potrzebujemy bo za id odpowiada baza danych
    public Toy(String name, ksb2hwk9mongodb.ToyType toyType) {
        //this.id = id;
        this.name = name;
        ToyType = toyType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ksb2hwk9mongodb.ToyType getToyType() {
        return ToyType;
    }

    public void setToyType(ksb2hwk9mongodb.ToyType toyType) {
        ToyType = toyType;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", ToyType=" + ToyType +
                '}';
    }
}
