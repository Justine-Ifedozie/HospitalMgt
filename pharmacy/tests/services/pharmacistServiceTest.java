package services;

import data.models.Category;
import data.models.Type;
import data.repositories.Drugs;
import dtos.requests.AddDrugRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class pharmacistServiceTest {

    Drugs drugs;
    pharmacistService pharmacistService;

    @BeforeEach
    void setUp() {
        drugs = new Drugs();
        pharmacistService = new pharmacistService();
    }

    @Test
    public void test_addDrug_drugsCountIsOne() {
        assertEquals(0L, drugs.count());
        AddDrugRequest panadolRequest = new AddDrugRequest();

        panadolRequest.setName("Panadol");
        panadolRequest.setCategory(Category.TABLET);
        panadolRequest.setType(Type.MULTIVITAMIN);
        panadolRequest.setManufacturedOn(LocalDate.of(2025, 9, 6));
        panadolRequest.setExpiry(panadolRequest.getManufacturedOn().plusMonths(8));
        panadolRequest.setQuantity(4);

        pharmacistService.addDrug(panadolRequest);
        assertEquals(1, drugs.count());
    }

}