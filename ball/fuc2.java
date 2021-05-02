import java.io.*;
import java.applet.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class fuc2 extends Applet implements MouseListener{
int x,l,y,z,flag,flag1,flag2,flag3,k;
public void init()
{
l=190;
k=190;
y=380;
x=195;
z=90;
flag=0;
flag1=0;
flag2=0;
flag3=1;
addMouseListener(this);
}
public void mouseClicked(MouseEvent e)
{
	flag3=0;
	repaint();
}
public void mousePressed(MouseEvent e){}
public void mouseReleased(MouseEvent e){}
public void mouseEntered(MouseEvent e){}
public void mouseExited(MouseEvent e){}
public void paint (Graphics g)
{
g.drawRect(l,0,20,10);
g.drawRect(k,390,20,10);
g.setColor(Color.yellow);
g.fillArc(x,y,10,10,z,90);
g.setColor(Color.blue);
g.fillArc(x,y,10,10,z+90,90);
g.setColor(Color.red);
g.fillArc(x,y,10,10,z+180,90);
g.setColor(Color.green);
g.fillArc(x,y,10,10,z+270,90);
if(flag3==0)
{
if(x==5)
{
flag=0;
}
else if(x==385)
{
flag=1;
}
if(y==10)
{
flag1=0;
}
else if(y==380)
{
flag1=1;
}
if(k==0)
{
flag2=0;
}
else if(k==380)
{
flag2=1;
}
if(flag==0)
{
x++;
z=z-10;
}
else{
x--;
z=z+10;
}
if(flag1==0)
{
y++;
}
else {
y--;
}
if(flag2==0)
{
k++;
l++;
}
else{
k--;
l--;
}
try
{
Thread.sleep(10);
}
catch(Exception e)
{
}
repaint();
}
}
}
/*<applet code="fuc2.java" width=400 height=400></applet>*/

