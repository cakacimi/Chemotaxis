import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

bacteria [] colony;
int z= 50;
int y=50;
public void setup()
{
  size(500,400);
  colony= new bacteria[15];
 
  for(int i = 0; i< colony.length; i++)
  {
    colony[i] = new bacteria();
  }  
}

public void draw()
{
  background(100);
  for (int i=0; i< colony.length; i++)
  {
  colony[i].move();
  colony[i].show();
  }

}   
  class bacteria
  { int xPos,yPos;
  
     bacteria()
       {  
        xPos=250;
        yPos=250;
       }
  
 public void move()
   {
    if ( mouseX < xPos)
      {
        xPos = xPos + (int)(Math.random()*3)-2;
       }
    if (mouseY < yPos)
      {
        yPos = yPos + (int)(Math.random()*3)-2;
      }

    
      if ( mouseX > xPos)
      {
        xPos = xPos + (int)(Math.random()*3);
       }
    if (mouseY > yPos)
      {
        yPos = yPos + (int)(Math.random()*3);
      }



    xPos = xPos + (int)(Math.random()*3)-1;
    yPos = yPos + (int)(Math.random()*3)-1;
   }

 public void show()
   {
     textSize(30);
     fill(255);
     text("I got my eye on you",100,100);
     noStroke();
 //red circle//
  fill(255,255,230);
  ellipse(xPos,yPos,100,z);
  
  //orange circle//
  fill(10,20,0);
  ellipse(xPos,yPos,200,z);
  
  //yellow circle//
  fill(255,255,255);
  ellipse(xPos,yPos,150,z);
  
  //green circle//
  fill(0,0,0,100);
  ellipse(xPos,yPos,z,z);
  
  //blue circle//
  fill(0,0,255-y,100);
  ellipse(xPos,yPos,z,z);
  
  //purple circle//
  fill(186,85,211-y,100);
  ellipse(xPos,yPos,z,z);
  
  //indigo circle//
  fill(30,144,255,200);
  ellipse(xPos,yPos,z,z);
  //pupil//
  fill(0);
  ellipse(xPos,yPos,z-35,z-35);
   }  
  
  }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
