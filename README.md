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

#### 2.1) Swagger 3

- Add a Swagger 3 documentation to the previous endpoint

### 3) Connect WebService and use Redis
- Mock connections to webservice(CWS) and use Redis to save the perennial informations

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

### 5) Remote API (Use gRPC) 
- Use https://grpc.io/

#### 6.1) Lombok
- Data, Builders, Value
- Logs

#### 6.3) OAuth2
- Authentication
