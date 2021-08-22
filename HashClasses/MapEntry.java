package HashClasses;

public class MapEntry<Integer, Integer> {

    private Integer key;
    private Integer value;
    private MapEntry<Integer, Integer> next;
    
    public MapEntry(Integer k, Integer val, MapEntry<Integer, Integer> nextEntry){
        this.key = k;
        this.value = val;
        this.next = nextEntry;
    }

    public Integer getKey() {
        return key;
    }
    public void setKey(Integer key){
        this.key = key;
    }
    public Integer getValue() {
        return value;
    }
    public void setValue(Integer val){
        this.value = val;
    }
    public MapEntry<Integer, Integer> getNext(){
        return next;
    }
    public void setNext(MapEntry<Integer, Integer> nextEntry){
        this.next = nextEntry;
    }
    
}
