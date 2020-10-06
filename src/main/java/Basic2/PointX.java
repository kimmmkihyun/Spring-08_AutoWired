package Basic2;

import org.springframework.stereotype.Component;

//@Component() 객체만들 때 사용하는 어노테이션

/*PointX PointX = new PointX();    자바에서는 클래스이름과 객체이름이 같으면 안되지만 어노테이션은 가능하다*/
@Component("PointX")
public class PointX implements Shape{

	public PointX() {
		System.out.println("PointX()");
	}
	
	
	@Override
	public String make() {
		
		return "X를 만들다";
	}

	@Override
	public String delete() {
		
		return "X를 지우다";
	}

}
