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
 
 %7 = load i32, i32* %a, align 4
 
 %8 = sitofp i32 %7 to float
 %9 = fcmp olt float %8, 0x40547ae100000000
 
 %10 = and i1 %6, %9
 
 %11 = load i32, i32* %a, align 4
 
 %12 = icmp sge i32 %11, 5
 
 %13 = and i1 %10, %12
 
 %14 = load i32, i32* %a, align 4
 
 %15 = icmp sle i32 %14, 17
 
 %16 = or i1 %13, %15
 
 store i1 %16, i1* %res, align 4
 
 %17 = load float, float* %b, align 4
 
 %18 = fcmp olt float %17, 0x40adc28f00000000
 
 %19 = load float, float* %b, align 4
 
 %20 = fcmp ogt float %19, 0x405eb85200000000
 
 %21 = and i1 %18, %20
 
 %22 = load float, float* %b, align 4
 
 %23 = sitofp i32 2 to float
 %24 = fcmp ole float %23, %22
 
 %25 = and i1 %21, %24
 
 %26 = load float, float* %b, align 4
 
 %27 = sitofp i32 24 to float
 %28 = fcmp oge float %26, %27
 
 %29 = and i1 %25, %28
 
 store i1 %29, i1* %res, align 4
 
 %30 = load i32, i32* %a, align 4
 
 %31 = icmp sle i32 %30, 3
 
 %32 = load float, float* %b, align 4
 
 %33 = fcmp oge float %32, 0x40adc28f00000000
 
 %34 = and i1 %31, %33
 
 %35 = load float, float* %b, align 4
 
 %36 = sitofp i32 5 to float
 %37 = fcmp oeq float %35, %36
 
 %38 = icmp ne i1 %37, 0
 
 %39 = and i1 %34, %38
 
 store i1 %39, i1* %res, align 4
 
 %40 = load i32, i32* %a, align 4
 
 %41 = sitofp i32 %40 to float
 %42 = fcmp one float %41, 0x404eb85200000000
 
 %43 = load i32, i32* %a, align 4
 
 %44 = load float, float* %b, align 4
 
 %45 = sitofp i32 %43 to float
 %46 = fcmp one float %45, %44
 
 %47 = and i1 %42, %46
 
 store i1 %47, i1* %res, align 4
 
 %52 = load i1, i1* %res, align 4
 
 %48 = icmp eq i32 3, 4
 
 %49 = sitofp i32 4 to float
 %50 = fcmp one float %49, 0x408e666600000000
 
 %51 = and i1 %48, %50
 
 %53 = and i1 %52, %51
 
 store i1 %53, i1* %res, align 4
 
 %54 = load i1, i1* %res, align 4
 
 %55 = icmp ne i1 %54, 0
 
 ret i1 %55

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
