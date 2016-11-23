package parkshop.pmcourse.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 * 卖家访问控制类
 */
@Controller
@RequestMapping("/seller")
public class SellerCtrl {
	/*
	 * Manage Products
	 * Add /Modify / Delete Products ( upload Photo’s Product)
	 */
	@PostMapping("/goods/add")
    public String addGoods(HttpServletRequest request, Model model) {
		return null;
	}
	@PostMapping("/goods/modify")
	public String modifyGoods(HttpServletRequest request, Model model) {
		return null;
	}
	@GetMapping("/goods/delete/{goodsId}")
	public String deleteGoods(@PathVariable int goodsId,HttpServletRequest request, Model model) {
		return null;
	}
	/*
	 * Manage Advertisement
	Apply Advertisement
	Homepage Product list 
	 */
	// apply advertisement to seller own shop
	@PostMapping("/advertisement/apply")
	public String applyAdvertisement(HttpServletRequest request, Model model) {
		return null;
	}
	
	/*
	 * Add/Modify Shop Details
	Shop contacts / Email / Telephone
	 */
	
	/*
	 * Manage Order
	Processing Order -> Preparing for Shipment->Shipped->Complete
	 */
	
	/*
	 * View Sales History (Daily /Weekly/ Monthly/ Yearly)- Search
	 */

	/*
	 * View Shop Income from Sale
	Daily /Weekly /Monthly /Yearly
	 */
	
	
	
}
