package data.models;


import data.repositories.Drugs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrugsTest {

    Drugs drugs;

    @BeforeEach
    public void setUp() {
        drugs = new Drugs();
        drugs.clear();
    }

    @Test
    public void test_addDrug_drugsCountIsOne() {
        Drug panadol = new Drug();
        drugs.save(panadol);
        assertEquals(1, drugs.count());
    }

    @Test
    public void test_addDrug_sameDrugIsReturned(){
        Drug panadol = new Drug();
        Drug returnedDrug = drugs.save(panadol);
        assertEquals(returnedDrug, panadol);
    }

    @Test
    public void test_addedDrug_canBeFoundById(){
        Drug panadol = new Drug();
        Drug drug1 = drugs.save(panadol);
        Drug foundDrug = drugs.findById(panadol.getId());
        assertEquals(foundDrug, drug1);
    }

    @Test
    public void test_twoDrugsAdded_canBeFoundById(){
        Drug panadol = new Drug();
        Drug drug1 = drugs.save(panadol);
        assertEquals(1, drugs.count());

        Drug paracetamol = new Drug();
        Drug drug2 = drugs.save(paracetamol);
        assertEquals(2, drugs.count());

        assertEquals(drugs.findById(panadol.getId()), drug1);
        assertEquals(drugs.findById(paracetamol.getId()), drug2);
    }

    @Test
    public void test_addSameDrugTwice_countIsOne(){
        Drug panadol = new Drug();
        Drug savedPanadol = drugs.save(panadol);

        assertEquals(1, drugs.count());

        drugs.save(savedPanadol);
        assertEquals(1, drugs.count());
    }

    @Test
    public void test_addTwoDrugs_findDrugByName_returnsSameDrug(){
        Drug panadol = new Drug();
        drugs.save(panadol);
        panadol.setName("Panadol");

        Drug foundDrug = drugs.findByName("Panadol");
        assertEquals(foundDrug,  panadol);
    }

    @Test
    public void test_addTwoDrugs_deleteOneById_countIsOne(){
        Drug panadol = new Drug();
        drugs.save(panadol);

        Drug paracetamol = new Drug();
        drugs.save(paracetamol);
        assertEquals(2L, drugs.count());

        drugs.deleteById(panadol.getId());
        assertEquals(1L, drugs.count());
    }

    @Test
    public void test_addTwoDrugs_deleteOneByEntity_countIsOne(){
        Drug panadol = new Drug();
        drugs.save(panadol);

        Drug paracetamol = new Drug();
        drugs.save(paracetamol);
        assertEquals(2L, drugs.count());

        drugs.delete(panadol);
        assertEquals(1L, drugs.count());
    }

}