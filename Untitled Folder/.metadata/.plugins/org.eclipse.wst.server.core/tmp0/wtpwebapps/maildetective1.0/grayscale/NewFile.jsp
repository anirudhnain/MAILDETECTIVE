<!-- The MIT License (MIT)

Copyright (c) IIIT-DELHI 
authors:
HEMANT JAIN "hjcooljohny75@gmail.com"
ANIRUDH NAIN 


Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE. -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.io.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ page import="check.mailchecker" %>
<%@ page import="check.test2" %>
<%@ page import="check.test4other" %>
<%@ page import="check.test4starred" %>
<%@ page import="check.Laj" %>
<%String name=request.getParameter("user");
String pass=request.getParameter("password");
System.out.println(name);
System.out.println(pass);	
mailchecker x =new mailchecker();
int j=0;%>
<%! public String[] id =new String[4];%>
<% String[] xyz=new String[2];
id[0]=name;
id[1]=pass;
xyz[0]=name;
xyz[1]=pass;
System.out.println("hiii");
int i=mailchecker.mai(xyz);
System.out.println("hiii");
//int i=mailchecker.fla;
System.out.println(i);
String site;
if(i==1)
{ site ="gmail_like.jsp?item="+j;

Thread thread = new Thread(){
    

public void run(){
	Laj demol = new Laj();
	id[2]="inbox";
	id[3]="read1.txt";
	
	try{
		
	Laj.mai(id);
} catch (Exception e) {
    e.printStackTrace();
  }   finally
  {}
System.out.println("Thread1 Running");


try{
	
	Laj demo = new Laj();
	id[2]="[Gmail]/Spam";
	id[3]="read2.txt";
	
Laj.mai(id);

} catch (Exception e) {
e.printStackTrace();
}   
System.out.println("Thread2 Running");

try{
	
	Laj demo = new Laj();
	id[2]="[Gmail]/Starred";
	id[3]="read.txt";
	
Laj.mai(id);

} catch (Exception e) {
e.printStackTrace();
}   
System.out.println("Thread3 Running");
try{
	
	Laj demo = new Laj();
	id[2]="[Gmail]/Drafts";
	id[3]="read3.txt";
	
Laj.mai(id);

} catch (Exception e) {
e.printStackTrace();
}   
System.out.println("Thread4 Running");

try{
	
	Laj demo = new Laj();
	id[2]="[Gmail]/Trash";
	id[3]="read4.txt";
	
Laj.mai(id);

} catch (Exception e) {
e.printStackTrace();
}   
System.out.println("Thread5 Running");
try{
	
	Laj demo = new Laj();
	id[2]="[Gmail]/Sent";
	id[3]="read5.txt";
	
Laj.mai(id);

} catch (Exception e) {
e.printStackTrace();
}   
System.out.println("Thread6 Running");

try{
	
	Laj demo = new Laj();
	id[2]="[Gmail]/All";
	id[3]="read6.txt";
	
Laj.mai(id);

} catch (Exception e) {
e.printStackTrace();
}   
System.out.println("Thread7 Running");



}  
//printLines(command + " stdout:", pro.getInputStream());
//printLines(command + " stderr:", pro.getErrorStream());
// pro.waitFor();
//System.out.println(command + " exitValue() " + pro.exitValue());
// runProcess("javac test2.java");
//runProcess("java test2 "+id+" "+pass+" "+choice+" &");

   };

thread.start();

    



	
}
else
	site = "index.jsp";
	

   // New location to be redirected
  
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site);%>
<title>Insert title here</title>
</head>
<body>

</body>
</html>