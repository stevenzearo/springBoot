package steve.spring.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import steve.spring.model.pojo.Course;
import steve.spring.model.service.CourseService;

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
    @Autowired
    private CourseService courseService;
    @RequestMapping("/toIndex")
    public ModelAndView toIndex(){
        List<String> stringList = Arrays.asList("a", "b", "c", "d", "e");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("userName", "steve");
        modelAndView.addObject("password", "123456");
        PageInfo<Course> courseInfoPage = courseService.getCourseInfoPage(1, 5);
        modelAndView.addObject("coursePage", courseInfoPage);
        modelAndView.addObject("ls", stringList);
        return modelAndView;
    }
}
