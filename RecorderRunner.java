

public class RecorderRunner{
    public static void main(String[] args){
        Recorder recorder = new Recorder();
        recorder.recording("key1", "value1");
        recorder.recording("key1", null);
        recorder.recording("key1", "Delete");
        try{
           recorder.recording("key10", "Delete");
        }catch(IllegalArgumentException e){
           e.printStackTrace(); 
        }
            recorder.recording("key2", "value2");
            recorder.recording(null, null);
    }
    
}