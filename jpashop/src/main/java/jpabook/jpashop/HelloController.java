package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    // HTTP GET 요청이 "/api/hello" 경로로 들어오는지 검사
    @GetMapping("/api/hello")
    public String Hello(Model model){
        // Model 객체는 스프링 MVC에서 컨트롤러가 뷰에 데이터를 전달할 때 사용되는 일종의 컨테이너로, 이 객체를 사용하여 컨트롤러에서 생성한 데이터를 뷰로 전달할 수 있다.

        // model.addAttribute("userName", "Lee")는 "userName"라는 이름의 속성에 "Lee"라는 값을 추가하는 역할을 한다.
        // 이렇게 추가된 데이터는 해당 요청에 대한 뷰 템플릿에서 사용될 수 있다.
        // 뷰 템플릿에서는 "userName"라는 이름으로 이 데이터를 참조할 수 있게 된다.
        model.addAttribute("userName", "Lee");

        // `resources:templates/` + `{viewName}` + `.html`
        // 여기서는 `resources:templates/helloGetMapping.html`
        return "helloGetMapping";
    }
}
