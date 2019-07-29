package steve.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author  steve
 * @Date  2019/7/29
 * @Time  13:25
 * @Version  1.0
 */

@RestController
@RequestMapping(value = "/controller")
public class ControllerTest {


    @RequestMapping("/test")
    public String test(){
        return "this is a controller's test method.";
    }


}
