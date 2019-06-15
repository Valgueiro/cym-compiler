int addInt(){
    int a = 5;
    int b = 2;

    int addWInts = 3+2;
    addWInts = a + b;
    addWInts = a + 3;
    addWInts = 3 + b;
    addWInts = a + 2 + b + 3;

    return addWInts; 
}

float addFloat(){
    float a = 5.3;
    float b = 2.455;

    float addWFloats = 3.32+2.232;
    addWFloats = a + b;
    addWFloats = a + 3.32;
    addWFloats = 3.32 + b;
    addWFloats = a + 2.11 + b + 3.222;

    return addWFloats; 
}

float addIntFloat(){
    int a = 3;
    float b = 3.43;

    float addWIntFloats = 4+2.232;
    addWIntFloats = a + b;
    addWIntFloats = a + 3.32;
    addWIntFloats = 3 + b;
    addWIntFloats = a + 2 + b + 3.222;
    return addWIntFloats;
}

int subInt(){
    int a = 5;
    int b = 2;

    int subWInts = 3-2;
    subWInts = a - b;
    subWInts = a - 3;
    subWInts = 3 - b;
    subWInts = a - 2 - b - 3;

    return subWInts; 
}

float subFloat(){
    float a = 5.3;
    float b = 2.455;

    float subWFloats = 3.32-2.232;
    subWFloats = a - b;
    subWFloats = a - 3.32;
    subWFloats = 3.32 - b;
    subWFloats = a - 2.11 - b - 3.222;

    return subWFloats; 
}

float subIntFloat(){
    int a = 3;
    float b = 3.43;

    float subWIntFloats = 4 - 2.232;
    subWIntFloats = a - b;
    subWIntFloats = a - 3.32;
    subWIntFloats = 3 - b;
    subWIntFloats = a - 2 - b - 3.222;
    return subWIntFloats;
}

int main(){
    int x = addInt();
    float y = addFloat();
    y = addIntFloat();

    x = subInt();
    y = subFloat();
    y = subIntFloat();
    return 0;
}