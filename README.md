# SpringBoot-DataREST
 <p>Spring boot data REST API for performing CRUD operation or demonstrates all 4 basic HTTP request types using spring data jpa, spring rest repository, h2 embdded database library jars. GET, POST, PUT and DELETE controller methods do not implemented here in this project because in <b>CustomerRepo.java</b> file <b>CustomerRepo</b> interface extends <b>JpaRepository</b> interface which indirectly extends <b>CrudRepository</b> interface. CrudRepository interface provides generic CRUD functions. And so, because of this inheritance relationship, the JpaRepository contains the full API of CrudRepository and PagingAndSortingRepository, and provides extra feature.</p>

<h2>Installation</h2> 
 <ul>
	<li>This is a Spring Starter Project, so you just need to import it to your IDE and run the <b>Spring Boot App</b> to resolve the dependencies.</li>
</ul>

<h2>Dependencies</h2>
	<ul>
		<li><h5>Spring Starter Project Dependencies</h5></li>
			<p>->Spring Data JPA</p>
      <p>->H2 Database</p>
      <p>->Rest Repositories</p>
    <li><h5>Dependency for Auto Relunch the Application</h5></li>
			<p>->Spring Boot Devtools - Version 2.1.8.RELEASE</p>
	</ul>

<h2>Tools and Technologies Used</h2>
	<ul>
		<li>Spring Boot,    version="2.1.8.RELEASE"</li>
		<li>JDK,          version="1.8 or later"</li>
		<li>IDE,          Eclipse or Spring Tool Suite (STS)</li>
	</ul>
  
 <h2>Database configuration</h2> 
 <ul>
		<li>H2 embdded database uses for this application so to access into the database use this link (<b>http://localhost:8080/h2-console</b>) and use (<b>jdbc:h2:mem:technardiot</b>) as JDBC URL.</li>
		<li>Connect and run this (<b>SELECT * FROM CUSTOMER</b>) query to see the existing data in database.</li>
		<li>Existing data has entered using the <b>data.sql</b> file.</li>
 </ul>
 
 <h2>Calling Procedure from Postman</h2>
	<ul>
  <li><h5>Let’s Run This Application!</h5></li>
  <p>->Use <b>POSTMAN</b> or any other Rest Client and hit on the url <b>http://localhost:8080/</b><p/>
  <p>->You will see the HATEOAS representation of all the available REST URLs</p>
			<img src="https://github.com/provaakter/SpringBoot-DataREST/blob/master/Images/Spring%20Data%20Rest%20Request.jpg">
	<p>-><b>_links</b> is part of the HAL, it exposes the links of the endpoints which is available.</p>
  <p>-><b>customers</b> is the Service which is created by Spring Data REST from this repository.</p>
  <p>-><b>profile</b> exposes the additional metadata information</p>
  <li><h5>Get All Request</h5></li>
			<p>http://localhost:8080/customers</p>
	<li><h5>Get by Id Request</h5></li>
			<p>http://localhost:8080/customers/2</p>
	<li><h5>Post Request</h5></li>
			<img src="https://github.com/provaakter/SpringBoot-DataREST/blob/master/Images/Spring%20Data%20Rest%20Post%20Request.jpg">
	<li><h5>Put Request</h5></li>
			<img src="https://github.com/provaakter/SpringBoot-DataREST/blob/master/Images/Spring%20Data%20Rest%20Put%20Request.jpg">
	<li><h5>Delete Request</h5></li>
			<p>http://localhost:8080/customers/4</p>
	</ul>
