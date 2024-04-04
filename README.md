# CS-305 Software Security

Projects from CS-305 Software Security.

## Projects
- Project 1 - [Vulnerability Assessment Report](docs/CS-305%20Project-1%20Artemis%20Financial%20Vulnerability%20Assessment%20Report.pdf)
- Project 2 - [Practices for Secure Software Report](docs/CS-305%20Project-2%20Practices%20for%20Secure%20Software%20Report.pdf)
- Certificate Generation - [Certificate Generation](docs/Module%20Five%20Certificate%20Generation.pdf)


## Reflection

### Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

The client was Artemis Financial, a financial institution. They are looking to incorporate additional security layers into their business application codebase, including files and contents.

### What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?

I enjoyed running functional tests and conducting a secondary dependency vulnerability check via static testing methods to ensure that most vulnerabilities were identified and mitigated. Secure coding practices are crucial to incorporate at all stages of the SDLC because developers, DevOps engineers, and administrators must protect not only their clients' data but also their clients' users' data.   

### What part of the vulnerability assessment was challenging or helpful to you?

The Maven dependency check tool was very helpful; it provided an effective way to identify vulnerabilities. The Maven dependency tool user guide offered support on how to read the report and how to determine if a vulnerability is a false positive. False positives can be suppressed; however, the analyzer must confirm false positives before suppressing them for future builds.

### How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

During the refactoring and analysis process of the dependency check, outdated libraries and frameworks were identified. Outdated libraries are often vulnerable to attacks and may compromise the overall functionality of the software. Therefore, these libraries were updated to the most recent patches. Additionally, to provide an additional layer of security, input validation was implemented in the source code. A hash function, which takes data and generates hash values (digests), was also added. Hash functions are used for integrity and digital signature authentication. Penetration testing techniques will be sufficient to identify most software vulnerabilities, and the DevSecOps proposed guidelines will be used to mitigate any vulnerabilities found.   

### How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

In the process of refactoring the codebase, it was progressively debugged for functional checks and code errors. The pom.xml file was analyzed to ensure that each introduced dependency is functional and up-to-date. After the codebase was refactored, an additional dependency check was performed to ensure that no new vulnerabilities were introduced.

### What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

Most of the tools I used were research-based. I utilized Stack Overflow to find solutions to environmental setup problems provided by other developers and administrators who have encountered similar issues to mine. 


### Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

  - The implementation of the hash function algorithm and other types of hash functions and data encryption.
  - Implementation of maven dependency check and its report after and before suppressed vulnerabilities. 
  - CA authorization procedure, implementation and management. 
  - Input validation technics as it provides an additional security layer in data and database management.

<p align="center">
  <img src="CS-305_Project%202_ssl-server_student/images/cert.jpg" alt="image">
</p>





