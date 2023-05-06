GET       /employees                    # get employee list
GET       /employees/1                  # get a specific employee by ID
GET       /employees?gender=male        # get all male employees

Employee
{
"id": 5,
"name": "Lily",
"age": 20,
"gender": "Female",
"salary": 8000
}

POST      /employees                    # add an employee
response status 201 created

PUT       /employees/1                  # update an employee
DELETE    /employees/1                  # delete an employee
response status 204 no content

GET       /employees?page=1&pageSize=5  # Page query, page equals 1, pageSize equals 5

page=2 pageSize=2
A
B
C
D
E
F