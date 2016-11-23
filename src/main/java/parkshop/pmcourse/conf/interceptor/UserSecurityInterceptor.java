package parkshop.pmcourse.conf.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import parkshop.pmcourse.conf.domain.Info;

/**
 * 用户登录后台管理的拦截器
 * 存在该用户session则允许通过，否则返回登录页面
 */
@Component
public class UserSecurityInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
     
    	HttpSession session=request.getSession();
    	Object obj = request.getSession();
        if (obj == null || !(obj instanceof Info)) {
            response.sendRedirect(request.getContextPath() + "/login");
            return false;
        }
        
      /*  
       * 不再使用 session 保存游客信息。
       * 
       * // 如果当前 session 密码为空，表明是访问的游客,需要登录
        Info curUser=(Info)obj;
        if(curUser.getPassword()==null) {                       
            response.sendRedirect(request.getContextPath() + "/login");
            return false;
        }*/
        
        return true;
    }

    
    
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}