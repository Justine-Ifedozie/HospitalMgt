package data.repositories;

import data.models.Drug;

import java.util.ArrayList;
import java.util.List;

public class Drugs {
    private final static List<Drug> drugs = new ArrayList<>();

    public Drug save(Drug drug) {
        boolean drugIsNew = drug.getId() == 0;
        if (drugIsNew) saveNew(drug);
        else update(drug);
        return drug;
    }

    public long count() {
        return drugs.size();
    }

    public Drug findById(int id) {
        return drugs.get(id - 1);
    }

    public void deleteById(int id) {
        Drug drug = findById(id);
        drugs.remove(drug);
    }

    public void delete(Drug drug) {
        deleteById(drug.getId());
    }

    private void update(Drug drug) {
        delete(drug);
        drugs.add(drug);
    }

    private void saveNew(Drug drug) {
        drug.setId(generatedId());
        drugs.add(drug);
    }

    private int generatedId() {
        return drugs.size() + 1;
    }


    public void clear() {
        drugs.clear();
    }

    public Drug findByName(String drugName) {
        for (Drug drug : drugs) {
            if (drug.getName().equals(drugName)) return drug;

        }
        return null;
    }
}
