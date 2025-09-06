package utils;

import data.models.Drug;
import dtos.requests.AddDrugRequest;
import dtos.responses.AddDrugResponse;

public class Mapper {

    public static AddDrugResponse map(Drug drug){
        AddDrugResponse addDrugResponse = new AddDrugResponse();
        addDrugResponse.setDrugId(drug.getId());
        addDrugResponse.setDrugName(drug.getName());
        return addDrugResponse;
    }

    public static void map(AddDrugRequest drugRequest, Drug drug){
        drug.setName(drugRequest.getName());
        drug.setCategory(drugRequest.getCategory());
        drug.setType(drugRequest.getType());
        drug.setExpiry(drugRequest.getExpiry());
        drug.setManufacturedOn(drugRequest.getManufacturedOn());
        drug.setQuantity(drugRequest.getQuantity());
    }
}
