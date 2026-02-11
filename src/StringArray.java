import java.util.Arrays;

public class StringArray {

    String[] values;

    public StringArray(String[] values) {
        this.values = values;
        System.out.println("New StringArray, Length: " + values.length);
    }

    public void append(String newValue){
        String[] newValues = new String[values.length + 1];
        for(int i = 0; i < values.length; i++){
            newValues[i] = values[i];
        }
        newValues[values.length] = newValue;
        values = newValues;
    }

    public void insert(int index, String value){
        append(null);
        for(int i = values.length-1; i > index; i--){
            values[i] = values[i-1];
        }
        values[index] = value;
        System.out.printf("Insert %s at %d\n", value, index);
    }

    public void reverse(){
        String[] reverseValues = new String[values.length];
        for(int i = 0; i < values.length/2; i++){
            reverseValues[i] = values[values.length-i-1];
        }
        values = reverseValues;
        System.out.println("Reversed");
    }

    public String toString() {
        String ret;
        ret = Arrays.toString(values);
        return ret;
    }
}
