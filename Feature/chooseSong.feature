
Feature:
As a user, when there is no current song in the university, I want to choose a new song so all other users can listen to it. 
 

Scenario: List all university's songs
 
Given "TCM" isn't playing any song
And have these songs on its store:
 
|  title 		| artistName	| duration | 				songUrl         |       imageUrl          | 
|   Hero    | Adele   		| 	300 	 | http://www.test.com    |  http://www.test.com    |
|   Joss    | Rulas    		| 	300 	 | http://www.testing.com |  http://www.test.com    |
|   Ready?  | Pep Sala		| 	300 	 | http://www.tet.com     |  http://www.test.com    |
|   Juliar  | Adele   		| 	300 	 | http://www.ted.com     |  http://www.test.com    |
|   Join    | Apple  	   	| 	300 	 | http://www.text.com    |  http://www.test.com    |
|   Pelo    | Montana   	| 	300 	 | http://www.temt.com    |  http://www.test.com    |

			  

When user searches for all songs of university "TCM"
Then will return next songs:
 

|  title 		| artistName	| duration | 				songUrl         |       imageUrl          | 
|   Hero    | Adele   		| 	300 	 | http://www.test.com    |  http://www.test.com    |
|   Joss    | Rulas    		| 	300 	 | http://www.testing.com |  http://www.test.com    |
|   Ready?  | Pep Sala		| 	300 	 | http://www.tet.com     |  http://www.test.com    |
|   Juliar  | Adele   		| 	300 	 | http://www.ted.com     |  http://www.test.com    |
|   Join    | Apple  	   	| 	300 	 | http://www.text.com    |  http://www.test.com    |
|   Pelo    | Montana   	| 	300 	 | http://www.temt.com    |  http://www.test.com    |
			  
			
Scenario: Set current song

Given that "TCM" is not playing any song
And has this list of songs:


|  title 		| artistName	| duration | 				songUrl         |       imageUrl          | 
|   Hero    | Adele   		| 	300 	 | http://www.test.com    |  http://www.test.com    |
|   Joss    | Rulas    		| 	300 	 | http://www.testing.com |  http://www.test.com    |
|   Ready?  | Pep Sala		| 	300 	 | http://www.tet.com     |  http://www.test.com    |
|   Juliar  | Adele   		| 	300 	 | http://www.ted.com     |  http://www.test.com    |
|   Join    | Apple  	   	| 	300 	 | http://www.text.com    |  http://www.test.com    |
|   Pelo    | Montana   	| 	300 	 | http://www.temt.com    |  http://www.test.com    |			  


When user selects: 


|  title 		| artistName	| duration | 				songUrl         |       imageUrl          | 
|   Hero    | Adele   		| 	300 	 | http://www.test.com    |  http://www.test.com    |			  


Then "TCM" must be playing:

|  title 		| artistName	| duration | 				songUrl         |       imageUrl          | 
|   Hero    | Adele   		| 	300 	 | http://www.test.com    |  http://www.test.com    |			  

 