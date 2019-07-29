package steve.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * @Author steve
 * @Date 2019/7/29
 * @Time 16:16
 * @Version 1.0
 */
@Controller
public class IndexTestController {
    @RequestMapping("/toIndex")
    public ModelAndView toIndex(){
        List<String> stringList = Arrays.asList("a", "b", "c", "d", "e");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("userName", "steve");
        modelAndView.addObject("password", "123456");

        modelAndView.addObject("ls", stringList);
        return modelAndView;
    }
}
