//
//Exercise 2-1 Sign Function//
int sign(double x){
    if (x>0){
        return 1;
    }
    if (x==0){
        return 0;
    } else {
        return -1;
    }
}
/*Exercise 2-2 Collatz Number
I hope thats okay, if i do that in a method */

int collatz (int n){
    int colNum;
    if (n%2==0){
        colNum = n/2;
    } else {
        colNum = 3*n+1;
    }
    return colNum;
}
//if put in a loop and repeated with the result, the collatz number will always end on "4" "2" "1" "4" "2" "1" ... //

// Exercise 2-3 Max//
int max(int a, int b, int c){
    int max;
    if (a>b){
        if (a>c){
            max = a;
        } else {
            max = c;
        }
 
    } else {
        if(b>c){
            max = b;
        } else {
            max = c;
        }
    }
    return max;
}

//Exercise 2-4 FizzBuzz//

void go() {
    System.out.print("Please input an integer: ");
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    printFizzBuzz(i);
}

void printFizzBuzz(int x) {;
    if (x%3==0){
        if (x%5==0){
            System.out.println("FizzBuzz");
        } else {
            System.out.println("Fizz");
        }
 
    } else {
        if(x%5==0){
            System.out.println("Buzz");
        } else {
            System.out.println("No FizzBuzz for you ;(");
        }
        //optionally you can just delete the last else bracket, for no output when not divisable by 3 and 5//
    }  
}

//Exercise 2-5 Triangle//

void triangle1(int n){
    int i,j;
    i=0;
    while (i<n) {
        j=0;
        while (j<=i){
            System.out.print("*");
            j++;
        }
     i++;
     System.out.println();
    }
}

//Exercise 2-6 Euler Problem (i hope i understood the question)//
//i also made it optional to put an integer here, i didnt want to hard code it to the number 100//
int euler(int n){
    int i,j,k,sum;
    i=0;
    j=0;
    k=0;
    while (i<=n){
        j = i+j;
        i++;
    }
    j = j*j;
    i = 0;
    while (i<=n){
        k = i*i+k;
        i++;
    }
    sum = j-k;
    return sum;
}

//Exercise 2-7 Beer//
//in the exercize sheet it says "Use one of more loops to achieve this task." i hope "OF" means "OR" and it was an typo//
void beer(){
    int i;
    i=99;
    while (i>1){
    System.out.print(i);
    System.out.print(" bottles of beer on the wall, ");
    System.out.print(i);
    System.out.print(" bottles of beer.");
    System.out.println();
    System.out.print("Take one down and pass it around, ");
    System.out.print(i);
    System.out.print(" bottles of beer on the wall.");
    System.out.println();
    System.out.println();
    i--;
    }
    System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
    System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
    System.out.println();
    System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
    System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");

}
