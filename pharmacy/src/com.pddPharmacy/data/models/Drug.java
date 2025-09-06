package data.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Drug {
    private int id;
    private String name;
    private LocalDate expiry;
    private LocalDate manufacturedOn;
    private LocalDateTime dateAdded = LocalDateTime.now();
    private Type type;
    private Category category;
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpiry() {
        return expiry;
    }

    public void setExpiry(LocalDate expiry) {
        this.expiry = expiry;
    }

    public LocalDate getManufacturedOn() {
        return manufacturedOn;
    }

    public void setManufacturedOn(LocalDate manufacturedOn) {
        this.manufacturedOn = manufacturedOn;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}






