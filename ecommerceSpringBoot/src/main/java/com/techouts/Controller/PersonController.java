package com.techouts.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techouts.Repository.CartRepository;
import com.techouts.Repository.OrderRepository;
import com.techouts.Repository.PersonRepository;
import com.techouts.Repository.ProductRepository;
import com.techouts.model.CartList;
import com.techouts.model.OrderList;
import com.techouts.model.Person;
import com.techouts.model.ProductList;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import jakarta.validation.metadata.MethodType;

@Controller
public class PersonController {
	@Autowired
	PersonRepository personRepository;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	CartRepository cartRepository;
	@Autowired
	OrderRepository orderRepository;

//RegisterPage controller 
	@GetMapping("/Register")
	public String reg(Person person) {
		System.out.println("Hii");
		return "Register";
	}

//After Registration validating con
	@RequestMapping(value="/addcustomer", method= {RequestMethod.POST,RequestMethod.GET})
	public String addUser(@Valid Person person, BindingResult result, Model model) {
		try {
			if (result.hasErrors()) {}

			personRepository.save(person);
			return "loginPage";
		} catch (Exception e) {
			model.addAttribute("Error", "this username is already available go with login ");
			return "Register";
		}
	}
//Login page Controller

	@GetMapping("/loginPage")
	public String log() {
		return "Login";
	}
//Login Validation Controller

	@GetMapping("/Login")
	public String Login(@Valid Person person, BindingResult result, Model model,
			@RequestParam(value = "userName", required = false) String userName,
			@RequestParam(value = "password", required = false) String password, HttpServletRequest request) {
		try {
			Person person1 = (Person) personRepository.findByUserName(userName);
			String ss = person1.getPassword();
			System.out.println(ss);
			if (person1.getPassword().equals(password)) {
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("userName", userName);
				return "redirect:products";
			} else {
				model.addAttribute("Error", "invalid credentials");
				return "loginPage";

			}

		} catch (Exception e) {
			model.addAttribute("Error", "invalid credentials");
			return "Login.html";

		}

	}

	@PostMapping("/save")
	public String save(ProductList productList) {
		productRepository.save(productList);
		return "saved";
	}

	// This controller is for getting data from product table
	@GetMapping("/products")
	public String products(Model model) {
		System.out.println("products");
		List<ProductList> products = productRepository.findAll();
		System.out.println(products);
		model.addAttribute("products", products);
		return "products";
	}

//This controller is user for displaying product List 
	@GetMapping("/showFormForUpdate")
	public String updateForm(@RequestParam(value = "tablename", required = false) String tablename, Model model) {
		List<ProductList> products = productRepository.findBytableName(tablename);
		model.addAttribute("products", products);
		return "productPlp";
	}

//This controller is used for displaying product description
	@GetMapping("/showPdpPages")
	public String showForm(@RequestParam(value = "productId", required = false) int productId, Model model) {
		ProductList products = productRepository.findByProductId(productId);
		model.addAttribute("products", products);
		return "prooductPdp";
	}

//this controller is used for displaying header
	@GetMapping("/header")
	public String headers() {
		return "Header";
	}

//this controller is for diaplaying footer
	@GetMapping("/footer")
	public String footer() {
		return "footer";
	}

//this controller is used for inserting data in to cart table
	@RequestMapping(value = "/cart", method = { RequestMethod.POST, RequestMethod.GET })
	public String addCart(@RequestParam(value = "productId", required = false) int productId, Model model,
			HttpSession session) {
		ProductList products = productRepository.findByProductId(productId);
		String username = (String) session.getAttribute("userName");
		if (username != null) {
			CartList cartList = new CartList();
			cartList.setProductId(products.getProductId());
			cartList.setColor(products.getProductColor());
			cartList.setProductCost(products.getProductCost());
			cartList.setProductDescription(products.getProductDescription());
			cartList.setProductImage(products.getProductImage());
			cartList.setTablename(products.getTablename());
			cartList.setUsername(username);
			cartRepository.save(cartList);
			return "redirect:products";
		} else {
//		
			return "Login";
		}
	}

	// this controller is used for inserting data into order tble
	@PostMapping("/order")
	public String addOrders(@RequestParam(value = "productId", required = false) int productId, Model model,
			HttpSession session) {
		ProductList products = productRepository.findByProductId(productId);
		String username = (String) session.getAttribute("userName");
		if (username != null) {
			OrderList orderList = new OrderList();
			orderList.setProductId(products.getProductId());
			orderList.setColor(products.getProductColor());
			orderList.setProductCost(products.getProductCost());
			orderList.setProductDescription(products.getProductDescription());
			orderList.setProductImage(products.getProductImage());
			orderList.setTablename(products.getTablename());
			orderList.setUsername(username);
			orderRepository.save(orderList);
			return "redirect:products";
		} else {
//		
			return "Login";
		}
	}

	// Order confirmation page
	@GetMapping("/showConfirmationPage")
	public String showConfirmForm(@RequestParam(value = "productId", required = false) int productId, Model model) {
		ProductList products = productRepository.findByProductId(productId);
		model.addAttribute("products", products);
		return "OrderConfirmation";
	}

	@GetMapping("/orderList")
	public String orderList(Model model, HttpSession session) {
		String userName = (String) session.getAttribute("userName");
		System.out.println(userName);
		if (userName != null) {
			List<OrderList> orderList = orderRepository.findByUserName(userName);
			System.out.println(orderList);
			model.addAttribute("orderList", orderList);
			if (orderList.size() > 0) {
				return "OderList";
			} else {
				return "Empty.html";
			}

		} else {
			return "Login";
		}
	}

	@GetMapping("/cartList")
	public String cartList(Model model, HttpSession session) {
		String userName = (String) session.getAttribute("userName");
		if (userName != null) {
			List<CartList> cartList = cartRepository.findByUserName(userName);
			model.addAttribute("cartList", cartList);
			if (cartList.size() > 0) {
				return "CartList";
			} else {
				return "Empty.html";
			}

		} else {
			return "Login";
		}
	}

	@RequestMapping(value = "/checkout", method = { RequestMethod.DELETE, RequestMethod.POST, RequestMethod.GET })
	public String checkOut(@RequestParam(value = "productId", required = false) int productId, Model model) {
		cartRepository.deleteById(productId);
		ProductList products = productRepository.findByProductId(productId);
		model.addAttribute("products", products);
		return "OrderConfirmation";

	}

	@RequestMapping("/Logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:products";

	}

}
