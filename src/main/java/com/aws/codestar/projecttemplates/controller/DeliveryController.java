package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.DTO.DeliveryDTO;
import com.aws.codestar.projecttemplates.model.Delivery;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

    @GetMapping
    public List<Delivery> getAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Delivery getById(@PathVariable("id") String id) {
        return null;
    }

    @PostMapping
    public Delivery create(@RequestBody Delivery delivery) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        return;
    }

    @PatchMapping("/{id}")
    public Object update(@PathVariable("id") String id, @RequestBody Delivery delivery) {
        
    	return null;
    }

    private Delivery getDeliveryFromDTO(DeliveryDTO dto) {
    	Delivery del = new Delivery();
    	del.setId(dto.getId());
    	del.setCustomer(dto.getCustomer());
    	del.setReceiver(dto.getReceiver());
    	del.setPackages(dto.getPackages());
    	return del;
    }

    private DeliveryDTO getDTOfromDelivery(Delivery dto) {    	
    	return new DeliveryDTO(dto.getCustomer(), dto.getReceiver(), dto.getPackages());
    }

    private List<Delivery> getListDeliveryFromDTO(List<DeliveryDTO> dto){
    	List<Delivery> list = new ArrayList<>();
    	for( DeliveryDTO d : dto ) {
    		list.add(getDeliveryFromDTO(d));
    	}
    	return list;
    }
}
