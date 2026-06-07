import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
//        try(InputStreamReader isr=new InputStreamReader(System.in)){
//            System.out.println("Enter some letters:");
//            int letters=isr.read();
//            while(isr.ready()){
//                System.out.println((char)letters);
//                letters= isr.read();
//            }
//            isr.close();
//            System.out.println();
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }
      
        try(FileReader Fr =new FileReader("File handling/src/note.txt")){
            System.out.println("Enter some letters:");
            int letters= Fr.read();
            while(Fr.ready()){
                System.out.println((char)letters);
                letters= Fr.read();
            }
            Fr.close();
            System.out.println();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}