package steve.spring.model.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import steve.spring.model.dao.CourseDao;
import steve.spring.model.pojo.Course;
import steve.spring.model.service.CourseService;

/**
 * @Author steve
 * @Date 2019/7/30
 * @Time 10:53
 * @Version 1.0
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;
    @Override
    public PageInfo<Course> getCourseInfoPage(Integer pageNum, Integer pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> courseDao.getAllCourseInfo());
    }
}
