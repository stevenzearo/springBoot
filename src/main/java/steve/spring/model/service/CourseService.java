package steve.spring.model.service;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import steve.spring.model.dao.CourseDao;
import steve.spring.model.pojo.Course;

/**
 * @Author steve
 * @Date 2019/7/30
 * @Time 10:51
 * @Version 1.0
 */
public interface CourseService {


    PageInfo<Course> getCourseInfoPage(Integer pageNum, Integer pageSize);

}
