# Mala3ebna

Project brief:
We have implemented an android application called "Mala3ebna”. This application is used to book football pitches from different areas in Egypt, when you first open the application the first thing you have to do is to sign in using your google email once you are signed in you are allowed to see all the football pitches registered on the system once you select the football pitch you want it will redirect you to the booking page showing you the name of the football pitch and its location as well as its price per hour and you will find a drop down menu with the available free timings only if you find a timing that suits you u can proceed by pressing the submit button and it will confirm the booking timing you chose. 
Project APIs:
we use 2 main APIs, the first one is google API for sign in using your google account and the second API is Postgeress sql to maintain the database for our application and keeping record of our data (Football pitches in each location and its available timings for booking) we used clever cloud to create a cloud database online so we can use it for storing the data and testing our application 
Project Dependencies:
We used node js and express in order to implement the backend of the project and we downloaded docker in order to make an image of our backend, we created the docker file as well as the docker compose file that runs node js and npm install and for the frontend part we implemented it using java in android studio and we tested using an android device.
Config
For the config file we created a configfile.js to store the cloud database credentials including the user name and host name, password, database name, port number and we added it in the git ignore file to prevent our credentials from being visible to everyone. Also there is a credential file.json used in the front end for google sign in that is added to the gitignore file also
