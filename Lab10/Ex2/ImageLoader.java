
public class ImageLoader {

   private static ImageLoader instance = null;

   private  ImageLoader(){

   }
   public static ImageLoader getinstance(){
      if(instance == null ){
         instance = new ImageLoader();
      }
      return instance;
   }

   public String loadImage(){
      return "Loaded successfully";
   }
}