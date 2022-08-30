import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
 
/**
 * Vi du su dung vong lap for duyet cac phan tu cua TreeMap
 * 
 * @author viettuts.vn
 */
public class phucle {
 
    public static void main(String args[]) {
        // khoi tao map
        TreeMap<String, String> map = new TreeMap<String, String>();
        // them cac phan tu vao map
        map.put("J", "Java");
        map.put("C", "C++");
        map.put("P", "PHP");
        map.put("Py", "Python");
        // hien thi map
        show(map);
    }
     
    public static void show(Map<String, String> map) {
      //   Set<String> keySet = map.keySet();
      //   for (String key : keySet) {
      //       System.out.println(key + " - " + map.get(key));
      //   }
      for(String i : map.values()){
         System.out.println(i);
      }
    }
}
