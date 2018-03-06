int x = 100;
int speed = 1;
void setup() {
  size(1000, 500); 
  noFill();
}

void draw() {
  background(200);
  for (int i = 0; i < 25; i++) {
    ellipse(x, 250, i*15, i * 15);
    ellipse(width - x, 250, i*15, i*15);
  }
  x+=speed;
  if (x < 0 || x > width) {
    speed = -speed;
  }
}
