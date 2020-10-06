package Basic2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
//		Shape px = new PointX();
//		PointY py = new PointY();
		
//		CircleImpl ci = new CircleImpl();
//		ci.setPointx(px);  //shape은 인터페이스라서 자식인 PointX의 정보가 담긴 px,py를 넘겨야한다
//		System.out.println(ci.make());
		
//		RectangleImpl ri = new RectangleImpl();
//		ri.setPointy(py);
//		System.out.println(ri.make());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AutoWiredExam.xml");
		
		Circle circle = (Circle) context.getBean("myCircleImpl");
		System.out.println(circle.make());
		
		System.out.println("-------------------------------");
		
		Rectangle rectangle = context.getBean("myRectangleImpl",Rectangle.class);
		System.out.println(rectangle.make());
		
		
		
	}

}
