package steve.spring.model.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import steve.spring.model.pojo.Course;

import java.util.List;

/**
 * @Author steve
 * @Date 2019/7/30
 * @Time 10:43
 * @Version 1.0
 */
@Repository
@Mapper
public interface CourseDao {
    /**
     * 获取所有课程信息
     * @return 课程信息集合
     */
    List<Course> getAllCourseInfo();
}
