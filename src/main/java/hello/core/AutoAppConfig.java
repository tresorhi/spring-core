package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //basePackages = "hello.core.member", 지정하지 않으면 @CompoenetScan이 붙은 클래스의 패키기자 시작 위치
        excludeFilters= @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        //기존이 AppConfig를 제외하기 위해
)
public class AutoAppConfig {

}
