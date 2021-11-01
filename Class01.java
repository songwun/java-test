package ch10;
class  CSphere
{
	private double radius;
	void setRadius(int r) // 設定半徑
	{
	radius=r;
	} 
	double volume()
	{
	return ((double)(4.0/3.0)*3.14159*radius*radius*radius);
	} 
}
class CWin
{
	int length;
	int width;
	int height;
	void setW(int w) // 設定寬度的 method
	{
	width=w;
	}
	void setH(int h) // 設定高度的 method
	{
	height=h;
	}
	void setL(int l) // 設定長度的 method
	{
	length=l;
	}
	int volume()
	{
	return ((int)width*height*2+width*length*2+length*height*2);
	}
}
public class Class01 {

	public static void main(String[] args) {
		CWin cw=new CWin();
		cw.setW(5);
		cw.setH(6);
		cw.setL(4);
		System.out.println("立方體表面積="+cw.volume());
		CSphere cs=new CSphere();
		cs.setRadius(10);
		System.out.println("球形體積="+cs.volume());
	}

}
