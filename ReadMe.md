<h1 style="color:blue;text-align:center;" ><b>Url Hit Counter</h1>
<h1 style="color:blue;" ><b>Data Structures and Framework used</h1>
<p>Data Structure --> Array List</p>
<p>Framework --> SpringBoot</p>
<p>Language --> Java</p>
<h1 style="color:blue;" ><b>Data Flow</h1>
1.controller --> Controller Package handels all type of Api request by UserController Class.
<br>
<br>
2.Service --> Service Layer Contains the entity class as Model Class names as User class and all the Business Logic of our code is writeen inside the UserService Class.
<br>
<br>
3. Repository --> Inside the Repo package we have a UserRepo class and inside the Class we have a ArrayList of type user as our dataSource
<br>
<br>
<h1 style="color:blue;" ><b>Api</h1>
1. "localhost:8080/user" --> the Api is Used to save A user and the type of this API is POST
<br>
<br>
2. "localhost:8080/user/userId/{userId}" --> the Api is hit the url by providing  user Id and the API is reponcible for increasing  the api hit count of the specific user who have userId is match with input userId.
<br>
<br>
3. "localhost:8080/user/userId/{userId}" --> the Api returns the user which has user name match with input userName with count 
<br>
<br>
<h1 style="color:blue;" ><b>Git Commands</h1>
$ git init
<br>
$ git status
<br>
$ git add .
<br>
$ git commit -m "Rajat_Commit"
<br>
$ git remote add origin ""
<br>
$ git push -u origin master
