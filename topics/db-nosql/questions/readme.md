# Exam Questions

## Common

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

<details>
<summary>12. What does NoSQL stand for?</summary>

> **Answer:**
>
> NoSQL stands for `Not Only SQL`.

</details>

<details>
<summary>13. What are common characteristics of NoSQL databases?</summary>

> **Answer:**
>
> * Not using the relational model
> * Running well on clusters
> * Open-source
> * Schemaless

</details>

<details>
<summary>14. What are motivating factors to use NoSQL databases?</summary>

> **Answer:**
>
> * Cost
> * Flexibility
> * Scalability
> * Availability

</details>

<details>
<summary>15. Name basic types of NoSQL databases</summary>

> **Answer:**
>
> * Key-Value
> * Document-based
> * Column-based
> * Graph-based

</details>

<details>
<summary>16. Name examples of key-values databases.</summary>

> **Answer:**
>
> * MongoDB
> * Amazon DynamoDB
> * RavenDB
> * etc.

</details>

<details>
<summary>17. Name examples of document-based databases.</summary>

> **Answer:**
>
> * Redis
> * Amazon DynamoDB
> * Azure CosmosDB
> * CouchDB
> * etc.

</details>

<details>
<summary>18. Name examples of column-based databases.</summary>

> **Answer:**
>
> * Bigtable
> * Cassandra
> * HBase
> * Hypertable
> * etc.

</details>

<details>
<summary>19. Name examples of graph-based databases.</summary>

> **Answer:**
>
> * Neo4j
> * OrientDB
> * etc.

</details>

<details>
<summary>20. Are NoSQL databases commonly designed to use multiple servers?</summary>

> **Answer:**
> That's true, but this is not a strict requirement.

</details>

<details>
<summary>21. What is a distributed system?</summary>

> **Answer:**
> Systems that run on multiple servers are known as distributed systems.

</details>

<details>
<summary>22. How is CAP-theorem applicable to NoSQL systems?</summary>

> **Answer:**
> CAP theorem allows distributed systems to follow any two of these requirements. Since partition tolerance is mandatory for distributed databases. Thus, we are left only with CP (Consistency, Partition tolerance) and AP (availability, Partition tolerance).

Some of the examples of AP systems are `DynamoDB`, `Cassandra`, `CouchDB`
Some of the examples of CP systems are `BigTable`, `HyperTable`, `Mongo DB`, `HBase`

</details>

<details>
<summary>23. What are the advantages of RDBMS over NoSQL?</summary>

> **Answer:**
>
> * Better for relational data that is structured and organized
> * Organize data through normalization
> * Use Structured query language (SQL) which is easy to learn
> * Maintains Data Integrity
> * Data and its relationships are stored in separate tables
> * ACID compliance i.e. either all the transactions are committed or None
> * Scale up/ Vertical Scaling

</details>

<details>
<summary>24. What are the advantages of NoSQL over RDBMS?</summary>

> **Answer:**
>
> * Better for Unstructured and unpredictable Data
> * Handles Big Data
> * No predefined schema
> * Cheaper to manage
> * Scale-out/Horizontal Scaling
> * BASE Transaction
> * High performance, availability, and scalability

</details>

<details>
<summary>25. Can you explain the transaction support by using a BASE in NoSQL?</summary>

> **Answer:**
>
> The CAP theorem states that distributed systems cannot achieve all three properties at the same time; consistency, availability and partition tolerance. The `BASE` system gives up on consistency while maintaining the other two. The `BASE` system works well despite physical network partitions and always allow a client with reading and write availability.
>
> `BASE` stands for:
>
> * Basically Available - The database appears to work most of the time.
> * Soft state - Stores don't have to be write-consistent, nor do different replicas have to be mutually consistent all the time.
> * Eventual consistency - Stores exhibit consistency at some later point (e.g., lazily at reading time).

</details>

<details>
<summary>26. What does Big Data stand for?</summary>

> **Answer:**
> Big data is a term that describes the large volume of data – both structured and unstructured – that inundates a business on a day-to-day basis.

</details>

## Redis

<details>
<summary>1. What does good key-value database use cases include?</summary>

> **Answer:**
>
> * Scalable data
> * Profiles, preferences and configurations
> * Cache management
> * Blockchain implementation
> * Multimedia storage or large objects (video, images, audio, etc.)

</details>

<details>
<summary>2. How values are stored in key-value databases?</summary>

> **Answer:**
>
> Every item in the database is stored as an attribute name (or key) together with its value.

</details>

<details>
<summary>3. Which data structure is used in key-value databases?</summary>

> **Answer:**
>
> Associative arrays.

</details>

<details>
<summary>4. How are associative arrays different from arrays?</summary>

> **Answer:**
>
> An associative array is a data structure, like an array, but is not restricted to using integers as indexes or limiting values to the same type. Associative arrays generalize the idea of an ordered list indexed by an identifier to include arbitrary values for identifiers and values. .

</details>

<details>
<summary>5. How does key-value databases store data?</summary>

> **Answer:**
>
> Many key-value data stores keep persistent copies of data on long-term storage, such as hard drives or flash devices. Some key-value data stores only keep data in memory.

</details>

<details>
<summary>6. How can you use a cache to improve relational database performance?</summary>

> **Answer:**
>
> An in-memory cache is an associative array. The values retrieved from the relational database could be stored in the cache by creating a key for each value stored. Programs that access customer data will typically check the cache first for data and if it is not found in the cache, the program will then query the database. Retrieving data from memory is faster than retrieving it from disk.

</details>

<details>
<summary>7. What's Redis?</summary>

> **Answer:**
>
> Redis is an advanced key-value data store and cache.

</details>

<details>
<summary>8. What does Redis actually mean?</summary>

> **Answer:**
>
> It means REmote DIctionary Server.

</details>

<details>
<summary>9. Which data structures are supported by Redis?</summary>

> **Answer:**
>
> * Binary-safe strings
> * Lists
> * Sets
> * Sorted sets, similar to Sets but where every string element is associated to a floating number value, called score
> * Hashes
> * Bit arrays
> * HyperLogLogs
> * Streams

</details>

<details>
<summary>10. What are a valid key in Redis?</summary>

> **Answer:**
>
> Redis keys are binary safe, this means that you can use any binary sequence as a key, from a string like "foo" to the content of a JPEG file. The empty string is also a valid key.

</details>

<details>
<summary>11. Which rules about keys in Redis do you know?</summary>

> **Answer:**
>
> * It's better to avoid very long keys. For instance a key of 1024 bytes is a bad idea not only memory-wise, but also because the lookup of the key in the dataset may require several costly key-comparisons.
> * It's better to avoid very short keys. While short keys will obviously consume a bit less memory, but keys should be readable.
> * The maximum allowed key size is 512 MB.

</details>

<details>
<summary>12. Can a key in Redis expire?</summary>

> **Answer:**
>
> There is a command `EXPIRE`. Set a timeout on key. After the timeout has expired, the key will automatically be deleted.

</details>

<details>
<summary>13. What's redis-cli?</summary>

> **Answer:**
>
> `redis-cli` is the Redis command line interface, a simple program that allows to send commands to Redis, and read the replies sent by the server, directly from the terminal.

</details>

<details>
<summary>14. What are Redis PubSub commands?</summary>

> **Answer:**
>
> * SUBSCRIBE - subscribes to channels
> * PUBLISH - posts a message to a channel
> * UNSUBSCRIBE - stops listening for messages posted to channels matching the given patterns

</details>
