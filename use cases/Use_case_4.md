###USE CASE: 
***
####CHARACTERISTIC INFORMATION
***
#####__Goal in Context__
As an HR advisor I want to produce a report on the salary of employees of a given role so that I can support financial reporting of the organisation.

#####__Scope__
Company.

#####__Level__
Primary task.

#####__Preconditions__
We know the role. Database contains current employee salary data.

#####__Success End Condition__
A report is available for HR to provide to finance.

#####__Failed End Condition__
No report is produced.

#####__Primary Actor__
HR Advisor.

#####__Trigger__
A request for finance information is sent to HR.

####MAIN SUCCESS SCENARIO
***
1. Finance request salary information for a given role.
2. HR advisor captures name of the role to get salary information for.
3. HR advisor extracts current salary information of all employees of the given role.
4. HR advisor provides report to finance.

####EXTENSIONS
***
3. Role does not exist:
	i. HR advisor informs finance no role exists.

####SUB-VARIATIONS
***
None.

####SCHEDULE
***
__DUE DATE:__ Release 1.0