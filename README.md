# Weblogin
The login page allows a user to gain access to an application by entering their username and password or by authenticating using a social media login.
Login Page is very common among any type of secured applications and its widely used on the internet for authenticating the user before presenting the secured pages of the web applications. For example to use Facebook you have to get authenticated by the Facebook before they give you access to their platform. The user authentication is done through a special web page called Login Page. The Login page asks you to enter your credentials which is then validated by the application and after successful validation you are presented with the secured part of the application.

In this example we will see the actual use of Login Page in web application or any other type of applications. For example if you have to use Windows or Linux operating system you have to login to the system by providing the username and password. So, login page will validate you to find if you are the authenticated user of the web or not. If not you won't be able to get into the webpage and can't access it , here where we can use forgot password and get reset to  new pasword . The security and authentication of any application is very first process which is in used with the invention of the Operating systems.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
USED:
Java , html , css , Java servelet -- Source Code / 
Mysql workbench -- database /  
Eclipse -- used Java IDE / 
Tomcat server 9.0 used -- server / 
||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
1. First Page(Login) Interface
![Screenshot (31)](https://user-images.githubusercontent.com/86471322/214312770-f9ce8a51-b0b7-4c2d-abbb-32fa6c741f01.png)

2.  SignUp interface
![Screenshot (32)](https://user-images.githubusercontent.com/86471322/214312952-d7d58a9c-6832-414a-9eae-25d7e82591cf.png)

3. After logging into webpage interface
![Screenshot (33)](https://user-images.githubusercontent.com/86471322/214313096-8a2ae81e-56dc-4b5c-a550-9470d3016f8e.png)

4. Forgot Password page
![Screenshot (34)](https://user-images.githubusercontent.com/86471322/214313229-e1cc0dcc-8523-4c73-bb45-c87a94da2e42.png)

5.Backend sql database data which the users signups
![Screenshot (35)](https://user-images.githubusercontent.com/86471322/214479877-5c0bcad4-cc12-46ac-81e8-0ade9f3b2aef.png)

MySQL Query includes:
create database webapp;
use webapp;
create table employee(id int primary key auto_increment,uname varchar(50),upwd varchar(50),uemail varchar(50),umobile varchar(10));
describe employee;
select * from employee;
