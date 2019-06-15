define i1 @andOrExpr() #0 { 
 %a = alloca i1, align 4
 store i1 1, i1* %a, align 4
 
 %b = alloca i1, align 4
 %1 = load i1, i1* %a, align 4
 
 %2 = and i1 0, %1
 
 store i1 %2, i1* %b, align 4
 
 %res = alloca i1, align 4
 %3 = and i1 1, 1
 
 store i1 %3, i1* %res, align 4
 
 %4 = load i1, i1* %a, align 4
 
 %5 = load i1, i1* %b, align 4
 
 %6 = and i1 %4, %5
 
 store i1 %6, i1* %res, align 4
 
 %7 = load i1, i1* %a, align 4
 
 %8 = load i1, i1* %b, align 4
 
 %9 = or i1 %7, %8
 
 store i1 %9, i1* %res, align 4
 
 %10 = load i1, i1* %a, align 4
 
 %11 = and i1 1, %10
 
 %12 = load i1, i1* %b, align 4
 
 %13 = and i1 %11, %12
 
 %14 = and i1 %13, 0
 
 store i1 %14, i1* %res, align 4
 
 %15 = load i1, i1* %a, align 4
 
 %16 = or i1 1, %15
 
 %17 = load i1, i1* %b, align 4
 
 %18 = or i1 %16, %17
 
 %19 = or i1 %18, 0
 
 store i1 %19, i1* %res, align 4
 
 %20 = load i1, i1* %a, align 4
 
 %21 = or i1 1, %20
 
 %22 = load i1, i1* %b, align 4
 
 %23 = and i1 %21, %22
 
 %24 = or i1 %23, 0
 
 %25 = load i1, i1* %a, align 4
 
 %26 = and i1 %24, %25
 
 %27 = or i1 %26, 1
 
 store i1 %27, i1* %res, align 4
 
 %28 = load i1, i1* %res, align 4
 
 ret i1 %28

}
define i1 @CompExpr() #0 { 
 %a = alloca i32, align 4
 store i32 5, i32* %a, align 4
 
 %b = alloca float, align 4
 store float 0x40a0000000000000, float* %b, align 4
 
 %res = alloca i1, align 4
 %1 = load i32, i32* %a, align 4
 
 %2 = load float, float* %b, align 4
 
 %3 = sitofp i32 %1 to float
 %4 = fcmp ogt float %3, %2
 
 store i1 %4, i1* %res, align 4
 
 %5 = load i32, i32* %a, align 4
 
 %6 = icmp sgt i32 %5, 3
 
 store i1 %6, i1* %res, align 4
 
 %7 = load float, float* %b, align 4
 
 %8 = fcmp olt float %7, 0x40adc28f00000000
 
 store i1 %8, i1* %res, align 4
 
 %9 = load i32, i32* %a, align 4
 
 %10 = icmp sle i32 %9, 3
 
 %11 = load float, float* %b, align 4
 
 %12 = fcmp oge float %11, 0x40adc28f00000000
 
 %13 = and i1 %10, %12
 
 %14 = load float, float* %b, align 4
 
 %15 = sitofp i32 5 to float
 %16 = fcmp oeq float %14, %15
 
 %17 = icmp ne i1 %16, 0
 
 %18 = and i1 %13, %17
 
 store i1 %18, i1* %res, align 4
 
 %19 = load i32, i32* %a, align 4
 
 %20 = sitofp i32 %19 to float
 %21 = fcmp one float %20, 0x404eb85200000000
 
 %22 = load i32, i32* %a, align 4
 
 %23 = load float, float* %b, align 4
 
 %24 = sitofp i32 %22 to float
 %25 = fcmp one float %24, %23
 
 %26 = and i1 %21, %25
 
 store i1 %26, i1* %res, align 4
 
 %27 = load i1, i1* %res, align 4
 
 ret i1 %27

}
define i1 @notExpr() #0 { 
 %a = alloca i1, align 4
 store i1 1, i1* %a, align 4
 
 %b = alloca i1, align 4
 %1 = load i1, i1* %a, align 4
 
 %2 = icmp ne i1 %1, 0
 
 store i1 %2, i1* %b, align 4
 
 %res = alloca i1, align 4
 %3 = load i1, i1* %a, align 4
 
 %4 = icmp ne i1 %3, 0
 
 %5 = load i1, i1* %b, align 4
 
 %6 = and i1 %4, %5
 
 store i1 %6, i1* %res, align 4
 
 %7 = load i1, i1* %b, align 4
 
 %8 = load i1, i1* %a, align 4
 
 %9 = or i1 %7, %8
 
 %10 = load i1, i1* %b, align 4
 
 %11 = icmp ne i1 %10, 0
 
 %12 = and i1 %9, %11
 
 store i1 %12, i1* %res, align 4
 
 %13 = load i1, i1* %res, align 4
 
 %14 = icmp ne i1 %13, 0
 
 store i1 %14, i1* %res, align 4
 
 %15 = load i1, i1* %res, align 4
 
 ret i1 %15

}
define i32 @main() #0 { 
 %x = alloca i1, align 4
 %1 = call i1 @andOrExpr()
 
 store i1 %1, i1* %x, align 4
 
 %2 = call i1 @CompExpr()
 
 store i1 %2, i1* %x, align 4
 
 ret i32 0

}
