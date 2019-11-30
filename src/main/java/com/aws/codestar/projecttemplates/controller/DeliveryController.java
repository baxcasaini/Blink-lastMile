package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.DTO.DeliveryDTO;
import com.aws.codestar.projecttemplates.model.Delivery;
import com.aws.codestar.projecttemplates.repository.DeliveryRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

    @Autowired
    private DeliveryRepository deliveryRepository;

    @GetMapping
    public List<Delivery> getAll() {
        return getListDeliveryFromDTO(deliveryRepository.findAll());
    }

    @GetMapping("/{id}")
    public Delivery getById(@PathVariable("id") String id) {
        return getDeliveryFromDTO(deliveryRepository.findById(id).get());
    }

    @PostMapping
    public Delivery create(@RequestBody Delivery delivery) {
        return getDeliveryFromDTO(deliveryRepository.insert(getDTOfromDelivery(delivery)));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        deliveryRepository.deleteById(id);
    }

    @PatchMapping("/{id}")
    public Delivery update(@PathVariable("id") String id, @RequestBody Delivery delivery) {
        DeliveryDTO deliveryUp = deliveryRepository.findById(id).get();
        if(delivery.getCustomer() != null)
        	deliveryUp.setCustomer(delivery.getCustomer());
        if(delivery.getReceiver() != null)
        	deliveryUp.setReceiver(delivery.getReceiver());
        if(delivery.getPackages() != null)
        	deliveryUp.setPackages(delivery.getPackages());
        
    	return getDeliveryFromDTO(deliveryRepository.save(deliveryUp));
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
