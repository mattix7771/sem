###USE CASE: 
***
####CHARACTERISTIC INFORMATION
***
#####__Goal in Context__
As an HR advisor I want to delete an employee's details so that the company is compliant with data retention legislation

#####__Scope__
Company.

#####__Level__
Primary task.

#####__Preconditions__
Database contains details of employee.

#####__Success End Condition__
The employee's details are deleted

#####__Failed End Condition__
The employee's details are not deleted

#####__Primary Actor__
HR Advisor.

#####__Trigger__
Employee left the company

####MAIN SUCCESS SCENARIO
***
1. Employee left the company.
2. HR advisor captures the employee's details that need to be deleted.
3. HR advisor deletes the employee's details.

####EXTENSIONS
***
1. Provided details are not valid and no employee is found:
	i. HR advisor confirms employee's details again.

####SUB-VARIATIONS
***
None.

####SCHEDULE
***
__DUE DATE:__ Release 1.0