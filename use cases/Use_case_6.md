###USE CASE: 
***
####CHARACTERISTIC INFORMATION
***
#####__Goal in Context__
As an HR advisor I want to view and employee's details so that the employee's promotion request can be supported

#####__Scope__
Company.

#####__Level__
Primary task.

#####__Preconditions__
We know the employee's name, surname and department. Database contains all details of employee.

#####__Success End Condition__
The employee's details are viewed

#####__Failed End Condition__
The employee's details are not viewed

#####__Primary Actor__
HR Advisor.

#####__Trigger__
A promotion has been issued

####MAIN SUCCESS SCENARIO
***
1. A promotion has been issued.
2. HR advisor captures name, surname and department to enter in a database query.
3. HR advisor extracts the employee's details.
4. HR advisor issues promotion.

####EXTENSIONS
***
1. Matching name, surname and department do not exist:
	i. HR advisor informs the promotion issuer no such match exists.

####SUB-VARIATIONS
***
None.

####SCHEDULE
***
__DUE DATE:__ Release 1.0