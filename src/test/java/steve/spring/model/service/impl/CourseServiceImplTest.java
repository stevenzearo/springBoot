package steve.spring.model.service.impl;

import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import steve.spring.model.dao.CourseDao;
import steve.spring.model.pojo.Course;
import steve.spring.model.service.CourseService;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author steve
 * @Date 2019/7/30
 * @Time 10:54
 * @Version 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseServiceImplTest {
    @Autowired
    private CourseService courseService;
    @Autowired
    private CourseDao courseDao;
    @Test
    public void getCourseInfoPage() {
        PageInfo<Course> courseInfoPage = courseService.getCourseInfoPage(1, 5);
        System.out.println("hello");
        System.out.println(courseInfoPage.getList().size());
        courseInfoPage.getList().forEach(System.out::println);

    }
}