public class KarpRabin {
    private final int PRIME=101;

    private long calculateHash(String str){
        long hash=0;
        for(int i=0;i<str.length();i++){
            hash=(long)(hash+str.charAt(i)*Math.pow(PRIME,i));

        }

        return hash;
    }
    private long updateHash(long prevHash,char oldChar,char newChar,int patterLength){
        long newHash=(prevHash-oldChar)/PRIME;

    }
}
