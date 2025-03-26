
public class VideoEditor {

 public String video;
 public String text = ""; 
 public Float contrast = 0.0f;

 public CommandHistory myHistory = new CommandHistory(); 



 public VideoEditor(String video)
 {
      this.video = video;
 }



 //Text methods
 public String getText(){
   
   return text;
}

 public void setText(String text) {

      this.text = text;
 }

 public void removeText() {

      this.text = "";
 }
 


 //Contrast functions

 public float getContrast() {
 
    return contrast;
 }
 
 public void setContrast(float contrast) { 

    this.contrast = contrast;
 }

 public void removeContrast() {

      
 }



//Undo method
public void undo(){

   if(!myHistory.isEmpty()){

         myHistory.pop().undo();

   }
}

public void executeOperation(Command operation){

   myHistory.executeOperation(operation);  

}


 
 public String toString() {
 
    return "VideoEditor{ video= " + video + ", contrast=" + contrast + ", text='" + text + '\'' + '}';
 }
}