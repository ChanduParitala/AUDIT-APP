Hi,
This is <a href="https://git03.iiht.tech/CHANDAN/">CHANDAN P</a>
# AUDIT-APP

#Functional Requirements
Audit Severity Microservice should be invoked from Audit management portal. Post authorization of
request, it allows certain operation based on given inputs:

Based on the Audit request input, follow the setting for the acceptable value of NO :3
Audit type: Internal; Acceptable value of NO: 3
    o Determine the project execution status and arrive at the remediation duration detail
    o If the value is within the acceptable limit, then no action need to be action, else action
should be taken in taken within a specific span of time. The logic is listed below
    ▪ Audit type – Internal; Count of NO <= acceptable value ; Audit result – GREEN; Remedial action duration: No action needed
    ▪ Audit type – Internal; Count of NO > acceptable value ; Audit result – RED; Remedial action duration: Action to be taken in 2 weeks.

#Client Portal Requirements
    o Audit management Portal must allow a member to Login. Once successfully logged in, the member do the following operations:
    o Choose the audit type to view the list of audit checklist questions
    o Let the project manager provide answers to the questions
    o Invoke the AuditSeverity Microservice to determine the project execution status
    o Display the result on the Web UI
    o The audit request detail along with the project execution status and remedial action duration should be saved to the database
    o Each of the above operations will reach out to the middleware Microservices that are hosted in cloud.
