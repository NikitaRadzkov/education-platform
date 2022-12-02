# Questions

## Beginner

### Web Basics

<details>
<summary>1. What is MAC Address and how do you find it?</summary>

> **Answer:**
>
> Media Access Control (MAC) Address is unique 48-bits hardware number of a computer, which is embedded into network
> card (known as Network Interface Card) during the time of manufacturing. MAC Address is also known as Physical Address
> of a network device.
>
> ##### Command for Windows:
>
> * ipconfig /all
>
> ##### MAC OS:
>
> * TCP/IP Control Panel
>
> ##### Command for UNIX/Linux:
>
> * ifconfig -a
> * ip link list
> * ip address show
>
</details>

<details>
<summary>2. How does DNS work?</summary>

> **Answer:**
>
> The Domain Name System resolves the names of internet sites with their underlying IP addresses adding efficiency and
> even security in the process.
>
> The process of DNS resolution involves converting a hostname (such as www.example.com) into a computer-friendly IP
> address (such as 192.168.1.1). An IP address is given to each device on the Internet, and that address is necessary to
> find the appropriate Internet device - like a street address is used to find a particular home. When a user wants to
> load a webpage, a translation must occur between what a user types into their web browser (example.com) and the
> machine-friendly address necessary to locate the example.com webpage.
>
> In order to understand the process behind the DNS resolution, it’s important to learn about the different hardware
> components a DNS query must pass between. For the web browser, the DNS lookup occurs “behind the scenes” and requires
> no interaction from the user’s computer apart from the initial request.
</details>

<details>
<summary>3. What is the difference between URI, URL & URN?</summary>

> **Answer:**
>
> **URI** stands for Uniform Resource Identifier. URI is a text which is used to identify any resource or name on
> Internet. URI has two specializations in the form of URL (Uniform Resource Locator) and URN (Uniform Resource Name) to
> identify resource and name. We mostly see examples of URL and URN in the real word.
>
> **URL** standards for Uniform resource locator and it is a subset of URI or Uniform Resource Identifier. URL includes
> location as well as the protocol to retrieve the resource e.g. in
> <http://java67.blogspot.sg/2012/09/what-is-new-in-java-7-top-5-jdk-7.html>, HTTP is a protocol which can be used to
> retrieve resource what-is-new-in-java-7-top-5-jdk-7.html available in location <http://java67.blogspot.com> directory.
> It's not necessary that URL always include HTTP as protocol, it can use any protocol e.g. ftp://, https:// or ldap://.
>
> **URN** stands for Uniform Resource Name. URN is also the subset of URI. URN is completely different than URL as it
> doesn't include any protocol.
</details>

<details>
<summary>4. How does HTTP work?</summary>

> **Answer:**
>
> HTTP is a protocol which allows the fetching of resources, such as HTML documents. It is the foundation of any data
> exchange on the Web and it is a client-server protocol, which means requests are initiated by the recipient, usually
> the Web browser. A complete document is reconstructed from the different sub-documents fetched, for instance text,
> layout description, images, videos, scripts, and more.
>
> Clients and servers communicate by exchanging individual messages (as opposed to a stream of data). The messages sent
> by the client, usually a Web browser, are called requests and the messages sent by the server as an answer are called
> responses.
</details>

<details>
<summary>5. What are Cookies, Sessions, and Tokens?</summary>

> **Answer:**
>
> An **HTTP cookie** (also called web cookie, Internet cookie, browser cookie, or simply cookie) is a small piece of
> data stored on the user's computer by the web browser while browsing a website. Cookies were designed to be a reliable
> mechanism for websites to remember stateful information (such as items added in the shopping cart in an online store)
> or to record the user's browsing activity (including clicking particular buttons, logging in, or recording which pages
> were visited in the past). They can also be used to remember pieces of information that the user previously entered
> into form fields, such as names, addresses, passwords, and payment card numbers.
>
> A **web session** is a series of contiguous actions by a visitor on an individual website within a given time frame.
> This could include your search engine searches, filling out a form to receive content, scrolling on a website page,
> adding items to a shopping cart, researching airfare, or which pages you viewed on a single website. Any interaction
> that you have with a single website is recorded as a web session to that website property.
>
> A **token** is a piece of data that has no meaning or use on its own, but combined with the correct tokenization
> system, becomes a vital player in securing your application.
</details>

<details>
<summary>6. What is HTML? What is it used for?</summary>

>**Answer:**
>
> HTML stands for Hyper Text Markup Language. This means that an HTML document, written in plain text, is used to
> describe the structure and content of web pages, with links to other pages and resources. In its most basic form, you
> can define blocks of content, which are displayed depending on the type of block you used.
</details>

<details>
<summary>7. What is the difference between HTML elements and tags?</summary>

> **Answer:**
>
> ##### Elements
>
> Each part of a web page, such as a paragraph, an image, a link or anything else you can interact with, is an element.
> Each type of element has its own behavior - for example you can click on links, or type in text boxes.
>
> ##### Tags
>
> An HTML document is a simple, plain text document, which you are able to open with any text editor on your computer.
> When you open one, you’ll see the document is made up of tags, which are keywords surrounded by angled brackets, each
> of which describes an HTML element. Here you can see HTML tags telling the browser how to render the text element
> inside:
>
> ```html
> <span>This text is surrounded by HTML tags!</span>
> ```
>
> Most tags are paired, i.e have opening and closing tags. The opening tag is written with the tag name in angled
> brackets, like `<tagname>` whereas the closing tag adds a forward slash: `</tagname>`. Anything between these opening
> and closing tags is considered to be contents of that tag.
>
> Some tags, like the `<img>` tag are self-closing. This means that they cannot have any content. For example, an image
> can’t contain additional HTML elements within it. The only way to change their behavior or appearance is through
> attributes or CSS.
>
> ```html
> <img src="http://placekitten.com/200/300" alt="kitten image" />
> ```
>
</details>

<details>
<summary>8. What are attributes and how do you use them?</summary>

>**Answer:**
>
> Each tag can also have additional attributes, which change the way the tag behaves or is displayed. For example, an
> ```<input>``` tag has a type attribute, which you can use to specify whether it’s a text field, checkbox, radio button
> or one of many more options.
</details>

### Web Browsers

<details>
<summary>1. What is a web browser?</summary>

> **Answer:**
>
> A web browser (commonly referred to as a browser) is a software application for accessing information on the World
> Wide Web. When a user requests a web page from a particular website, the web browser retrieves the necessary content
> from a web server and then displays the page on the user's device.
</details>

<details>
<summary>2. Name the top web browsers.</summary>

> **Answer:**
>
> * Google Chrome
> * Microsoft Edge
> * Mozilla Firefox
> * Safari
>
</details>

### Responsive and Adaptive Design

<details>
<summary>1. What types of layouts do you know? Briefly describe each.</summary>

> **Answer:**
>
> There are 4 layouts:
>
> * **Fixed.** It has fixed width in pixels that doesn't change regardless of screen size or resolution.
> * **Fluid.** Elements' dimensions are specified as a percentage and not in pixels so the ratio of elements doesn't
> change with screen size/resolution.
> * **Adaptive.** It consists of several fixed layouts, each for a specific screen size/resolution.
> * **Responsive.** Layout width is specified as a percentage so the elements stretch or shrink according to screen
> size/resolution.
>
</details>

<details>
<summary>2. What is the main difference between Adaptive and Responsive design?</summary>

> **Answer:**
>
> **Adaptive design** is an approach that promotes the creation of multiple versions of a web page for devices with
> different screen width. While **Responsive design** is an approach that involves creating of one layout that
> automatically adjusts and adapts to any device screen size.
</details>

<details>
<summary>3. What is the viewport?</summary>

> **Answer:**
>
> The viewport is the area of the window in which web content can be seen without scrolling.
</details>

### Types of Testing

<details>
<summary>1. What is a Compatibility testing?</summary>

> **Answer:**
>
> Compatibility testing is a type of testing which verifies an application work with different environmental elements.
</details>

<details>
<summary>2. What important environmental elements can you name?</summary>

> **Answer:**
>
> * Browsers
> * Hardware platform
> * OS
> * Database
> * etc.
>
</details>

<details>
<summary>3. What is a Cross-Browser testing?</summary>

> **Answer:**
>
> Cross-Browser testing is a type of Compatibility testing which verifies an application work in different browsers.
</details>

<details>
<summary>4. What is Globalisation, i18n, and L10n testing?</summary>

> **Answer:**
>
> **Globalization testing**'s aim is to ensure that the product is stable in terms of both its functionalities as well
> as representation of data in spite of varying cultures/locales. It helps to understand whether the application can be
> used across the globe. This testing can be divided into 2 parts - Internationalization testing (aka i18n) and
> Localization testing (aka L10n).
>
> **i18n testing** checks whether the app is working uniformly round various global regions and cultures. It mainly
> focuses on executing functionality regression tests over different language environments and entering native language
> strings. It also includes testing whether the culture-specific info like currency, date, time is displayed correctly.
>
> **L10n testing** is a language verification testing which is done to ensure the quality of a product for a specific
> culture or locale settings. It mainly focuses on the UI and content.
</details>

<details>
<summary>5. What are the most important aspects to verify during Globalisation testing?</summary>

> **Answer:**
>
> * **User Interface.** Each language script has a different writing style (few are written from left to right and few
> are from right to left direction) and the space required by the words might vary from one language to another. So
> there is a need to test the UI layout in each language in order to ensure that the UI is clean and there are no issues
> like text overlapping, misalignment of text, navigation issues, etc.
> * **Date & Time format.** The date & time display formats will vary from region to region. The most common date format
> in the US is mm/dd/yyyy. Contrary to this, the most common date format in Europe is dd/mm/yyyy. So, it is critical to
> ensure that the date & time is displayed in the appropriate format when you switch to different regions/countries.
> * **Currency format.** The number formats for currencies vary from one country to another. So, you should take care of
> the formatting. Another important thing is to display the correct symbol of currency along with the units.
> * **Phone number, Address & Zip code format.** The order in which the address is displayed varies from one language to
> another. In Japanese, the address order is a postal code, state, city. Whereas, in English, the address order is name,
> city, state, postal code. So, you need to verify if the address order display is working fine as you switch between
> different languages supported by your app.
>
</details>








## Intermediate

### Web Browsers

<details>
<summary>1. What is a renderer process?</summary>

> **Answer:**
>
> The renderer process is responsible for rendering of the web page. It means that the renderer process turns HTML, CSS,
> and JavaScript into a web page that the user can interact with. The renderer process does the job with the help of
> various threads that are run inside of it.
</details>

<details>
<summary>2. What is the difference between Browser Engine, Rendering Engine, and Javascript Engine?</summary>

> **Answer:**
>
> **Browser engine** is "the heart" of a browser, it helps to present the content of a website by understanding the
> HTML, CSS, and JavaScript written on the web page. It comprises of 2 more engines that help the browser engine to do
> its job - Rendering Engine and JavaScript Engine.
>
> **Rendering engine** is responsible for the layout of the website on the screen. Its core job is to present text,
> paint, and animations used on the website. A rendering engine is often used interchangeably with browser engines.
>
> **JavaScript engine** helps to interpret JavaScript code of the website before rendering it in front of the audience.
> It is also used as a compiler to drive faster results with improved performance.
>
> The primary difference between a rendering engine and a JavaScript engine lies around the dependency with browser. The
> rendering engine is tightly coupled with browser engine, on the other hand, a JavaScript engine can be worked upon
> even without a browser.
</details>

<details>
<summary>3. Name rendering engines of several popular browsers.</summary>

> **Answer:**
>
> * Google Chrome > Blink
> * Safari > WebKit
> * Mozilla Firefox > Gecko
> * Edge > EdgeHTML
>
</details>

### Web Application Architecture

<details>
<summary>1. What do you call Web Application Architecture?</summary>

> **Answer:**
>
> Web Application Architecture is a framework that is comprised of the relationships and interactions between
> application components, such as middleware systems, user interfaces, and databases.
</details>

<details>
<summary>2. Name Web Application Architecture Components. What are they responsible for?</summary>

> **Answer:**
>
> Web App Architecture components can be categorized into two areas: user interface app components and structural
> components.
>
> User interface app components refer to web pages displaying dashboards, logs, notifications, configuration settings,
> and more. They are not relevant to the structural development of the application and are more user
> interface/experience oriented.
>
> The structural components, which are the real meat of the app development process, are:
>
> * **The web browser or client.** It is the interface rendition of a web app functionality, with which the user
> interacts with. This content delivered to the client can be developed using HTML, JavaScript, and CSS.
> * **The web application server.** It manages business logic and data persistence and can be built using PHP, Python,
> Java, Ruby, .NET, Node.js, among other languages.
> * **The database server.** It provides and stores relevant data for the application. Additionally, it may also supply
> the business logic and other information that is managed by the web application server.
>
</details>

### Types of Testing

<details>
<summary>1. Name several principles of Usability.</summary>

> **Answer:**
>
> * Visibility of system status
> * Match between system and the real world
> * Consistency and standards
> * Error prevention
> * Recognition rather than recall
> * Aesthetic and minimalist design
> * etc.
>
</details>

<details>
<summary>2. What is Web Accessibility and why it's important to test this?</summary>

> **Answer:**
>
> The web is open to everyone. For most of the users, Internet usage over the web is easy. But this is not the case when
> we are talking about people with disabilities. It is imperative that websites be accessible, usable and useful to this
> group of users as well – and it should not differentiate users based on language/culture/location/software/physical or
> mental ability.
>
> Testing a web application in order to make sure that each and every user can easily access the website is known as Web
> Accessibility Testing.
>
> Importance:
>
> * Easy and efficient access to users with disabilities or challenges
> * Increases market share and audience reach
> * Satisfied existing and future legal requirements and helps follow ethics
>
</details>

<details>
<summary>3. What is Performance testing?</summary>

> **Answer:**
>
> Performance testing is a testing practice performed to determine how a system works in terms of responsiveness and
> stability under a particular workload or without it.
</details>

<details>
<summary>4. What types of Load testing exist?</summary>

> **Answer:**
>
> * **Load testing.** Performed to understand the behaviour of the system under a specific load.
> * **Stress testing.** Performed to understand the behaviour of the system under sharply increased load.
> * **Soak testing.** Performed to determine the system parameters under continuous load.
> * **Volume testing.** Performed to check huge data volume handled by the database.
>
</details>

<details>
<summary>5. Describe several principles of secure application.</summary>

> **Answer:**
>
> * **Privacy.** Limited access to user's personal information.
> * **Authentication.** Validating users or processes before granting access to data.
> * **Autorisation.** Giving access to data only to those users who have been properly authorized and have the
> appropriate permissions.
> * **Accountability.** Establishing a connection between user and action, confirmation of action or error.
>
</details>

<details>
<summary>6. What types of attacks can you name?</summary>

> **Answer:**
>
> * **Cross Site Request Forgery (CSRF).** This is an attack that forces an end user to execute unwanted actions on a
> web application in which they’re currently authenticated.
> * **Cross Site Scripting (XSS).** Type of injection in which malicious scripts are injected into otherwise benign and
> trusted websites.
> * **SQL Injection.** Injection technique used to attack data-driven applications in which malicious SQL statements are
> inserted into a URL parameters or an entry field for execution
>
</details>

### API

<details>
<summary>1. What is API?</summary>

> **Answer:**
>
> API spands for Application Program Interface. It is a computing interface which defines interactions between multiple
> software intermediaries such as applications, components, servers, etc. It defines the kinds of calls or requests that
> can be made, how to make them, the data formats that should be used, the conventions to follow, etc.
</details>

<details>
<summary>2. What are the main differences between API and Web Services?</summary>

> **Answer:**
>
> * All Web Services are APIs but not all APIs are Web Services
> * A Web Service uses only three styles of use: SOAP, REST and XML-RPC for communication whereas API may use any style
> for communication
> * A Web Service always needs a network for its operation whereas an API doesn’t need it
> * An API facilitates interfacing directly with an application whereas a Web Service interacts with two machines over a
> network
>
</details>

<details>
<summary>3. What is REST?</summary>

> **Answer:**
>
> REST stands for Representational State Transfer. It is an architecture style for designing networked applications.
</details>

<details>
<summary>4. Describe Guiding Principles of REST.</summary>

> **Answer:**
>
> * **Client–Server.** The client-server constraint works on the concept that the client and the server should be
> separate from each other and allowed to evolve individually and independently.
> * **Stateless.** Each request from client to server must contain all of the information necessary to understand the
> request, and cannot take advantage of any stored context on the server.
> * **Cacheable.** Cache constraints require that the data within a response to a request be labeled as cacheable or
> non-cacheable. If a response is cacheable, then a client cache is given the right to reuse that response data for
> later requests.
> * **Uniform Interface.** The key to the decoupling client from server is having a uniform interface that allows
> independent evolution of the application without having the application’s services, models, or actions tightly coupled
> to the API layer itself.
> * **Layered System.** The layered system style allows an architecture to be composed of hierarchical layers by
> constraining component behavior such that each component cannot “see” beyond the immediate layer with which they are
> interacting.
> * **Code on Demand.** The only optional constraint. REST allows client functionality to be extended by downloading and
> executing code in the form of applets or scripts. This simplifies clients by reducing the number of features required
> to be pre-implemented.
>
</details>

<details>
<summary>5. What HTTP Methods can you name?</summary>

> **Answer:**
>
> * **GET** - Retrieve data from a resource
> * **POST** - Create API resource
> * **PUT** - Update API resource
> * **DELETE** - Delete API resource
>
</details>

**[⬆ back to top](#questions)**
