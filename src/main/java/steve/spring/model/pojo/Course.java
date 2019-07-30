package steve.spring.model.pojo;

//课程表
public class Course {
	
	private Integer courseId;//课程id
	private String  courseName;//课程名
	private Integer courseCategoryId;//课程类别id
	private String  courseIntroduce;//课程介绍
	private String  courseNotice;//课程笔记
	private String  courseGoal;//课程学习目标
	private Integer userTeacherId;//课程教师id
	private String  coursePicture;//课程图片路径
	private Float   coursePrice;//课程价格
	private Integer courseLevel;//课程难度系数
	private String  coursePubDate;//发布时间
	public Course() {
		super();
	}
	public Course(Integer courseId, String courseName, Integer courseCategoryId, String courseIntroduce,
				  String courseNotice, String courseGoal, Integer userTeacherId, String coursePicture,
				  Float coursePrice, Integer courseLevel,String  coursePubDate) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseCategoryId = courseCategoryId;
		this.courseIntroduce = courseIntroduce;
		this.courseNotice = courseNotice;
		this.courseGoal = courseGoal;
		this.userTeacherId = userTeacherId;
		this.coursePicture = coursePicture;
		this.coursePrice = coursePrice;
		this.courseLevel = courseLevel;
		this.coursePubDate =coursePubDate;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getCourseCategoryId() {
		return courseCategoryId;
	}
	public void setCourseCategoryId(Integer courseCategoryId) {
		this.courseCategoryId = courseCategoryId;
	}
	public String getCourseIntroduce() {
		return courseIntroduce;
	}
	public void setCourseIntroduce(String courseIntroduce) {
		this.courseIntroduce = courseIntroduce;
	}
	public String getCourseNotice() {
		return courseNotice;
	}
	public void setCourseNotice(String courseNotice) {
		this.courseNotice = courseNotice;
	}
	public String getCourseGoal() {
		return courseGoal;
	}
	public void setCourseGoal(String courseGoal) {
		this.courseGoal = courseGoal;
	}
	public Integer getUserTeacherId() {
		return userTeacherId;
	}
	public void setUserTeacherId(Integer userTeacherId) {
		this.userTeacherId = userTeacherId;
	}
	public String getCoursePicture() {
		return coursePicture;
	}
	public void setCoursePicture(String coursePicture) {
		this.coursePicture = coursePicture;
	}
	public Float getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(Float coursePrice) {
		this.coursePrice = coursePrice;
	}
	public Integer getCourseLevel() {
		return courseLevel;
	}
	public void setCourseLevel(Integer courseLevel) {
		this.courseLevel = courseLevel;
	}
	public String getCourseDate() {
		return coursePubDate;
	}
	public void setCourseDate(String courseDate) {
		this.coursePubDate = courseDate;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseCategoryId=" + courseCategoryId
				+ ", courseIntroduce=" + courseIntroduce + ", courseNotice=" + courseNotice + ", courseGoal="
				+ courseGoal + ", userTeacherId=" + userTeacherId + ", coursePicture=" + coursePicture
				+ "," + "coursePrice=" + coursePrice + ", courseLevel=" + courseLevel + ", coursePubDate="
				+ coursePubDate + "]";
	}
	
	
}
