public class searchinrange {
    public static void main(String[] args) {
        String name="Guruprakash";
        char key='p';
        System.out.println(searchinrange(name,key,3,9));
    }
    static boolean searchinrange(String str,char key,int st,int end){
        {

            if(str.length()==0){
                return false;
            }

            for(int i=st;i<=end;i++){
                if(str.charAt(i)==key){
                    return true;
                }
            }
            return false;
        }
    }
}
