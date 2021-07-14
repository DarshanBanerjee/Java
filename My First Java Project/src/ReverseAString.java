public class ReverseAString {
    public static void main(String args[]){
        String name = "Darshan";
        for(int i = name.length(); i < 0; i = i - 1){
            System.out.println(name.charAt(i));
        }
    }
}
