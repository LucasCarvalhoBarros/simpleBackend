# POC Spring Boot

Project to training

## Steps

### 1) Controllers

- Create a API that respond to GET at `/test/hello` receiving a nullable query parameter `name` and return the text `Hello {name}` 
or `Hello world` if the parameter is not sent.

### 2) VOs and Service

- Create a API that respond a POST at `/calc/sum` and sum 2 integers using a service.
Sample request body: `{"a": 1, "b": 2}` (all tthe fields are required)
Sample response body: `{"result": 3}`

#### 2.1) Swagger

- Add a Swagger documentation to the previous endpoint

### 3) JPA and Adapters

- Map a entity Client to a table `T_CLIENT` with the follow collums and attributes: `id, name, age` (all client attributes are required, the name shoud have a min of 5 character and a max of 50).

  Create the follow API Services:

- POST on `/clients` that create a client (no return needed)
- GET on `/clients/{id}` that return a client by id, shoud return error 404 if the client not exists.
- PUT on `/clients/{id}` that update a client (the id shoud not be changed, validate if the client exist, no return needed)
- GET on `/clients` that return all the clients, with the optional query parameter `minAge` that will filter to return just the clients with age equals or greater the same

#### 3.1) Entities relationships, ZonedDateTime converter, Json Formater

- Map a entity Order for a table T_ORDER in a relationship ManyToOne with the Client (one client may have many orders). The order should have the follow attributes (all required): `id, client, value, dateTime`.

  Create the follow API Services:

- POST on `/clients/{id}/orders` that create a order for a client (no return needed)
- GET on `/clients/{id}/orders` that return all orders from a client
- GET on `/clients/{id}/orders/{id}` that return a order from a client
- PUT on `/clients/{id}/orders/{id}` that update a order from a client

### 4) Unit tests

#### 4.1) Simple unit tests
- Make unit tests for the adapters of previous APIS

#### 4.2) Tests with mocks
- Make unit tests for the services of previous APIS

#### 4.3) Controller Tests
- Make unit tests for the controllers of previous APIS

#### 4.4) Repository Tests
- Make unit tests for the repositories of previous APIS

### 5) Remote API (Feign)
- Make a API service /orders that make a request to the previous API `/clients` and for each client make a request for teh API `/clients/{id}/orders` and build a response with the all the clients with all their orders

### 6) Extras to Understand

#### 6.1) Lombok
- Data, Builders, Value
- Logs

#### 6.2) RabbitMQ
- Consumer
- Producer

#### 6.3) OAuth
- Authentication

#### 6.4) Hystrix
- How Circuit Break works
