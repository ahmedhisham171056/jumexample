# jumexample

*# build & run phase:
---------------------------------------------------------------------------------------------------------

This is Jumia Test submitted by Ahmed Hisham on October 17th 2021.

The solution is represented into two separate projects, a Backend and Frontend.

Backend is developed in Spring framework, using spring boot 2.5.x. the front end is developed with Angular 12.

* First, clone both projects into your own machine, then apply the following:

from the Backend project root folder, run the following command:

docker build -t jumia-server .

followed by this command:

docker run -d -p 8080:8080 jumia-server

* Second, move to Frondend root folder, and use the following command:

docker build -t jumia-client .

followed by this command

docker-compose up

---------------------------------------------------------------------------------------------------------

*# testing app
---------------------------------------------------------------------------------------------------------

from any browser, navigate to localhost:4200

--> a list of all customers, and all provided numbers are shown.
--> use Search bar to look for any Country / Status / Customer Name or phone number

