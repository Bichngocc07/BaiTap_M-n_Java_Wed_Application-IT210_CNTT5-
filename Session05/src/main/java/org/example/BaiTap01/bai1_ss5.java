import org.springframework.context.annotation.Bean;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;

//1. Chỉ ra ít nhất 2 lỗi sai
//Lỗi 1: Sai định dạng file view
//resolver.setSuffix(".jsp");
//
//Sai vì:
//
//Bài yêu cầu dùng Thymeleaf
//Thymeleaf chỉ đọc .html, không đọc .jsp
//Sửa:
//
//        resolver.setSuffix(".html");
//Lỗi 2: Sai thư mục chứa view
//resolver.setPrefix("/WEB-INF/views/");
//
//Sai vì:
//
//        /views/ là convention của JSP
//
//Bài yêu cầu:
//
//nhận diện file .html trong thư mục /WEB-INF/templates/
//Sửa:
//
//        resolver.setPrefix("/WEB-INF/templates/");
@Bean
public SpringResourceTemplateResolver templateResolver() {

    SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();

    resolver.setPrefix("/WEB-INF/templates/");
    resolver.setSuffix(".html");
    resolver.setCharacterEncoding("UTF-8");

    return resolver;
}