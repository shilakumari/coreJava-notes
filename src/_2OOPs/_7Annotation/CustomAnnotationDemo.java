package _2OOPs._7Annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class CustomAnnotationDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		m1();
		System.out.println();
		m2();
	}

	private static void m2() throws NoSuchMethodException, SecurityException {
		Student s = new Student("S-111", "Vinay", "Delhi");
		s.getStudentDetails();
		Class c = s.getClass();
		Method m = c.getMethod("getStudentDetails");
		Annotation ann = m.getAnnotation(Course2.class);
		Course2 crs = (Course2) ann;
		System.out.println(crs.cid() + crs.cname() + crs.ccost());
	}

	private static void m1() {
		Student s = new Student("S-444", "Vinay", "Delhi");
		s.getStudentDetails();

		Class c = s.getClass();
		Annotation ann = c.getAnnotation(Course.class);
		Course crs = (Course) ann;
		System.out.println(crs.cid() + crs.cname() + crs.ccost());

	}

}

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Course {
	String cid() default "C-111";

	String cname() default "C Programming language";

	int ccost() default 10000;
}
@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Course2 {
	String cid() default "C-111";

	String cname() default "C Programming language";

	int ccost() default 10000;
}
@Course(cid = "C-333", ccost = 30000)
class Student {
	String sid;
	String sname;
	String saddr;

	public Student(String sid, String sname, String saddr) {
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
	}

	@Course2(cid="C-999",cname="Java", ccost=30000)
	public void getStudentDetails() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(saddr);
	}
}