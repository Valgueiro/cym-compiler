boolean andOrExpr(){
    boolean a = true;
    boolean b = false && a;

    boolean res = true && true;
    res = a && b;
    res = a || b;
    res = true && a && b && false;
    res = true || a || b || false; 
    res = true || a && b || false && a || true; 

    return res; 
}

boolean CompExpr(){
    int a = 5;
    float b = 5.00;
    boolean res = a > b;

    res = a > 3;
    res = b < 5.43;
    res = a <= 3 && b >= 5.43;
    
    return res; 
}



int main(){
    boolean x = andOrExpr();

    return 0;
}