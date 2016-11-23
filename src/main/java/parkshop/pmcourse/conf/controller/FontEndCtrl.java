package parkshop.pmcourse.conf.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import parkshop.pmcourse.conf.domain.Info;
import parkshop.pmcourse.conf.inter.InfoSer;

/**
 * 为已经登录或即将登录用户的前端页面显示的控制器，  " /** " 
 * 共包括archives,login,projects,tags,about,post,login,register这几个页面
 */
@Controller
public class FontEndCtrl {

    @Autowired
    private InfoSer infoSer;
  

    @GetMapping("/login")
    public String login(HttpServletRequest request, Model model) {
    	
        String result = request.getParameter("result");
        if (result != null && result.equals("fail")) {
            model.addAttribute("success", 0);        	
        }
        return "login";
    }

    @PostMapping("/login.action")
    public String doLogin(Info user, HttpServletRequest request,Model model) {
        
    
    	Info result = infoSer.login(user);
      
        if(result!=null){
        	 model.addAttribute("curUser",user.getUsername());
        	 result.setVisitorUrl(request);
        	 // session 中不保存用户简历，可以参考对应的 mapping 文件
             infoSer.addSession(request, result);
             return "redirect:/tools/twoDimension/index";        	
        }
        
        return "redirect:/login?result=fail";
        
    }
    
    @GetMapping("/signup")
    public String signup(HttpServletRequest request, Model model) {
    	
        
        return "signup";
    }

    
    @PostMapping("/doSignup")
    public String doSignup(Info user, HttpServletRequest request,Model model) {
    	
    	
    	boolean success=infoSer.signup(user);
    	if(success){
    		model.addAttribute("successInfo", "注册成功！");
    		doLogin(user, request, model);
    	    return "redirect:/admin/info";
    	}else{
    		model.addAttribute("failInfo", "该用户名已存在，注册失败");
    		return "signup";
    	}
    }

   
    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        infoSer.destroySession(request);
        return "redirect:/login";
    }
    
   /*
    * 使用 Session 的方式，保存当前游客访问的用户信息。
    * 
    *  @GetMapping("/visitor/{userName}")
    public String visitor(@PathVariable String userName,HttpServletRequest request){
    	infoSer.destroySession(request);
    	Info visitorUser=infoSer.getUserInfoByName(userName);
    	
    	if(visitorUser!=null){
    		// 添加到 session , 无密码。若再登录时，将覆盖当前用户信息
    	visitorUser.setPassword(null);
    	visitorUser.setVisitorUrl(request);
    	infoSer.addSession(request, visitorUser);    	
    	return "redirect:/about";
    	}else{
    		return "redirect:/error";
    	}
    }*/}
