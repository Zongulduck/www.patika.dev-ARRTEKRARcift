import java.util.Arrays;
public class Main {
    static boolean Kontrol(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return false;}}
        return true;}
    public static void main(String[] args) {
        int[] dizi = {2,2,2,4,4,4,4,5,5,5,5,5,7,7,7,7,7,8,8,8,8,8,8,10,10,10,8,3,3,3,12,12,12};
        int[] dizi2 = new int[dizi.length];
        int index = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (i != j && (dizi[i]) == dizi[j]) {
                    if (Kontrol(dizi2, dizi[i])) {
                        dizi2[index] = dizi[i];
                        index++;
                        break;
                    }}}}
        for (int i: dizi2){
            if (i!=0 && i%2==0){
                System.out.println(i);
            }}}}