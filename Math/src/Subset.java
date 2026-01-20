import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {

    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();

        outer.add(new ArrayList<>());
        for(int i=0;i<arr.length;i++){
            int n=outer.size();
            for(int j=0;j<n;j++){
                List<Integer> internal =new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
    static List<List<Integer>> subsetnoDup(int[] arr){
        Arrays.sort(arr);

        List<List<Integer>> outer=new ArrayList<>();

        outer.add(new ArrayList<>());
        int s=0;
        int e=0;
        for(int i=0;i<arr.length;i++){
            s=0;
            if(i>0 && arr[i]==arr[i-1]){
                s=e+1;
            }
            e= outer.size()-1;
            int n=outer.size();
            for(int j=s;j<n;j++){
                List<Integer> internal =new ArrayList<>(outer.get(j));
                internal.add(i);
                outer.add(internal);
            }
        }
        return outer;
    }

}
/*
static List<List<Imteger>> subsnoDup(int[] arr){
    Arrays.sort(arrt);
    List<List<Integer>> outer=new ArrayList<>();
    outer.add(new ArrayList<>());
    int s=0;
    int e=0;
    for(int i=0;i<arr.lengthli++)
    {
    s=0;
    if(i>0 && arr[i]==arr[i-1]){
    s=e+1;
    }
    e=outer.size()-1;
    for(int j=s;j<n;j++){
    List<Integer> internal=new ArrayList<>(outer.get(j));
    internal.add(arr[i]);
    outer.add(internal);
    }
    }
    return outer;
}
 */
