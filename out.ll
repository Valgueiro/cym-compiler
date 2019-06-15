define float @create() #0 { 
 %1 = sub i32 3, 4
 
 %2 = sitofp i32 %1 to float
 ret float %2

}
define i32 @letigo() #0 { 
 %1 = fsub float 0x4092e14800000000, 0x4126666600000000
 
 %2 = fptosi float %1 to i32
 ret i32 %2

}
define i32 @main() #0 { 
 %x = alloca i32, align 4
 %1 = call float @create()
 
 %2 = fptosi float %1 to i32
 store i32 %2, i32* %x, align 4
 
 %y = alloca float, align 4
 %3 = call i32 @letigo()
 
 %4 = sitofp i32 %3 to float
 store float %4, float* %y, align 4
 
ret i32 0;

}
