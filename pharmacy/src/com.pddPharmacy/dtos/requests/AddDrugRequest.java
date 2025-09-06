package dtos.requests;

import data.models.Category;
import data.models.Type;
import data.repositories.Drugs;

import java.time.LocalDate;

public class AddDrugRequest {

    private String name;
    private Category category;
    private Type type;
    private LocalDate expiry;
    private LocalDate manufacturedOn;
    private int quantity;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
