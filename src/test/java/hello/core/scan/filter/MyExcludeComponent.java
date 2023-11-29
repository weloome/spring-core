package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) //어디에붙냐
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
}
