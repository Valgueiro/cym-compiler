define i32 @returnInt() #0 { 
 ret i32 1

}
define float @returnFloat() #0 { 
 ret float 0x4089999a00000000

}
define i1 @returnBoolean() #0 { 
 ret i1 1

}
define i32 @declarationTest() #0 { 
 %varDeclarationTest = alloca i32, align 4
 
 %varDeclarationTest2 = alloca float, align 4
 
 %varDeclarationTest3 = alloca i1, align 4
 
 ret i32 0

}
define i32 @returnArgIntTest(i32) #0 { 
%argIntTest = alloca i32, align 4
store i32 %0, i32* %argIntTest, align 4
 %2 = load i32, i32* %argIntTest, align 4
 
 ret i32 %2

}
define float @returnArgFloatTest(float) #0 { 
%argFloatTest = alloca float, align 4
store float %0, float* %argFloatTest, align 4
 %2 = load float, float* %argFloatTest, align 4
 
 ret float %2

}
define i1 @returnArgBooleanTest(i1) #0 { 
%argBooleanTest = alloca i1, align 4
store i1 %0, i1* %argBooleanTest, align 4
 %2 = load i1, i1* %argBooleanTest, align 4
 
 ret i1 %2

}
define i32 @assignTest() #0 { 
 %varAssignTest = alloca i32, align 4
 store i32 2, i32* %varAssignTest, align 4
 
 %varAssignTest2 = alloca i32, align 4
 store i32 3, i32* %varAssignTest2, align 4
 
 %varAssignTest3 = alloca float, align 4
 store float 0x400ccccd00000000, float* %varAssignTest3, align 4
 
 %varAssignTest4 = alloca i1, align 4
 store i1 1, i1* %varAssignTest4, align 4
 
 %1 = load i32, i32* %varAssignTest2, align 4
 
 store i32 %1, i32* %varAssignTest, align 4
 
 store i1 0, i1* %varAssignTest4, align 4
 
 ret i32 0

}
define i32 @numOperationTest() #0 { 
 %varNumOperationTest = alloca i32, align 4
 %1 = add i32 2, 2
 
 store i32 %1, i32* %varNumOperationTest, align 4
 
 %2 = sub i32 2, 2
 
 store i32 %2, i32* %varNumOperationTest, align 4
 
 %3 = mul i32 2, 2
 
 store i32 %3, i32* %varNumOperationTest, align 4
 
 %4 = sdiv i32 2, 2
 
 store i32 %4, i32* %varNumOperationTest, align 4
 
 %varNumOperationTest2 = alloca float, align 4
 %5 = fadd float 0x4039999a00000000, 0x3dcccccd00000000
 
 store float %5, float* %varNumOperationTest2, align 4
 
 %6 = fsub float 0x4039999a00000000, 0x3e4ccccd00000000
 
 store float %6, float* %varNumOperationTest2, align 4
 
 %7 = fmul float 0x4030000000000000, 0x4106e14800000000
 
 store float %7, float* %varNumOperationTest2, align 4
 
 %8 = fdiv float 0x3f80000000000000, 0x3f00000000000000
 
 store float %8, float* %varNumOperationTest2, align 4
 
 ret i32 0

}
define i1 @booleanOperationTest() #0 { 
 %varBooleanOperationTest = alloca i1, align 4
 %1 = and i1 1, 1
 
 store i1 %1, i1* %varBooleanOperationTest, align 4
 
 %2 = or i1 1, 0
 
 store i1 %2, i1* %varBooleanOperationTest, align 4
 
 %varNumOperationTest = alloca i1, align 4
 %3 = icmp sgt i32 2, 1
 
 store i1 %3, i1* %varNumOperationTest, align 4
 
 %4 = icmp slt i32 2, 1
 
 store i1 %4, i1* %varNumOperationTest, align 4
 
 %5 = icmp eq i32 2, 1
 
 store i1 %5, i1* %varNumOperationTest, align 4
 
 %6 = icmp ne i32 2, 1
 
 store i1 %6, i1* %varNumOperationTest, align 4
 
 ret i1 1

}
define i32 @multipleArgsTest(i32, i32, i32, i32) #0 { 
%argTest1 = alloca i32, align 4
%argTest2 = alloca i32, align 4
%argTest3 = alloca i32, align 4
%argTest4 = alloca i32, align 4
store i32 %0, i32* %argTest1, align 4
store i32 %1, i32* %argTest2, align 4
store i32 %2, i32* %argTest3, align 4
store i32 %3, i32* %argTest4, align 4
 %varMultipleArgsTest = alloca i32, align 4
 %5 = load i32, i32* %argTest1, align 4
 
 %6 = load i32, i32* %argTest2, align 4
 
 %7 = add i32 %5, %6
 
 %8 = load i32, i32* %argTest3, align 4
 
 %9 = add i32 %7, %8
 
 %10 = load i32, i32* %argTest4, align 4
 
 %11 = add i32 %9, %10
 
 store i32 %11, i32* %varMultipleArgsTest, align 4
 
 %12 = load i32, i32* %varMultipleArgsTest, align 4
 
 ret i32 %12

}
define i32 @ifTest() #0 { 
 %varIfTest = alloca i1, align 4
 store i1 1, i1* %varIfTest, align 4
 
 ret i32 0

}
define i32 @callTest() #0 { 
 %varCallTest = alloca i32, align 4
 %1 = call i32 @returnInt()
 
 store i32 %1, i32* %varCallTest, align 4
 
 %varCallTest2 = alloca float, align 4
 %2 = call float @returnFloat()
 
 store float %2, float* %varCallTest2, align 4
 
 %3 = call i32 @ifTest()
 
 store i32 %3, i32* %varCallTest, align 4
 
 %4 = call i32 @multipleArgsTest(i32 1, i32 2, i32 3, i32 4)
 
 store i32 %4, i32* %varCallTest, align 4
 
 ret i32 0

}
