import java.util.HashMap;

//Union Data Structure like union in C programming language
//when you add value for key, all other values will be null

public class Union<K, V> {

    private K lastKeyChanged;
    private HashMap<K, V> valuesMap;

    public Union() {
        this.valuesMap = new HashMap<>();
    }

    public void add(K key, V value) {
        valuesMap.put(key, value);
        if (lastKeyChanged != null) {
            valuesMap.remove(lastKeyChanged);
        }
        lastKeyChanged = key;
    }

    public V get(K key){
        return valuesMap.get(key);
    }
}
