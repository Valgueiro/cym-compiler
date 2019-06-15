define i32 @create() #0 { 
 ret i32 5

}
define i32 @main() #0 { 
 %1 = call i32 @create()
 
 ret i32 0

}
