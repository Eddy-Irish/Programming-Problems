package HashClasses;

public class CustomHashMap {

    private int defaultCapacity = 16;
    public MapEntry<K, V>[] table;

    public CustomHashMap(){
        table = new MapEntry[defaultCapacity];
    }
    
}
