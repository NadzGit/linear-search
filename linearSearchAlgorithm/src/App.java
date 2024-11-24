import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int size = intInput("How long do you want your list?");
        int searchKey = intInput("What number do you want to search for?"); 
        linearSearchAlgorithm(size, searchKey);
    }
    public static int intInput(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int input = Integer.parseInt(scanner.nextLine());
        
        return input;
    } 
    public static int[] createArray(int size){
        int[]a = new int[size];
        return a;
    }

    public static int [] fillArray(int[]a, int size){
        for(int i = 0;i<size;i++){
           a[i] = intInput("Type position "+ (i+1)+ " in the list.");
        }
        return a;
    }

    public static void checkArray(int searchKey, int size, int []a){
        int i = 0;
        while((i < size)&& a[i] != searchKey){
            for(i = 0;i < size; i++){
                    if (a[i] == searchKey){
                        System.out.println("Found at position "+ i+ ".");
                        return;
                    }

                    else{
                        if (i == size-1){
                            System.out.println("Not found.");
                        }
                    }                   
                }
            }
        

    }
    
    public static void linearSearchAlgorithm(int size, int searchKey){
        int[]a = createArray(size);
        a = fillArray(a, size);
        checkArray(searchKey,size,a);
    }
}
