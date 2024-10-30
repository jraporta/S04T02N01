package cat.itacademy.s04.t02.n01.model;

import jakarta.persistence.*;

@Entity
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int quantityKilograms;


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantityKilograms() {
        return quantityKilograms;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantityKilograms(int quantityKilograms) {
        this.quantityKilograms = quantityKilograms;
    }

}
