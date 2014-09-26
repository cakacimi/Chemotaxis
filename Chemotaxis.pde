bacteria [] colony;
int z= 50;
int y=50;
void setup()
{
  size(500,400);
  colony= new bacteria[15];
 
  for(int i = 0; i< colony.length; i++)
  {
    colony[i] = new bacteria();
  }  
}

void draw()
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
  
 void move()
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

 void show()
   {
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
