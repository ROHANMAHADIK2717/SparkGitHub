/*<APPLET code = "GFG1.class" width=500 height=500>
</APPLET>
*/

import java.awt.*;
import java.applet.*;

public class GFG1 extends Applet implements Runnable{
	private String display;
	private int x,y,flag;
	Thread t;

	public void init()
	{
		display="Harvibhai V Desai";
		x=100;
		y=100;
		flag=1;
		t=new Thread(this,"MyThread");
		t.start();
	}

	public void update()
	{
		x=x+10*flag;
		if(x>300)
		flag=-1;
		if(x<100)
		flag=1;
	}

	public void run()
	{
		while(true)
		{
			update();
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
			System.out.println(ie);
			}
		}
	}
	public void paint(Graphics g)
	{
		g.drawString(display,x,y);
	}
}