# Run Locally
`> ./gradlew bootRun`

The server starts on `http://localhost:8080`

---

# Endpoints
- `GET /` => prints "Hello Root"
- `GET /todo-app/greeting` => returns a JSON object with a message "Hello World!"
- `GET /todo-app/greeting?name=test` => returns a JSON object with a message "Hello Test!"

- `GET /todo-app/items` => returns an existing list of items
- `GET /todo-app/items/1` => returns an existing item with the id 1
- `POST /todo-app/items` => creates an item with the following JSON as a request body <br/> 
    `{ "title": "test title", "description": "test desc" }`

---

# Using Docker
Run `docker pull yelhady/todo-spring-boot-web:latest`. <br/>
Then, `docker run -d -p 4000:8080 yelhady/todo-spring-boot-web:latest`