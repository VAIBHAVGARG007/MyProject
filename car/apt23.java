import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;
public class apt23 extends Applet implements MouseMotionListener, MouseListener{
    int x,y,y2,x1,x2,i,y3,y1;
    int flag1,flag2;
    int a,b,t,count=0;
    AudioClip au;
    Font s;
    int flag;
    public void init(){
         s=new Font("Verdana",Font.BOLD,50);


        y1=750;
       flag=1;
         y=100;
         y2=10;
         x2=335;



        addMouseMotionListener(this);
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e){
        
        
         count=1;

        repaint();
    }
    public void mousePressed(MouseEvent e){}
    public void mouseDragged(MouseEvent e){
         x1=e.getX();
         y3=e.getY();
         if(((x1>=310)&&(x1<=520))&&((y3>=750)&&(y3<=899))){
            x2=x1;
         }
    }
    public void mouseReleased (MouseEvent e){}
    public void mouseEntered (MouseEvent e){}
    public void mouseExited (MouseEvent e){}
    public void mouseMoved (MouseEvent e){}
    public void paint(Graphics g){
      
     
        
        g.setColor(Color.black);
        g.fillRect(300,0,300,900);
        g.setColor(Color.white);
        g.fillRect(440,y++,20,80);
        g.fillRect(440,y-201,20,80);
        g.fillRect(440,y-401,20,80);
        g.fillRect(440,y-601,20,80);
        g.fillRect(440,y-801,20,80);
        g.fillRect(440,y+201,20,80);
        g.fillRect(440,y+401,20,80);
        g.fillRect(440,y+601,20,80);
        g.fillRect(440,y+801,20,80);

        
        Image img2 =getImage(getCodeBase(),"car1.jpg");
       
        g.drawImage(img2,x2,y1,this);

           
        if(count==1){

            if(y==800){
            y=0;

        }


        Image img =getImage(getCodeBase(),"car2.jpg");
        Image tree=getImage(getCodeBase(),"tree.jpg");
        if(i==1){
            x=495;
             g.drawImage(img,x,y2=y2+2,this);
       
        	g.drawImage(tree,84,y-300,this);
        

        if(y2==800){
            
            y2=10;
             Random r=new Random();
            i =Math.abs(r.nextInt())%2;
        }
       

        try{
            Thread.sleep(4);
            
        }
        catch(InterruptedException e){}
        if((( x2>=445 &&  x2<=565 ) && ( y2>=625 && y2<=755 )) ){
             g.setColor(Color.yellow);
              g.setFont(s);
        
            g.drawString("GAME OVER ",300,520);
        }
            else
                repaint();



           } 
        else if(i==0){
            x=335;


             g.drawImage(img,x,y2=y2+2,this);
       
        
        

        if(y2==800){
            
            y2=10;
             Random r=new Random();
            i =Math.abs(r.nextInt())%2;
        }
       

        try{
            Thread.sleep(4);
            
        }
        catch(InterruptedException e){}
        if((( x2>=335 &&  x2<=385 ) && ( y2>=625 && y2<=755 )) ){
             g.setColor(Color.yellow);
              g.setFont(s);
        
            g.drawString("GAME OVER ",300,520);
        }
        else       
         repaint();
    }
            
        }
    }         
}

//<applet code ="apt23.class" width=1600 height=900 ></applet> 