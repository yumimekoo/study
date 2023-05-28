// Lab 3 (graded) Anton L.//
// Exercise 3-1 - Special Pythagorean Triplet//

void triplet (){
    for (int a = 1; a < 1001; a++){
        for (int b = a + 1; b < 1000; b++){
            double cSqt = (a*a) + (b*b);
            double c = Math.pow(cSqt,0.5);
            
            if(a+b+c==1000){
                System.out.println("a = "+a+" | b = "+b+" | c = "+c);
                double p = a*b*c;
                System.out.println("Product: "+p);
                break;
            }
        }
    } 
}

// Exercise 3-2 - Send more Money//
// Optionally you can put m!=0 if you dont want that the number "MONEY" starts with 0 //
// Only number not starting with 0 is: s = 9| e = 5| n = 6| d = 7| m = 1| o = 0| r = 8| y = 2//

void money (){
    for (int s = 0; s<10; s++){
        for (int e = 0; e<10; e++){
            for (int n = 0; n<10; n++){
                for (int d = 0; d<10; d++){
                    for (int m = 0; m<10; m++){
                        for (int o = 0; o<10; o++){
                            for (int r = 0; r<10; r++){
                                for (int y = 0; y<10; y++){
                                    int send = (s*1000)+(e*100)+(n*10)+(d);
                                    int more = (m*1000)+(o*100)+(r*10)+(e);
                                    int money = (m*10000)+(o*1000)+(n*100)+(e*10)+(y);
                                    if(s!=e && s!=n && s!=d && s!=m && s!=o && s!=r && s!=y
                                            && e!=n && e!=d && e!=m && e!=o && e!=r && e!=y
                                                    && n!=d && n!=m && n!=o && n!=r && n!=y
                                                            && d!=m && d!=o && d!=r && d!=y
                                                                    && m!=o && m!=r && m!=y
                                                                            && o!=r && o!=y
                                                                                    && r!=y //&& m!=0//
                                        && send+more==money){
                                            System.out.println("s = "+s+"| e = "+e+"| n = "+n+"| d = "+d+"| m = "+m+"| o = "+o+"| r = "+r+"| y = "+y);
                                            System.out.println(send+" "+more+" "+money);
                                        }
                                }
                            }
                        } 
                    }
                }          
            } 
        }     
    }       
}

// Exercise 3-3 - Chinese Remainder//

void chinese (){
    int x = 0;
    while(true){
        x++;
        if(x%3==2 && x%5==3 && x%7==2){
            System.out.println("Lowest number is: "+x);
            break;
        }
    } 
    
}

// Exercise 3-4 - Palindrome//

boolean isPalindrome (String s){
    String l = s.toLowerCase();  // i would do this, if "s.toLowerCase" was allowed (also change all s to l in line 75), because it prevents palindromes considered as false if one letter is uppercase//
    for(int i = 0; i < l.length()/2; i++){
        if((int)l.charAt(i)!=(int)s.charAt(l.length()-1-i)){
            return false;
        }
    }
    return true;
}

// Exercise 3-5 - Guess Number//

int enterInt() {
    System.out.print("Please enter an integer ");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
}

int getRandomNumber() {
    double x = Math.random();
    x = x * 100 + 1;
    return (int)x;
}

void play() {
int x = getRandomNumber();
int y = enterInt();
    while(x!=y){
        if(x>y){
            System.out.println("Your number is too low!");
        } else {
            System.out.println("Your number is too high!");
        }
        System.out.println(); //extra linebreak just for the better playing experience ;) //
        y = enterInt();
    }
    System.out.println("You won!");
}

// best tactic to guess the number is to always guess the half of given field, starting with 50 //
//(f.e. if it says too high, than the next guess is the half of 1 and 50 and so on.) //

// Exercise 3-6 - ASCII Table//

void pAscii (){
    System.out.println("     0 1 2 3 4 5 6 7 8 9");
    System.out.println("------------------------");
    for (int i = 32; i<127;i++){
        if (i==32||i%10==0){
            System.out.print(i/10*10);
            if (i<100){
                System.out.print(" ");
            }
            System.out.print("|");
            if (i<40){
                System.out.print("    ");
            }
        }
        System.out.print(" " + (char)i);
        if(i%10 != 9){
            continue;
        }
        System.out.println();
    } 
}

// Exercise 3-7 - Scores of Names//

void scoreName (String s){
    int c = 0;
    for (int i=0;i<s.length();i++){
        c = c + ((int)s.charAt(i) - 64);
    }
    System.out.println("Score of: "+s+" = "+c);
}

// MARY         =   57
// PATRICIA     =   77
// LINDA        =   40
// BARBARA      =   43
// ELIZABETH    =   88
// JENNIFER     =   81
// MARIA        =   42
// SUSAN        =   74

void palNumber(){
    int sum;
    for(int a = 999; a <= 0; a--){
        for(int b = 999; b <= 0; b--){
            sum = a*b;
            if(sum!=0){
            String s = String.valueOf(sum);
            for(int i = 0; i < s.length()/2; i++){
                if((int)s.charAt(i)==(int)s.charAt(s.length()-1-i)){
                    System.out.println(sum);
                }

            }
            }   
        }   

    }
}

String eToE(String s) {
    String st = "";
    for (int i = 0; i < s.length(); i++){
       char c = s.charAt(i);
       if ((int)c<91 && (int)c>64) {
        int x = ((int)c+32);
        c = (char)x;
         st = st + c;
       }  else {
         st = st + c;
       }
       
    }
    return st;
 }