package services;

import data.models.Drug;
import data.repositories.Drugs;
import dtos.requests.AddDrugRequest;
import dtos.responses.AddDrugResponse;
import static utils.Mapper.map;


public class pharmacistService {

    private final Drugs drugs = new Drugs();

    public AddDrugResponse addDrug(AddDrugRequest addDrugRequest) {
        Drug drug = new Drug();
        map(addDrugRequest, new Drug());
        drugs.save(drug);
        return map(drug);
    }
}
