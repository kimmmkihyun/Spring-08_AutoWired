package Basic;

public class Main {

	public static void main(String[] args) {
		
		Shape px = new PointX();
		PointY py = new PointY();
		
		CircleImpl ci = new CircleImpl();
		ci.setPointx(px);  //shape�� �������̽��� �ڽ��� PointX�� ������ ��� px,py�� �Ѱܾ��Ѵ�
		System.out.println(ci.make());
		
		RectangleImpl ri = new RectangleImpl();
		ri.setPointy(py);
		System.out.println(ri.make());
	}

}
