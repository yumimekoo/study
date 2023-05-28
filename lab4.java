// Exercise 4-1 -   Project Euler Problem 4 //

void palNumber(){
    int sum;
    int c = 0;
    int x = 0;
    int y = 0;
    for(int a = 999; a >= 100; a--){
        for(int b = 999; b >= 100; b--){
            sum = a*b;
            if(isPal(sum)==true){
                if(c<sum){
                    c=sum;
                    x = a;
                    y = b;
                }
                
            }       
        }       
    }
    System.out.println("a = "+x+" | b = "+y+" | Ergebnis: "+c);
}
  
boolean isPal (int x){
    String s = String.valueOf(x);
    for(int i = 0; i < s.length()/2; i++){
        if((int)s.charAt(i)!=(int)s.charAt(s.length()-1-i)){
            return false;
        }
    }
    return true;
}

// Exercise 4-2 - Collatz Sequence //
// I am using "LONG" here to solve the Euler Problem 14 on the Website, because it forces me to find the highest chain under 1.000.000, and that doesnt fir in "INT" anymore ;) //

int lengthOfColSeq(long x){
    int count = 0;
    while(x!=1){
        if (x%2==0){
            x = x/2;
        } else {
            x = 3*x+1;
        }
    count++;
}
return count;
}

long longestColSeq(long n){     // 1000000 instead of 100 to solve the euler problem//
    int cache = 0;
    long result = 0;
    int l = 0;
    for(long i = 1; i < n; i++){    
        l = lengthOfColSeq(i);
        if (cache<l){
            cache = l;
            result = i;
        }    
    }
    return result; 
}
// b. 97 does give the longest ColSeq under 100 //

// Exercise 4-3 - Palindromes //

boolean isPalindrome2(String s){
    String st = "";
    for (int i = 0; i < s.length(); i++){
       char c = s.charAt(i);
       if ((int)c<91 && (int)c>64) {
            int x = ((int)c+32);
            c = (char)x;
            st = st + c;
       }  else {
            if((int)c>96 && (int)c<123){
                st = st + c;
            } else {
                st = st;
            }
       }
       
    }
    for(int i = 0; i < st.length()/2; i++){
        if((int)st.charAt(i)!=(int)st.charAt(st.length()-1-i)){
            return false;
        }
    }
    return true;
}

// Exercise 4-4 - 2-Digits //

int lar2Dig(String s){
    int dig = 0;
    int cache = 0;
    for (int i = 0; i < s.length()-1; i++){
        dig = (((int)s.charAt(i)-48)*10)+((int)s.charAt(i+1)-48);
        //System.out.println(dig);//
        if(dig > cache){
            cache = dig;
        }
    }
    return cache;
}

// Exercise 4-5  Statistics //
// a. //
double meanA (int[] a){
    double sum = 0;
    double mean = 0;
        for (int i:a){
            sum = sum+i;
        }
    mean = sum/a.length;
    return mean;
}
// b. //
double diffA (int [] b){
    double s = 0;
    double diff = 0;
    for (int i:b){
        double sq = (i-meanA(b));
        s = s + (sq*sq); 
    }
    diff = s/b.length;
    return diff;
}

// Exercise 4-6 Int to Array //

int[] intToArr(int n){
    String temp = String.valueOf(n);
    int x = temp.length();
    int [] sum = new int[x];
        for (int i = 0; i<x;i++){
            sum [i] = (temp.charAt(i)-48);

    }
return sum;
}