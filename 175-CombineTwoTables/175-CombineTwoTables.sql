-- Last updated: 8/11/2026, 4:01:06 PM
SELECT 
  Person.firstName,
  Person.lastName,
  Address.city,
  Address.state 
from Person
LEFT JOIN Address
ON Person.personId = Address.personId;

