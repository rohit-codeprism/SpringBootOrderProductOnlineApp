package in.nit.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {

	@PostMapping("/purchase/{userName}/{amount}/{userName}")
	public String placeOrder(@PathVariable String userName , @PathVariable Double amount, @PathVariable String  productName)
	{
		return "HI"+ userName + "your order for "+productName+"with amount"+amount;
	}
}
