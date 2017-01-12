<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Login Page for Chevron</title>
 <style >
         
        
         #login_form {

            }

            #f1 {
             background-image:url(image2.jpg);
           opacity: 0.5;
                border-color: transparent;
                border-style:groove;
                border-width: 1px;
                padding: 20px 20px 20px 20px;
                
                
            }
            .f1_label {
                white-space:normal;
                
            }
            

            .new {
                background: darkblue;
                text-align: center;
            }
        
body
{
    
    background-image: url(image2.jpg);
   background-repeat: no-repeat;
    background-size: cover;
    padding-bottom:  40px;
    
    
}

</style>
    </head>
 

    
   
    <body>
        <center><h1><font color="white" >Chevron Corporation</h1></center>
        <div id="login_form">
             
            <div class="new"><span>Log In</span></div><br> 
           <form name="f1" method="post" action="Controller" id="f1">
           <input type="hidden" name="operation" value="login"/>  
                     
                        User Name : 
                        <input type="text" name="username"   />
                   <br><br>
                        Password  : 
                        <input type="password" name="password"   />
                        <br><br>
                       </font>
                            <input type="submit" name="login" value="LogIn"/>
             
    
 	
			
    </BODY>
</HTML>​
