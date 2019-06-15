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
    return 4.59-10.4;
}

int main(){
    int x = sum(5,3);
    int w = retFloat();
    float y = retInt();
    boolean z = and(true, false, true);

    x = sum(retFloat(), retInt());
}