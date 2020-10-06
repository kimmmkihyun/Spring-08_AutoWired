package Basic2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*CircleImpl myCircleImpl = new CircleImpl();*/
@Component("myCircleImpl")
public class CircleImpl implements Circle{
	
	//shape �ڽ��� pointx�� ������ �ϴ� �۾�(�ڽ��� 2�� �̻��̸� Ȯ���ϰ� ��������Ѵ�)
	@Autowired
	@Qualifier("PointX") // ���� �ڽ��� ���������� �̸��� �����ش�
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
