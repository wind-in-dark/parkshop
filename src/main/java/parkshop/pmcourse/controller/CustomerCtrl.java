package parkshop.pmcourse.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerCtrl {

	/*
	 * cart
	 Search Product
	View Product Page
	Add Cart
	Add Favorite
	Add Favorite Shop or Product 
	Add cart
	Delete Product from Cart
	Modify Product Quantity

	 */
	// customer add goods into their own shop cart
	@GetMapping("/cart/add/{goodsId}")
    public String addGoodsIntoCart(@PathVariable int goodsId,HttpServletRequest request, Model model) {
		return null;
	}
	@GetMapping("/cart/remove/{goodsId}")
	public String removeGoodsFormCart(@PathVariable int goodsId,HttpServletRequest request, Model model) {
		return null;
	}
	// Modify Product Quantity
	@PostMapping("/cart/modify/{goodsId}")
	public String modifyGoodsFormCart(@PathVariable int goodsId,HttpServletRequest request, Model model) {
		return null;
	}
	// balance(结算购物车) their cart
	@GetMapping("/cart/delete/{goodsId}")
	public String balanceCart(@PathVariable int goodsId,HttpServletRequest request, Model model) {
		return null;
	}
	/*
	 * Favorite
	 */
	@GetMapping("/favorite/goods/add/{goodsId}")
	public String addFavoriteGoods(@PathVariable int goodsId,HttpServletRequest request, Model model) {
		return null;
	}
	@GetMapping("/favorite/goods/remove/{goodsId}")
	public String removeFavoriteGoods(@PathVariable int goodsId,HttpServletRequest request, Model model) {
		return null;
	}
	@GetMapping("/favorite/shop/remove/{goodsId}")
	public String addFavoriteShop(@PathVariable int goodsId,HttpServletRequest request, Model model) {
		return null;
	}
	@GetMapping("/favorite/shop/remove/{goodsId}")
	public String removeFavoriteShop(@PathVariable int goodsId,HttpServletRequest request, Model model) {
		return null;
	}
	/*
	 * Buy
	 * Pay ( Interface to bank system) via Alipay or Wechat
	 */
	@GetMapping("/buy/{goodsId}")
	public String buy(@PathVariable int goodsId,HttpServletRequest request, Model model) {
		return null;
	}
	/*
	 * Order Details
	 * Order Status (Processing Order -> Preparing for Shipment->Shipped->Complete)
	 */
	
	/*
	 * Comment Product (Only Purchased)
	 */
	
	/*
	 * View Buy History (Daily /Weekly/ Monthly/ Yearly)- Search
	 */
	
	
}
