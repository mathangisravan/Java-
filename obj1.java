class Calculator{
    int a;
    public int add(int n1,int n2){
        
        int r = n1 + n2;
        return r;

    }
}

class obj1 {
    public static void main(String a[]){
        Calculator calc = new Calculator();
        int n1 = 5;
        int n2 = 7;
        int result = calc.add(n1,n2);
        System.out.println(result);

    }
}
