package Basic2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
//		Shape px = new PointX();
//		PointY py = new PointY();
		
//		CircleImpl ci = new CircleImpl();
//		ci.setPointx(px);  //shape�� �������̽��� �ڽ��� PointX�� ������ ��� px,py�� �Ѱܾ��Ѵ�
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
