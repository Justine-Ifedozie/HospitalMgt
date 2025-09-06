package controllers;

import dtos.requests.AddDrugRequest;
import dtos.responses.AddDrugResponse;
import services.PharmacistService;

public class PharmacistController {

    private final PharmacistService pharmacistService = new PharmacistService();

    public AddDrugResponse recordNewDrug(AddDrugRequest addDrugRequest){
        return pharmacistService.addDrug(addDrugRequest);
    }
}
