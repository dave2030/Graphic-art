package GraphicsAssignment;
import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class Whitehouseart extends JFrame {

	public void paint (Graphics g) {
		
		  Graphics2D ga = (Graphics2D)g; 
		  
		  Rectangle2D.Double background = new Rectangle2D.Double (0,0,600,480); 
		    ga.draw (background);
		    
		    //Draw Sky
		      Rectangle2D.Float sky = new Rectangle2D.Float (0,0,600,230);
			  ga.setPaint(Color.cyan);
			  ga.fill(sky);
		    
		    //Draw the grass
			  Rectangle2D.Float grass = new Rectangle2D.Float (0,230,600,250);
			  ga.setPaint(Color.green);
			  ga.fill(grass);  
		    
			  //Draw the body of the house.
			  Rectangle2D.Float body = new Rectangle2D.Float (150,110,300,300);
			  ga.setPaint(Color.red);
			  ga.fill(body);
			  
			  //Draw Chimney Base Bar
			  Rectangle2D.Float chimneybar=new Rectangle2D.Float(150,110,300,20);
			  ga.setPaint(Color.gray);
			  ga.fill(chimneybar);
			  
			  //Draw Middle Door
			  Rectangle2D.Float door1=new Rectangle2D.Float(270,230,60,150);
			  ga.setPaint(Color.white);
			  ga.fill(door1);
			  
			  //Draw Left Door
			  Rectangle2D.Float door2=new Rectangle2D.Float(170,260,40,120);
			  ga.setPaint(Color.white);
			  ga.fill(door2);
			  
			  //Draw Right Door
			  Rectangle2D.Float door3=new Rectangle2D.Float(390,260,40,120);
			  ga.setPaint(Color.white);
			  ga.fill(door3);
			  
			  //Draw Bottom Left Pillar Base
			  Rectangle2D.Float pillarbasedownleft=new Rectangle2D.Float(220,360,40,20);
			  ga.setPaint(Color.white);
			  ga.fill(pillarbasedownleft);
			  
			  //Draw Bottom Right Pillar Base
			  Rectangle2D.Float pillarbasedownright=new Rectangle2D.Float(340,360,40,20);
			  ga.setPaint(Color.white);
			  ga.fill(pillarbasedownright);
			  
			  //Draw Top Left Pillar Base
			  Rectangle2D.Float pillarbaseupleft=new Rectangle2D.Float(220,130,40,20);
			  ga.setPaint(Color.white);
			  ga.fill(pillarbaseupleft);
			  
			  //Draw Top Right Pillar Base
			  Rectangle2D.Float pillarbaseupright=new Rectangle2D.Float(340,130,40,20);
			  ga.setPaint(Color.white);
			  ga.fill(pillarbaseupright);
			  
			  //Draw Left Pillar Pole
			  Rectangle2D.Float pole1=new Rectangle2D.Float(230,130,20,230);
			  ga.setPaint(Color.white);
			  ga.fill(pole1);
			  
			  //Draw Right Pillar Pole
			  Rectangle2D.Float pole2=new Rectangle2D.Float(350,130,20,230);
			  ga.setPaint(Color.white);
			  ga.fill(pole2);
			  
			  //Draw Middle Top Gray Window
			  Rectangle2D.Float topwin=new Rectangle2D.Float(270,150,60,30);
			  ga.setPaint(Color.gray);
			  ga.fill(topwin);
			  
			  //Draw Stair 1
			  Rectangle2D.Float stair1=new Rectangle2D.Float(180,380,240,10);
			  ga.setPaint(Color.gray);
			  ga.fill(stair1);
			  
			  //Draw Stair 2
			  Rectangle2D.Float stair2=new Rectangle2D.Float(170,390,260,10);
			  ga.setPaint(Color.gray);
			  ga.fill(stair2);
			  
			  //Draw Stair 3
			  Rectangle2D.Float stair3=new Rectangle2D.Float(160,400,280,10);
			  ga.setPaint(Color.gray);
			  ga.fill(stair3);
			  
			  //Draw Stair 4
			  Rectangle2D.Float stair4=new Rectangle2D.Float(150,410,300,10);
			  ga.setPaint(Color.gray);
			  ga.fill(stair4);
			  
			  //Draw Stair 5
			  Rectangle2D.Float stair5=new Rectangle2D.Float(140,420,320,10);
			  ga.setPaint(Color.gray);
			  ga.fill(stair5);
			  
			  //Draw Stair 6
			  Rectangle2D.Float stair6=new Rectangle2D.Float(130,430,340,10);
			  ga.setPaint(Color.gray);
			  ga.fill(stair6);
			  
			  //Draw Stair 7
			  Rectangle2D.Float stair7=new Rectangle2D.Float(120,440,360,10);
			  ga.setPaint(Color.gray);
			  ga.fill(stair7);
			  
			  //Draw Stair 1 line
			  Line2D.Float line1=new Line2D.Float(150,380,450,380);
			  ga.setPaint(Color.black);
			  ga.draw(line1);
			  
			  //Draw Stair 2 line
			  Line2D.Float line2=new Line2D.Float(170,390,430,390);
			  ga.setPaint(Color.black);
			  ga.draw(line2);
			  
			  //Draw Stair 3 line
			  Line2D.Float line3=new Line2D.Float(160,400,440,400);
			  ga.setPaint(Color.black);
			  ga.draw(line3);
			  
			  //Draw Stair 4 line
			  Line2D.Float line4=new Line2D.Float(150,410,450,410);
			  ga.setPaint(Color.black);
			  ga.draw(line4);
			  
			  //Draw Stair 5 line
			  Line2D.Float line5=new Line2D.Float(140,420,460,420);
			  ga.setPaint(Color.black);
			  ga.draw(line5);
			  
			  //Draw Stair 6 line
			  Line2D.Float line6=new Line2D.Float(130,430,470,430);
			  ga.setPaint(Color.black);
			  ga.draw(line6);
			  
			  //Draw Stair 7 line
			  Line2D.Float line7=new Line2D.Float(120,440,480,440);
			  ga.setPaint(Color.black);
			  ga.draw(line7);
			  
			  //Draw Stair 8 line
			  Line2D.Float line8=new Line2D.Float(120,450,480,450);
			  ga.setPaint(Color.black);
			  ga.draw(line8);
			  
			  //Draw Middle Door Window 1
			  Rectangle2D.Float middlewindow1=new Rectangle2D.Float(290,250,20,20);
			  ga.setPaint(Color.black);
			  ga.fill(middlewindow1);
			  
			  //Draw Middle Door Window 2
			  Rectangle2D.Float middlewindow2=new Rectangle2D.Float(290,280,20,20);
			  ga.setPaint(Color.black);
			  ga.fill(middlewindow2);
			  
			  //Draw Middle Door Window 3
			  Rectangle2D.Float middlewindow3=new Rectangle2D.Float(290,310,20,20);
			  ga.setPaint(Color.black);
			  ga.fill(middlewindow3);
			  
			  //Draw Middle Door Window 4
			  Rectangle2D.Float middlewindow4=new Rectangle2D.Float(290,340,20,20);
			  ga.setPaint(Color.black);
			  ga.fill(middlewindow4);
			  
			  //Draw Left Door Window 1
			  Rectangle2D.Float leftwindow1=new Rectangle2D.Float(180,270,20,20);
			  ga.setPaint(Color.black);
			  ga.fill(leftwindow1);
			  
			  //Draw Left Door Window 2
			  Rectangle2D.Float leftwindow2=new Rectangle2D.Float(180,300,20,20);
			  ga.setPaint(Color.black);
			  ga.fill(leftwindow2);
			  
			  //Draw Left Door Window 3
			  Rectangle2D.Float leftwindow3=new Rectangle2D.Float(180,330,20,20);
			  ga.setPaint(Color.black);
			  ga.fill(leftwindow3);
			  
			  //Draw Right Door Window 1
			  Rectangle2D.Float rightwindow1=new Rectangle2D.Float(400,270,20,20);
			  ga.setPaint(Color.black);
			  ga.fill(rightwindow1);
			  
			  //Draw Right Door Window 2
			  Rectangle2D.Float rightwindow2=new Rectangle2D.Float(400,300,20,20);
			  ga.setPaint(Color.black);
			  ga.fill(rightwindow2);
			  
			  //Draw Right Door Window 3
			  Rectangle2D.Float rightwindow3=new Rectangle2D.Float(400,330,20,20);
			  ga.setPaint(Color.black);
			  ga.fill(rightwindow3);
			  
			  //Draw Left House Base
			  Rectangle2D.Float b1=new Rectangle2D.Float(150,380,30,2);
			  ga.setPaint(Color.black);
			  ga.fill(b1);
			  
			  //Draw Right House Base
			  Rectangle2D.Float b2=new Rectangle2D.Float(420,380,30,2);
			  ga.setPaint(Color.black);
			  ga.fill(b2);
			  
			  //Draw Roof
			  GeneralPath roof = new GeneralPath();
			  roof.moveTo(150F,110F);
			  roof.lineTo(300F,30F);
			  roof.lineTo(450, 110);
			  roof.closePath();
			  ga.setPaint(Color.red);
			  ga.fill(roof);
			  
			  //Draw Left Flag's White Body
			  Rectangle2D.Float leftflagbody=new Rectangle2D.Float(55,280,75,50);
			  ga.setPaint(Color.white);
			  ga.fill(leftflagbody);
			  
			  //Draw Left Flag's Blue Box
			  Rectangle2D.Float leftflagblue=new Rectangle2D.Float(55,280,35,30);
			  ga.setPaint(Color.blue);
			  ga.fill(leftflagblue);
			  
			  //Draw Left Flag Red Stripe 1
			  Rectangle2D.Float leftflagred1=new Rectangle2D.Float(90,280,40,10);
			  ga.setPaint(Color.red);
			  ga.fill(leftflagred1);
			  
			  //Draw Left Flag Red Stripe 2
			  Rectangle2D.Float leftflagred2=new Rectangle2D.Float(90,300,40,10);
			  ga.setPaint(Color.red);
			  ga.fill(leftflagred2);
			  
			  //Draw Left Flag Red Stripe 3
			  Rectangle2D.Float leftflagred3=new Rectangle2D.Float(55,320,75,10);
			  ga.setPaint(Color.red);
			  ga.fill(leftflagred3);
			  
			  //Draw Left Flag Pole
			  Rectangle2D.Float leftpole=new Rectangle2D.Float(45,280,10,170);
			  ga.setPaint(Color.gray);
			  ga.fill(leftpole);
			  
			  //Draw Right Flag's White Body
			  Rectangle2D.Float Rightflagbody=new Rectangle2D.Float(500,280,75,50);
			  ga.setPaint(Color.white);
			  ga.fill(Rightflagbody);
			  
			  //Draw Right Flag's Blue Box
			  Rectangle2D.Float Rightflagblue=new Rectangle2D.Float(500,280,35,30);
			  ga.setPaint(Color.blue);
			  ga.fill(Rightflagblue);
			  
			  //Draw Right Flag Red Stripe 1
			  Rectangle2D.Float Rightflagred1=new Rectangle2D.Float(535,280,40,10);
			  ga.setPaint(Color.red);
			  ga.fill(Rightflagred1);
			  
			  //Draw Right Flag Red Stripe 2
			  Rectangle2D.Float Rightflagred2=new Rectangle2D.Float(535,300,40,10);
			  ga.setPaint(Color.red);
			  ga.fill(Rightflagred2);
			  
			  //Draw Right Flag Red Stripe 3
			  Rectangle2D.Float Rightflagred3=new Rectangle2D.Float(500,320,75,10);
			  ga.setPaint(Color.red);
			  ga.fill(Rightflagred3);
			  
			  //Draw Right Flag Pole
			  Rectangle2D.Float Rightpole=new Rectangle2D.Float(490,280,10,170);
			  ga.setPaint(Color.gray);
			  ga.fill(Rightpole);
			  
			  //Draw Left Flag Circle 1
			  Ellipse2D.Float leftcircle1 = new Ellipse2D.Float (60,283,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(leftcircle1);
			  
			  //Draw Left Flag Circle 2
			  Ellipse2D.Float leftcircle2 = new Ellipse2D.Float (70,283,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(leftcircle2);
			  
			  //Draw Left Flag Circle 3
			  Ellipse2D.Float leftcircle3 = new Ellipse2D.Float (80,283,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(leftcircle3);
			  
			  //Draw Left Flag Circle 4
			  Ellipse2D.Float leftcircle4 = new Ellipse2D.Float (60,293,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(leftcircle4);
			  
			  //Draw Left Flag Circle 5
			  Ellipse2D.Float leftcircle5 = new Ellipse2D.Float (70,293,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(leftcircle5);
			  
			  //Draw Left Flag Circle 6
			  Ellipse2D.Float leftcircle6 = new Ellipse2D.Float (80,293,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(leftcircle6);
			  
			  //Draw Left Flag Circle 7
			  Ellipse2D.Float leftcircle7 = new Ellipse2D.Float (60,303,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(leftcircle7);
			  
			  //Draw Left Flag Circle 8
			  Ellipse2D.Float leftcircle8 = new Ellipse2D.Float (70,303,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(leftcircle8);
			  
			  //Draw Left Flag Circle 9
			  Ellipse2D.Float leftcircle9 = new Ellipse2D.Float (80,303,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(leftcircle9);
			  
			  //Draw right Flag Circle 1
			  Ellipse2D.Float rightcircle1 = new Ellipse2D.Float (505,283,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(rightcircle1);
			  
			  //Draw right Flag Circle 2
			  Ellipse2D.Float rightcircle2 = new Ellipse2D.Float (515,283,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(rightcircle2);
			  
			  //Draw right Flag Circle 3
			  Ellipse2D.Float rightcircle3 = new Ellipse2D.Float (525,283,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(rightcircle3);
			  
			  //Draw right Flag Circle 4
			  Ellipse2D.Float rightcircle4 = new Ellipse2D.Float (505,293,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(rightcircle4);
			  
			  //Draw right Flag Circle 5
			  Ellipse2D.Float rightcircle5 = new Ellipse2D.Float (515,293,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(rightcircle5);
			  
			  //Draw right Flag Circle 6
			  Ellipse2D.Float rightcircle6 = new Ellipse2D.Float (525,293,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(rightcircle6);
			  
			  //Draw right Flag Circle 7
			  Ellipse2D.Float rightcircle7 = new Ellipse2D.Float (505,303,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(rightcircle7);
			  
			  //Draw right Flag Circle 8
			  Ellipse2D.Float rightcircle8 = new Ellipse2D.Float (515,303,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(rightcircle8);
			  
			  //Draw right Flag Circle 9
			  Ellipse2D.Float rightcircle9 = new Ellipse2D.Float (525,303,5,5);
			  ga.setPaint(Color.white);
			  ga.fill(rightcircle9);
			  
			  //Draw Sun
			  Arc2D.Float sun= new Arc2D.Float (0,12, 50, 50, 180, 270,Arc2D.OPEN);
			  ga.setPaint(Color.yellow);
			  ga.fill(sun);
			  
			  
			  //Draw cloud 1
			  Arc2D.Float cloud1= new Arc2D.Float (525,80, 50, 50, 180, 360,Arc2D.OPEN);
			  ga.setPaint(Color.white);
			  ga.fill(cloud1);
			  
			  
			  //Draw cloud 2
			  Arc2D.Float cloud2= new Arc2D.Float (500,60, 50, 50, 180, 360,Arc2D.OPEN);
			  ga.setPaint(Color.white);
			  ga.fill(cloud2);
			  
			  //Draw cloud 2
			  Arc2D.Float cloud3= new Arc2D.Float (475,80, 50, 50, 180, 360,Arc2D.OPEN);
			  ga.setPaint(Color.white);
			  ga.fill(cloud3);
			  
			  //Draw House Window Arc
			  Arc2D.Float win= new Arc2D.Float (275,70, 50, 50, 0, 180,Arc2D.OPEN);
			  ga.setPaint(Color.white);
			  ga.fill(win);
			  

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new Whitehouseart();
	    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); 
	    frame.setSize (600,480);
	    frame.setVisible (true);
		
	}
}
