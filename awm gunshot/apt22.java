import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;
public class apt22 extends Applet implements MouseMotionListener, MouseListener{
    int x,y,y1;
    int flag1=0,flag2=0,flag3=0;
    boolean q1=true,q2=true,q3=true;
    int a,b,t,count=0;
    AudioClip au = null;
    Font s,p;
    int flag=0;
    public void init(){
        s=new Font("Verdana",Font.BOLD,30);
        p=new Font("Verdana",Font.ITALIC,20);
         au=getAudioClip(getCodeBase(),"22.wav");
    y=500;



        addMouseMotionListener(this);
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e){
        if(flag==0){
            
            count=0;
            flag1=1;
            repaint();
            flag=1;
        }

        a=810;
        b=e.getY();
        // Graphics g=getGraphics();
        
         au.play();



    }
    public void mousePressed(MouseEvent e){}
    public void mouseDragged(MouseEvent e){}
    public void mouseReleased (MouseEvent e){}
    public void mouseEntered (MouseEvent e){}
    public void mouseExited (MouseEvent e){}
    public void mouseMoved (MouseEvent e){
     
        y1=e.getY();
       
        
    }
    public void paint(Graphics g){
        setBackground(Color.black);
          Image img2 =getImage(getCodeBase(),"b1.jpg");
         g.drawImage(img2,a=a-7,b+70,this);


        Image img =getImage(getCodeBase(),"b.jpg");
  
       
        Image img3 =getImage(getCodeBase(),"bs.jpg");
        Image img4 =getImage(getCodeBase(),"bs.jpg");
        Image img5 =getImage(getCodeBase(),"bs.jpg");
        if(q3)
        g.drawImage(img3,690,10,this);
        if(q2)
        g.drawImage(img4,650,10,this);
        if(q1)
        g.drawImage(img5,610,10,this);
        
        Image img1 =getImage(getCodeBase(),"g.jpg");
    
         g.drawImage(img1,800,y1,this);
         if(flag2==1){
            g.setColor(Color.yellow);
              g.setFont(s);
        
            g.drawString("GAME OVER ",140,220);
            g.setFont(p);
            g.drawString("click to restart",180,180);
            flag2=0;

         }
      
       if(flag1==1){ 
         if(flag3==0){
             q1=true;
            q2=true;
            q3=true;
            flag3=1;

        }
         g.drawImage(img,20,y--,this);
        if(count==1){
            q1=false;
           
        }
        else if(count==2){
           q2=false;
        }
        else if(count==3){
            q3=false;

        }
        else if(count==4){
            
           
           


            flag1=0;
            flag2=1;
            flag3=0;
            flag=0;

        }
       
       

        try{
            Thread.sleep(5);
            
        }
        catch(InterruptedException e){}
        if(((a<=106)&&(a>=50))&& ((b+70>=y)&&(b+70<=y+149))){
          y=500;
        
       }
       if(y==-146){
        y=500;
        count++;
       }
               
        repaint();
    
    }

        
       
        }
         
         
    }
        
    
    

//<applet code ="apt22.class" width=1920 height=720 ></applet> 