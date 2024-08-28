# CS-305 Software Security

Projects from CS-305 Software Security.

## Projects
- Project 1 - [Vulnerability Assessment Report](docs/CS-305%20Project-1%20Artemis%20Financial%20Vulnerability%20Assessment%20Report.pdf)
- Project 2 - [Practices for Secure Software Report](docs/CS-305%20Project-2%20Practices%20for%20Secure%20Software%20Report.pdf)
- Certificate Generation - [Certificate Generation](docs/Module%20Five%20Certificate%20Generation.pdf)

### Cert
<p align="center">
  <img src="CS-305_Project%202_ssl-server_student/images/cert.jpg" alt="image">
</p>


## Reflection

### Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

The client, Artemis Financial, a financial institution, sought to incorporate additional security layers into their business application codebase, including files and contents.

### What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?

Refactoring and performing a secondary dependency vulnerability scan on the codebase proved valuable. I excelled in troubleshooting the scan process, including dependency resolution and environment setup. Additionally, I effectively documented the vulnerabilities and the steps taken to mitigate them. Reducing vulnerabilities and security threats enhances the overall security of the software.

### What part of the vulnerability assessment was challenging or helpful to you?

 The Maven dependency tool user guide provided guidance on interpreting the report and determining whether a vulnerability is a false positive. While false positives can be suppressed, they must be verified by the analyzer before being excluded from future builds. Handling false positives was challenging due to their high volume during the dependency check.

### How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

During the refactoring and analysis of dependencies, outdated libraries and frameworks were identified. Such libraries are often vulnerable to attacks and can compromise the overall functionality of the software. Consequently, these libraries were updated to their latest patches. To further enhance security, input validation was incorporated into the source code. Additionally, a hash function was implemented to generate hash values (digests) for data. Hash functions are essential for ensuring data integrity and digital signature authentication. Penetration testing techniques will effectively identify most software vulnerabilities, and the proposed DevSecOps guidelines will be applied to address any vulnerabilities discovered.

### How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

During the refactoring of the codebase, it was systematically debugged to address functional issues and code errors. The `pom.xml` file was carefully analyzed to ensure that each dependency was functional and up-to-date. Following the refactoring, an additional dependency check was conducted to confirm that no new vulnerabilities had been introduced.

### What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

Most of the tools I used were research-based. I relied on Stack Overflow to find solutions to environmental setup issues, leveraging insights from other developers and administrators who had faced similar challenges.


### Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

  - The implementation of the data encryption.
  - Implementation of maven dependency check and its report after and before suppressed vulnerabilities. 
  - CA authorization procedure, implementation and management. 
  - Input validation technics as it provides an additional security layer.




