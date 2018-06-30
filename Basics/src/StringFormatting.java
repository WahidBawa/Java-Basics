public class StringFormatting {
    public static void main(String[] args) {
        String info = "";
        info += "My name is Bob.";
        info += " ";
        info += "I am a builder";
        System.out.println(info);

        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");
//        System.out.println(sb.toString());
        System.out.println(sb);

        StringBuilder s = new StringBuilder();
        s.append("My name is roger.")
        .append(" ")
        .append("I am a skydiver.");
        System.out.println(s);
    }
}
