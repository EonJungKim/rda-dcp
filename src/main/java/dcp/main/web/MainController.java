package dcp.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : 김언중
 * @since : 2023. 07. 24.
 * <p>
 * == 수정사항 ==
 * ---------------------------------------
 * 2023. 07. 24.  김언중 최초 생성
 */
@Controller
public class MainController {

    @RequestMapping(value = "main.do")
    public String main() {
        return "main/main";
    }
}
