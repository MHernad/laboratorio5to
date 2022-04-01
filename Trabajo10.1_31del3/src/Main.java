import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> ReverseArray = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            ReverseArray.add(i+1);
        }

        for(int i = ReverseArray.size()-1; i >= 0; i--) {
            System.out.println(ReverseArray.get(i));
        }
    }
}
