package parkshop.pmcourse.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import parkshop.pmcourse.conf.interceptor.UserSecurityInterceptor;

/**
 * web页面配置类，拦截器地址在此注册
 */
@Configuration
public class WebMvcConf extends WebMvcConfigurerAdapter{
    @Autowired
    private UserSecurityInterceptor securityInterceptor;
   
    @Override    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(securityInterceptor).addPathPatterns("/admin/**");//配置登录拦截器拦截路径
         }
    @Override  
    public void addResourceHandlers(ResourceHandlerRegistry registry) {  
        registry.addResourceHandler("/files/**").addResourceLocations("file:///"+"path");  
   
  //  registry.addResourceHandler("/files/**").addResourceLocations("file:///E:/var/spring/uploaded_files/");  
}

}
