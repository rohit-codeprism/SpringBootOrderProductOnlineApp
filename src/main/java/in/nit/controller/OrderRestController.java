package in.nit.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.nit.dto.OrderDTO;

@RestController
public class OrderRestController {

	@PostMapping("/purchase")
	public String placeOrder(@RequestBody OrderDTO orderDTO) 
	{
		return "HI"+ orderDTO.getUserName() + "your order for "+orderDTO.getProductName()+"with amount"+orderDTO.getAmount()+ "placed successfully....";
	}
}
