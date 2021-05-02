import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Hgame extends Applet implements MouseListener{
	int x,y,xh,yh,flag,score,speed,hscore;
	Image img;

	public void init(){
		score=0;speed=10;hscore=0;
		x=850;yh=250;flag=0;xh=50;
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e){
		flag=1;
		//repaint();
		}
	public void mousePressed(MouseEvent e){
		flag=2;
		//repaint();
		}
	public void mouseReleased(MouseEvent e){
		flag=1;
		//repaint();
		}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	
	
   public void paint(Graphics g){
      try{
	     g.fillRect(0,0,900,30);		   //Upper Rectangle
         g.fillRect(0,470,900,30);		   //Lower Rectangle
	     g.setColor(Color.black);		   //set background color black
	     g.fillRect(0,30,900,440);		   //set background color black
	
          img=getImage(getCodeBase(),"animated-helicopter-image-0027.gif");		//Helicopter Image
          g.drawImage(img,xh,yh,250,80,this);		                            //Draw Helicopter Image
		  
	        g.setColor(Color.white);		
	        g.drawString("Score: "+score,800,20);	       //show game score top right side
            g.drawString("Hight Score: "+hscore,20,20);	   //show game score top right side
			
	       if(flag>0)			    //Game start if we click i.e flag=1
	       {
		      score++;
		      g.setColor(Color.red);
		       if(x==850)				            //rectangle appeare it x=850
		          y=(int)(Math.random()*340)+30;	//Random position of rectangle middle of the upper and lower rectangle 
				
		           g.fillRect(x,y,50,100);			//draw Rectangle
				
		                    x-=5;					//move rectangle left side
				
		              if(flag==1)				//helicopter goes down
		                  yh=yh+2;							
		              if(flag==2)				//helicopter goes Up
		                  yh=yh-2;

               //Increase speed of game for scoring multiple of 1500		
                      if(score%1500==0)	
		 	              speed--;
		
               //second Rectangle will appeare if first is completlydisapper
                       if(x==-50)		
                           x=850;
		               else{
			              Thread.sleep(speed);
			              repaint();
			            }
            }
			
                //Checking the game over condition i.e. helicopter touch any obstacle or not?
			    if((x>=xh&& x<=xh+250 &&yh<=(y+100) && (yh+80)>y) || yh==390 || yh==30){
                    g.setColor(Color.white);
				    g.fillRect(250,100,400,300);
				    g.setColor(Color.black);
				    g.drawString("GAME OVER",300,180);
				    g.drawString("Score:"+(score-1),300,280);
				    flag=0;score=0;xh=50;
				    x=850;yh=250;speed=10;
				      if(hscore<=(score-1))
					    hscore=score-1;
				     Thread.sleep(2000);
			     }
		}
		catch(InterruptedException e){}
	}	
}
//<applet code="Hgame" height=500 width=900></applet>
