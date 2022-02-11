import java.util.HashMap;
import java.util.Map;

public class Recorder{
    private Map<String, String> map = new HashMap<>();

    public void recording(String key, String value){
        if (key == null && value == null){
            this.map.clear();
            System.out.println("Empty");
        }else if (key != null && value == null){
            this.map.get(key);
        }else if (key != null && value.equals("Delete")){
            Object key2 = this.map.remove(key);
            if (key2 == null){
                throw new IllegalArgumentException();
            }else{
                System.out.println(key + " deleted");
            }
        }else{
            this.map.put(key, value);
            System.out.println(key + "=" + value);   
        }
    } 
}  