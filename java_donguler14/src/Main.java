import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
int i,j,a=0;
for(i=2;i<101;i++){
    for(j=2;j<i;j++){
        if(i%j==0){
            a++;
        }

        }
    if(a==0){
        System.out.print("  "+i);
    }
    a=0;
}

    }}