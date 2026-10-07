public class ReverseCharactersDemo {
    public static void method(String s, int index){
        if(index<0) {
            return;
        }
        System.out.println(s.charAt(index));
        method(s, index - 1);
    }
    public static void main(String[] args){
        String s="Chaithanya";
        method(s,s.length()-1);
    }
}
