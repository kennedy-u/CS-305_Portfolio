
# SNHU CS-305
## CS-305 (Software Security)

## Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

  - The client was Artemis Financial, Artemis Financial is a financial institution, they are looking to incorporate additional security layers to its business application code base files and contents. 

## What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?

  - I enjoyed running a functional test and a secondary dependency vulnerability check via a static testing method to ensure that most of the vulnerabilities were found and mitigated. Secure coding practices are important to incorporate in all parts of SDLC because developers, DevOps engineers, and administrators not only need to protect their client's data but also their client's user's data.   

## What part of the vulnerability assessment was challenging or helpful to you?

  - The maven dependency check tool was most helpful, it provided an effective way to identify vulnerabilities. The maven dependency tool user guide provided support for how to read the report and how to identify if a vulnerability is a false positive. False positives can be suppressed; however, the analyzer must confirm false positives before suppressing them for future builds.  

## How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

  - Through the refactoring and analysis process of the dependency check, outdated libraries and outdated frameworks were found. Outdated libraries are mostly found to be vulnerable to attacks and may impair software’s overall functionality, so these libraries were updated to the most recent patch. To provide additional security layer input validation was provided in the source code. A hash function that will take data and hash that data to hash values (digest) was added. Hash functions are used for integrity and digital signature authentications. Penetration testing technics will suffice to identify most software vulnerabilities and use the DevSecOps proposed guidelines to mitigate vulnerabilities found.    

## How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

  - In the process of refactoring the code base, the code base was progressively debugged for functional checks and code errors. The pom.xml file was analyzed to make sure that each introduced dependency is functional and updated. After the code base was refactored, an additional dependency check was run on the code to ensure that no new vulnerability was added after the code was refactored.

## What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

  - Most of the tools I used were research-based. I used stack overflow in finding environmental set-up problem solutions provided by other developers and administrators who have had similar problems as mine. 


## Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

  - The implementation of the hash function algorithm and other types of hash functions and data encryption.
  - Implementation of maven dependency check and its report after and before suppressed vulnerabilities. 
  - CA authorization procedure, implementation and management. 
  - Input validation technics as it provides an additional security layer in data and database management.





