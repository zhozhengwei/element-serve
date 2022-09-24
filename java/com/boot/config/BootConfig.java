package com.boot.config;
import com.boot.intercepters.TokenIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class BootConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TokenIntercepter())
                //拦截路径
                .addPathPatterns("/**")
                //不需要拦截的路径（白名单）
                .excludePathPatterns("/**","/upload/**","/business/**","/message/**","/websocket/**","/category/**","/brand/**","/car/**","/user/**","/images/**","/css/**");

        //这里其实权限的限制可以使用一个拦截器的方式就是将需要访问的资源配置进入这个拦截器中进行token中信息的验证，通过了即可访问资源如果
        //验证用户是否有这个权限访问这个资源如果用户没有权限访问这个资源则拦截这个请求
    }

    //跨域请求
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
//                .allowedOrigins("*") //允许跨域请求的 域名
                .allowedOriginPatterns("*")
                .allowCredentials(true) //是否允许cookie
                .allowedMethods("*") //允许的请求方式：GET、POST、DELETE、 PUT
                .allowedHeaders("*") //允许的header属性
                .maxAge(36000); //跨域如需时间
    }
}
