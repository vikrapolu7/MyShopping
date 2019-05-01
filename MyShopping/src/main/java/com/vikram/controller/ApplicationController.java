package com.vikram.controller;

import java.util.Base64;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vikram.model.Product;
import com.vikram.model.User;
import com.vikram.service.ProductService;
import com.vikram.service.UserService;

@Controller
public class ApplicationController {
		@Autowired
		private UserService userService;
		@Autowired
		private ProductService productService;
		
		@RequestMapping("/register")
		public String registrationpage(HttpServletRequest request) {
			request.setAttribute("mode", "MODE_REGISTER");
			return "register";
					
		}
		@RequestMapping("/login")
		public String login(HttpServletRequest request) {
			request.setAttribute("mode", "MODE_LOGIN");
			System.out.println("executing this");
			return "login";
		}
		@PostMapping("/loginvalid")
		public String loginValidation(@ModelAttribute User user,BindingResult bindingResult,HttpServletRequest request) {
			User validuser = userService.findByEmailIdAndPassword(user.getEmailId(),user.getPassword());
			
			if(validuser!=null) {
				
				request.setAttribute("mode", "MODE_MAIN");
				request.setAttribute("vuser", validuser);
				Product product= productService.findById(1);
				System.out.println(product.getProductname());
				
				request.setAttribute("vproduct", product);
				return "mainpage";
			}
			else {
				request.setAttribute("error", "login unsuccessful");
				request.setAttribute("mode", "MODE_LOGIN");
				return "login";
			}
			
		}
		@PostMapping("/registeruser")
		public String registerUser(@ModelAttribute User user,BindingResult bindingResult,HttpServletRequest request){
			System.out.println("emailID"+user.getEmailId());
			userService.registerUser(user);
			request.setAttribute("mode", "MODE_LOGIN");
			return "login";
		}
		
		@RequestMapping("/product")
		public String productpage(HttpServletRequest request) {
			request.setAttribute("mode", "MODE_PRODUCT");
			System.out.println("came into product");
			return "insertproduct";
		}
		
		@PostMapping("/productsubmit")
		public String productsubmit(@ModelAttribute Product product,BindingResult bindingResult, HttpServletRequest request) {
			productService.insertImage(product);
			request.setAttribute("mode", "MODE_PRODUCT");
			return "insertproduct";
		}
	/*
	 * @PostMapping("/buynow") //public String buyproduct(@ModelAttribute Product
	 * product,BindingResult bindingResult,HttpServletRequest request) {
	 * 
	 * }
	 */
}	
