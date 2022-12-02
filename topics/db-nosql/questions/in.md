# Interview Questions

<details>
<summary>1. What does NoSQL mean?</summary>

> **Answer:**
>
> NoSQL stands for `Not Only SQL`.

</details>

<details>
<summary>2. Name motivating factors to use NoSQL databases?</summary>

> **Answer:**
>
> * Cost
> * Flexibility
> * Scalability
> * Availability

</details>

<details>
<summary>3. What is vertical scaling?</summary>

> **Answer:**
>
> Vertical scaling adds more CPU and storage resources to increase capacity. Vertical scaling has the advantages of being simple, reliable, and cost-effective up to a certain point, but eventually you reach a point where it’s no longer feasible to move to a better machine.
</details>

<details>
<summary>4. What is horizontal scaling?</summary>

> **Answer:**
>
> Scaling horizontally means distributing the database across multiple machines. Horizontally scaled architecture can run on many small, not expensive machines, often reducing your hosting costs.
</details>

<details>
<summary>5. Name basic types of NoSQL databases?</summary>

> **Answer:**
>
> * Key-Value
> * Document-based
> * Column-based
> * Graph-based

</details>

<details>
<summary>6. How values are stored in key-value databases?</summary>

> **Answer:**
>
> Every item in the database is stored as an attribute name (or `key`) together with its value.

</details>

<details>
<summary>7. Name three common features of key-value databases.</summary>

> **Answer:**
>
> * Simplicity
> * Speed
> * Scalability

</details>

<details>
<summary>8. Name examples of key-values databases.</summary>

> **Answer:**
>
> * Redis
> * Amazon DynamoDB
> * Azure CosmosDB
> * etc.

</details>

<details>
<summary>9. What is document-based database?</summary>

> **Answer:**
>
> * Document databases pair each key with a complex data structure known as a document. Documents can contain many different key-value pairs, or key-array pairs, or even nested documents.

</details>

<details>
<summary>10. Which advantages of storing data in documents do you know?</summary>

> **Answer:**
>
> * Documents are independent units which makes performance better (related data is read contiguously off disk) and makes it easier to distribute data across multiple servers while preserving its locality.
>
> * Application logic is easier to write. You don’t have to translate between objects in your application and SQL queries, you can just turn the object model directly into a document.
>
> * Unstructured data can be stored easily, since a document contains whatever keys and values the application logic requires. In addition, costly migrations are avoided since the database does not need to know its information schema in advance.

</details>

<details>
<summary>11. Name examples of document-based databases.</summary>

> **Answer:**
>
> * MongoDB
> * Amazon DynamoDB
> * RavenDB
> * etc.

</details>
