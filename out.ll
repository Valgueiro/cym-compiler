define i32 @sum(i32, i32) #0 { 
%a = alloca i32, align 4
%b = alloca i32, align 4
store i32 %0, i32* %a, align 4
store i32 %1, i32* %b, align 4
 %x = alloca float, align 4
 %3 = load i32, i32* %a, align 4
 
 %4 = mul i32 %3, 5
 
 %5 = sitofp i32 %4 to float
 store float %5, float* %x, align 4
 
 %6 = add i32 10, 5
 
 %7 = sitofp i32 %6 to float
 store float %7, float* %x, align 4
 
 %8 = load i32, i32* %a, align 4
 
 %9 = load i32, i32* %b, align 4
 
 %10 = add i32 %8, %9
 
 ret i32 %10

}
define i1 @and(i1, i1, i1) #0 { 
%a = alloca i1, align 4
%b = alloca i1, align 4
%c = alloca i1, align 4
store i1 %0, i1* %a, align 4
store i1 %1, i1* %b, align 4
store i1 %2, i1* %c, align 4
 %6 = load i1, i1* %a, align 4
 
 %4 = load i1, i1* %b, align 4
 
 %5 = icmp ne i1 %4, 0
 
 %7 = and i1 %6, %5
 
 %8 = load i1, i1* %c, align 4
 
 %9 = or i1 %7, %8
 
 ret i1 %9

}
define float @retFloat() #0 { 
 %1 = sub i32 3, 4
 
 %2 = sitofp i32 %1 to float
 ret float %2

}
define i32 @retInt() #0 { 
 %1 = fsub float 0x4092e14800000000, 0x4126666600000000
 
 %2 = fptosi float %1 to i32
 ret i32 %2

}
define i32 @main() #0 { 
 %x = alloca i32, align 4
 %1 = call i32 @sum(i32 5, i32 3)
 
 store i32 %1, i32* %x, align 4
 
 %w = alloca i32, align 4
 %2 = call float @retFloat()
 
 %3 = fptosi float %2 to i32
 store i32 %3, i32* %w, align 4
 
 %y = alloca float, align 4
 %4 = call i32 @retInt()
 
 %5 = sitofp i32 %4 to float
 store float %5, float* %y, align 4
 
 %z = alloca i1, align 4
 %6 = call i1 @and(i1 1, i1 0, i1 1)
 
 store i1 %6, i1* %z, align 4
 
 %7 = call float @retFloat()
 
 %8 = call i32 @retInt()
 
 %9 = call i32 @sum(float %7, i32 %8)
 
 store i32 %9, i32* %x, align 4
 
ret i32 0;

}
