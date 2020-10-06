package Basic2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*CircleImpl myCircleImpl = new CircleImpl();*/
@Component("myCircleImpl")
public class CircleImpl implements Circle{
	
	//shape 자식이 pointx로 들어오게 하는 작업(자식이 2개 이상이면 확실하게 정해줘야한다)
	@Autowired
	@Qualifier("PointX") // 담을 자식의 참조변수의 이름을 적어준다
	Shape pointx;
	int x;
	int y;
	int radius;
	
	public CircleImpl() {
		System.out.println("CircleImpl()");
		
	}
	
	public Shape getPointx() {
		return pointx;
	}

/*
	public void setPointx(Shape pointx) {
		this.pointx = pointx;
		System.out.println("setPointx(Shape pointx)");
	}
*/

	@Override
	public int getX() {
		
		return x;
	}

	@Override
	public int getY() {
		
		return y;
	}

	@Override
	public String make() {
		
		return pointx.make();
	}

}
