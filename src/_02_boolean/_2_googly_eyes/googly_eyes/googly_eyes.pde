PImage face;

void setup() {
  
  face = loadImage("bigeyesquid.jpeg");
  
  size(800,600);
  face.resize(800, 600);
  
}

void draw() {
  
  background(face);
  
  ellipse(430,360,100,100);
 
  ellipse(430,3500,20,20);
  color(0,0,0);
  
}
