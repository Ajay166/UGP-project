class RepeatedlyChars{

    public static void main(String[] args){

        String input="JAVAPROGRAMMING";

        StringBuilder sb=new StringBuilder();
        input.chars().distinct().forEach(c-> sb.append((char)c));

        System.out.println(sb);
   }
}