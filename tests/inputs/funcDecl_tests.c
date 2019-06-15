int sum (int a, int b){
    float x = a * 5;
    x = 10 + 5;
    return a + b;
}

boolean and(boolean a, boolean b, boolean c){
    return a && !b || c;
}

float retFloat(){
    return 3 - 4;
}

int retInt(){
    return 4.33-10.4;
}

int div(float a, float b){
    a = 17.45;
    return a/b;
}

boolean oxe(int e, float b, boolean x){
    return (e > b) && x;
}

int main(){
    int x = sum(5,3);
    int w = retFloat();
    float y = retInt();
    boolean z = and(true, false, true);

    x = div(3.5, 4.33);
    x = sum(w, retInt());
    z = oxe(x, y, z);
}