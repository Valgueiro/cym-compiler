int multInt(){
    int a = 5;
    int b = 2;

    int multWInts = 3*2;
    multWInts = a * b;
    multWInts = a * 3;
    multWInts = 3 * b;
    multWInts = a * 2 * b * 3;

    return multWInts; 
}

float multFloat(){
    float a = 5.3;
    float b = 2.455;

    float multWFloats = 3.32*2.232;
    multWFloats = a * b;
    multWFloats = a * 3.32;
    multWFloats = 3.32 * b;
    multWFloats = a * 2.11 * b * 3.222;

    return multWFloats; 
}

float multIntFloat(){
    int a = 3;
    float b = 3.43;

    float multWIntFloats = 4*2.232;
    multWIntFloats = a * b;
    multWIntFloats = a * 3.32;
    multWIntFloats = 3 * b;
    multWIntFloats = a * 2 * b * 3.222;
    return multWIntFloats;
}

int divInt(){
    int a = 5;
    int b = 2;

    int divWInts = 3/2;
    divWInts = a / b;
    divWInts = a / 3;
    divWInts = 3 / b;
    divWInts = a / 2 / b / 3;

    return divWInts; 
}

float divFloat(){
    float a = 5.3;
    float b = 2.455;

    float divWFloats = 3.32/2.232;
    divWFloats = a / b;
    divWFloats = a / 3.32;
    divWFloats = 3.32 / b;
    divWFloats = a / 2.11 / b / 3.222;

    return divWFloats; 
}

float divIntFloat(){
    int a = 3;
    float b = 3.43;

    float divWIntFloats = 4/2.232;
    divWIntFloats = a / b;
    divWIntFloats = a / 3.32;
    divWIntFloats = 3 / b;
    divWIntFloats = a / 2 / b / 3.222;
    return divWIntFloats;
}

int main(){
    int x = multInt();
    float y = multFloat();
    y = multIntFloat();

    x = divInt();
    y = divFloat();
    y = divIntFloat();
    return 0;
}