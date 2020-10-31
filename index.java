// Write a program that will ouptut the following:

// 90 - 100 is a red rectangle 
// 80 - 89 is a blue ellipse
// 70 - 79 is a green rectangle
// 60 - 69 is a yellow ellipse
// 59 and below is a purple rectangle

int num = 60;

void setup() {
	size(500, 500);
}

void draw() {
	background(0);
	noStroke();

  //remove the underline below and complete the instructions
  
  if(num >= 90 && num <= 100){
   // if(num <= 100){
    fill(255, 0, 0);
    rect(100, 100, 20, 20);
  }else if(num >= 80 && num <= 89){
    fill(0, 0, 255);
    ellipse(100, 100, 20, 20);

  }else if(num >= 70 && num <= 70){
    fill(0, 255, 0);
    rect(100, 100, 20, 20);

  }else if(num >= 60 && num <= 69){
    fill(255, 255, 0);
    ellipse(100, 100, 20, 20);
  }else{
    fill(191, 0, 255);
    rect(100, 100, 20, 20);
  }


  
	

}