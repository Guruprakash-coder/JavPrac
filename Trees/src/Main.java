import com.sun.source.tree.Tree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("dfs");
        String s="dfs";
        System.out.println(sb.equals(s));

        StringBuilder ans= new StringBuilder(sb.substring(0, sb.length()));
        System.out.println(ans);

        }
    }
